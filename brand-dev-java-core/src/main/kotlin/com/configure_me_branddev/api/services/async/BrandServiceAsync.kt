// File generated from our OpenAPI spec by Stainless.

package com.configure_me_branddev.api.services.async

import com.configure_me_branddev.api.core.RequestOptions
import com.configure_me_branddev.api.core.http.HttpResponseFor
import com.configure_me_branddev.api.models.brand.BrandIdentifyFromTransactionParams
import com.configure_me_branddev.api.models.brand.BrandIdentifyFromTransactionResponse
import com.configure_me_branddev.api.models.brand.BrandRetrieveByTickerParams
import com.configure_me_branddev.api.models.brand.BrandRetrieveByTickerResponse
import com.configure_me_branddev.api.models.brand.BrandRetrieveNaicsParams
import com.configure_me_branddev.api.models.brand.BrandRetrieveNaicsResponse
import com.configure_me_branddev.api.models.brand.BrandRetrieveParams
import com.configure_me_branddev.api.models.brand.BrandRetrieveResponse
import com.configure_me_branddev.api.models.brand.BrandSearchParams
import com.configure_me_branddev.api.models.brand.BrandSearchResponse
import com.google.errorprone.annotations.MustBeClosed
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
        @MustBeClosed
        fun retrieve(
            params: BrandRetrieveParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/transaction_identifier`, but is otherwise the
         * same as [BrandServiceAsync.identifyFromTransaction].
         */
        @MustBeClosed
        fun identifyFromTransaction(
            params: BrandIdentifyFromTransactionParams
        ): CompletableFuture<HttpResponseFor<BrandIdentifyFromTransactionResponse>> =
            identifyFromTransaction(params, RequestOptions.none())

        /** @see [identifyFromTransaction] */
        @MustBeClosed
        fun identifyFromTransaction(
            params: BrandIdentifyFromTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandIdentifyFromTransactionResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/retrieve-by-ticker`, but is otherwise the
         * same as [BrandServiceAsync.retrieveByTicker].
         */
        @MustBeClosed
        fun retrieveByTicker(
            params: BrandRetrieveByTickerParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByTickerResponse>> =
            retrieveByTicker(params, RequestOptions.none())

        /** @see [retrieveByTicker] */
        @MustBeClosed
        fun retrieveByTicker(
            params: BrandRetrieveByTickerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByTickerResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/naics`, but is otherwise the same as
         * [BrandServiceAsync.retrieveNaics].
         */
        @MustBeClosed
        fun retrieveNaics(
            params: BrandRetrieveNaicsParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveNaicsResponse>> =
            retrieveNaics(params, RequestOptions.none())

        /** @see [retrieveNaics] */
        @MustBeClosed
        fun retrieveNaics(
            params: BrandRetrieveNaicsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveNaicsResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/search`, but is otherwise the same as
         * [BrandServiceAsync.search].
         */
        @MustBeClosed
        fun search(
            params: BrandSearchParams
        ): CompletableFuture<HttpResponseFor<List<BrandSearchResponse>>> =
            search(params, RequestOptions.none())

        /** @see [search] */
        @MustBeClosed
        fun search(
            params: BrandSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BrandSearchResponse>>>
    }
}
