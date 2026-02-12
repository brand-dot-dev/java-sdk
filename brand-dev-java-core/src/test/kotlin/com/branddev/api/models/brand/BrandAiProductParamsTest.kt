// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandAiProductParamsTest {

    @Test
    fun create() {
        BrandAiProductParams.builder().url("https://example.com").timeoutMs(1000L).build()
    }

    @Test
    fun body() {
        val params =
            BrandAiProductParams.builder().url("https://example.com").timeoutMs(1000L).build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.timeoutMs()).contains(1000L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BrandAiProductParams.builder().url("https://example.com").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
