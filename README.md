# kotrade
Kotlin Cryptocurrency Exchange &amp; Trading Library

## Supported Exhanges

| Exhange |    Status    | Trading operations | Candlestick streams |
|:--------|:------------:|--------------------|:-------------------:|
| Binance | Implementing |                    |                     |
| FTX     | Implementing |                    |   `Not Supported`   |
| Bybit   | Implementing |                    |                     |

## Examples

```kotlin
fun main() {
    val exchange = createExchange("binance")
    exchange.streamMarketService.candlestick("ADA-USDT", 5.minutes) {
        println(it)
    }
}

```