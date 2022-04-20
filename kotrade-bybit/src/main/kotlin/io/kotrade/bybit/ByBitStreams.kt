package io.kotrade.bybit

import io.kotrade.core.*
import io.ktor.client.*
import kotlinx.coroutines.channels.Channel
import kotlin.time.Duration

class ByBitStreams(httpClient: HttpClient) : AbstractStreams(httpClient) {

    override fun trade(vararg cryptocurrencyPairs: String): Channel<Trade> {
        TODO("Not yet implemented")
    }

    override fun orderBook(vararg cryptocurrencyPairs: String): Channel<OrderBook> {
        TODO("Not yet implemented")
    }

    override fun candlestick(cryptocurrencyPairs: List<String>, interval: Duration): Channel<Candlestick> {
        TODO("Not yet implemented")
    }

    override fun webSocketConfig(): ExchangeWebsocketConfig {
        return ExchangeWebsocketConfig(
            host = "stream.bybit.com",
            basePath = "/realtime"
        )
    }
}