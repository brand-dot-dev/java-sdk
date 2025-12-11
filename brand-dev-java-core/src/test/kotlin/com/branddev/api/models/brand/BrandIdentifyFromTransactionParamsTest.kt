// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandIdentifyFromTransactionParamsTest {

    @Test
    fun create() {
        BrandIdentifyFromTransactionParams.builder()
            .transactionInfo("transaction_info")
            .city("city")
            .countryGl(BrandIdentifyFromTransactionParams.CountryGl.AD)
            .forceLanguage(BrandIdentifyFromTransactionParams.ForceLanguage.ALBANIAN)
            .maxSpeed(true)
            .mcc("mcc")
            .phone(0.0)
            .timeoutMs(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BrandIdentifyFromTransactionParams.builder()
                .transactionInfo("transaction_info")
                .city("city")
                .countryGl(BrandIdentifyFromTransactionParams.CountryGl.AD)
                .forceLanguage(BrandIdentifyFromTransactionParams.ForceLanguage.ALBANIAN)
                .maxSpeed(true)
                .mcc("mcc")
                .phone(0.0)
                .timeoutMs(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("transaction_info", "transaction_info")
                    .put("city", "city")
                    .put("country_gl", "ad")
                    .put("force_language", "albanian")
                    .put("maxSpeed", "true")
                    .put("mcc", "mcc")
                    .put("phone", "0.0")
                    .put("timeoutMS", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BrandIdentifyFromTransactionParams.builder().transactionInfo("transaction_info").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("transaction_info", "transaction_info").build())
    }
}
