// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.services.async

import com.branddev.api.core.RequestOptions
import com.branddev.api.core.http.HttpResponseFor
import com.branddev.api.models.brand.BrandAiQueryParams
import com.branddev.api.models.brand.BrandAiQueryResponse
import com.branddev.api.models.brand.BrandIdentifyFromTransactionParams
import com.branddev.api.models.brand.BrandIdentifyFromTransactionResponse
import com.branddev.api.models.brand.BrandPrefetchParams
import com.branddev.api.models.brand.BrandPrefetchResponse
import com.branddev.api.models.brand.BrandRetrieveByTickerParams
import com.branddev.api.models.brand.BrandRetrieveByTickerResponse
import com.branddev.api.models.brand.BrandRetrieveNaicsParams
import com.branddev.api.models.brand.BrandRetrieveNaicsResponse
import com.branddev.api.models.brand.BrandRetrieveParams
import com.branddev.api.models.brand.BrandRetrieveResponse
import com.branddev.api.models.brand.BrandSearchParams
import com.branddev.api.models.brand.BrandSearchResponse
import java.util.concurrent.CompletableFuture

interface BrandServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve brand data by domain */
    fun retrieve(params: BrandRetrieveParams): CompletableFuture<BrandRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveResponse>

    /**
     * Beta feature: Use AI to extract specific data points from a brand's website. The AI will
     * crawl the website and extract the requested information based on the provided data points.
     */
    fun aiQuery(params: BrandAiQueryParams): CompletableFuture<BrandAiQueryResponse> =
        aiQuery(params, RequestOptions.none())

    /** @see [aiQuery] */
    fun aiQuery(
        params: BrandAiQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandAiQueryResponse>

    /**
     * Endpoint specially designed for platforms that want to identify transaction data by the
     * transaction title.
     */
    fun identifyFromTransaction(
        params: BrandIdentifyFromTransactionParams
    ): CompletableFuture<BrandIdentifyFromTransactionResponse> =
        identifyFromTransaction(params, RequestOptions.none())

    /** @see [identifyFromTransaction] */
    fun identifyFromTransaction(
        params: BrandIdentifyFromTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandIdentifyFromTransactionResponse>

    /**
     * Signal that you may fetch brand data for a particular domain soon to improve latency. This
     * endpoint does not charge credits and is available for paid customers to optimize future
     * requests. [You must be on a paid plan to use this endpoint]
     */
    fun prefetch(params: BrandPrefetchParams): CompletableFuture<BrandPrefetchResponse> =
        prefetch(params, RequestOptions.none())

    /** @see [prefetch] */
    fun prefetch(
        params: BrandPrefetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandPrefetchResponse>

    /** Retrieve brand data by stock ticker (e.g. AAPL, TSLA, etc.) */
    fun retrieveByTicker(
        params: BrandRetrieveByTickerParams
    ): CompletableFuture<BrandRetrieveByTickerResponse> =
        retrieveByTicker(params, RequestOptions.none())

    /** @see [retrieveByTicker] */
    fun retrieveByTicker(
        params: BrandRetrieveByTickerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveByTickerResponse>

    /** Endpoint to classify any brand into a 2022 NAICS code. */
    fun retrieveNaics(
        params: BrandRetrieveNaicsParams
    ): CompletableFuture<BrandRetrieveNaicsResponse> = retrieveNaics(params, RequestOptions.none())

    /** @see [retrieveNaics] */
    fun retrieveNaics(
        params: BrandRetrieveNaicsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveNaicsResponse>

    /** Search brands by query */
    fun search(params: BrandSearchParams): CompletableFuture<List<BrandSearchResponse>> =
        search(params, RequestOptions.none())

    /** @see [search] */
    fun search(
        params: BrandSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BrandSearchResponse>>

    /** A view of [BrandServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /brand/retrieve`, but is otherwise the same as
         * [BrandServiceAsync.retrieve].
         */
        fun retrieve(
            params: BrandRetrieveParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post /brand/ai/query`, but is otherwise the same as
         * [BrandServiceAsync.aiQuery].
         */
        fun aiQuery(
            params: BrandAiQueryParams
        ): CompletableFuture<HttpResponseFor<BrandAiQueryResponse>> =
            aiQuery(params, RequestOptions.none())

        /** @see [aiQuery] */
        fun aiQuery(
            params: BrandAiQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandAiQueryResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/transaction_identifier`, but is otherwise the
         * same as [BrandServiceAsync.identifyFromTransaction].
         */
        fun identifyFromTransaction(
            params: BrandIdentifyFromTransactionParams
        ): CompletableFuture<HttpResponseFor<BrandIdentifyFromTransactionResponse>> =
            identifyFromTransaction(params, RequestOptions.none())

        /** @see [identifyFromTransaction] */
        fun identifyFromTransaction(
            params: BrandIdentifyFromTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandIdentifyFromTransactionResponse>>

        /**
         * Returns a raw HTTP response for `post /brand/prefetch`, but is otherwise the same as
         * [BrandServiceAsync.prefetch].
         */
        fun prefetch(
            params: BrandPrefetchParams
        ): CompletableFuture<HttpResponseFor<BrandPrefetchResponse>> =
            prefetch(params, RequestOptions.none())

        /** @see [prefetch] */
        fun prefetch(
            params: BrandPrefetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandPrefetchResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/retrieve-by-ticker`, but is otherwise the
         * same as [BrandServiceAsync.retrieveByTicker].
         */
        fun retrieveByTicker(
            params: BrandRetrieveByTickerParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByTickerResponse>> =
            retrieveByTicker(params, RequestOptions.none())

        /** @see [retrieveByTicker] */
        fun retrieveByTicker(
            params: BrandRetrieveByTickerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByTickerResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/naics`, but is otherwise the same as
         * [BrandServiceAsync.retrieveNaics].
         */
        fun retrieveNaics(
            params: BrandRetrieveNaicsParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveNaicsResponse>> =
            retrieveNaics(params, RequestOptions.none())

        /** @see [retrieveNaics] */
        fun retrieveNaics(
            params: BrandRetrieveNaicsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveNaicsResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/search`, but is otherwise the same as
         * [BrandServiceAsync.search].
         */
        fun search(
            params: BrandSearchParams
        ): CompletableFuture<HttpResponseFor<List<BrandSearchResponse>>> =
            search(params, RequestOptions.none())

        /** @see [search] */
        fun search(
            params: BrandSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BrandSearchResponse>>>
    }
}
