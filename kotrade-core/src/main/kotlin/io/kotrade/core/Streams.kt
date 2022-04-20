package io.kotrade.core

import kotlinx.coroutines.channels.Channel
import kotlin.time.Duration

interface Streams {

    fun trade(vararg cryptocurrencyPairs: String): Channel<Trade>

    fun orderBook(vararg cryptocurrencyPairs: String): Channel<OrderBook>

    fun candlestick(cryptocurrencyPair: String, interval: Duration): Channel<Candlestick>

    fun candlestick(cryptocurrencyPairs: List<String>, interval: Duration): Channel<Candlestick>

}