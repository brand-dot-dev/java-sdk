// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveParamsTest {

    @Test
    fun create() {
        BrandRetrieveParams.builder()
            .domain("domain")
            .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
            .maxSpeed(true)
            .name("xxx")
            .ticker("ticker")
            .tickerExchange(BrandRetrieveParams.TickerExchange.AMEX)
            .timeoutMs(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BrandRetrieveParams.builder()
                .domain("domain")
                .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                .maxSpeed(true)
                .name("xxx")
                .ticker("ticker")
                .tickerExchange(BrandRetrieveParams.TickerExchange.AMEX)
                .timeoutMs(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("domain", "domain")
                    .put("force_language", "albanian")
                    .put("maxSpeed", "true")
                    .put("name", "xxx")
                    .put("ticker", "ticker")
                    .put("ticker_exchange", "AMEX")
                    .put("timeoutMS", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandRetrieveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
