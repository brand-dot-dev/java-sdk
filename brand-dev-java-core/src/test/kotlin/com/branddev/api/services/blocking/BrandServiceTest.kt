// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.services.blocking

import com.branddev.api.TestServerExtension
import com.branddev.api.client.okhttp.BrandDevOkHttpClient
import com.branddev.api.models.brand.BrandIdentifyFromTransactionParams
import com.branddev.api.models.brand.BrandRetrieveByTickerParams
import com.branddev.api.models.brand.BrandRetrieveNaicsParams
import com.branddev.api.models.brand.BrandRetrieveParams
import com.branddev.api.models.brand.BrandSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BrandServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            BrandDevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.brand()

        val brand =
            brandService.retrieve(
                BrandRetrieveParams.builder()
                    .domain("domain")
                    .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                    .build()
            )

        brand.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun identifyFromTransaction() {
        val client =
            BrandDevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.brand()

        val response =
            brandService.identifyFromTransaction(
                BrandIdentifyFromTransactionParams.builder()
                    .transactionInfo("transaction_info")
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveByTicker() {
        val client =
            BrandDevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.brand()

        val response =
            brandService.retrieveByTicker(
                BrandRetrieveByTickerParams.builder().ticker("ticker").build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveNaics() {
        val client =
            BrandDevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.brand()

        val response =
            brandService.retrieveNaics(BrandRetrieveNaicsParams.builder().input("input").build())

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun search() {
        val client =
            BrandDevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.brand()

        val response = brandService.search(BrandSearchParams.builder().query("query").build())

        response.forEach { it.validate() }
    }
}
