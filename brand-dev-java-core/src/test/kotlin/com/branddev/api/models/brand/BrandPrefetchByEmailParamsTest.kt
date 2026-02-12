// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandPrefetchByEmailParamsTest {

    @Test
    fun create() {
        BrandPrefetchByEmailParams.builder().email("dev@stainless.com").timeoutMs(1000L).build()
    }

    @Test
    fun body() {
        val params =
            BrandPrefetchByEmailParams.builder().email("dev@stainless.com").timeoutMs(1000L).build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.timeoutMs()).contains(1000L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BrandPrefetchByEmailParams.builder().email("dev@stainless.com").build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
    }
}
