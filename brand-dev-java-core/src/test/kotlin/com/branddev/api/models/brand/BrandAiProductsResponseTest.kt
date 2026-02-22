// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandAiProductsResponseTest {

    @Test
    fun create() {
        val brandAiProductsResponse =
            BrandAiProductsResponse.builder()
                .addProduct(
                    BrandAiProductsResponse.Product.builder()
                        .description("description")
                        .addFeature("string")
                        .addImage("string")
                        .name("name")
                        .addTag("string")
                        .addTargetAudience("string")
                        .billingFrequency(BrandAiProductsResponse.Product.BillingFrequency.MONTHLY)
                        .category("category")
                        .currency("currency")
                        .imageUrl("image_url")
                        .price(0.0)
                        .pricingModel(BrandAiProductsResponse.Product.PricingModel.PER_SEAT)
                        .url("url")
                        .build()
                )
                .build()

        assertThat(brandAiProductsResponse.products().getOrNull())
            .containsExactly(
                BrandAiProductsResponse.Product.builder()
                    .description("description")
                    .addFeature("string")
                    .addImage("string")
                    .name("name")
                    .addTag("string")
                    .addTargetAudience("string")
                    .billingFrequency(BrandAiProductsResponse.Product.BillingFrequency.MONTHLY)
                    .category("category")
                    .currency("currency")
                    .imageUrl("image_url")
                    .price(0.0)
                    .pricingModel(BrandAiProductsResponse.Product.PricingModel.PER_SEAT)
                    .url("url")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandAiProductsResponse =
            BrandAiProductsResponse.builder()
                .addProduct(
                    BrandAiProductsResponse.Product.builder()
                        .description("description")
                        .addFeature("string")
                        .addImage("string")
                        .name("name")
                        .addTag("string")
                        .addTargetAudience("string")
                        .billingFrequency(BrandAiProductsResponse.Product.BillingFrequency.MONTHLY)
                        .category("category")
                        .currency("currency")
                        .imageUrl("image_url")
                        .price(0.0)
                        .pricingModel(BrandAiProductsResponse.Product.PricingModel.PER_SEAT)
                        .url("url")
                        .build()
                )
                .build()

        val roundtrippedBrandAiProductsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandAiProductsResponse),
                jacksonTypeRef<BrandAiProductsResponse>(),
            )

        assertThat(roundtrippedBrandAiProductsResponse).isEqualTo(brandAiProductsResponse)
    }
}
