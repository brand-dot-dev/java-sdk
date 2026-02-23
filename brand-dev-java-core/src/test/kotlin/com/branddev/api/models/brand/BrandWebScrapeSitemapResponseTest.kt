// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandWebScrapeSitemapResponseTest {

    @Test
    fun create() {
        val brandWebScrapeSitemapResponse =
            BrandWebScrapeSitemapResponse.builder()
                .domain("domain")
                .meta(
                    BrandWebScrapeSitemapResponse.Meta.builder()
                        .errors(0L)
                        .sitemapsDiscovered(0L)
                        .sitemapsFetched(0L)
                        .sitemapsSkipped(0L)
                        .build()
                )
                .success(BrandWebScrapeSitemapResponse.Success.TRUE)
                .addUrl("string")
                .build()

        assertThat(brandWebScrapeSitemapResponse.domain()).isEqualTo("domain")
        assertThat(brandWebScrapeSitemapResponse.meta())
            .isEqualTo(
                BrandWebScrapeSitemapResponse.Meta.builder()
                    .errors(0L)
                    .sitemapsDiscovered(0L)
                    .sitemapsFetched(0L)
                    .sitemapsSkipped(0L)
                    .build()
            )
        assertThat(brandWebScrapeSitemapResponse.success())
            .isEqualTo(BrandWebScrapeSitemapResponse.Success.TRUE)
        assertThat(brandWebScrapeSitemapResponse.urls()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandWebScrapeSitemapResponse =
            BrandWebScrapeSitemapResponse.builder()
                .domain("domain")
                .meta(
                    BrandWebScrapeSitemapResponse.Meta.builder()
                        .errors(0L)
                        .sitemapsDiscovered(0L)
                        .sitemapsFetched(0L)
                        .sitemapsSkipped(0L)
                        .build()
                )
                .success(BrandWebScrapeSitemapResponse.Success.TRUE)
                .addUrl("string")
                .build()

        val roundtrippedBrandWebScrapeSitemapResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandWebScrapeSitemapResponse),
                jacksonTypeRef<BrandWebScrapeSitemapResponse>(),
            )

        assertThat(roundtrippedBrandWebScrapeSitemapResponse)
            .isEqualTo(brandWebScrapeSitemapResponse)
    }
}
