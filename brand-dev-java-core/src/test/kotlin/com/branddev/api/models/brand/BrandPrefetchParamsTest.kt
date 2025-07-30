// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandPrefetchParamsTest {

    @Test
    fun create() {
        BrandPrefetchParams.builder().domain("domain").timeoutMs(1L).build()
    }

    @Test
    fun body() {
        val params = BrandPrefetchParams.builder().domain("domain").timeoutMs(1L).build()

        val body = params._body()

        assertThat(body.domain()).isEqualTo("domain")
        assertThat(body.timeoutMs()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BrandPrefetchParams.builder().domain("domain").build()

        val body = params._body()

        assertThat(body.domain()).isEqualTo("domain")
    }
}
