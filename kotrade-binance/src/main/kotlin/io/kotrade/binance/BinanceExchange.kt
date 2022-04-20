package io.kotrade.binance

import io.kotrade.binance.converter.BinanceCandlestickConverter
import io.kotrade.binance.converter.BinanceMarketConverter
import io.kotrade.binance.converter.BinanceOrderBookConverter
import io.kotrade.core.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.coroutines.runBlocking

private const val binance = "binance"

fun Kotrade.Companion.binance(block: (ExchangeConfig.() -> Unit)? = null): BinanceExchange {
    block?.invoke(ExchangeConfig())
    return BinanceExchange()
}

class BinanceExchange : AbstractExchange<BinanceMarket> {

    constructor() : super(name = binance)
    constructor(apiKey: String, apiSecret: String) : super(name = binance, apiKey, apiSecret)

    override val streams: Streams = BinanceStreams(httpClient)

    override val host: String
        get() = "https://api2.binance.com"
    override val marketEndpoint: String
        get() = "/api/v3/exchangeInfo"
    override val orderBookEndpoint: String
        get() = "/api/v3/depth"
    override val candlestickEndpoint: String
        get() = "/api/v3/klines"

    private val marketConverter = BinanceMarketConverter()
    private val orderBookConverter = BinanceOrderBookConverter()
    private val candleStickConverter = BinanceCandlestickConverter()

    override fun market(): Market {
        return runBlocking {
            marketConverter.convert(httpClient.get("$host$marketEndpoint").body())
        }
    }

    override fun tickers(): List<Any> {
        TODO("Not yet implemented")
    }

    override fun orderBook(): OrderBook {
        return runBlocking {
            orderBookConverter.convert(httpClient.get("$host$orderBookEndpoint").body())
        }
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


