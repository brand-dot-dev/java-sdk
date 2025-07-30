// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandScreenshotResponseTest {

    @Test
    fun create() {
        val brandScreenshotResponse =
            BrandScreenshotResponse.builder()
                .code(0L)
                .domain("domain")
                .screenshot("screenshot")
                .screenshotType(BrandScreenshotResponse.ScreenshotType.VIEWPORT)
                .status("status")
                .build()

        assertThat(brandScreenshotResponse.code()).contains(0L)
        assertThat(brandScreenshotResponse.domain()).contains("domain")
        assertThat(brandScreenshotResponse.screenshot()).contains("screenshot")
        assertThat(brandScreenshotResponse.screenshotType())
            .contains(BrandScreenshotResponse.ScreenshotType.VIEWPORT)
        assertThat(brandScreenshotResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandScreenshotResponse =
            BrandScreenshotResponse.builder()
                .code(0L)
                .domain("domain")
                .screenshot("screenshot")
                .screenshotType(BrandScreenshotResponse.ScreenshotType.VIEWPORT)
                .status("status")
                .build()

        val roundtrippedBrandScreenshotResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandScreenshotResponse),
                jacksonTypeRef<BrandScreenshotResponse>(),
            )

        assertThat(roundtrippedBrandScreenshotResponse).isEqualTo(brandScreenshotResponse)
    }
}
