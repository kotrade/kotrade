package io.kotrade.bybit

import kotlinx.serialization.Serializable

@Serializable
data class ByBitMarket(
    val result: List<ByBitMarketSymbol>
)

@Serializable
data class ByBitMarketSymbol(
    val name: String,
    val alias: String,
    val status: String,
    val baseCurrency: String,
    val quoteCurrency: String,
    val priceScale: Int,
    val takerFee: Double,
    val makerFee: Double,
    val fundingInterval: Int,
    val leverageFilter: LeverageFilter
)

@Serializable
data class LeverageFilter(
    val minLeverage: Int,
    val maxLeverage: Int,
    val leverageStep: Double
)