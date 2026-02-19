// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.services.blocking

import com.branddev.api.core.ClientOptions
import com.branddev.api.core.RequestOptions
import com.branddev.api.core.http.HttpResponseFor
import com.branddev.api.models.brand.BrandAiProductParams
import com.branddev.api.models.brand.BrandAiProductResponse
import com.branddev.api.models.brand.BrandAiProductsParams
import com.branddev.api.models.brand.BrandAiProductsResponse
import com.branddev.api.models.brand.BrandAiQueryParams
import com.branddev.api.models.brand.BrandAiQueryResponse
import com.branddev.api.models.brand.BrandFontsParams
import com.branddev.api.models.brand.BrandFontsResponse
import com.branddev.api.models.brand.BrandIdentifyFromTransactionParams
import com.branddev.api.models.brand.BrandIdentifyFromTransactionResponse
import com.branddev.api.models.brand.BrandPrefetchByEmailParams
import com.branddev.api.models.brand.BrandPrefetchByEmailResponse
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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface BrandService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService

    /** Retrieve logos, backdrops, colors, industry, description, and more from any domain */
    fun retrieve(params: BrandRetrieveParams): BrandRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveResponse

    /**
     * Beta feature: Given a single URL, determines if it is a product detail page, classifies the
     * platform/product type, and extracts the product information. Supports Amazon, TikTok Shop,
     * Etsy, and generic ecommerce sites.
     */
    fun aiProduct(params: BrandAiProductParams): BrandAiProductResponse =
        aiProduct(params, RequestOptions.none())

    /** @see aiProduct */
    fun aiProduct(
        params: BrandAiProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandAiProductResponse

    /**
     * Beta feature: Extract product information from a brand's website. Brand.dev will analyze the
     * website and return a list of products with details such as name, description, image, pricing,
     * features, and more.
     */
    fun aiProducts(params: BrandAiProductsParams): BrandAiProductsResponse =
        aiProducts(params, RequestOptions.none())

    /** @see aiProducts */
    fun aiProducts(
        params: BrandAiProductsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandAiProductsResponse

    /** @see aiProducts */
    fun aiProducts(
        body: BrandAiProductsParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandAiProductsResponse =
        aiProducts(BrandAiProductsParams.builder().body(body).build(), requestOptions)

    /** @see aiProducts */
    fun aiProducts(body: BrandAiProductsParams.Body): BrandAiProductsResponse =
        aiProducts(body, RequestOptions.none())

    /** @see aiProducts */
    fun aiProducts(
        byDomain: BrandAiProductsParams.Body.ByDomain,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandAiProductsResponse =
        aiProducts(BrandAiProductsParams.Body.ofByDomain(byDomain), requestOptions)

    /** @see aiProducts */
    fun aiProducts(byDomain: BrandAiProductsParams.Body.ByDomain): BrandAiProductsResponse =
        aiProducts(byDomain, RequestOptions.none())

    /** @see aiProducts */
    fun aiProducts(
        byDirectUrl: BrandAiProductsParams.Body.ByDirectUrl,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandAiProductsResponse =
        aiProducts(BrandAiProductsParams.Body.ofByDirectUrl(byDirectUrl), requestOptions)

    /** @see aiProducts */
    fun aiProducts(byDirectUrl: BrandAiProductsParams.Body.ByDirectUrl): BrandAiProductsResponse =
        aiProducts(byDirectUrl, RequestOptions.none())

    /**
     * Use AI to extract specific data points from a brand's website. The AI will crawl the website
     * and extract the requested information based on the provided data points.
     */
    fun aiQuery(params: BrandAiQueryParams): BrandAiQueryResponse =
        aiQuery(params, RequestOptions.none())

    /** @see aiQuery */
    fun aiQuery(
        params: BrandAiQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandAiQueryResponse

    /**
     * Extract font information from a brand's website including font families, usage statistics,
     * fallbacks, and element/word counts.
     */
    fun fonts(params: BrandFontsParams): BrandFontsResponse = fonts(params, RequestOptions.none())

    /** @see fonts */
    fun fonts(
        params: BrandFontsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandFontsResponse

    /**
     * Endpoint specially designed for platforms that want to identify transaction data by the
     * transaction title.
     */
    fun identifyFromTransaction(
        params: BrandIdentifyFromTransactionParams
    ): BrandIdentifyFromTransactionResponse = identifyFromTransaction(params, RequestOptions.none())

    /** @see identifyFromTransaction */
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

    /** @see prefetch */
    fun prefetch(
        params: BrandPrefetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandPrefetchResponse

    /**
     * Signal that you may fetch brand data for a particular domain soon to improve latency. This
     * endpoint accepts an email address, extracts the domain from it, validates that it's not a
     * disposable or free email provider, and queues the domain for prefetching. This endpoint does
     * not charge credits and is available for paid customers to optimize future requests.
     * [You must be on a paid plan to use this endpoint]
     */
    fun prefetchByEmail(params: BrandPrefetchByEmailParams): BrandPrefetchByEmailResponse =
        prefetchByEmail(params, RequestOptions.none())

    /** @see prefetchByEmail */
    fun prefetchByEmail(
        params: BrandPrefetchByEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandPrefetchByEmailResponse

    /**
     * Retrieve brand information using an email address while detecting disposable and free email
     * addresses. This endpoint extracts the domain from the email address and returns brand data
     * for that domain. Disposable and free email addresses (like gmail.com, yahoo.com) will throw a
     * 422 error.
     */
    fun retrieveByEmail(params: BrandRetrieveByEmailParams): BrandRetrieveByEmailResponse =
        retrieveByEmail(params, RequestOptions.none())

    /** @see retrieveByEmail */
    fun retrieveByEmail(
        params: BrandRetrieveByEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveByEmailResponse

    /**
     * Retrieve brand information using an ISIN (International Securities Identification Number).
     * This endpoint looks up the company associated with the ISIN and returns its brand data.
     */
    fun retrieveByIsin(params: BrandRetrieveByIsinParams): BrandRetrieveByIsinResponse =
        retrieveByIsin(params, RequestOptions.none())

    /** @see retrieveByIsin */
    fun retrieveByIsin(
        params: BrandRetrieveByIsinParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveByIsinResponse

    /**
     * Retrieve brand information using a company name. This endpoint searches for the company by
     * name and returns its brand data.
     */
    fun retrieveByName(params: BrandRetrieveByNameParams): BrandRetrieveByNameResponse =
        retrieveByName(params, RequestOptions.none())

    /** @see retrieveByName */
    fun retrieveByName(
        params: BrandRetrieveByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveByNameResponse

    /**
     * Retrieve brand information using a stock ticker symbol. This endpoint looks up the company
     * associated with the ticker and returns its brand data.
     */
    fun retrieveByTicker(params: BrandRetrieveByTickerParams): BrandRetrieveByTickerResponse =
        retrieveByTicker(params, RequestOptions.none())

    /** @see retrieveByTicker */
    fun retrieveByTicker(
        params: BrandRetrieveByTickerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveByTickerResponse

    /** Endpoint to classify any brand into a 2022 NAICS code. */
    fun retrieveNaics(params: BrandRetrieveNaicsParams): BrandRetrieveNaicsResponse =
        retrieveNaics(params, RequestOptions.none())

    /** @see retrieveNaics */
    fun retrieveNaics(
        params: BrandRetrieveNaicsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveNaicsResponse

    /**
     * Returns a simplified version of brand data containing only essential information: domain,
     * title, colors, logos, and backdrops. This endpoint is optimized for faster responses and
     * reduced data transfer.
     */
    fun retrieveSimplified(params: BrandRetrieveSimplifiedParams): BrandRetrieveSimplifiedResponse =
        retrieveSimplified(params, RequestOptions.none())

    /** @see retrieveSimplified */
    fun retrieveSimplified(
        params: BrandRetrieveSimplifiedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveSimplifiedResponse

    /**
     * Capture a screenshot of a website. Supports both viewport (standard browser view) and
     * full-page screenshots. Can also screenshot specific page types (login, pricing, etc.) by
     * using heuristics to find the appropriate URL. Returns a URL to the uploaded screenshot image
     * hosted on our CDN.
     */
    fun screenshot(params: BrandScreenshotParams): BrandScreenshotResponse =
        screenshot(params, RequestOptions.none())

    /** @see screenshot */
    fun screenshot(
        params: BrandScreenshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandScreenshotResponse

    /**
     * Automatically extract comprehensive design system information from a brand's website
     * including colors, typography, spacing, shadows, and UI components.
     */
    fun styleguide(params: BrandStyleguideParams): BrandStyleguideResponse =
        styleguide(params, RequestOptions.none())

    /** @see styleguide */
    fun styleguide(
        params: BrandStyleguideParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandStyleguideResponse

    /** A view of [BrandService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /brand/retrieve`, but is otherwise the same as
         * [BrandService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: BrandRetrieveParams): HttpResponseFor<BrandRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /brand/ai/product`, but is otherwise the same as
         * [BrandService.aiProduct].
         */
        @MustBeClosed
        fun aiProduct(params: BrandAiProductParams): HttpResponseFor<BrandAiProductResponse> =
            aiProduct(params, RequestOptions.none())

        /** @see aiProduct */
        @MustBeClosed
        fun aiProduct(
            params: BrandAiProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandAiProductResponse>

        /**
         * Returns a raw HTTP response for `post /brand/ai/products`, but is otherwise the same as
         * [BrandService.aiProducts].
         */
        @MustBeClosed
        fun aiProducts(params: BrandAiProductsParams): HttpResponseFor<BrandAiProductsResponse> =
            aiProducts(params, RequestOptions.none())

        /** @see aiProducts */
        @MustBeClosed
        fun aiProducts(
            params: BrandAiProductsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandAiProductsResponse>

        /** @see aiProducts */
        @MustBeClosed
        fun aiProducts(
            body: BrandAiProductsParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandAiProductsResponse> =
            aiProducts(BrandAiProductsParams.builder().body(body).build(), requestOptions)

        /** @see aiProducts */
        @MustBeClosed
        fun aiProducts(body: BrandAiProductsParams.Body): HttpResponseFor<BrandAiProductsResponse> =
            aiProducts(body, RequestOptions.none())

        /** @see aiProducts */
        @MustBeClosed
        fun aiProducts(
            byDomain: BrandAiProductsParams.Body.ByDomain,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandAiProductsResponse> =
            aiProducts(BrandAiProductsParams.Body.ofByDomain(byDomain), requestOptions)

        /** @see aiProducts */
        @MustBeClosed
        fun aiProducts(
            byDomain: BrandAiProductsParams.Body.ByDomain
        ): HttpResponseFor<BrandAiProductsResponse> = aiProducts(byDomain, RequestOptions.none())

        /** @see aiProducts */
        @MustBeClosed
        fun aiProducts(
            byDirectUrl: BrandAiProductsParams.Body.ByDirectUrl,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandAiProductsResponse> =
            aiProducts(BrandAiProductsParams.Body.ofByDirectUrl(byDirectUrl), requestOptions)

        /** @see aiProducts */
        @MustBeClosed
        fun aiProducts(
            byDirectUrl: BrandAiProductsParams.Body.ByDirectUrl
        ): HttpResponseFor<BrandAiProductsResponse> = aiProducts(byDirectUrl, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /brand/ai/query`, but is otherwise the same as
         * [BrandService.aiQuery].
         */
        @MustBeClosed
        fun aiQuery(params: BrandAiQueryParams): HttpResponseFor<BrandAiQueryResponse> =
            aiQuery(params, RequestOptions.none())

        /** @see aiQuery */
        @MustBeClosed
        fun aiQuery(
            params: BrandAiQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandAiQueryResponse>

        /**
         * Returns a raw HTTP response for `get /brand/fonts`, but is otherwise the same as
         * [BrandService.fonts].
         */
        @MustBeClosed
        fun fonts(params: BrandFontsParams): HttpResponseFor<BrandFontsResponse> =
            fonts(params, RequestOptions.none())

        /** @see fonts */
        @MustBeClosed
        fun fonts(
            params: BrandFontsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandFontsResponse>

        /**
         * Returns a raw HTTP response for `get /brand/transaction_identifier`, but is otherwise the
         * same as [BrandService.identifyFromTransaction].
         */
        @MustBeClosed
        fun identifyFromTransaction(
            params: BrandIdentifyFromTransactionParams
        ): HttpResponseFor<BrandIdentifyFromTransactionResponse> =
            identifyFromTransaction(params, RequestOptions.none())

        /** @see identifyFromTransaction */
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

        /** @see prefetch */
        @MustBeClosed
        fun prefetch(
            params: BrandPrefetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandPrefetchResponse>

        /**
         * Returns a raw HTTP response for `post /brand/prefetch-by-email`, but is otherwise the
         * same as [BrandService.prefetchByEmail].
         */
        @MustBeClosed
        fun prefetchByEmail(
            params: BrandPrefetchByEmailParams
        ): HttpResponseFor<BrandPrefetchByEmailResponse> =
            prefetchByEmail(params, RequestOptions.none())

        /** @see prefetchByEmail */
        @MustBeClosed
        fun prefetchByEmail(
            params: BrandPrefetchByEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandPrefetchByEmailResponse>

        /**
         * Returns a raw HTTP response for `get /brand/retrieve-by-email`, but is otherwise the same
         * as [BrandService.retrieveByEmail].
         */
        @MustBeClosed
        fun retrieveByEmail(
            params: BrandRetrieveByEmailParams
        ): HttpResponseFor<BrandRetrieveByEmailResponse> =
            retrieveByEmail(params, RequestOptions.none())

        /** @see retrieveByEmail */
        @MustBeClosed
        fun retrieveByEmail(
            params: BrandRetrieveByEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveByEmailResponse>

        /**
         * Returns a raw HTTP response for `get /brand/retrieve-by-isin`, but is otherwise the same
         * as [BrandService.retrieveByIsin].
         */
        @MustBeClosed
        fun retrieveByIsin(
            params: BrandRetrieveByIsinParams
        ): HttpResponseFor<BrandRetrieveByIsinResponse> =
            retrieveByIsin(params, RequestOptions.none())

        /** @see retrieveByIsin */
        @MustBeClosed
        fun retrieveByIsin(
            params: BrandRetrieveByIsinParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveByIsinResponse>

        /**
         * Returns a raw HTTP response for `get /brand/retrieve-by-name`, but is otherwise the same
         * as [BrandService.retrieveByName].
         */
        @MustBeClosed
        fun retrieveByName(
            params: BrandRetrieveByNameParams
        ): HttpResponseFor<BrandRetrieveByNameResponse> =
            retrieveByName(params, RequestOptions.none())

        /** @see retrieveByName */
        @MustBeClosed
        fun retrieveByName(
            params: BrandRetrieveByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveByNameResponse>

        /**
         * Returns a raw HTTP response for `get /brand/retrieve-by-ticker`, but is otherwise the
         * same as [BrandService.retrieveByTicker].
         */
        @MustBeClosed
        fun retrieveByTicker(
            params: BrandRetrieveByTickerParams
        ): HttpResponseFor<BrandRetrieveByTickerResponse> =
            retrieveByTicker(params, RequestOptions.none())

        /** @see retrieveByTicker */
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

        /** @see retrieveNaics */
        @MustBeClosed
        fun retrieveNaics(
            params: BrandRetrieveNaicsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveNaicsResponse>

        /**
         * Returns a raw HTTP response for `get /brand/retrieve-simplified`, but is otherwise the
         * same as [BrandService.retrieveSimplified].
         */
        @MustBeClosed
        fun retrieveSimplified(
            params: BrandRetrieveSimplifiedParams
        ): HttpResponseFor<BrandRetrieveSimplifiedResponse> =
            retrieveSimplified(params, RequestOptions.none())

        /** @see retrieveSimplified */
        @MustBeClosed
        fun retrieveSimplified(
            params: BrandRetrieveSimplifiedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveSimplifiedResponse>

        /**
         * Returns a raw HTTP response for `get /brand/screenshot`, but is otherwise the same as
         * [BrandService.screenshot].
         */
        @MustBeClosed
        fun screenshot(params: BrandScreenshotParams): HttpResponseFor<BrandScreenshotResponse> =
            screenshot(params, RequestOptions.none())

        /** @see screenshot */
        @MustBeClosed
        fun screenshot(
            params: BrandScreenshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandScreenshotResponse>

        /**
         * Returns a raw HTTP response for `get /brand/styleguide`, but is otherwise the same as
         * [BrandService.styleguide].
         */
        @MustBeClosed
        fun styleguide(params: BrandStyleguideParams): HttpResponseFor<BrandStyleguideResponse> =
            styleguide(params, RequestOptions.none())

        /** @see styleguide */
        @MustBeClosed
        fun styleguide(
            params: BrandStyleguideParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandStyleguideResponse>
    }
}
