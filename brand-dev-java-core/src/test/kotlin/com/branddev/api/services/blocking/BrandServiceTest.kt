// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.services.blocking

import com.branddev.api.client.okhttp.BrandDevOkHttpClient
import com.branddev.api.core.JsonValue
import com.branddev.api.models.brand.BrandAiProductParams
import com.branddev.api.models.brand.BrandAiProductsParams
import com.branddev.api.models.brand.BrandAiQueryParams
import com.branddev.api.models.brand.BrandFontsParams
import com.branddev.api.models.brand.BrandIdentifyFromTransactionParams
import com.branddev.api.models.brand.BrandPrefetchByEmailParams
import com.branddev.api.models.brand.BrandPrefetchParams
import com.branddev.api.models.brand.BrandRetrieveByEmailParams
import com.branddev.api.models.brand.BrandRetrieveByIsinParams
import com.branddev.api.models.brand.BrandRetrieveByNameParams
import com.branddev.api.models.brand.BrandRetrieveByTickerParams
import com.branddev.api.models.brand.BrandRetrieveNaicsParams
import com.branddev.api.models.brand.BrandRetrieveParams
import com.branddev.api.models.brand.BrandRetrieveSimplifiedParams
import com.branddev.api.models.brand.BrandScreenshotParams
import com.branddev.api.models.brand.BrandStyleguideParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val brand =
            brandService.retrieve(
                BrandRetrieveParams.builder()
                    .domain("domain")
                    .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                    .maxSpeed(true)
                    .timeoutMs(1000L)
                    .build()
            )

        brand.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun aiProduct() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.aiProduct(
                BrandAiProductParams.builder().url("https://example.com").timeoutMs(1000L).build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun aiProducts() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.aiProducts(
                BrandAiProductsParams.Body.ByDomain.builder()
                    .domain("domain")
                    .maxProducts(1L)
                    .timeoutMs(1000L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun aiQuery() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.aiQuery(
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
                                    .putAdditionalProperty(
                                        "testimonial_text",
                                        JsonValue.from("string"),
                                    )
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
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun fonts() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.fonts(BrandFontsParams.builder().domain("domain").timeoutMs(1000L).build())

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun identifyFromTransaction() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.identifyFromTransaction(
                BrandIdentifyFromTransactionParams.builder()
                    .transactionInfo("transaction_info")
                    .city("city")
                    .countryGl(BrandIdentifyFromTransactionParams.CountryGl.AD)
                    .forceLanguage(BrandIdentifyFromTransactionParams.ForceLanguage.ALBANIAN)
                    .maxSpeed(true)
                    .mcc("mcc")
                    .phone(0.0)
                    .timeoutMs(1000L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun prefetch() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.prefetch(
                BrandPrefetchParams.builder().domain("domain").timeoutMs(1000L).build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun prefetchByEmail() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.prefetchByEmail(
                BrandPrefetchByEmailParams.builder()
                    .email("dev@stainless.com")
                    .timeoutMs(1000L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveByEmail() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.retrieveByEmail(
                BrandRetrieveByEmailParams.builder()
                    .email("dev@stainless.com")
                    .forceLanguage(BrandRetrieveByEmailParams.ForceLanguage.ALBANIAN)
                    .maxSpeed(true)
                    .timeoutMs(1000L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveByIsin() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.retrieveByIsin(
                BrandRetrieveByIsinParams.builder()
                    .isin("SE60513A9993")
                    .forceLanguage(BrandRetrieveByIsinParams.ForceLanguage.ALBANIAN)
                    .maxSpeed(true)
                    .timeoutMs(1000L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveByName() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.retrieveByName(
                BrandRetrieveByNameParams.builder()
                    .name("xxx")
                    .forceLanguage(BrandRetrieveByNameParams.ForceLanguage.ALBANIAN)
                    .maxSpeed(true)
                    .timeoutMs(1000L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveByTicker() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.retrieveByTicker(
                BrandRetrieveByTickerParams.builder()
                    .ticker("ticker")
                    .forceLanguage(BrandRetrieveByTickerParams.ForceLanguage.ALBANIAN)
                    .maxSpeed(true)
                    .tickerExchange(BrandRetrieveByTickerParams.TickerExchange.AMEX)
                    .timeoutMs(1000L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveNaics() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.retrieveNaics(
                BrandRetrieveNaicsParams.builder()
                    .input("input")
                    .maxResults(1L)
                    .minResults(1L)
                    .timeoutMs(1000L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSimplified() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.retrieveSimplified(
                BrandRetrieveSimplifiedParams.builder().domain("domain").timeoutMs(1000L).build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun screenshot() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.screenshot(
                BrandScreenshotParams.builder()
                    .domain("domain")
                    .fullScreenshot(BrandScreenshotParams.FullScreenshot.TRUE)
                    .page(BrandScreenshotParams.Page.LOGIN)
                    .prioritize(BrandScreenshotParams.Prioritize.SPEED)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun styleguide() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.brand()

        val response =
            brandService.styleguide(
                BrandStyleguideParams.builder()
                    .domain("domain")
                    .prioritize(BrandStyleguideParams.Prioritize.SPEED)
                    .timeoutMs(1000L)
                    .build()
            )

        response.validate()
    }
}
