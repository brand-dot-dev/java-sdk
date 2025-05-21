// File generated from our OpenAPI spec by Stainless.

package com.configure_me_branddev.api.client

import com.configure_me_branddev.api.core.ClientOptions
import com.configure_me_branddev.api.core.getPackageVersion
import com.configure_me_branddev.api.services.async.BrandServiceAsync
import com.configure_me_branddev.api.services.async.BrandServiceAsyncImpl

class BrandDevClientAsyncImpl(private val clientOptions: ClientOptions) : BrandDevClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: BrandDevClient by lazy { BrandDevClientImpl(clientOptions) }

    private val withRawResponse: BrandDevClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val brand: BrandServiceAsync by lazy {
        BrandServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): BrandDevClient = sync

    override fun withRawResponse(): BrandDevClientAsync.WithRawResponse = withRawResponse

    override fun brand(): BrandServiceAsync = brand

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandDevClientAsync.WithRawResponse {

        private val brand: BrandServiceAsync.WithRawResponse by lazy {
            BrandServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun brand(): BrandServiceAsync.WithRawResponse = brand
    }
}
