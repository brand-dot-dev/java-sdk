// File generated from our OpenAPI spec by Stainless.

package com.configure_me_branddev.api.models.brand

import com.configure_me_branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandRetrieveNaicsResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val brandRetrieveNaicsResponse =
            BrandRetrieveNaicsResponse.builder()
                .addCode(
                    BrandRetrieveNaicsResponse.Code.builder().code("code").title("title").build()
                )
                .domain("domain")
                .status("status")
                .type("type")
                .build()

        assertThat(brandRetrieveNaicsResponse.codes().getOrNull())
            .containsExactly(
                BrandRetrieveNaicsResponse.Code.builder().code("code").title("title").build()
            )
        assertThat(brandRetrieveNaicsResponse.domain()).contains("domain")
        assertThat(brandRetrieveNaicsResponse.status()).contains("status")
        assertThat(brandRetrieveNaicsResponse.type()).contains("type")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandRetrieveNaicsResponse =
            BrandRetrieveNaicsResponse.builder()
                .addCode(
                    BrandRetrieveNaicsResponse.Code.builder().code("code").title("title").build()
                )
                .domain("domain")
                .status("status")
                .type("type")
                .build()

        val roundtrippedBrandRetrieveNaicsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandRetrieveNaicsResponse),
                jacksonTypeRef<BrandRetrieveNaicsResponse>(),
            )

        assertThat(roundtrippedBrandRetrieveNaicsResponse).isEqualTo(brandRetrieveNaicsResponse)
    }
}
