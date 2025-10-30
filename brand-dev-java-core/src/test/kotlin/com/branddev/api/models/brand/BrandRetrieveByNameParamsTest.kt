// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveByNameParamsTest {

    @Test
    fun create() {
        BrandRetrieveByNameParams.builder()
            .name("xxx")
            .forceLanguage(BrandRetrieveByNameParams.ForceLanguage.ALBANIAN)
            .maxSpeed(true)
            .timeoutMs(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BrandRetrieveByNameParams.builder()
                .name("xxx")
                .forceLanguage(BrandRetrieveByNameParams.ForceLanguage.ALBANIAN)
                .maxSpeed(true)
                .timeoutMs(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("name", "xxx")
                    .put("force_language", "albanian")
                    .put("maxSpeed", "true")
                    .put("timeoutMS", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandRetrieveByNameParams.builder().name("xxx").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("name", "xxx").build())
    }
}
