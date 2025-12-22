// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandPrefetchByEmailResponseTest {

    @Test
    fun create() {
        val brandPrefetchByEmailResponse =
            BrandPrefetchByEmailResponse.builder()
                .domain("domain")
                .message("message")
                .status("status")
                .build()

        assertThat(brandPrefetchByEmailResponse.domain()).contains("domain")
        assertThat(brandPrefetchByEmailResponse.message()).contains("message")
        assertThat(brandPrefetchByEmailResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandPrefetchByEmailResponse =
            BrandPrefetchByEmailResponse.builder()
                .domain("domain")
                .message("message")
                .status("status")
                .build()

        val roundtrippedBrandPrefetchByEmailResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandPrefetchByEmailResponse),
                jacksonTypeRef<BrandPrefetchByEmailResponse>(),
            )

        assertThat(roundtrippedBrandPrefetchByEmailResponse).isEqualTo(brandPrefetchByEmailResponse)
    }
}
