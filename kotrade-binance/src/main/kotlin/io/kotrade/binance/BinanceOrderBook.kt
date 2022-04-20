package io.kotrade.binance

import kotlinx.serialization.Serializable

@Serializable
data class BinanceOrderBook(
    val lastUpdateId: Long,
    val bids: List<Double>,
    val asks: List<Double>
)
