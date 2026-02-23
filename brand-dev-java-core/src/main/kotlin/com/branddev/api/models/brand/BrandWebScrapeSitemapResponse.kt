// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.Enum
import com.branddev.api.core.ExcludeMissing
import com.branddev.api.core.JsonField
import com.branddev.api.core.JsonMissing
import com.branddev.api.core.JsonValue
import com.branddev.api.core.checkKnown
import com.branddev.api.core.checkRequired
import com.branddev.api.core.toImmutable
import com.branddev.api.errors.BrandDevInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class BrandWebScrapeSitemapResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val domain: JsonField<String>,
    private val meta: JsonField<Meta>,
    private val success: JsonField<Success>,
    private val urls: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Success> = JsonMissing.of(),
        @JsonProperty("urls") @ExcludeMissing urls: JsonField<List<String>> = JsonMissing.of(),
    ) : this(domain, meta, success, urls, mutableMapOf())

    /**
     * The normalized domain that was crawled
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun domain(): String = domain.getRequired("domain")

    /**
     * Metadata about the sitemap crawl operation
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meta(): Meta = meta.getRequired("meta")

    /**
     * Indicates success
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Success = success.getRequired("success")

    /**
     * Array of discovered page URLs from the sitemap (max 500)
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun urls(): List<String> = urls.getRequired("urls")

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Success> = success

    /**
     * Returns the raw JSON value of [urls].
     *
     * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("urls") @ExcludeMissing fun _urls(): JsonField<List<String>> = urls

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
         * Returns a mutable builder for constructing an instance of
         * [BrandWebScrapeSitemapResponse].
         *
         * The following fields are required:
         * ```java
         * .domain()
         * .meta()
         * .success()
         * .urls()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandWebScrapeSitemapResponse]. */
    class Builder internal constructor() {

        private var domain: JsonField<String>? = null
        private var meta: JsonField<Meta>? = null
        private var success: JsonField<Success>? = null
        private var urls: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandWebScrapeSitemapResponse: BrandWebScrapeSitemapResponse) = apply {
            domain = brandWebScrapeSitemapResponse.domain
            meta = brandWebScrapeSitemapResponse.meta
            success = brandWebScrapeSitemapResponse.success
            urls = brandWebScrapeSitemapResponse.urls.map { it.toMutableList() }
            additionalProperties = brandWebScrapeSitemapResponse.additionalProperties.toMutableMap()
        }

        /** The normalized domain that was crawled */
        fun domain(domain: String) = domain(JsonField.of(domain))

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { this.domain = domain }

        /** Metadata about the sitemap crawl operation */
        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

        /** Indicates success */
        fun success(success: Success) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Success] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Success>) = apply { this.success = success }

        /** Array of discovered page URLs from the sitemap (max 500) */
        fun urls(urls: List<String>) = urls(JsonField.of(urls))

        /**
         * Sets [Builder.urls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urls] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun urls(urls: JsonField<List<String>>) = apply {
            this.urls = urls.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [urls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUrl(url: String) = apply {
            urls = (urls ?: JsonField.of(mutableListOf())).also { checkKnown("urls", it).add(url) }
        }

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
         * Returns an immutable instance of [BrandWebScrapeSitemapResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .domain()
         * .meta()
         * .success()
         * .urls()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandWebScrapeSitemapResponse =
            BrandWebScrapeSitemapResponse(
                checkRequired("domain", domain),
                checkRequired("meta", meta),
                checkRequired("success", success),
                checkRequired("urls", urls).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandWebScrapeSitemapResponse = apply {
        if (validated) {
            return@apply
        }

        domain()
        meta().validate()
        success().validate()
        urls()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (domain.asKnown().isPresent) 1 else 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0) +
            (success.asKnown().getOrNull()?.validity() ?: 0) +
            (urls.asKnown().getOrNull()?.size ?: 0)

    /** Metadata about the sitemap crawl operation */
    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val errors: JsonField<Long>,
        private val sitemapsDiscovered: JsonField<Long>,
        private val sitemapsFetched: JsonField<Long>,
        private val sitemapsSkipped: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("errors") @ExcludeMissing errors: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sitemapsDiscovered")
            @ExcludeMissing
            sitemapsDiscovered: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sitemapsFetched")
            @ExcludeMissing
            sitemapsFetched: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sitemapsSkipped")
            @ExcludeMissing
            sitemapsSkipped: JsonField<Long> = JsonMissing.of(),
        ) : this(errors, sitemapsDiscovered, sitemapsFetched, sitemapsSkipped, mutableMapOf())

        /**
         * Number of errors encountered during crawling
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun errors(): Long = errors.getRequired("errors")

        /**
         * Total number of sitemap files discovered
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sitemapsDiscovered(): Long = sitemapsDiscovered.getRequired("sitemapsDiscovered")

        /**
         * Number of sitemap files successfully fetched and parsed
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sitemapsFetched(): Long = sitemapsFetched.getRequired("sitemapsFetched")

        /**
         * Number of sitemap files skipped (due to errors, timeouts, or limits)
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sitemapsSkipped(): Long = sitemapsSkipped.getRequired("sitemapsSkipped")

        /**
         * Returns the raw JSON value of [errors].
         *
         * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<Long> = errors

        /**
         * Returns the raw JSON value of [sitemapsDiscovered].
         *
         * Unlike [sitemapsDiscovered], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sitemapsDiscovered")
        @ExcludeMissing
        fun _sitemapsDiscovered(): JsonField<Long> = sitemapsDiscovered

        /**
         * Returns the raw JSON value of [sitemapsFetched].
         *
         * Unlike [sitemapsFetched], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sitemapsFetched")
        @ExcludeMissing
        fun _sitemapsFetched(): JsonField<Long> = sitemapsFetched

        /**
         * Returns the raw JSON value of [sitemapsSkipped].
         *
         * Unlike [sitemapsSkipped], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sitemapsSkipped")
        @ExcludeMissing
        fun _sitemapsSkipped(): JsonField<Long> = sitemapsSkipped

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
             * Returns a mutable builder for constructing an instance of [Meta].
             *
             * The following fields are required:
             * ```java
             * .errors()
             * .sitemapsDiscovered()
             * .sitemapsFetched()
             * .sitemapsSkipped()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var errors: JsonField<Long>? = null
            private var sitemapsDiscovered: JsonField<Long>? = null
            private var sitemapsFetched: JsonField<Long>? = null
            private var sitemapsSkipped: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                errors = meta.errors
                sitemapsDiscovered = meta.sitemapsDiscovered
                sitemapsFetched = meta.sitemapsFetched
                sitemapsSkipped = meta.sitemapsSkipped
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            /** Number of errors encountered during crawling */
            fun errors(errors: Long) = errors(JsonField.of(errors))

            /**
             * Sets [Builder.errors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errors] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun errors(errors: JsonField<Long>) = apply { this.errors = errors }

            /** Total number of sitemap files discovered */
            fun sitemapsDiscovered(sitemapsDiscovered: Long) =
                sitemapsDiscovered(JsonField.of(sitemapsDiscovered))

            /**
             * Sets [Builder.sitemapsDiscovered] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sitemapsDiscovered] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sitemapsDiscovered(sitemapsDiscovered: JsonField<Long>) = apply {
                this.sitemapsDiscovered = sitemapsDiscovered
            }

            /** Number of sitemap files successfully fetched and parsed */
            fun sitemapsFetched(sitemapsFetched: Long) =
                sitemapsFetched(JsonField.of(sitemapsFetched))

            /**
             * Sets [Builder.sitemapsFetched] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sitemapsFetched] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sitemapsFetched(sitemapsFetched: JsonField<Long>) = apply {
                this.sitemapsFetched = sitemapsFetched
            }

            /** Number of sitemap files skipped (due to errors, timeouts, or limits) */
            fun sitemapsSkipped(sitemapsSkipped: Long) =
                sitemapsSkipped(JsonField.of(sitemapsSkipped))

            /**
             * Sets [Builder.sitemapsSkipped] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sitemapsSkipped] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sitemapsSkipped(sitemapsSkipped: JsonField<Long>) = apply {
                this.sitemapsSkipped = sitemapsSkipped
            }

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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .errors()
             * .sitemapsDiscovered()
             * .sitemapsFetched()
             * .sitemapsSkipped()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meta =
                Meta(
                    checkRequired("errors", errors),
                    checkRequired("sitemapsDiscovered", sitemapsDiscovered),
                    checkRequired("sitemapsFetched", sitemapsFetched),
                    checkRequired("sitemapsSkipped", sitemapsSkipped),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            errors()
            sitemapsDiscovered()
            sitemapsFetched()
            sitemapsSkipped()
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
            (if (errors.asKnown().isPresent) 1 else 0) +
                (if (sitemapsDiscovered.asKnown().isPresent) 1 else 0) +
                (if (sitemapsFetched.asKnown().isPresent) 1 else 0) +
                (if (sitemapsSkipped.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                errors == other.errors &&
                sitemapsDiscovered == other.sitemapsDiscovered &&
                sitemapsFetched == other.sitemapsFetched &&
                sitemapsSkipped == other.sitemapsSkipped &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                errors,
                sitemapsDiscovered,
                sitemapsFetched,
                sitemapsSkipped,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{errors=$errors, sitemapsDiscovered=$sitemapsDiscovered, sitemapsFetched=$sitemapsFetched, sitemapsSkipped=$sitemapsSkipped, additionalProperties=$additionalProperties}"
    }

    /** Indicates success */
    class Success @JsonCreator private constructor(private val value: JsonField<Boolean>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        companion object {

            @JvmField val TRUE = of(true)

            @JvmStatic fun of(value: Boolean) = Success(JsonField.of(value))
        }

        /** An enum containing [Success]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [Success]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Success] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /** An enum member indicating that [Success] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TRUE -> Value.TRUE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BrandDevInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TRUE -> Known.TRUE
                else -> throw BrandDevInvalidDataException("Unknown Success: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws BrandDevInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asBoolean(): Boolean =
            _value().asBoolean().orElseThrow {
                BrandDevInvalidDataException("Value is not a Boolean")
            }

        private var validated: Boolean = false

        fun validate(): Success = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Success && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandWebScrapeSitemapResponse &&
            domain == other.domain &&
            meta == other.meta &&
            success == other.success &&
            urls == other.urls &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(domain, meta, success, urls, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandWebScrapeSitemapResponse{domain=$domain, meta=$meta, success=$success, urls=$urls, additionalProperties=$additionalProperties}"
}
