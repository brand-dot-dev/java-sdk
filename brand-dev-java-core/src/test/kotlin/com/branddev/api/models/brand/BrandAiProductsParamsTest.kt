// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandAiProductsParamsTest {

    @Test
    fun create() {
        BrandAiProductsParams.builder()
            .body(
                BrandAiProductsParams.Body.ByDomain.builder()
                    .domain("domain")
                    .maxProducts(1L)
                    .timeoutMs(1000L)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BrandAiProductsParams.builder()
                .body(
                    BrandAiProductsParams.Body.ByDomain.builder()
                        .domain("domain")
                        .maxProducts(1L)
                        .timeoutMs(1000L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BrandAiProductsParams.Body.ofByDomain(
                    BrandAiProductsParams.Body.ByDomain.builder()
                        .domain("domain")
                        .maxProducts(1L)
                        .timeoutMs(1000L)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BrandAiProductsParams.builder()
                .body(BrandAiProductsParams.Body.ByDomain.builder().domain("domain").build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BrandAiProductsParams.Body.ofByDomain(
                    BrandAiProductsParams.Body.ByDomain.builder().domain("domain").build()
                )
            )
    }
}
