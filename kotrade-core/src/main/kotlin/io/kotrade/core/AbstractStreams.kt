package io.kotrade.core

import io.ktor.client.*
import kotlinx.coroutines.channels.Channel
import kotlin.time.Duration

data class ExchangeWebsocketConfig(
    val host: String,
    val port: Int? = null,
    val basePath: String
)

abstract class AbstractStreams(protected val httpClient: HttpClient) : Streams {

    override fun candlestick(cryptocurrencyPair: String, interval: Duration): Channel<Candlestick> {
        return candlestick(listOf(cryptocurrencyPair), interval)
    }

    protected abstract fun webSocketConfig(): ExchangeWebsocketConfig
}