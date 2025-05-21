// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.client

import com.branddev.api.core.ClientOptions
import com.branddev.api.core.getPackageVersion
import com.branddev.api.services.blocking.BrandService
import com.branddev.api.services.blocking.BrandServiceImpl

class BrandDevClientImpl(private val clientOptions: ClientOptions) : BrandDevClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: BrandDevClientAsync by lazy { BrandDevClientAsyncImpl(clientOptions) }

    private val withRawResponse: BrandDevClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val brand: BrandService by lazy { BrandServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): BrandDevClientAsync = async

    override fun withRawResponse(): BrandDevClient.WithRawResponse = withRawResponse

    override fun brand(): BrandService = brand

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandDevClient.WithRawResponse {

        private val brand: BrandService.WithRawResponse by lazy {
            BrandServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun brand(): BrandService.WithRawResponse = brand
    }
}
