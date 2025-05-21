// File generated from our OpenAPI spec by Stainless.

package com.configure_me_branddev.api.models.brand

import com.configure_me_branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandSearchResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val brandSearchResponse =
            BrandSearchResponse.builder().domain("domain").logo("logo").title("title").build()

        assertThat(brandSearchResponse.domain()).contains("domain")
        assertThat(brandSearchResponse.logo()).contains("logo")
        assertThat(brandSearchResponse.title()).contains("title")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandSearchResponse =
            BrandSearchResponse.builder().domain("domain").logo("logo").title("title").build()

        val roundtrippedBrandSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandSearchResponse),
                jacksonTypeRef<BrandSearchResponse>(),
            )

        assertThat(roundtrippedBrandSearchResponse).isEqualTo(brandSearchResponse)
    }
}
