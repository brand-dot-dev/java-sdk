// File generated from our OpenAPI spec by Stainless.

package com.configure_me_branddev.api.models.brand

import com.configure_me_branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandRetrieveByTickerParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        BrandRetrieveByTickerParams.builder().ticker("ticker").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = BrandRetrieveByTickerParams.builder().ticker("ticker").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("ticker", "ticker").build())
    }
}
