package io.kotrade.core

interface Exchange {

    val streams: Streams

    fun market(): Market

    fun tickers(): List<Any>

    fun orderBook(): OrderBook

    fun candlesticks(): List<Candlestick>

    fun status(): List<Any>

    fun trades(): List<Any>

    fun balance(): Any

    fun createOrder(): Any

    fun cancelOrder(): Any

    fun orders(): Any

}