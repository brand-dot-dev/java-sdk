// File generated from our OpenAPI spec by Stainless.

package com.configure_me_branddev.api.services

import com.configure_me_branddev.api.client.BrandDevClient
import com.configure_me_branddev.api.client.okhttp.BrandDevOkHttpClient
import com.configure_me_branddev.api.core.JsonValue
import com.configure_me_branddev.api.core.http.Headers
import com.configure_me_branddev.api.core.jsonMapper
import com.configure_me_branddev.api.errors.BadRequestException
import com.configure_me_branddev.api.errors.BrandDevException
import com.configure_me_branddev.api.errors.InternalServerException
import com.configure_me_branddev.api.errors.NotFoundException
import com.configure_me_branddev.api.errors.PermissionDeniedException
import com.configure_me_branddev.api.errors.RateLimitException
import com.configure_me_branddev.api.errors.UnauthorizedException
import com.configure_me_branddev.api.errors.UnexpectedStatusCodeException
import com.configure_me_branddev.api.errors.UnprocessableEntityException
import com.configure_me_branddev.api.models.brand.BrandRetrieveParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: BrandDevClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            BrandDevOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun brandRetrieve400() {
        val brandService = client.brand()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                brandService.retrieve(
                    BrandRetrieveParams.builder()
                        .domain("domain")
                        .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun brandRetrieve401() {
        val brandService = client.brand()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                brandService.retrieve(
                    BrandRetrieveParams.builder()
                        .domain("domain")
                        .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun brandRetrieve403() {
        val brandService = client.brand()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                brandService.retrieve(
                    BrandRetrieveParams.builder()
                        .domain("domain")
                        .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun brandRetrieve404() {
        val brandService = client.brand()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                brandService.retrieve(
                    BrandRetrieveParams.builder()
                        .domain("domain")
                        .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun brandRetrieve422() {
        val brandService = client.brand()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                brandService.retrieve(
                    BrandRetrieveParams.builder()
                        .domain("domain")
                        .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun brandRetrieve429() {
        val brandService = client.brand()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                brandService.retrieve(
                    BrandRetrieveParams.builder()
                        .domain("domain")
                        .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun brandRetrieve500() {
        val brandService = client.brand()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                brandService.retrieve(
                    BrandRetrieveParams.builder()
                        .domain("domain")
                        .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun brandRetrieve999() {
        val brandService = client.brand()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                brandService.retrieve(
                    BrandRetrieveParams.builder()
                        .domain("domain")
                        .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun brandRetrieveInvalidJsonBody() {
        val brandService = client.brand()
        stubFor(
            get(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<BrandDevException> {
                brandService.retrieve(
                    BrandRetrieveParams.builder()
                        .domain("domain")
                        .forceLanguage(BrandRetrieveParams.ForceLanguage.ALBANIAN)
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
