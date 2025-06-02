// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandAiQueryResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val brandAiQueryResponse =
            BrandAiQueryResponse.builder()
                .addDataExtracted(
                    BrandAiQueryResponse.DataExtracted.builder()
                        .datapointName("datapoint_name")
                        .datapointValue("string")
                        .build()
                )
                .domain("domain")
                .addUrlsAnalyzed("string")
                .build()

        assertThat(brandAiQueryResponse.dataExtracted().getOrNull())
            .containsExactly(
                BrandAiQueryResponse.DataExtracted.builder()
                    .datapointName("datapoint_name")
                    .datapointValue("string")
                    .build()
            )
        assertThat(brandAiQueryResponse.domain()).contains("domain")
        assertThat(brandAiQueryResponse.urlsAnalyzed().getOrNull()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandAiQueryResponse =
            BrandAiQueryResponse.builder()
                .addDataExtracted(
                    BrandAiQueryResponse.DataExtracted.builder()
                        .datapointName("datapoint_name")
                        .datapointValue("string")
                        .build()
                )
                .domain("domain")
                .addUrlsAnalyzed("string")
                .build()

        val roundtrippedBrandAiQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandAiQueryResponse),
                jacksonTypeRef<BrandAiQueryResponse>(),
            )

        assertThat(roundtrippedBrandAiQueryResponse).isEqualTo(brandAiQueryResponse)
    }
}
