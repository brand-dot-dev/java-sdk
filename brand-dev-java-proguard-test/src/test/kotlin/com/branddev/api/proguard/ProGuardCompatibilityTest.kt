// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.proguard

import com.branddev.api.client.okhttp.BrandDevOkHttpClient
import com.branddev.api.core.jsonMapper
import com.branddev.api.models.brand.BrandRetrieveResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @BeforeAll
        @JvmStatic
        fun setUp() {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/brand-dev-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = BrandDevOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.brand()).isNotNull()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun brandRetrieveResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val brandRetrieveResponse =
            BrandRetrieveResponse.builder()
                .brand(
                    BrandRetrieveResponse.Brand.builder()
                        .address(
                            BrandRetrieveResponse.Brand.Address.builder()
                                .city("city")
                                .country("country")
                                .countryCode("country_code")
                                .postalCode("postal_code")
                                .stateCode("state_code")
                                .stateProvince("state_province")
                                .street("street")
                                .build()
                        )
                        .addBackdrop(
                            BrandRetrieveResponse.Brand.Backdrop.builder()
                                .addColor(
                                    BrandRetrieveResponse.Brand.Backdrop.Color.builder()
                                        .hex("hex")
                                        .name("name")
                                        .build()
                                )
                                .resolution(
                                    BrandRetrieveResponse.Brand.Backdrop.Resolution.builder()
                                        .height(0L)
                                        .width(0L)
                                        .build()
                                )
                                .url("url")
                                .build()
                        )
                        .addColor(
                            BrandRetrieveResponse.Brand.Color.builder()
                                .hex("hex")
                                .name("name")
                                .build()
                        )
                        .description("description")
                        .domain("domain")
                        .isNsfw(true)
                        .addLogo(
                            BrandRetrieveResponse.Brand.Logo.builder()
                                .addColor(
                                    BrandRetrieveResponse.Brand.Logo.Color.builder()
                                        .hex("hex")
                                        .name("name")
                                        .build()
                                )
                                .group(0L)
                                .mode("mode")
                                .resolution(
                                    BrandRetrieveResponse.Brand.Logo.Resolution.builder()
                                        .height(0L)
                                        .width(0L)
                                        .build()
                                )
                                .url("url")
                                .build()
                        )
                        .slogan("slogan")
                        .addSocial(
                            BrandRetrieveResponse.Brand.Social.builder()
                                .type("type")
                                .url("url")
                                .build()
                        )
                        .stock(
                            BrandRetrieveResponse.Brand.Stock.builder()
                                .exchange("exchange")
                                .ticker("ticker")
                                .build()
                        )
                        .title("title")
                        .build()
                )
                .code(0L)
                .status("status")
                .build()

        val roundtrippedBrandRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandRetrieveResponse),
                jacksonTypeRef<BrandRetrieveResponse>(),
            )

        assertThat(roundtrippedBrandRetrieveResponse).isEqualTo(brandRetrieveResponse)
    }
}
