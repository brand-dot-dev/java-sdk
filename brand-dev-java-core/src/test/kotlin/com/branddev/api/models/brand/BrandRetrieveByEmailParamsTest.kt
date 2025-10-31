// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveByEmailParamsTest {

    @Test
    fun create() {
        BrandRetrieveByEmailParams.builder()
            .email("dev@stainless.com")
            .forceLanguage(BrandRetrieveByEmailParams.ForceLanguage.ALBANIAN)
            .maxSpeed(true)
            .timeoutMs(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BrandRetrieveByEmailParams.builder()
                .email("dev@stainless.com")
                .forceLanguage(BrandRetrieveByEmailParams.ForceLanguage.ALBANIAN)
                .maxSpeed(true)
                .timeoutMs(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("email", "dev@stainless.com")
                    .put("force_language", "albanian")
                    .put("maxSpeed", "true")
                    .put("timeoutMS", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandRetrieveByEmailParams.builder().email("dev@stainless.com").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("email", "dev@stainless.com").build())
    }
}
