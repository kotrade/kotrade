package io.kotrade.core.converter

import io.kotrade.core.OrderBook

interface OrderBookConverter<T> : Converter<T, OrderBook>