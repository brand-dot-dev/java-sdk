// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandFontsResponseTest {

    @Test
    fun create() {
        val brandFontsResponse =
            BrandFontsResponse.builder()
                .code(0L)
                .domain("domain")
                .addFont(
                    BrandFontsResponse.Font.builder()
                        .addFallback("string")
                        .font("font")
                        .numElements(0.0)
                        .numWords(0.0)
                        .percentElements(0.0)
                        .percentWords(0.0)
                        .addUse("string")
                        .build()
                )
                .status("status")
                .build()

        assertThat(brandFontsResponse.code()).isEqualTo(0L)
        assertThat(brandFontsResponse.domain()).isEqualTo("domain")
        assertThat(brandFontsResponse.fonts())
            .containsExactly(
                BrandFontsResponse.Font.builder()
                    .addFallback("string")
                    .font("font")
                    .numElements(0.0)
                    .numWords(0.0)
                    .percentElements(0.0)
                    .percentWords(0.0)
                    .addUse("string")
                    .build()
            )
        assertThat(brandFontsResponse.status()).isEqualTo("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandFontsResponse =
            BrandFontsResponse.builder()
                .code(0L)
                .domain("domain")
                .addFont(
                    BrandFontsResponse.Font.builder()
                        .addFallback("string")
                        .font("font")
                        .numElements(0.0)
                        .numWords(0.0)
                        .percentElements(0.0)
                        .percentWords(0.0)
                        .addUse("string")
                        .build()
                )
                .status("status")
                .build()

        val roundtrippedBrandFontsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandFontsResponse),
                jacksonTypeRef<BrandFontsResponse>(),
            )

        assertThat(roundtrippedBrandFontsResponse).isEqualTo(brandFontsResponse)
    }
}
