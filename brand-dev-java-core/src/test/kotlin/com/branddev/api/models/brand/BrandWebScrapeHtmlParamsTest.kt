// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandWebScrapeHtmlParamsTest {

    @Test
    fun create() {
        BrandWebScrapeHtmlParams.builder().url("https://example.com").build()
    }

    @Test
    fun queryParams() {
        val params = BrandWebScrapeHtmlParams.builder().url("https://example.com").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("url", "https://example.com").build())
    }
}
