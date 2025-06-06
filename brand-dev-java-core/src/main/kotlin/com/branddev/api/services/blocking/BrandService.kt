// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.services.blocking

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
import com.google.errorprone.annotations.MustBeClosed

interface BrandService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve brand data by domain */
    fun retrieve(params: BrandRetrieveParams): BrandRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveResponse

    /**
     * Beta feature: Use AI to extract specific data points from a brand's website. The AI will
     * crawl the website and extract the requested information based on the provided data points.
     */
    fun aiQuery(params: BrandAiQueryParams): BrandAiQueryResponse =
        aiQuery(params, RequestOptions.none())

    /** @see [aiQuery] */
    fun aiQuery(
        params: BrandAiQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandAiQueryResponse

    /**
     * Endpoint specially designed for platforms that want to identify transaction data by the
     * transaction title.
     */
    fun identifyFromTransaction(
        params: BrandIdentifyFromTransactionParams
    ): BrandIdentifyFromTransactionResponse = identifyFromTransaction(params, RequestOptions.none())

    /** @see [identifyFromTransaction] */
    fun identifyFromTransaction(
        params: BrandIdentifyFromTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandIdentifyFromTransactionResponse

    /**
     * Signal that you may fetch brand data for a particular domain soon to improve latency. This
     * endpoint does not charge credits and is available for paid customers to optimize future
     * requests. [You must be on a paid plan to use this endpoint]
     */
    fun prefetch(params: BrandPrefetchParams): BrandPrefetchResponse =
        prefetch(params, RequestOptions.none())

    /** @see [prefetch] */
    fun prefetch(
        params: BrandPrefetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandPrefetchResponse

    /** Retrieve brand data by stock ticker (e.g. AAPL, TSLA, etc.) */
    fun retrieveByTicker(params: BrandRetrieveByTickerParams): BrandRetrieveByTickerResponse =
        retrieveByTicker(params, RequestOptions.none())

    /** @see [retrieveByTicker] */
    fun retrieveByTicker(
        params: BrandRetrieveByTickerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveByTickerResponse

    /** Endpoint to classify any brand into a 2022 NAICS code. */
    fun retrieveNaics(params: BrandRetrieveNaicsParams): BrandRetrieveNaicsResponse =
        retrieveNaics(params, RequestOptions.none())

    /** @see [retrieveNaics] */
    fun retrieveNaics(
        params: BrandRetrieveNaicsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveNaicsResponse

    /** Search brands by query */
    fun search(params: BrandSearchParams): List<BrandSearchResponse> =
        search(params, RequestOptions.none())

    /** @see [search] */
    fun search(
        params: BrandSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BrandSearchResponse>

    /** A view of [BrandService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /brand/retrieve`, but is otherwise the same as
         * [BrandService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: BrandRetrieveParams): HttpResponseFor<BrandRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /brand/ai/query`, but is otherwise the same as
         * [BrandService.aiQuery].
         */
        @MustBeClosed
        fun aiQuery(params: BrandAiQueryParams): HttpResponseFor<BrandAiQueryResponse> =
            aiQuery(params, RequestOptions.none())

        /** @see [aiQuery] */
        @MustBeClosed
        fun aiQuery(
            params: BrandAiQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandAiQueryResponse>

        /**
         * Returns a raw HTTP response for `get /brand/transaction_identifier`, but is otherwise the
         * same as [BrandService.identifyFromTransaction].
         */
        @MustBeClosed
        fun identifyFromTransaction(
            params: BrandIdentifyFromTransactionParams
        ): HttpResponseFor<BrandIdentifyFromTransactionResponse> =
            identifyFromTransaction(params, RequestOptions.none())

        /** @see [identifyFromTransaction] */
        @MustBeClosed
        fun identifyFromTransaction(
            params: BrandIdentifyFromTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandIdentifyFromTransactionResponse>

        /**
         * Returns a raw HTTP response for `post /brand/prefetch`, but is otherwise the same as
         * [BrandService.prefetch].
         */
        @MustBeClosed
        fun prefetch(params: BrandPrefetchParams): HttpResponseFor<BrandPrefetchResponse> =
            prefetch(params, RequestOptions.none())

        /** @see [prefetch] */
        @MustBeClosed
        fun prefetch(
            params: BrandPrefetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandPrefetchResponse>

        /**
         * Returns a raw HTTP response for `get /brand/retrieve-by-ticker`, but is otherwise the
         * same as [BrandService.retrieveByTicker].
         */
        @MustBeClosed
        fun retrieveByTicker(
            params: BrandRetrieveByTickerParams
        ): HttpResponseFor<BrandRetrieveByTickerResponse> =
            retrieveByTicker(params, RequestOptions.none())

        /** @see [retrieveByTicker] */
        @MustBeClosed
        fun retrieveByTicker(
            params: BrandRetrieveByTickerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveByTickerResponse>

        /**
         * Returns a raw HTTP response for `get /brand/naics`, but is otherwise the same as
         * [BrandService.retrieveNaics].
         */
        @MustBeClosed
        fun retrieveNaics(
            params: BrandRetrieveNaicsParams
        ): HttpResponseFor<BrandRetrieveNaicsResponse> =
            retrieveNaics(params, RequestOptions.none())

        /** @see [retrieveNaics] */
        @MustBeClosed
        fun retrieveNaics(
            params: BrandRetrieveNaicsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveNaicsResponse>

        /**
         * Returns a raw HTTP response for `get /brand/search`, but is otherwise the same as
         * [BrandService.search].
         */
        @MustBeClosed
        fun search(params: BrandSearchParams): HttpResponseFor<List<BrandSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see [search] */
        @MustBeClosed
        fun search(
            params: BrandSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BrandSearchResponse>>
    }
}
