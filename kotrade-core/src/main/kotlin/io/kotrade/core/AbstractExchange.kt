package io.kotrade.core

import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.plugins.logging.LogLevel.*
import io.ktor.client.plugins.websocket.*
import io.ktor.serialization.kotlinx.*
import kotlinx.serialization.json.Json

abstract class AbstractExchange<T>: Exchange {

    protected val name: String

    protected var apiKey: String? = null

    protected var apiSecret: String? = null

    protected val httpClient = HttpClient(OkHttp) {
        install(WebSockets) {
            contentConverter = KotlinxWebsocketSerializationConverter(Json {
                ignoreUnknownKeys = true
            })
        }
        install(Logging) {
            this.level = ALL
        }
        addShutdownHook()
    }

    protected abstract val host: String
    protected abstract val marketEndpoint: String
    protected abstract val orderBookEndpoint: String
    protected abstract val candlestickEndpoint: String

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, apiKey: String, apiSecret: String) {
        this.name = name
        this.apiKey = apiKey
        this.apiSecret = apiSecret
    }

    protected fun checkMethodIsPrivate() {
        if (apiKey.isNullOrBlank() || apiSecret.isNullOrBlank()) {
            throw RuntimeException("Credentials not present for private method")
        }
    }

    private fun addShutdownHook() {
        println("Shutdown hook added")
        Runtime.getRuntime().addShutdownHook(Thread {
            println("Shutdown client")
            httpClient.close()
        })
    }
}