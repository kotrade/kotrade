package io.kotrade.binance

import kotlinx.serialization.Serializable

@Serializable
data class BinanceCandlestick(
    val symbol: String,
    val startTime: Long,
    val closeTime: Long,
    val interval: String,
    val firstTradeId: Long,
    val lastTradeId: Long,
    val openPrice: Double,
    val closePrice: Double,
    val highPrice: Double,
    val lowPrice: Double,
    val baseAssetVolume: String,
    val numberOfTrades: Long,
    val isCandlestickClosed: Boolean,
    val quoteAssetVolume: String,
    val takerBuyBaseAssetVolume: String,
    val takerBuyQuoteAssetVolume: String
)

