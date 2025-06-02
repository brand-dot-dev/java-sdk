// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandAiQueryParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        BrandAiQueryParams.builder()
            .addDataToExtract(
                BrandAiQueryParams.DataToExtract.builder()
                    .datapointDescription("datapoint_description")
                    .datapointExample("datapoint_example")
                    .datapointName("datapoint_name")
                    .datapointType(BrandAiQueryParams.DataToExtract.DatapointType.TEXT)
                    .build()
            )
            .domain("domain")
            .addSpecificPage("string")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            BrandAiQueryParams.builder()
                .addDataToExtract(
                    BrandAiQueryParams.DataToExtract.builder()
                        .datapointDescription("datapoint_description")
                        .datapointExample("datapoint_example")
                        .datapointName("datapoint_name")
                        .datapointType(BrandAiQueryParams.DataToExtract.DatapointType.TEXT)
                        .build()
                )
                .domain("domain")
                .addSpecificPage("string")
                .build()

        val body = params._body()

        assertThat(body.dataToExtract())
            .containsExactly(
                BrandAiQueryParams.DataToExtract.builder()
                    .datapointDescription("datapoint_description")
                    .datapointExample("datapoint_example")
                    .datapointName("datapoint_name")
                    .datapointType(BrandAiQueryParams.DataToExtract.DatapointType.TEXT)
                    .build()
            )
        assertThat(body.domain()).isEqualTo("domain")
        assertThat(body.specificPages().getOrNull()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BrandAiQueryParams.builder()
                .addDataToExtract(
                    BrandAiQueryParams.DataToExtract.builder()
                        .datapointDescription("datapoint_description")
                        .datapointExample("datapoint_example")
                        .datapointName("datapoint_name")
                        .datapointType(BrandAiQueryParams.DataToExtract.DatapointType.TEXT)
                        .build()
                )
                .domain("domain")
                .build()

        val body = params._body()

        assertThat(body.dataToExtract())
            .containsExactly(
                BrandAiQueryParams.DataToExtract.builder()
                    .datapointDescription("datapoint_description")
                    .datapointExample("datapoint_example")
                    .datapointName("datapoint_name")
                    .datapointType(BrandAiQueryParams.DataToExtract.DatapointType.TEXT)
                    .build()
            )
        assertThat(body.domain()).isEqualTo("domain")
    }
}
