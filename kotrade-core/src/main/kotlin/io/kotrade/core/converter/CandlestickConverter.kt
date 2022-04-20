package io.kotrade.core.converter

import io.kotrade.core.Candlestick

interface CandlestickConverter<T> : Converter<T, Candlestick>