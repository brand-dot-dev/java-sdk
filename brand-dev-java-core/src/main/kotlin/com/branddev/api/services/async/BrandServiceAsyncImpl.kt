// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.services.async

import com.branddev.api.core.ClientOptions
import com.branddev.api.core.JsonValue
import com.branddev.api.core.RequestOptions
import com.branddev.api.core.handlers.errorHandler
import com.branddev.api.core.handlers.jsonHandler
import com.branddev.api.core.handlers.withErrorHandler
import com.branddev.api.core.http.HttpMethod
import com.branddev.api.core.http.HttpRequest
import com.branddev.api.core.http.HttpResponse.Handler
import com.branddev.api.core.http.HttpResponseFor
import com.branddev.api.core.http.json
import com.branddev.api.core.http.parseable
import com.branddev.api.core.prepareAsync
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
import java.util.function.Consumer

class BrandServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BrandServiceAsync {

    private val withRawResponse: BrandServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BrandServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandServiceAsync =
        BrandServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandRetrieveResponse> =
        // get /brand/retrieve
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun aiQuery(
        params: BrandAiQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandAiQueryResponse> =
        // post /brand/ai/query
        withRawResponse().aiQuery(params, requestOptions).thenApply { it.parse() }

    override fun identifyFromTransaction(
        params: BrandIdentifyFromTransactionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandIdentifyFromTransactionResponse> =
        // get /brand/transaction_identifier
        withRawResponse().identifyFromTransaction(params, requestOptions).thenApply { it.parse() }

    override fun prefetch(
        params: BrandPrefetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandPrefetchResponse> =
        // post /brand/prefetch
        withRawResponse().prefetch(params, requestOptions).thenApply { it.parse() }

    override fun retrieveByTicker(
        params: BrandRetrieveByTickerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandRetrieveByTickerResponse> =
        // get /brand/retrieve-by-ticker
        withRawResponse().retrieveByTicker(params, requestOptions).thenApply { it.parse() }

    override fun retrieveNaics(
        params: BrandRetrieveNaicsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandRetrieveNaicsResponse> =
        // get /brand/naics
        withRawResponse().retrieveNaics(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: BrandSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<BrandSearchResponse>> =
        // get /brand/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse =
            BrandServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<BrandRetrieveResponse> =
            jsonHandler<BrandRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "retrieve")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val aiQueryHandler: Handler<BrandAiQueryResponse> =
            jsonHandler<BrandAiQueryResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun aiQuery(
            params: BrandAiQueryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandAiQueryResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "ai", "query")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { aiQueryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val identifyFromTransactionHandler: Handler<BrandIdentifyFromTransactionResponse> =
            jsonHandler<BrandIdentifyFromTransactionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun identifyFromTransaction(
            params: BrandIdentifyFromTransactionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandIdentifyFromTransactionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "transaction_identifier")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { identifyFromTransactionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val prefetchHandler: Handler<BrandPrefetchResponse> =
            jsonHandler<BrandPrefetchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun prefetch(
            params: BrandPrefetchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandPrefetchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "prefetch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { prefetchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveByTickerHandler: Handler<BrandRetrieveByTickerResponse> =
            jsonHandler<BrandRetrieveByTickerResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveByTicker(
            params: BrandRetrieveByTickerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByTickerResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "retrieve-by-ticker")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveByTickerHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveNaicsHandler: Handler<BrandRetrieveNaicsResponse> =
            jsonHandler<BrandRetrieveNaicsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveNaics(
            params: BrandRetrieveNaicsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandRetrieveNaicsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "naics")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveNaicsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchHandler: Handler<List<BrandSearchResponse>> =
            jsonHandler<List<BrandSearchResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun search(
            params: BrandSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<BrandSearchResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "search")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { searchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }
    }
}
