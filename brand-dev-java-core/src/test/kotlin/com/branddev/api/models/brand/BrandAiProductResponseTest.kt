// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandAiProductResponseTest {

    @Test
    fun create() {
        val brandAiProductResponse =
            BrandAiProductResponse.builder()
                .isProductPage(true)
                .platform(BrandAiProductResponse.Platform.AMAZON)
                .product(
                    BrandAiProductResponse.Product.builder()
                        .description("description")
                        .addFeature("string")
                        .addImage("string")
                        .name("name")
                        .addTag("string")
                        .addTargetAudience("string")
                        .billingFrequency(BrandAiProductResponse.Product.BillingFrequency.MONTHLY)
                        .category("category")
                        .currency("currency")
                        .imageUrl("image_url")
                        .price(0.0)
                        .pricingModel(BrandAiProductResponse.Product.PricingModel.PER_SEAT)
                        .url("url")
                        .build()
                )
                .build()

        assertThat(brandAiProductResponse.isProductPage()).contains(true)
        assertThat(brandAiProductResponse.platform())
            .contains(BrandAiProductResponse.Platform.AMAZON)
        assertThat(brandAiProductResponse.product())
            .contains(
                BrandAiProductResponse.Product.builder()
                    .description("description")
                    .addFeature("string")
                    .addImage("string")
                    .name("name")
                    .addTag("string")
                    .addTargetAudience("string")
                    .billingFrequency(BrandAiProductResponse.Product.BillingFrequency.MONTHLY)
                    .category("category")
                    .currency("currency")
                    .imageUrl("image_url")
                    .price(0.0)
                    .pricingModel(BrandAiProductResponse.Product.PricingModel.PER_SEAT)
                    .url("url")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandAiProductResponse =
            BrandAiProductResponse.builder()
                .isProductPage(true)
                .platform(BrandAiProductResponse.Platform.AMAZON)
                .product(
                    BrandAiProductResponse.Product.builder()
                        .description("description")
                        .addFeature("string")
                        .addImage("string")
                        .name("name")
                        .addTag("string")
                        .addTargetAudience("string")
                        .billingFrequency(BrandAiProductResponse.Product.BillingFrequency.MONTHLY)
                        .category("category")
                        .currency("currency")
                        .imageUrl("image_url")
                        .price(0.0)
                        .pricingModel(BrandAiProductResponse.Product.PricingModel.PER_SEAT)
                        .url("url")
                        .build()
                )
                .build()

        val roundtrippedBrandAiProductResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandAiProductResponse),
                jacksonTypeRef<BrandAiProductResponse>(),
            )

        assertThat(roundtrippedBrandAiProductResponse).isEqualTo(brandAiProductResponse)
    }
}
