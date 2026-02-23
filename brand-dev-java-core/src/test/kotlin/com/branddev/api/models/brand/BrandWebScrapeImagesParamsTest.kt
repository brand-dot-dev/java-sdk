// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandWebScrapeImagesParamsTest {

    @Test
    fun create() {
        BrandWebScrapeImagesParams.builder().url("https://example.com").build()
    }

    @Test
    fun queryParams() {
        val params = BrandWebScrapeImagesParams.builder().url("https://example.com").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("url", "https://example.com").build())
    }
}
