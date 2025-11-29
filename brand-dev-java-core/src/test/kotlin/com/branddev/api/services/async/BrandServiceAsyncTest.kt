// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.services.async

import com.branddev.api.TestServerExtension
import com.branddev.api.client.okhttp.BrandDevOkHttpClientAsync
import com.branddev.api.models.brand.BrandAiQueryParams
import com.branddev.api.models.brand.BrandFontsParams
import com.branddev.api.models.brand.BrandIdentifyFromTransactionParams
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
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BrandServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val brandFuture =
            brandServiceAsync.retrieve(
                BrandRetrieveParams.builder()
                    .domain("domain")
                    .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                    .maxSpeed(true)
                    .timeoutMs(1L)
                    .build()
            )

        val brand = brandFuture.get()
        brand.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun aiQuery() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val responseFuture =
            brandServiceAsync.aiQuery(
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
                    .specificPages(
                        BrandAiQueryParams.SpecificPages.builder()
                            .aboutUs(true)
                            .blog(true)
                            .careers(true)
                            .contactUs(true)
                            .faq(true)
                            .homePage(true)
                            .privacyPolicy(true)
                            .termsAndConditions(true)
                            .build()
                    )
                    .timeoutMs(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun fonts() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val responseFuture =
            brandServiceAsync.fonts(
                BrandFontsParams.builder().domain("domain").timeoutMs(1L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun identifyFromTransaction() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val responseFuture =
            brandServiceAsync.identifyFromTransaction(
                BrandIdentifyFromTransactionParams.builder()
                    .transactionInfo("transaction_info")
                    .city("city")
                    .countryGl(BrandIdentifyFromTransactionParams.CountryGl.AD)
                    .forceLanguage(BrandIdentifyFromTransactionParams.ForceLanguage.ALBANIAN)
                    .maxSpeed(true)
                    .mcc("mcc")
                    .timeoutMs(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun prefetch() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val responseFuture =
            brandServiceAsync.prefetch(
                BrandPrefetchParams.builder().domain("domain").timeoutMs(1L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveByEmail() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val responseFuture =
            brandServiceAsync.retrieveByEmail(
                BrandRetrieveByEmailParams.builder()
                    .email("dev@stainless.com")
                    .forceLanguage(BrandRetrieveByEmailParams.ForceLanguage.ALBANIAN)
                    .maxSpeed(true)
                    .timeoutMs(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveByIsin() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val responseFuture =
            brandServiceAsync.retrieveByIsin(
                BrandRetrieveByIsinParams.builder()
                    .isin("SE60513A9993")
                    .forceLanguage(BrandRetrieveByIsinParams.ForceLanguage.ALBANIAN)
                    .maxSpeed(true)
                    .timeoutMs(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveByName() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val responseFuture =
            brandServiceAsync.retrieveByName(
                BrandRetrieveByNameParams.builder()
                    .name("xxx")
                    .forceLanguage(BrandRetrieveByNameParams.ForceLanguage.ALBANIAN)
                    .maxSpeed(true)
                    .timeoutMs(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveByTicker() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val responseFuture =
            brandServiceAsync.retrieveByTicker(
                BrandRetrieveByTickerParams.builder()
                    .ticker("ticker")
                    .forceLanguage(BrandRetrieveByTickerParams.ForceLanguage.ALBANIAN)
                    .maxSpeed(true)
                    .tickerExchange(BrandRetrieveByTickerParams.TickerExchange.AMEX)
                    .timeoutMs(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveNaics() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val responseFuture =
            brandServiceAsync.retrieveNaics(
                BrandRetrieveNaicsParams.builder().input("input").timeoutMs(1L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSimplified() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val responseFuture =
            brandServiceAsync.retrieveSimplified(
                BrandRetrieveSimplifiedParams.builder().domain("domain").timeoutMs(1L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun screenshot() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val responseFuture =
            brandServiceAsync.screenshot(
                BrandScreenshotParams.builder()
                    .domain("domain")
                    .fullScreenshot(BrandScreenshotParams.FullScreenshot.TRUE)
                    .page(BrandScreenshotParams.Page.LOGIN)
                    .prioritize(BrandScreenshotParams.Prioritize.SPEED)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun styleguide() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val responseFuture =
            brandServiceAsync.styleguide(
                BrandStyleguideParams.builder()
                    .domain("domain")
                    .prioritize(BrandStyleguideParams.Prioritize.SPEED)
                    .timeoutMs(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
