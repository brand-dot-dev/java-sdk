// File generated from our OpenAPI spec by Stainless.

package com.configure_me_branddev.api.models.brand

import com.configure_me_branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandRetrieveParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        BrandRetrieveParams.builder()
            .domain("domain")
            .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            BrandRetrieveParams.builder()
                .domain("domain")
                .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("domain", "domain")
                    .put("force_language", "albanian")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandRetrieveParams.builder().domain("domain").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("domain", "domain").build())
    }
}
