// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandFontsParamsTest {

    @Test
    fun create() {
        BrandFontsParams.builder().domain("domain").timeoutMs(1L).build()
    }

    @Test
    fun queryParams() {
        val params = BrandFontsParams.builder().domain("domain").timeoutMs(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("domain", "domain").put("timeoutMS", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandFontsParams.builder().domain("domain").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("domain", "domain").build())
    }
}
