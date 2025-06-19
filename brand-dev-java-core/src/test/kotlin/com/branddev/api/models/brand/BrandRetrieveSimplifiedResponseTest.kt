// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandRetrieveSimplifiedResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val brandRetrieveSimplifiedResponse =
            BrandRetrieveSimplifiedResponse.builder()
                .brand(
                    BrandRetrieveSimplifiedResponse.Brand.builder()
                        .addBackdrop(
                            BrandRetrieveSimplifiedResponse.Brand.Backdrop.builder()
                                .addColor(
                                    BrandRetrieveSimplifiedResponse.Brand.Backdrop.Color.builder()
                                        .hex("hex")
                                        .name("name")
                                        .build()
                                )
                                .resolution(
                                    BrandRetrieveSimplifiedResponse.Brand.Backdrop.Resolution
                                        .builder()
                                        .aspectRatio(0.0)
                                        .height(0L)
                                        .width(0L)
                                        .build()
                                )
                                .url("url")
                                .build()
                        )
                        .addColor(
                            BrandRetrieveSimplifiedResponse.Brand.Color.builder()
                                .hex("hex")
                                .name("name")
                                .build()
                        )
                        .domain("domain")
                        .addLogo(
                            BrandRetrieveSimplifiedResponse.Brand.Logo.builder()
                                .addColor(
                                    BrandRetrieveSimplifiedResponse.Brand.Logo.Color.builder()
                                        .hex("hex")
                                        .name("name")
                                        .build()
                                )
                                .group(0L)
                                .mode("mode")
                                .resolution(
                                    BrandRetrieveSimplifiedResponse.Brand.Logo.Resolution.builder()
                                        .aspectRatio(0.0)
                                        .height(0L)
                                        .width(0L)
                                        .build()
                                )
                                .type("type")
                                .url("url")
                                .build()
                        )
                        .title("title")
                        .build()
                )
                .code(0L)
                .status("status")
                .build()

        assertThat(brandRetrieveSimplifiedResponse.brand())
            .contains(
                BrandRetrieveSimplifiedResponse.Brand.builder()
                    .addBackdrop(
                        BrandRetrieveSimplifiedResponse.Brand.Backdrop.builder()
                            .addColor(
                                BrandRetrieveSimplifiedResponse.Brand.Backdrop.Color.builder()
                                    .hex("hex")
                                    .name("name")
                                    .build()
                            )
                            .resolution(
                                BrandRetrieveSimplifiedResponse.Brand.Backdrop.Resolution.builder()
                                    .aspectRatio(0.0)
                                    .height(0L)
                                    .width(0L)
                                    .build()
                            )
                            .url("url")
                            .build()
                    )
                    .addColor(
                        BrandRetrieveSimplifiedResponse.Brand.Color.builder()
                            .hex("hex")
                            .name("name")
                            .build()
                    )
                    .domain("domain")
                    .addLogo(
                        BrandRetrieveSimplifiedResponse.Brand.Logo.builder()
                            .addColor(
                                BrandRetrieveSimplifiedResponse.Brand.Logo.Color.builder()
                                    .hex("hex")
                                    .name("name")
                                    .build()
                            )
                            .group(0L)
                            .mode("mode")
                            .resolution(
                                BrandRetrieveSimplifiedResponse.Brand.Logo.Resolution.builder()
                                    .aspectRatio(0.0)
                                    .height(0L)
                                    .width(0L)
                                    .build()
                            )
                            .type("type")
                            .url("url")
                            .build()
                    )
                    .title("title")
                    .build()
            )
        assertThat(brandRetrieveSimplifiedResponse.code()).contains(0L)
        assertThat(brandRetrieveSimplifiedResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandRetrieveSimplifiedResponse =
            BrandRetrieveSimplifiedResponse.builder()
                .brand(
                    BrandRetrieveSimplifiedResponse.Brand.builder()
                        .addBackdrop(
                            BrandRetrieveSimplifiedResponse.Brand.Backdrop.builder()
                                .addColor(
                                    BrandRetrieveSimplifiedResponse.Brand.Backdrop.Color.builder()
                                        .hex("hex")
                                        .name("name")
                                        .build()
                                )
                                .resolution(
                                    BrandRetrieveSimplifiedResponse.Brand.Backdrop.Resolution
                                        .builder()
                                        .aspectRatio(0.0)
                                        .height(0L)
                                        .width(0L)
                                        .build()
                                )
                                .url("url")
                                .build()
                        )
                        .addColor(
                            BrandRetrieveSimplifiedResponse.Brand.Color.builder()
                                .hex("hex")
                                .name("name")
                                .build()
                        )
                        .domain("domain")
                        .addLogo(
                            BrandRetrieveSimplifiedResponse.Brand.Logo.builder()
                                .addColor(
                                    BrandRetrieveSimplifiedResponse.Brand.Logo.Color.builder()
                                        .hex("hex")
                                        .name("name")
                                        .build()
                                )
                                .group(0L)
                                .mode("mode")
                                .resolution(
                                    BrandRetrieveSimplifiedResponse.Brand.Logo.Resolution.builder()
                                        .aspectRatio(0.0)
                                        .height(0L)
                                        .width(0L)
                                        .build()
                                )
                                .type("type")
                                .url("url")
                                .build()
                        )
                        .title("title")
                        .build()
                )
                .code(0L)
                .status("status")
                .build()

        val roundtrippedBrandRetrieveSimplifiedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandRetrieveSimplifiedResponse),
                jacksonTypeRef<BrandRetrieveSimplifiedResponse>(),
            )

        assertThat(roundtrippedBrandRetrieveSimplifiedResponse)
            .isEqualTo(brandRetrieveSimplifiedResponse)
    }
}
