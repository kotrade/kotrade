package io.kotrade.binance.converter

import io.kotrade.binance.BinanceCandlestick
import io.kotrade.core.Candlestick
import io.kotrade.core.converter.CandlestickConverter

class BinanceCandlestickConverter : CandlestickConverter<BinanceCandlestick> {
    override fun convert(from: BinanceCandlestick): Candlestick {
        return Candlestick(
            exchangeName = "binance",
            symbol = from.symbol.lowercase(),
            openPrice = from.openPrice,
            highPrice = from.highPrice,
            lowPrice = from.lowPrice,
            closePrice = from.closePrice,
            original = from
        )
    }
}