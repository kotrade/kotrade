package io.kotrade.binance.converter

import io.kotrade.binance.BinanceOrderBook
import io.kotrade.core.OrderBook
import io.kotrade.core.converter.OrderBookConverter

class BinanceOrderBookConverter : OrderBookConverter<BinanceOrderBook> {
    override fun convert(from: BinanceOrderBook): OrderBook {
        TODO("Not yet implemented")
    }
}