// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.BaseDeserializer
import com.branddev.api.core.BaseSerializer
import com.branddev.api.core.ExcludeMissing
import com.branddev.api.core.JsonField
import com.branddev.api.core.JsonMissing
import com.branddev.api.core.JsonValue
import com.branddev.api.core.Params
import com.branddev.api.core.allMaxBy
import com.branddev.api.core.checkRequired
import com.branddev.api.core.getOrThrow
import com.branddev.api.core.http.Headers
import com.branddev.api.core.http.QueryParams
import com.branddev.api.errors.BrandDevInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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

    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrandAiProductsParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandAiProductsParams]. */
    class Builder internal constructor() {

        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandAiProductsParams: BrandAiProductsParams) = apply {
            body = brandAiProductsParams.body
            additionalHeaders = brandAiProductsParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandAiProductsParams.additionalQueryParams.toBuilder()
        }

        fun body(body: Body) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofByDomain(byDomain)`. */
        fun body(byDomain: Body.ByDomain) = body(Body.ofByDomain(byDomain))

        /** Alias for calling [body] with `Body.ofByDirectUrl(byDirectUrl)`. */
        fun body(byDirectUrl: Body.ByDirectUrl) = body(Body.ofByDirectUrl(byDirectUrl))

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
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandAiProductsParams =
            BrandAiProductsParams(
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val byDomain: ByDomain? = null,
        private val byDirectUrl: ByDirectUrl? = null,
        private val _json: JsonValue? = null,
    ) {

        fun byDomain(): Optional<ByDomain> = Optional.ofNullable(byDomain)

        fun byDirectUrl(): Optional<ByDirectUrl> = Optional.ofNullable(byDirectUrl)

        fun isByDomain(): Boolean = byDomain != null

        fun isByDirectUrl(): Boolean = byDirectUrl != null

        fun asByDomain(): ByDomain = byDomain.getOrThrow("byDomain")

        fun asByDirectUrl(): ByDirectUrl = byDirectUrl.getOrThrow("byDirectUrl")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                byDomain != null -> visitor.visitByDomain(byDomain)
                byDirectUrl != null -> visitor.visitByDirectUrl(byDirectUrl)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitByDomain(byDomain: ByDomain) {
                        byDomain.validate()
                    }

                    override fun visitByDirectUrl(byDirectUrl: ByDirectUrl) {
                        byDirectUrl.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitByDomain(byDomain: ByDomain) = byDomain.validity()

                    override fun visitByDirectUrl(byDirectUrl: ByDirectUrl) = byDirectUrl.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body && byDomain == other.byDomain && byDirectUrl == other.byDirectUrl
        }

        override fun hashCode(): Int = Objects.hash(byDomain, byDirectUrl)

        override fun toString(): String =
            when {
                byDomain != null -> "Body{byDomain=$byDomain}"
                byDirectUrl != null -> "Body{byDirectUrl=$byDirectUrl}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic fun ofByDomain(byDomain: ByDomain) = Body(byDomain = byDomain)

            @JvmStatic fun ofByDirectUrl(byDirectUrl: ByDirectUrl) = Body(byDirectUrl = byDirectUrl)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitByDomain(byDomain: ByDomain): T

            fun visitByDirectUrl(byDirectUrl: ByDirectUrl): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws BrandDevInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BrandDevInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ByDomain>())?.let {
                                Body(byDomain = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ByDirectUrl>())?.let {
                                Body(byDirectUrl = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.byDomain != null -> generator.writeObject(value.byDomain)
                    value.byDirectUrl != null -> generator.writeObject(value.byDirectUrl)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class ByDomain
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val domain: JsonField<String>,
            private val maxProducts: JsonField<Long>,
            private val timeoutMs: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("domain")
                @ExcludeMissing
                domain: JsonField<String> = JsonMissing.of(),
                @JsonProperty("maxProducts")
                @ExcludeMissing
                maxProducts: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("timeoutMS")
                @ExcludeMissing
                timeoutMs: JsonField<Long> = JsonMissing.of(),
            ) : this(domain, maxProducts, timeoutMs, mutableMapOf())

            /**
             * The domain name to analyze.
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun domain(): String = domain.getRequired("domain")

            /**
             * Maximum number of products to extract.
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun maxProducts(): Optional<Long> = maxProducts.getOptional("maxProducts")

            /**
             * Optional timeout in milliseconds for the request. Maximum allowed value is 300000ms
             * (5 minutes).
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun timeoutMs(): Optional<Long> = timeoutMs.getOptional("timeoutMS")

            /**
             * Returns the raw JSON value of [domain].
             *
             * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

            /**
             * Returns the raw JSON value of [maxProducts].
             *
             * Unlike [maxProducts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("maxProducts")
            @ExcludeMissing
            fun _maxProducts(): JsonField<Long> = maxProducts

            /**
             * Returns the raw JSON value of [timeoutMs].
             *
             * Unlike [timeoutMs], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /**
                 * Returns a mutable builder for constructing an instance of [ByDomain].
                 *
                 * The following fields are required:
                 * ```java
                 * .domain()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ByDomain]. */
            class Builder internal constructor() {

                private var domain: JsonField<String>? = null
                private var maxProducts: JsonField<Long> = JsonMissing.of()
                private var timeoutMs: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(byDomain: ByDomain) = apply {
                    domain = byDomain.domain
                    maxProducts = byDomain.maxProducts
                    timeoutMs = byDomain.timeoutMs
                    additionalProperties = byDomain.additionalProperties.toMutableMap()
                }

                /** The domain name to analyze. */
                fun domain(domain: String) = domain(JsonField.of(domain))

                /**
                 * Sets [Builder.domain] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.domain] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun domain(domain: JsonField<String>) = apply { this.domain = domain }

                /** Maximum number of products to extract. */
                fun maxProducts(maxProducts: Long) = maxProducts(JsonField.of(maxProducts))

                /**
                 * Sets [Builder.maxProducts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxProducts] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxProducts(maxProducts: JsonField<Long>) = apply {
                    this.maxProducts = maxProducts
                }

                /**
                 * Optional timeout in milliseconds for the request. Maximum allowed value is
                 * 300000ms (5 minutes).
                 */
                fun timeoutMs(timeoutMs: Long) = timeoutMs(JsonField.of(timeoutMs))

                /**
                 * Sets [Builder.timeoutMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeoutMs] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timeoutMs(timeoutMs: JsonField<Long>) = apply { this.timeoutMs = timeoutMs }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ByDomain].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .domain()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ByDomain =
                    ByDomain(
                        checkRequired("domain", domain),
                        maxProducts,
                        timeoutMs,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ByDomain = apply {
                if (validated) {
                    return@apply
                }

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
                (if (domain.asKnown().isPresent) 1 else 0) +
                    (if (maxProducts.asKnown().isPresent) 1 else 0) +
                    (if (timeoutMs.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ByDomain &&
                    domain == other.domain &&
                    maxProducts == other.maxProducts &&
                    timeoutMs == other.timeoutMs &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(domain, maxProducts, timeoutMs, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ByDomain{domain=$domain, maxProducts=$maxProducts, timeoutMs=$timeoutMs, additionalProperties=$additionalProperties}"
        }

        class ByDirectUrl
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val directUrl: JsonField<String>,
            private val maxProducts: JsonField<Long>,
            private val timeoutMs: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("directUrl")
                @ExcludeMissing
                directUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("maxProducts")
                @ExcludeMissing
                maxProducts: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("timeoutMS")
                @ExcludeMissing
                timeoutMs: JsonField<Long> = JsonMissing.of(),
            ) : this(directUrl, maxProducts, timeoutMs, mutableMapOf())

            /**
             * A specific URL to use directly as the starting point for extraction without domain
             * resolution.
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun directUrl(): String = directUrl.getRequired("directUrl")

            /**
             * Maximum number of products to extract.
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun maxProducts(): Optional<Long> = maxProducts.getOptional("maxProducts")

            /**
             * Optional timeout in milliseconds for the request. Maximum allowed value is 300000ms
             * (5 minutes).
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun timeoutMs(): Optional<Long> = timeoutMs.getOptional("timeoutMS")

            /**
             * Returns the raw JSON value of [directUrl].
             *
             * Unlike [directUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("directUrl")
            @ExcludeMissing
            fun _directUrl(): JsonField<String> = directUrl

            /**
             * Returns the raw JSON value of [maxProducts].
             *
             * Unlike [maxProducts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("maxProducts")
            @ExcludeMissing
            fun _maxProducts(): JsonField<Long> = maxProducts

            /**
             * Returns the raw JSON value of [timeoutMs].
             *
             * Unlike [timeoutMs], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /**
                 * Returns a mutable builder for constructing an instance of [ByDirectUrl].
                 *
                 * The following fields are required:
                 * ```java
                 * .directUrl()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ByDirectUrl]. */
            class Builder internal constructor() {

                private var directUrl: JsonField<String>? = null
                private var maxProducts: JsonField<Long> = JsonMissing.of()
                private var timeoutMs: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(byDirectUrl: ByDirectUrl) = apply {
                    directUrl = byDirectUrl.directUrl
                    maxProducts = byDirectUrl.maxProducts
                    timeoutMs = byDirectUrl.timeoutMs
                    additionalProperties = byDirectUrl.additionalProperties.toMutableMap()
                }

                /**
                 * A specific URL to use directly as the starting point for extraction without
                 * domain resolution.
                 */
                fun directUrl(directUrl: String) = directUrl(JsonField.of(directUrl))

                /**
                 * Sets [Builder.directUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.directUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun directUrl(directUrl: JsonField<String>) = apply { this.directUrl = directUrl }

                /** Maximum number of products to extract. */
                fun maxProducts(maxProducts: Long) = maxProducts(JsonField.of(maxProducts))

                /**
                 * Sets [Builder.maxProducts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxProducts] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxProducts(maxProducts: JsonField<Long>) = apply {
                    this.maxProducts = maxProducts
                }

                /**
                 * Optional timeout in milliseconds for the request. Maximum allowed value is
                 * 300000ms (5 minutes).
                 */
                fun timeoutMs(timeoutMs: Long) = timeoutMs(JsonField.of(timeoutMs))

                /**
                 * Sets [Builder.timeoutMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeoutMs] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timeoutMs(timeoutMs: JsonField<Long>) = apply { this.timeoutMs = timeoutMs }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ByDirectUrl].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .directUrl()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ByDirectUrl =
                    ByDirectUrl(
                        checkRequired("directUrl", directUrl),
                        maxProducts,
                        timeoutMs,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ByDirectUrl = apply {
                if (validated) {
                    return@apply
                }

                directUrl()
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
                    (if (maxProducts.asKnown().isPresent) 1 else 0) +
                    (if (timeoutMs.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ByDirectUrl &&
                    directUrl == other.directUrl &&
                    maxProducts == other.maxProducts &&
                    timeoutMs == other.timeoutMs &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(directUrl, maxProducts, timeoutMs, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ByDirectUrl{directUrl=$directUrl, maxProducts=$maxProducts, timeoutMs=$timeoutMs, additionalProperties=$additionalProperties}"
        }
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
