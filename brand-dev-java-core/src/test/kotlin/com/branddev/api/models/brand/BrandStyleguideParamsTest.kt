// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandStyleguideParamsTest {

    @Test
    fun create() {
        BrandStyleguideParams.builder()
            .directUrl("https://example.com")
            .domain("domain")
            .prioritize(BrandStyleguideParams.Prioritize.SPEED)
            .timeoutMs(1000L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BrandStyleguideParams.builder()
                .directUrl("https://example.com")
                .domain("domain")
                .prioritize(BrandStyleguideParams.Prioritize.SPEED)
                .timeoutMs(1000L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("directUrl", "https://example.com")
                    .put("domain", "domain")
                    .put("prioritize", "speed")
                    .put("timeoutMS", "1000")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandStyleguideParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
