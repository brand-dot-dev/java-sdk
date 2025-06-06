// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.services.blocking

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
import com.branddev.api.core.prepare
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

class BrandServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BrandService {

    private val withRawResponse: BrandService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BrandService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions,
    ): BrandRetrieveResponse =
        // get /brand/retrieve
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun aiQuery(
        params: BrandAiQueryParams,
        requestOptions: RequestOptions,
    ): BrandAiQueryResponse =
        // post /brand/ai/query
        withRawResponse().aiQuery(params, requestOptions).parse()

    override fun identifyFromTransaction(
        params: BrandIdentifyFromTransactionParams,
        requestOptions: RequestOptions,
    ): BrandIdentifyFromTransactionResponse =
        // get /brand/transaction_identifier
        withRawResponse().identifyFromTransaction(params, requestOptions).parse()

    override fun prefetch(
        params: BrandPrefetchParams,
        requestOptions: RequestOptions,
    ): BrandPrefetchResponse =
        // post /brand/prefetch
        withRawResponse().prefetch(params, requestOptions).parse()

    override fun retrieveByTicker(
        params: BrandRetrieveByTickerParams,
        requestOptions: RequestOptions,
    ): BrandRetrieveByTickerResponse =
        // get /brand/retrieve-by-ticker
        withRawResponse().retrieveByTicker(params, requestOptions).parse()

    override fun retrieveNaics(
        params: BrandRetrieveNaicsParams,
        requestOptions: RequestOptions,
    ): BrandRetrieveNaicsResponse =
        // get /brand/naics
        withRawResponse().retrieveNaics(params, requestOptions).parse()

    override fun search(
        params: BrandSearchParams,
        requestOptions: RequestOptions,
    ): List<BrandSearchResponse> =
        // get /brand/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<BrandRetrieveResponse> =
            jsonHandler<BrandRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("brand", "retrieve")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<BrandAiQueryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("brand", "ai", "query")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { aiQueryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<BrandIdentifyFromTransactionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("brand", "transaction_identifier")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { identifyFromTransactionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<BrandPrefetchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("brand", "prefetch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { prefetchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<BrandRetrieveByTickerResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("brand", "retrieve-by-ticker")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveByTickerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<BrandRetrieveNaicsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("brand", "naics")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveNaicsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<List<BrandSearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("brand", "search")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
