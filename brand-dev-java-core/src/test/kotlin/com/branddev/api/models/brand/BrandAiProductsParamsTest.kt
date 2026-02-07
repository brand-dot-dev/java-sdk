// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandAiProductsParamsTest {

    @Test
    fun create() {
        BrandAiProductsParams.builder()
            .directUrl("https://example.com")
            .domain("domain")
            .maxProducts(1L)
            .timeoutMs(1L)
            .build()
    }

    @Test
    fun body() {
        val params =
            BrandAiProductsParams.builder()
                .directUrl("https://example.com")
                .domain("domain")
                .maxProducts(1L)
                .timeoutMs(1L)
                .build()

        val body = params._body()

        assertThat(body.directUrl()).contains("https://example.com")
        assertThat(body.domain()).contains("domain")
        assertThat(body.maxProducts()).contains(1L)
        assertThat(body.timeoutMs()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BrandAiProductsParams.builder().build()

        val body = params._body()
    }
}
