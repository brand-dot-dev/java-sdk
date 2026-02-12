// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveByTickerParamsTest {

    @Test
    fun create() {
        BrandRetrieveByTickerParams.builder()
            .ticker("ticker")
            .forceLanguage(BrandRetrieveByTickerParams.ForceLanguage.ALBANIAN)
            .maxSpeed(true)
            .tickerExchange(BrandRetrieveByTickerParams.TickerExchange.AMEX)
            .timeoutMs(1000L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BrandRetrieveByTickerParams.builder()
                .ticker("ticker")
                .forceLanguage(BrandRetrieveByTickerParams.ForceLanguage.ALBANIAN)
                .maxSpeed(true)
                .tickerExchange(BrandRetrieveByTickerParams.TickerExchange.AMEX)
                .timeoutMs(1000L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ticker", "ticker")
                    .put("force_language", "albanian")
                    .put("maxSpeed", "true")
                    .put("ticker_exchange", "AMEX")
                    .put("timeoutMS", "1000")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandRetrieveByTickerParams.builder().ticker("ticker").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("ticker", "ticker").build())
    }
}
