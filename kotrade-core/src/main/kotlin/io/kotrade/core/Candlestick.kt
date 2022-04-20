package io.kotrade.core

data class Candlestick(
    val exchangeName: String,
    val symbol: String,
    val openPrice: Double,
    val highPrice: Double,
    val lowPrice: Double,
    val closePrice: Double,
    val original: Any
)
