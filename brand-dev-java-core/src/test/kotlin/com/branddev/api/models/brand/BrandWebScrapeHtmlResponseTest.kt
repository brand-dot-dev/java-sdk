// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandWebScrapeHtmlResponseTest {

    @Test
    fun create() {
        val brandWebScrapeHtmlResponse =
            BrandWebScrapeHtmlResponse.builder()
                .html("html")
                .success(BrandWebScrapeHtmlResponse.Success.TRUE)
                .url("url")
                .build()

        assertThat(brandWebScrapeHtmlResponse.html()).isEqualTo("html")
        assertThat(brandWebScrapeHtmlResponse.success())
            .isEqualTo(BrandWebScrapeHtmlResponse.Success.TRUE)
        assertThat(brandWebScrapeHtmlResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandWebScrapeHtmlResponse =
            BrandWebScrapeHtmlResponse.builder()
                .html("html")
                .success(BrandWebScrapeHtmlResponse.Success.TRUE)
                .url("url")
                .build()

        val roundtrippedBrandWebScrapeHtmlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandWebScrapeHtmlResponse),
                jacksonTypeRef<BrandWebScrapeHtmlResponse>(),
            )

        assertThat(roundtrippedBrandWebScrapeHtmlResponse).isEqualTo(brandWebScrapeHtmlResponse)
    }
}
