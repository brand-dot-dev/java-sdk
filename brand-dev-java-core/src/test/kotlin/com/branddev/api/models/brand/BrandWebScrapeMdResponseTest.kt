// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandWebScrapeMdResponseTest {

    @Test
    fun create() {
        val brandWebScrapeMdResponse =
            BrandWebScrapeMdResponse.builder()
                .markdown("markdown")
                .success(BrandWebScrapeMdResponse.Success.TRUE)
                .url("url")
                .build()

        assertThat(brandWebScrapeMdResponse.markdown()).isEqualTo("markdown")
        assertThat(brandWebScrapeMdResponse.success())
            .isEqualTo(BrandWebScrapeMdResponse.Success.TRUE)
        assertThat(brandWebScrapeMdResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandWebScrapeMdResponse =
            BrandWebScrapeMdResponse.builder()
                .markdown("markdown")
                .success(BrandWebScrapeMdResponse.Success.TRUE)
                .url("url")
                .build()

        val roundtrippedBrandWebScrapeMdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandWebScrapeMdResponse),
                jacksonTypeRef<BrandWebScrapeMdResponse>(),
            )

        assertThat(roundtrippedBrandWebScrapeMdResponse).isEqualTo(brandWebScrapeMdResponse)
    }
}
