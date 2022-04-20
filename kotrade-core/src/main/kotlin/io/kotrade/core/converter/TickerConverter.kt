package io.kotrade.core.converter

import io.kotrade.core.Ticker

interface TickerConverter<T> : Converter<T, Ticker>