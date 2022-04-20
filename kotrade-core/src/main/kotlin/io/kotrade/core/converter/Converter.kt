package io.kotrade.core.converter

interface Converter<F, T> {

    fun convert(from: F): T

}