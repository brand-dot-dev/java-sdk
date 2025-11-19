// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.services.async

import com.branddev.api.core.ClientOptions
import com.branddev.api.core.RequestOptions
import com.branddev.api.core.http.HttpResponseFor
import com.branddev.api.models.brand.BrandAiQueryParams
import com.branddev.api.models.brand.BrandAiQueryResponse
import com.branddev.api.models.brand.BrandIdentifyFromTransactionParams
import com.branddev.api.models.brand.BrandIdentifyFromTransactionResponse
import com.branddev.api.models.brand.BrandPrefetchParams
import com.branddev.api.models.brand.BrandPrefetchResponse
import com.branddev.api.models.brand.BrandRetrieveByEmailParams
import com.branddev.api.models.brand.BrandRetrieveByEmailResponse
import com.branddev.api.models.brand.BrandRetrieveByIsinParams
import com.branddev.api.models.brand.BrandRetrieveByIsinResponse
import com.branddev.api.models.brand.BrandRetrieveByNameParams
import com.branddev.api.models.brand.BrandRetrieveByNameResponse
import com.branddev.api.models.brand.BrandRetrieveByTickerParams
import com.branddev.api.models.brand.BrandRetrieveByTickerResponse
import com.branddev.api.models.brand.BrandRetrieveNaicsParams
import com.branddev.api.models.brand.BrandRetrieveNaicsResponse
import com.branddev.api.models.brand.BrandRetrieveParams
import com.branddev.api.models.brand.BrandRetrieveResponse
import com.branddev.api.models.brand.BrandRetrieveSimplifiedParams
import com.branddev.api.models.brand.BrandRetrieveSimplifiedResponse
import com.branddev.api.models.brand.BrandScreenshotParams
import com.branddev.api.models.brand.BrandScreenshotResponse
import com.branddev.api.models.brand.BrandStyleguideParams
import com.branddev.api.models.brand.BrandStyleguideResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BrandServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandServiceAsync

    /** Retrieve logos, backdrops, colors, industry, description, and more from any domain */
    fun retrieve(): CompletableFuture<BrandRetrieveResponse> = retrieve(BrandRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams = BrandRetrieveParams.none()
    ): CompletableFuture<BrandRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<BrandRetrieveResponse> =
        retrieve(BrandRetrieveParams.none(), requestOptions)

    /**
     * Beta feature: Use AI to extract specific data points from a brand's website. The AI will
     * crawl the website and extract the requested information based on the provided data points.
     */
    fun aiQuery(params: BrandAiQueryParams): CompletableFuture<BrandAiQueryResponse> =
        aiQuery(params, RequestOptions.none())

    /** @see aiQuery */
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

    /** @see identifyFromTransaction */
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

    /** @see prefetch */
    fun prefetch(
        params: BrandPrefetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandPrefetchResponse>

    /**
     * Retrieve brand information using an email address while detecting disposable and free email
     * addresses. This endpoint extracts the domain from the email address and returns brand data
     * for that domain. Disposable and free email addresses (like gmail.com, yahoo.com) will throw a
     * 422 error.
     */
    fun retrieveByEmail(
        params: BrandRetrieveByEmailParams
    ): CompletableFuture<BrandRetrieveByEmailResponse> =
        retrieveByEmail(params, RequestOptions.none())

    /** @see retrieveByEmail */
    fun retrieveByEmail(
        params: BrandRetrieveByEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveByEmailResponse>

    /**
     * Retrieve brand information using an ISIN (International Securities Identification Number).
     * This endpoint looks up the company associated with the ISIN and returns its brand data.
     */
    fun retrieveByIsin(
        params: BrandRetrieveByIsinParams
    ): CompletableFuture<BrandRetrieveByIsinResponse> =
        retrieveByIsin(params, RequestOptions.none())

    /** @see retrieveByIsin */
    fun retrieveByIsin(
        params: BrandRetrieveByIsinParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveByIsinResponse>

    /**
     * Retrieve brand information using a company name. This endpoint searches for the company by
     * name and returns its brand data.
     */
    fun retrieveByName(
        params: BrandRetrieveByNameParams
    ): CompletableFuture<BrandRetrieveByNameResponse> =
        retrieveByName(params, RequestOptions.none())

    /** @see retrieveByName */
    fun retrieveByName(
        params: BrandRetrieveByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveByNameResponse>

    /**
     * Retrieve brand information using a stock ticker symbol. This endpoint looks up the company
     * associated with the ticker and returns its brand data.
     */
    fun retrieveByTicker(
        params: BrandRetrieveByTickerParams
    ): CompletableFuture<BrandRetrieveByTickerResponse> =
        retrieveByTicker(params, RequestOptions.none())

    /** @see retrieveByTicker */
    fun retrieveByTicker(
        params: BrandRetrieveByTickerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveByTickerResponse>

    /** Endpoint to classify any brand into a 2022 NAICS code. */
    fun retrieveNaics(
        params: BrandRetrieveNaicsParams
    ): CompletableFuture<BrandRetrieveNaicsResponse> = retrieveNaics(params, RequestOptions.none())

    /** @see retrieveNaics */
    fun retrieveNaics(
        params: BrandRetrieveNaicsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveNaicsResponse>

    /**
     * Returns a simplified version of brand data containing only essential information: domain,
     * title, colors, logos, and backdrops. This endpoint is optimized for faster responses and
     * reduced data transfer.
     */
    fun retrieveSimplified(
        params: BrandRetrieveSimplifiedParams
    ): CompletableFuture<BrandRetrieveSimplifiedResponse> =
        retrieveSimplified(params, RequestOptions.none())

    /** @see retrieveSimplified */
    fun retrieveSimplified(
        params: BrandRetrieveSimplifiedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveSimplifiedResponse>

    /**
     * Beta feature: Capture a screenshot of a website. Supports both viewport (standard browser
     * view) and full-page screenshots. Can also screenshot specific page types (login, pricing,
     * etc.) by using heuristics to find the appropriate URL. Returns a URL to the uploaded
     * screenshot image hosted on our CDN.
     */
    fun screenshot(params: BrandScreenshotParams): CompletableFuture<BrandScreenshotResponse> =
        screenshot(params, RequestOptions.none())

    /** @see screenshot */
    fun screenshot(
        params: BrandScreenshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandScreenshotResponse>

    /**
     * Beta feature: Automatically extract comprehensive design system information from a brand's
     * website including colors, typography, spacing, shadows, and UI components.
     */
    fun styleguide(params: BrandStyleguideParams): CompletableFuture<BrandStyleguideResponse> =
        styleguide(params, RequestOptions.none())

    /** @see styleguide */
    fun styleguide(
        params: BrandStyleguideParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandStyleguideResponse>

    /** A view of [BrandServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /brand/retrieve`, but is otherwise the same as
         * [BrandServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(BrandRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BrandRetrieveParams = BrandRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /brand/ai/query`, but is otherwise the same as
         * [BrandServiceAsync.aiQuery].
         */
        fun aiQuery(
            params: BrandAiQueryParams
        ): CompletableFuture<HttpResponseFor<BrandAiQueryResponse>> =
            aiQuery(params, RequestOptions.none())

        /** @see aiQuery */
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

        /** @see identifyFromTransaction */
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

        /** @see prefetch */
        fun prefetch(
            params: BrandPrefetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandPrefetchResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/retrieve-by-email`, but is otherwise the same
         * as [BrandServiceAsync.retrieveByEmail].
         */
        fun retrieveByEmail(
            params: BrandRetrieveByEmailParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByEmailResponse>> =
            retrieveByEmail(params, RequestOptions.none())

        /** @see retrieveByEmail */
        fun retrieveByEmail(
            params: BrandRetrieveByEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByEmailResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/retrieve-by-isin`, but is otherwise the same
         * as [BrandServiceAsync.retrieveByIsin].
         */
        fun retrieveByIsin(
            params: BrandRetrieveByIsinParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByIsinResponse>> =
            retrieveByIsin(params, RequestOptions.none())

        /** @see retrieveByIsin */
        fun retrieveByIsin(
            params: BrandRetrieveByIsinParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByIsinResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/retrieve-by-name`, but is otherwise the same
         * as [BrandServiceAsync.retrieveByName].
         */
        fun retrieveByName(
            params: BrandRetrieveByNameParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByNameResponse>> =
            retrieveByName(params, RequestOptions.none())

        /** @see retrieveByName */
        fun retrieveByName(
            params: BrandRetrieveByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByNameResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/retrieve-by-ticker`, but is otherwise the
         * same as [BrandServiceAsync.retrieveByTicker].
         */
        fun retrieveByTicker(
            params: BrandRetrieveByTickerParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByTickerResponse>> =
            retrieveByTicker(params, RequestOptions.none())

        /** @see retrieveByTicker */
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

        /** @see retrieveNaics */
        fun retrieveNaics(
            params: BrandRetrieveNaicsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveNaicsResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/retrieve-simplified`, but is otherwise the
         * same as [BrandServiceAsync.retrieveSimplified].
         */
        fun retrieveSimplified(
            params: BrandRetrieveSimplifiedParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveSimplifiedResponse>> =
            retrieveSimplified(params, RequestOptions.none())

        /** @see retrieveSimplified */
        fun retrieveSimplified(
            params: BrandRetrieveSimplifiedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveSimplifiedResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/screenshot`, but is otherwise the same as
         * [BrandServiceAsync.screenshot].
         */
        fun screenshot(
            params: BrandScreenshotParams
        ): CompletableFuture<HttpResponseFor<BrandScreenshotResponse>> =
            screenshot(params, RequestOptions.none())

        /** @see screenshot */
        fun screenshot(
            params: BrandScreenshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandScreenshotResponse>>

        /**
         * Returns a raw HTTP response for `get /brand/styleguide`, but is otherwise the same as
         * [BrandServiceAsync.styleguide].
         */
        fun styleguide(
            params: BrandStyleguideParams
        ): CompletableFuture<HttpResponseFor<BrandStyleguideResponse>> =
            styleguide(params, RequestOptions.none())

        /** @see styleguide */
        fun styleguide(
            params: BrandStyleguideParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandStyleguideResponse>>
    }
}
