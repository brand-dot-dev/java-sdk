// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.ExcludeMissing
import com.branddev.api.core.JsonField
import com.branddev.api.core.JsonMissing
import com.branddev.api.core.JsonValue
import com.branddev.api.core.Params
import com.branddev.api.core.http.Headers
import com.branddev.api.core.http.QueryParams
import com.branddev.api.errors.BrandDevInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Beta feature: Extract product information from a brand's website. Brand.dev will analyze the
 * website and return a list of products with details such as name, description, image, pricing,
 * features, and more.
 */
class BrandAiProductsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A specific URL to use directly as the starting point for extraction without domain
     * resolution. Useful when you want to extract products from a specific page rather than
     * discovering the site's product pages automatically. Either 'domain' or 'directUrl' must be
     * provided, but not both.
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun directUrl(): Optional<String> = body.directUrl()

    /**
     * The domain name to analyze. Either 'domain' or 'directUrl' must be provided, but not both.
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domain(): Optional<String> = body.domain()

    /**
     * Maximum number of products to extract.
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxProducts(): Optional<Long> = body.maxProducts()

    /**
     * Optional timeout in milliseconds for the request. If the request takes longer than this
     * value, it will be aborted with a 408 status code. Maximum allowed value is 300000ms (5
     * minutes).
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutMs(): Optional<Long> = body.timeoutMs()

    /**
     * Returns the raw JSON value of [directUrl].
     *
     * Unlike [directUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _directUrl(): JsonField<String> = body._directUrl()

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _domain(): JsonField<String> = body._domain()

    /**
     * Returns the raw JSON value of [maxProducts].
     *
     * Unlike [maxProducts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxProducts(): JsonField<Long> = body._maxProducts()

    /**
     * Returns the raw JSON value of [timeoutMs].
     *
     * Unlike [timeoutMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeoutMs(): JsonField<Long> = body._timeoutMs()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BrandAiProductsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BrandAiProductsParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandAiProductsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandAiProductsParams: BrandAiProductsParams) = apply {
            body = brandAiProductsParams.body.toBuilder()
            additionalHeaders = brandAiProductsParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandAiProductsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [directUrl]
         * - [domain]
         * - [maxProducts]
         * - [timeoutMs]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * A specific URL to use directly as the starting point for extraction without domain
         * resolution. Useful when you want to extract products from a specific page rather than
         * discovering the site's product pages automatically. Either 'domain' or 'directUrl' must
         * be provided, but not both.
         */
        fun directUrl(directUrl: String) = apply { body.directUrl(directUrl) }

        /**
         * Sets [Builder.directUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.directUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun directUrl(directUrl: JsonField<String>) = apply { body.directUrl(directUrl) }

        /**
         * The domain name to analyze. Either 'domain' or 'directUrl' must be provided, but not
         * both.
         */
        fun domain(domain: String) = apply { body.domain(domain) }

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { body.domain(domain) }

        /** Maximum number of products to extract. */
        fun maxProducts(maxProducts: Long) = apply { body.maxProducts(maxProducts) }

        /**
         * Sets [Builder.maxProducts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxProducts] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxProducts(maxProducts: JsonField<Long>) = apply { body.maxProducts(maxProducts) }

        /**
         * Optional timeout in milliseconds for the request. If the request takes longer than this
         * value, it will be aborted with a 408 status code. Maximum allowed value is 300000ms (5
         * minutes).
         */
        fun timeoutMs(timeoutMs: Long) = apply { body.timeoutMs(timeoutMs) }

        /**
         * Sets [Builder.timeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeoutMs(timeoutMs: JsonField<Long>) = apply { body.timeoutMs(timeoutMs) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [BrandAiProductsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandAiProductsParams =
            BrandAiProductsParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val directUrl: JsonField<String>,
        private val domain: JsonField<String>,
        private val maxProducts: JsonField<Long>,
        private val timeoutMs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("directUrl")
            @ExcludeMissing
            directUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maxProducts")
            @ExcludeMissing
            maxProducts: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("timeoutMS") @ExcludeMissing timeoutMs: JsonField<Long> = JsonMissing.of(),
        ) : this(directUrl, domain, maxProducts, timeoutMs, mutableMapOf())

        /**
         * A specific URL to use directly as the starting point for extraction without domain
         * resolution. Useful when you want to extract products from a specific page rather than
         * discovering the site's product pages automatically. Either 'domain' or 'directUrl' must
         * be provided, but not both.
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun directUrl(): Optional<String> = directUrl.getOptional("directUrl")

        /**
         * The domain name to analyze. Either 'domain' or 'directUrl' must be provided, but not
         * both.
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun domain(): Optional<String> = domain.getOptional("domain")

        /**
         * Maximum number of products to extract.
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxProducts(): Optional<Long> = maxProducts.getOptional("maxProducts")

        /**
         * Optional timeout in milliseconds for the request. If the request takes longer than this
         * value, it will be aborted with a 408 status code. Maximum allowed value is 300000ms (5
         * minutes).
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timeoutMs(): Optional<Long> = timeoutMs.getOptional("timeoutMS")

        /**
         * Returns the raw JSON value of [directUrl].
         *
         * Unlike [directUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("directUrl") @ExcludeMissing fun _directUrl(): JsonField<String> = directUrl

        /**
         * Returns the raw JSON value of [domain].
         *
         * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

        /**
         * Returns the raw JSON value of [maxProducts].
         *
         * Unlike [maxProducts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maxProducts")
        @ExcludeMissing
        fun _maxProducts(): JsonField<Long> = maxProducts

        /**
         * Returns the raw JSON value of [timeoutMs].
         *
         * Unlike [timeoutMs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeoutMS") @ExcludeMissing fun _timeoutMs(): JsonField<Long> = timeoutMs

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var directUrl: JsonField<String> = JsonMissing.of()
            private var domain: JsonField<String> = JsonMissing.of()
            private var maxProducts: JsonField<Long> = JsonMissing.of()
            private var timeoutMs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                directUrl = body.directUrl
                domain = body.domain
                maxProducts = body.maxProducts
                timeoutMs = body.timeoutMs
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * A specific URL to use directly as the starting point for extraction without domain
             * resolution. Useful when you want to extract products from a specific page rather than
             * discovering the site's product pages automatically. Either 'domain' or 'directUrl'
             * must be provided, but not both.
             */
            fun directUrl(directUrl: String) = directUrl(JsonField.of(directUrl))

            /**
             * Sets [Builder.directUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.directUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun directUrl(directUrl: JsonField<String>) = apply { this.directUrl = directUrl }

            /**
             * The domain name to analyze. Either 'domain' or 'directUrl' must be provided, but not
             * both.
             */
            fun domain(domain: String) = domain(JsonField.of(domain))

            /**
             * Sets [Builder.domain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domain] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domain(domain: JsonField<String>) = apply { this.domain = domain }

            /** Maximum number of products to extract. */
            fun maxProducts(maxProducts: Long) = maxProducts(JsonField.of(maxProducts))

            /**
             * Sets [Builder.maxProducts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxProducts] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxProducts(maxProducts: JsonField<Long>) = apply { this.maxProducts = maxProducts }

            /**
             * Optional timeout in milliseconds for the request. If the request takes longer than
             * this value, it will be aborted with a 408 status code. Maximum allowed value is
             * 300000ms (5 minutes).
             */
            fun timeoutMs(timeoutMs: Long) = timeoutMs(JsonField.of(timeoutMs))

            /**
             * Sets [Builder.timeoutMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeoutMs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeoutMs(timeoutMs: JsonField<Long>) = apply { this.timeoutMs = timeoutMs }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(directUrl, domain, maxProducts, timeoutMs, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            directUrl()
            domain()
            maxProducts()
            timeoutMs()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BrandDevInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (directUrl.asKnown().isPresent) 1 else 0) +
                (if (domain.asKnown().isPresent) 1 else 0) +
                (if (maxProducts.asKnown().isPresent) 1 else 0) +
                (if (timeoutMs.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                directUrl == other.directUrl &&
                domain == other.domain &&
                maxProducts == other.maxProducts &&
                timeoutMs == other.timeoutMs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(directUrl, domain, maxProducts, timeoutMs, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{directUrl=$directUrl, domain=$domain, maxProducts=$maxProducts, timeoutMs=$timeoutMs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandAiProductsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BrandAiProductsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
