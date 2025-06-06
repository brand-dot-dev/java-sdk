// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandPrefetchParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        BrandPrefetchParams.builder().domain("domain").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params = BrandPrefetchParams.builder().domain("domain").build()

        val body = params._body()

        assertThat(body.domain()).isEqualTo("domain")
    }
}
