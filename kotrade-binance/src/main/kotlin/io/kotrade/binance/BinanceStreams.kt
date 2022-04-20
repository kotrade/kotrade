package io.kotrade.binance

import io.kotrade.core.AbstractStreams
import io.kotrade.core.Candlestick
import io.kotrade.core.OrderBook
import io.kotrade.core.Trade
import io.ktor.client.*
import io.ktor.client.plugins.websocket.*
import io.ktor.util.collections.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.Serializable
import kotlin.time.Duration

@Serializable
data class Subscription(
    val method: String = "SUBSCRIBE",
    val params: List<String>,
    val id: Int = 123
)

class BinanceStreams(httpClient: HttpClient) : AbstractStreams(httpClient) {

    override fun trade(vararg cryptocurrencyPairs: String): Channel<Trade> {
        TODO("Not yet implemented")
    }

    override fun orderBook(vararg cryptocurrencyPairs: String): Channel<OrderBook> {
        TODO("Not yet implemented")
    }

    override fun candlestick(cryptocurrencyPairs: List<String>, interval: Duration): Channel<Candlestick> {
        runBlocking {
            println("Try to subscribe")
            val subscription = Subscription(params = listOf("btcusdt@miniTicker"))
            //webSocketSession.sendSerialized(subscription)
        }

        return Channel()
    }
}

