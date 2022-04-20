package io.kotrade.bybit

data class ByBitCandlestick(
    val symbol: String,
    val interval: String,
    val openTime: Long,
    val open: Double,
    val high: Double,
    val low: Double,
    val close: Double,
    val volume: Double,
    val turnover: Double
)
