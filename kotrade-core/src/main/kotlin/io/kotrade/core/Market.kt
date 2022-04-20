package io.kotrade.core

data class Market(
    val exchangeName: String,
    val symbol: String,
    val baseAsset: String,
    val quoteAsset: String,
)
