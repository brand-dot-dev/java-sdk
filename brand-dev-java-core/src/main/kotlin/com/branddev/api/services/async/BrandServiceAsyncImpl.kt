// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.services.async

import com.branddev.api.core.ClientOptions
import com.branddev.api.core.RequestOptions
import com.branddev.api.core.handlers.errorBodyHandler
import com.branddev.api.core.handlers.errorHandler
import com.branddev.api.core.handlers.jsonHandler
import com.branddev.api.core.http.HttpMethod
import com.branddev.api.core.http.HttpRequest
import com.branddev.api.core.http.HttpResponse
import com.branddev.api.core.http.HttpResponse.Handler
import com.branddev.api.core.http.HttpResponseFor
import com.branddev.api.core.http.json
import com.branddev.api.core.http.parseable
import com.branddev.api.core.prepareAsync
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

    override fun fonts(
        params: BrandFontsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandFontsResponse> =
        // get /brand/fonts
        withRawResponse().fonts(params, requestOptions).thenApply { it.parse() }

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

    override fun prefetchByEmail(
        params: BrandPrefetchByEmailParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandPrefetchByEmailResponse> =
        // post /brand/prefetch-by-email
        withRawResponse().prefetchByEmail(params, requestOptions).thenApply { it.parse() }

    override fun retrieveByEmail(
        params: BrandRetrieveByEmailParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandRetrieveByEmailResponse> =
        // get /brand/retrieve-by-email
        withRawResponse().retrieveByEmail(params, requestOptions).thenApply { it.parse() }

    override fun retrieveByIsin(
        params: BrandRetrieveByIsinParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandRetrieveByIsinResponse> =
        // get /brand/retrieve-by-isin
        withRawResponse().retrieveByIsin(params, requestOptions).thenApply { it.parse() }

    override fun retrieveByName(
        params: BrandRetrieveByNameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandRetrieveByNameResponse> =
        // get /brand/retrieve-by-name
        withRawResponse().retrieveByName(params, requestOptions).thenApply { it.parse() }

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

    override fun retrieveSimplified(
        params: BrandRetrieveSimplifiedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandRetrieveSimplifiedResponse> =
        // get /brand/retrieve-simplified
        withRawResponse().retrieveSimplified(params, requestOptions).thenApply { it.parse() }

    override fun screenshot(
        params: BrandScreenshotParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandScreenshotResponse> =
        // get /brand/screenshot
        withRawResponse().screenshot(params, requestOptions).thenApply { it.parse() }

    override fun styleguide(
        params: BrandStyleguideParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandStyleguideResponse> =
        // get /brand/styleguide
        withRawResponse().styleguide(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse =
            BrandServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<BrandRetrieveResponse> =
            jsonHandler<BrandRetrieveResponse>(clientOptions.jsonMapper)

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
                    errorHandler.handle(response).parseable {
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
                    errorHandler.handle(response).parseable {
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

        private val fontsHandler: Handler<BrandFontsResponse> =
            jsonHandler<BrandFontsResponse>(clientOptions.jsonMapper)

        override fun fonts(
            params: BrandFontsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandFontsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "fonts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { fontsHandler.handle(it) }
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
                    errorHandler.handle(response).parseable {
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
                    errorHandler.handle(response).parseable {
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

        private val prefetchByEmailHandler: Handler<BrandPrefetchByEmailResponse> =
            jsonHandler<BrandPrefetchByEmailResponse>(clientOptions.jsonMapper)

        override fun prefetchByEmail(
            params: BrandPrefetchByEmailParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandPrefetchByEmailResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "prefetch-by-email")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { prefetchByEmailHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveByEmailHandler: Handler<BrandRetrieveByEmailResponse> =
            jsonHandler<BrandRetrieveByEmailResponse>(clientOptions.jsonMapper)

        override fun retrieveByEmail(
            params: BrandRetrieveByEmailParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByEmailResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "retrieve-by-email")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveByEmailHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveByIsinHandler: Handler<BrandRetrieveByIsinResponse> =
            jsonHandler<BrandRetrieveByIsinResponse>(clientOptions.jsonMapper)

        override fun retrieveByIsin(
            params: BrandRetrieveByIsinParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByIsinResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "retrieve-by-isin")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveByIsinHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveByNameHandler: Handler<BrandRetrieveByNameResponse> =
            jsonHandler<BrandRetrieveByNameResponse>(clientOptions.jsonMapper)

        override fun retrieveByName(
            params: BrandRetrieveByNameParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandRetrieveByNameResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "retrieve-by-name")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveByNameHandler.handle(it) }
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
                    errorHandler.handle(response).parseable {
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
                    errorHandler.handle(response).parseable {
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

        private val retrieveSimplifiedHandler: Handler<BrandRetrieveSimplifiedResponse> =
            jsonHandler<BrandRetrieveSimplifiedResponse>(clientOptions.jsonMapper)

        override fun retrieveSimplified(
            params: BrandRetrieveSimplifiedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandRetrieveSimplifiedResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "retrieve-simplified")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveSimplifiedHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val screenshotHandler: Handler<BrandScreenshotResponse> =
            jsonHandler<BrandScreenshotResponse>(clientOptions.jsonMapper)

        override fun screenshot(
            params: BrandScreenshotParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandScreenshotResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "screenshot")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { screenshotHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val styleguideHandler: Handler<BrandStyleguideResponse> =
            jsonHandler<BrandStyleguideResponse>(clientOptions.jsonMapper)

        override fun styleguide(
            params: BrandStyleguideParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandStyleguideResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "styleguide")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { styleguideHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
