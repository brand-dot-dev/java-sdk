// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveByIsinParamsTest {

    @Test
    fun create() {
        BrandRetrieveByIsinParams.builder()
            .isin("SE60513A9993")
            .forceLanguage(BrandRetrieveByIsinParams.ForceLanguage.ALBANIAN)
            .maxSpeed(true)
            .timeoutMs(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BrandRetrieveByIsinParams.builder()
                .isin("SE60513A9993")
                .forceLanguage(BrandRetrieveByIsinParams.ForceLanguage.ALBANIAN)
                .maxSpeed(true)
                .timeoutMs(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("isin", "SE60513A9993")
                    .put("force_language", "albanian")
                    .put("maxSpeed", "true")
                    .put("timeoutMS", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandRetrieveByIsinParams.builder().isin("SE60513A9993").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("isin", "SE60513A9993").build())
    }
}
