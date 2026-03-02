// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandWebScrapeMdParamsTest {

    @Test
    fun create() {
        BrandWebScrapeMdParams.builder()
            .url("https://example.com")
            .includeImages(true)
            .includeLinks(true)
            .shortenBase64Images(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BrandWebScrapeMdParams.builder()
                .url("https://example.com")
                .includeImages(true)
                .includeLinks(true)
                .shortenBase64Images(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("url", "https://example.com")
                    .put("includeImages", "true")
                    .put("includeLinks", "true")
                    .put("shortenBase64Images", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandWebScrapeMdParams.builder().url("https://example.com").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("url", "https://example.com").build())
    }
}
