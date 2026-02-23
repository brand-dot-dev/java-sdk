// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandWebScrapeImagesResponseTest {

    @Test
    fun create() {
        val brandWebScrapeImagesResponse =
            BrandWebScrapeImagesResponse.builder()
                .addImage(
                    BrandWebScrapeImagesResponse.Image.builder()
                        .alt("alt")
                        .element(BrandWebScrapeImagesResponse.Image.Element.IMG)
                        .src("src")
                        .type(BrandWebScrapeImagesResponse.Image.Type.URL)
                        .build()
                )
                .success(BrandWebScrapeImagesResponse.Success.TRUE)
                .url("url")
                .build()

        assertThat(brandWebScrapeImagesResponse.images())
            .containsExactly(
                BrandWebScrapeImagesResponse.Image.builder()
                    .alt("alt")
                    .element(BrandWebScrapeImagesResponse.Image.Element.IMG)
                    .src("src")
                    .type(BrandWebScrapeImagesResponse.Image.Type.URL)
                    .build()
            )
        assertThat(brandWebScrapeImagesResponse.success())
            .isEqualTo(BrandWebScrapeImagesResponse.Success.TRUE)
        assertThat(brandWebScrapeImagesResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandWebScrapeImagesResponse =
            BrandWebScrapeImagesResponse.builder()
                .addImage(
                    BrandWebScrapeImagesResponse.Image.builder()
                        .alt("alt")
                        .element(BrandWebScrapeImagesResponse.Image.Element.IMG)
                        .src("src")
                        .type(BrandWebScrapeImagesResponse.Image.Type.URL)
                        .build()
                )
                .success(BrandWebScrapeImagesResponse.Success.TRUE)
                .url("url")
                .build()

        val roundtrippedBrandWebScrapeImagesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandWebScrapeImagesResponse),
                jacksonTypeRef<BrandWebScrapeImagesResponse>(),
            )

        assertThat(roundtrippedBrandWebScrapeImagesResponse).isEqualTo(brandWebScrapeImagesResponse)
    }
}
