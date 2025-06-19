// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandScreenshotParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        BrandScreenshotParams.builder()
            .domain("domain")
            .fullScreenshot(BrandScreenshotParams.FullScreenshot.TRUE)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            BrandScreenshotParams.builder()
                .domain("domain")
                .fullScreenshot(BrandScreenshotParams.FullScreenshot.TRUE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("domain", "domain").put("fullScreenshot", "true").build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandScreenshotParams.builder().domain("domain").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("domain", "domain").build())
    }
}
