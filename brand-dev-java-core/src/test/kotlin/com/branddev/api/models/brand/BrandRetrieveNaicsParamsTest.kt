// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveNaicsParamsTest {

    @Test
    fun create() {
        BrandRetrieveNaicsParams.builder().input("input").timeoutMs(1L).build()
    }

    @Test
    fun queryParams() {
        val params = BrandRetrieveNaicsParams.builder().input("input").timeoutMs(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("input", "input").put("timeoutMS", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandRetrieveNaicsParams.builder().input("input").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("input", "input").build())
    }
}
