// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandPrefetchResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val brandPrefetchResponse =
            BrandPrefetchResponse.builder()
                .domain("domain")
                .message("message")
                .status("status")
                .build()

        assertThat(brandPrefetchResponse.domain()).contains("domain")
        assertThat(brandPrefetchResponse.message()).contains("message")
        assertThat(brandPrefetchResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandPrefetchResponse =
            BrandPrefetchResponse.builder()
                .domain("domain")
                .message("message")
                .status("status")
                .build()

        val roundtrippedBrandPrefetchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandPrefetchResponse),
                jacksonTypeRef<BrandPrefetchResponse>(),
            )

        assertThat(roundtrippedBrandPrefetchResponse).isEqualTo(brandPrefetchResponse)
    }
}
