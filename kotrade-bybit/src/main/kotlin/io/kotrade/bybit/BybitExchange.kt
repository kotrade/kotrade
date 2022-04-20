package io.kotrade.bybit

import io.kotrade.core.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.coroutines.runBlocking

fun Kotrade.Companion.bybit(configScope: (ExchangeConfig.() -> Unit)? = null): BybitExchange {
    val config = ExchangeConfig()
    configScope?.invoke(config)
    return BybitExchange(apiKey = config.apiKey, apiSecret = config.apiSecret)
}

private const val bybit = "bybit"

class BybitExchange : AbstractExchange<ByBitMarket> {

    override val host: String
        get() = "https://api.bybit.com"
    override val marketEndpoint: String
        get() = "/v2/public/symbols"
    override val orderBookEndpoint: String
        get() = TODO("Not yet implemented")
    override val candlestickEndpoint: String
        get() = TODO("Not yet implemented")

    constructor() : super(bybit)
    constructor(apiKey: String, apiSecret: String) : super(bybit, apiKey, apiSecret)

    private val marketConverter = ByBitMarketConverter()

    override val streams: Streams
        get() = ByBitStreams(httpClient)

    override fun market(): Market {
        return runBlocking {
            marketConverter.convert(httpClient.get("$host$marketEndpoint").body())
        }
    }

    override fun tickers(): List<Any> {
        TODO("Not yet implemented")
    }

    override fun orderBook(): OrderBook {
        TODO("Not yet implemented")
    }

    override fun candlesticks(): List<Candlestick> {
        TODO("Not yet implemented")
    }

    override fun status(): List<Any> {
        TODO("Not yet implemented")
    }

    override fun trades(): List<Any> {
        TODO("Not yet implemented")
    }

    override fun balance(): Any {
        TODO("Not yet implemented")
    }

    override fun createOrder(): Any {
        TODO("Not yet implemented")
    }

    override fun cancelOrder(): Any {
        TODO("Not yet implemented")
    }

    override fun orders(): Any {
        TODO("Not yet implemented")
    }
}