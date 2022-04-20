package io.kotrade.core

import kotlinx.serialization.Serializable

@Serializable
data class BinanceMarket(
    val symbols: List<BinanceMarketSymbol>
)

@Serializable
data class BinanceMarketSymbol(
    val symbol: String,
    val baseAsset: String,
    val quoteAsset: String,
    val isSpotTradingAllowed: Boolean,
    val isMarginTradingAllowed: Boolean,
    val permissions: List<String>
)