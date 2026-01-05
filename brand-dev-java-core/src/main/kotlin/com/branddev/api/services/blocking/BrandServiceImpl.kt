// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.services.blocking

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
import com.branddev.api.core.prepare
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
import java.util.function.Consumer

class BrandServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BrandService {

    private val withRawResponse: BrandService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BrandService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService =
        BrandServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions,
    ): BrandRetrieveResponse =
        // get /brand/retrieve
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun aiProducts(
        params: BrandAiProductsParams,
        requestOptions: RequestOptions,
    ): BrandAiProductsResponse =
        // post /brand/ai/products
        withRawResponse().aiProducts(params, requestOptions).parse()

    override fun aiQuery(
        params: BrandAiQueryParams,
        requestOptions: RequestOptions,
    ): BrandAiQueryResponse =
        // post /brand/ai/query
        withRawResponse().aiQuery(params, requestOptions).parse()

    override fun fonts(
        params: BrandFontsParams,
        requestOptions: RequestOptions,
    ): BrandFontsResponse =
        // get /brand/fonts
        withRawResponse().fonts(params, requestOptions).parse()

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

    override fun prefetchByEmail(
        params: BrandPrefetchByEmailParams,
        requestOptions: RequestOptions,
    ): BrandPrefetchByEmailResponse =
        // post /brand/prefetch-by-email
        withRawResponse().prefetchByEmail(params, requestOptions).parse()

    override fun retrieveByEmail(
        params: BrandRetrieveByEmailParams,
        requestOptions: RequestOptions,
    ): BrandRetrieveByEmailResponse =
        // get /brand/retrieve-by-email
        withRawResponse().retrieveByEmail(params, requestOptions).parse()

    override fun retrieveByIsin(
        params: BrandRetrieveByIsinParams,
        requestOptions: RequestOptions,
    ): BrandRetrieveByIsinResponse =
        // get /brand/retrieve-by-isin
        withRawResponse().retrieveByIsin(params, requestOptions).parse()

    override fun retrieveByName(
        params: BrandRetrieveByNameParams,
        requestOptions: RequestOptions,
    ): BrandRetrieveByNameResponse =
        // get /brand/retrieve-by-name
        withRawResponse().retrieveByName(params, requestOptions).parse()

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

    override fun retrieveSimplified(
        params: BrandRetrieveSimplifiedParams,
        requestOptions: RequestOptions,
    ): BrandRetrieveSimplifiedResponse =
        // get /brand/retrieve-simplified
        withRawResponse().retrieveSimplified(params, requestOptions).parse()

    override fun screenshot(
        params: BrandScreenshotParams,
        requestOptions: RequestOptions,
    ): BrandScreenshotResponse =
        // get /brand/screenshot
        withRawResponse().screenshot(params, requestOptions).parse()

    override fun styleguide(
        params: BrandStyleguideParams,
        requestOptions: RequestOptions,
    ): BrandStyleguideResponse =
        // get /brand/styleguide
        withRawResponse().styleguide(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandService.WithRawResponse =
            BrandServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<BrandRetrieveResponse> =
            jsonHandler<BrandRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "retrieve")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val aiProductsHandler: Handler<BrandAiProductsResponse> =
            jsonHandler<BrandAiProductsResponse>(clientOptions.jsonMapper)

        override fun aiProducts(
            params: BrandAiProductsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandAiProductsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "ai", "products")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { aiProductsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val aiQueryHandler: Handler<BrandAiQueryResponse> =
            jsonHandler<BrandAiQueryResponse>(clientOptions.jsonMapper)

        override fun aiQuery(
            params: BrandAiQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandAiQueryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "ai", "query")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { aiQueryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fontsHandler: Handler<BrandFontsResponse> =
            jsonHandler<BrandFontsResponse>(clientOptions.jsonMapper)

        override fun fonts(
            params: BrandFontsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandFontsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "fonts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { fontsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val identifyFromTransactionHandler: Handler<BrandIdentifyFromTransactionResponse> =
            jsonHandler<BrandIdentifyFromTransactionResponse>(clientOptions.jsonMapper)

        override fun identifyFromTransaction(
            params: BrandIdentifyFromTransactionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandIdentifyFromTransactionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "transaction_identifier")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override fun prefetch(
            params: BrandPrefetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandPrefetchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "prefetch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { prefetchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val prefetchByEmailHandler: Handler<BrandPrefetchByEmailResponse> =
            jsonHandler<BrandPrefetchByEmailResponse>(clientOptions.jsonMapper)

        override fun prefetchByEmail(
            params: BrandPrefetchByEmailParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandPrefetchByEmailResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "prefetch-by-email")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { prefetchByEmailHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveByEmailHandler: Handler<BrandRetrieveByEmailResponse> =
            jsonHandler<BrandRetrieveByEmailResponse>(clientOptions.jsonMapper)

        override fun retrieveByEmail(
            params: BrandRetrieveByEmailParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandRetrieveByEmailResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "retrieve-by-email")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveByEmailHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveByIsinHandler: Handler<BrandRetrieveByIsinResponse> =
            jsonHandler<BrandRetrieveByIsinResponse>(clientOptions.jsonMapper)

        override fun retrieveByIsin(
            params: BrandRetrieveByIsinParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandRetrieveByIsinResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "retrieve-by-isin")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveByIsinHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveByNameHandler: Handler<BrandRetrieveByNameResponse> =
            jsonHandler<BrandRetrieveByNameResponse>(clientOptions.jsonMapper)

        override fun retrieveByName(
            params: BrandRetrieveByNameParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandRetrieveByNameResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "retrieve-by-name")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveByNameHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveByTickerHandler: Handler<BrandRetrieveByTickerResponse> =
            jsonHandler<BrandRetrieveByTickerResponse>(clientOptions.jsonMapper)

        override fun retrieveByTicker(
            params: BrandRetrieveByTickerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandRetrieveByTickerResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "retrieve-by-ticker")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override fun retrieveNaics(
            params: BrandRetrieveNaicsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandRetrieveNaicsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "naics")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveNaicsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveSimplifiedHandler: Handler<BrandRetrieveSimplifiedResponse> =
            jsonHandler<BrandRetrieveSimplifiedResponse>(clientOptions.jsonMapper)

        override fun retrieveSimplified(
            params: BrandRetrieveSimplifiedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandRetrieveSimplifiedResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "retrieve-simplified")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveSimplifiedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val screenshotHandler: Handler<BrandScreenshotResponse> =
            jsonHandler<BrandScreenshotResponse>(clientOptions.jsonMapper)

        override fun screenshot(
            params: BrandScreenshotParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandScreenshotResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "screenshot")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { screenshotHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val styleguideHandler: Handler<BrandStyleguideResponse> =
            jsonHandler<BrandStyleguideResponse>(clientOptions.jsonMapper)

        override fun styleguide(
            params: BrandStyleguideParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandStyleguideResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "styleguide")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
