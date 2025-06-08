// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.services.async

import com.branddev.api.TestServerExtension
import com.branddev.api.client.okhttp.BrandDevOkHttpClientAsync
import com.branddev.api.models.brand.BrandAiQueryParams
import com.branddev.api.models.brand.BrandIdentifyFromTransactionParams
import com.branddev.api.models.brand.BrandPrefetchParams
import com.branddev.api.models.brand.BrandRetrieveByTickerParams
import com.branddev.api.models.brand.BrandRetrieveNaicsParams
import com.branddev.api.models.brand.BrandRetrieveParams
import com.branddev.api.models.brand.BrandSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BrandServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
                    .timeoutMs(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
                BrandRetrieveByTickerParams.builder().ticker("ticker").timeoutMs(1L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun search() {
        val client =
            BrandDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brand()

        val responseFuture =
            brandServiceAsync.search(
                BrandSearchParams.builder().query("query").timeoutMs(1L).build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
