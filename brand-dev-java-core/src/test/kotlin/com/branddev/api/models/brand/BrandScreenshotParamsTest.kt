// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandScreenshotParamsTest {

    @Test
    fun create() {
        BrandScreenshotParams.builder()
            .domain("domain")
            .fullScreenshot(BrandScreenshotParams.FullScreenshot.TRUE)
            .page(BrandScreenshotParams.Page.LOGIN)
            .prioritize(BrandScreenshotParams.Prioritize.SPEED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BrandScreenshotParams.builder()
                .domain("domain")
                .fullScreenshot(BrandScreenshotParams.FullScreenshot.TRUE)
                .page(BrandScreenshotParams.Page.LOGIN)
                .prioritize(BrandScreenshotParams.Prioritize.SPEED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("domain", "domain")
                    .put("fullScreenshot", "true")
                    .put("page", "login")
                    .put("prioritize", "speed")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandScreenshotParams.builder().domain("domain").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("domain", "domain").build())
    }
}
