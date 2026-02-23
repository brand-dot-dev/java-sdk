// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandWebScrapeSitemapParamsTest {

    @Test
    fun create() {
        BrandWebScrapeSitemapParams.builder().domain("domain").build()
    }

    @Test
    fun queryParams() {
        val params = BrandWebScrapeSitemapParams.builder().domain("domain").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("domain", "domain").build())
    }
}
