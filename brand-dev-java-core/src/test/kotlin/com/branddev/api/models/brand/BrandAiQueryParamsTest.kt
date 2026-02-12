// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandAiQueryParamsTest {

    @Test
    fun create() {
        BrandAiQueryParams.builder()
            .addDataToExtract(
                BrandAiQueryParams.DataToExtract.builder()
                    .datapointDescription("datapoint_description")
                    .datapointExample("datapoint_example")
                    .datapointName("datapoint_name")
                    .datapointType(BrandAiQueryParams.DataToExtract.DatapointType.TEXT)
                    .datapointListType(BrandAiQueryParams.DataToExtract.DatapointListType.STRING)
                    .datapointObjectSchema(
                        BrandAiQueryParams.DataToExtract.DatapointObjectSchema.builder()
                            .putAdditionalProperty("testimonial_text", JsonValue.from("string"))
                            .putAdditionalProperty("testimonial_author", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .domain("domain")
            .specificPages(
                BrandAiQueryParams.SpecificPages.builder()
                    .aboutUs(true)
                    .blog(true)
                    .careers(true)
                    .contactUs(true)
                    .faq(true)
                    .homePage(true)
                    .pricing(true)
                    .privacyPolicy(true)
                    .termsAndConditions(true)
                    .build()
            )
            .timeoutMs(1000L)
            .build()
    }

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
                        .datapointListType(
                            BrandAiQueryParams.DataToExtract.DatapointListType.STRING
                        )
                        .datapointObjectSchema(
                            BrandAiQueryParams.DataToExtract.DatapointObjectSchema.builder()
                                .putAdditionalProperty("testimonial_text", JsonValue.from("string"))
                                .putAdditionalProperty(
                                    "testimonial_author",
                                    JsonValue.from("string"),
                                )
                                .build()
                        )
                        .build()
                )
                .domain("domain")
                .specificPages(
                    BrandAiQueryParams.SpecificPages.builder()
                        .aboutUs(true)
                        .blog(true)
                        .careers(true)
                        .contactUs(true)
                        .faq(true)
                        .homePage(true)
                        .pricing(true)
                        .privacyPolicy(true)
                        .termsAndConditions(true)
                        .build()
                )
                .timeoutMs(1000L)
                .build()

        val body = params._body()

        assertThat(body.dataToExtract())
            .containsExactly(
                BrandAiQueryParams.DataToExtract.builder()
                    .datapointDescription("datapoint_description")
                    .datapointExample("datapoint_example")
                    .datapointName("datapoint_name")
                    .datapointType(BrandAiQueryParams.DataToExtract.DatapointType.TEXT)
                    .datapointListType(BrandAiQueryParams.DataToExtract.DatapointListType.STRING)
                    .datapointObjectSchema(
                        BrandAiQueryParams.DataToExtract.DatapointObjectSchema.builder()
                            .putAdditionalProperty("testimonial_text", JsonValue.from("string"))
                            .putAdditionalProperty("testimonial_author", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.domain()).isEqualTo("domain")
        assertThat(body.specificPages())
            .contains(
                BrandAiQueryParams.SpecificPages.builder()
                    .aboutUs(true)
                    .blog(true)
                    .careers(true)
                    .contactUs(true)
                    .faq(true)
                    .homePage(true)
                    .pricing(true)
                    .privacyPolicy(true)
                    .termsAndConditions(true)
                    .build()
            )
        assertThat(body.timeoutMs()).contains(1000L)
    }

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
