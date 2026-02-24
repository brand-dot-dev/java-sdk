// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.Enum
import com.branddev.api.core.JsonField
import com.branddev.api.core.Params
import com.branddev.api.core.http.Headers
import com.branddev.api.core.http.QueryParams
import com.branddev.api.errors.BrandDevInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Automatically extract comprehensive design system information from a brand's website including
 * colors, typography, spacing, shadows, and UI components. Either 'domain' or 'directUrl' must be
 * provided as a query parameter, but not both.
 */
class BrandStyleguideParams
private constructor(
    private val directUrl: String?,
    private val domain: String?,
    private val prioritize: Prioritize?,
    private val timeoutMs: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A specific URL to fetch the styleguide from directly, bypassing domain resolution (e.g.,
     * 'https://example.com/design-system').
     */
    fun directUrl(): Optional<String> = Optional.ofNullable(directUrl)

    /**
     * Domain name to extract styleguide from (e.g., 'example.com', 'google.com'). The domain will
     * be automatically normalized and validated.
     */
    fun domain(): Optional<String> = Optional.ofNullable(domain)

    /**
     * Optional parameter to prioritize screenshot capture for styleguide extraction. If 'speed',
     * optimizes for faster capture with basic quality. If 'quality', optimizes for higher quality
     * with longer wait times. Defaults to 'quality' if not provided.
     */
    fun prioritize(): Optional<Prioritize> = Optional.ofNullable(prioritize)

    /**
     * Optional timeout in milliseconds for the request. If the request takes longer than this
     * value, it will be aborted with a 408 status code. Maximum allowed value is 300000ms (5
     * minutes).
     */
    fun timeoutMs(): Optional<Long> = Optional.ofNullable(timeoutMs)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BrandStyleguideParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BrandStyleguideParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandStyleguideParams]. */
    class Builder internal constructor() {

        private var directUrl: String? = null
        private var domain: String? = null
        private var prioritize: Prioritize? = null
        private var timeoutMs: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandStyleguideParams: BrandStyleguideParams) = apply {
            directUrl = brandStyleguideParams.directUrl
            domain = brandStyleguideParams.domain
            prioritize = brandStyleguideParams.prioritize
            timeoutMs = brandStyleguideParams.timeoutMs
            additionalHeaders = brandStyleguideParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandStyleguideParams.additionalQueryParams.toBuilder()
        }

        /**
         * A specific URL to fetch the styleguide from directly, bypassing domain resolution (e.g.,
         * 'https://example.com/design-system').
         */
        fun directUrl(directUrl: String?) = apply { this.directUrl = directUrl }

        /** Alias for calling [Builder.directUrl] with `directUrl.orElse(null)`. */
        fun directUrl(directUrl: Optional<String>) = directUrl(directUrl.getOrNull())

        /**
         * Domain name to extract styleguide from (e.g., 'example.com', 'google.com'). The domain
         * will be automatically normalized and validated.
         */
        fun domain(domain: String?) = apply { this.domain = domain }

        /** Alias for calling [Builder.domain] with `domain.orElse(null)`. */
        fun domain(domain: Optional<String>) = domain(domain.getOrNull())

        /**
         * Optional parameter to prioritize screenshot capture for styleguide extraction. If
         * 'speed', optimizes for faster capture with basic quality. If 'quality', optimizes for
         * higher quality with longer wait times. Defaults to 'quality' if not provided.
         */
        fun prioritize(prioritize: Prioritize?) = apply { this.prioritize = prioritize }

        /** Alias for calling [Builder.prioritize] with `prioritize.orElse(null)`. */
        fun prioritize(prioritize: Optional<Prioritize>) = prioritize(prioritize.getOrNull())

        /**
         * Optional timeout in milliseconds for the request. If the request takes longer than this
         * value, it will be aborted with a 408 status code. Maximum allowed value is 300000ms (5
         * minutes).
         */
        fun timeoutMs(timeoutMs: Long?) = apply { this.timeoutMs = timeoutMs }

        /**
         * Alias for [Builder.timeoutMs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun timeoutMs(timeoutMs: Long) = timeoutMs(timeoutMs as Long?)

        /** Alias for calling [Builder.timeoutMs] with `timeoutMs.orElse(null)`. */
        fun timeoutMs(timeoutMs: Optional<Long>) = timeoutMs(timeoutMs.getOrNull())

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
         * Returns an immutable instance of [BrandStyleguideParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandStyleguideParams =
            BrandStyleguideParams(
                directUrl,
                domain,
                prioritize,
                timeoutMs,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                directUrl?.let { put("directUrl", it) }
                domain?.let { put("domain", it) }
                prioritize?.let { put("prioritize", it.toString()) }
                timeoutMs?.let { put("timeoutMS", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Optional parameter to prioritize screenshot capture for styleguide extraction. If 'speed',
     * optimizes for faster capture with basic quality. If 'quality', optimizes for higher quality
     * with longer wait times. Defaults to 'quality' if not provided.
     */
    class Prioritize @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SPEED = of("speed")

            @JvmField val QUALITY = of("quality")

            @JvmStatic fun of(value: String) = Prioritize(JsonField.of(value))
        }

        /** An enum containing [Prioritize]'s known values. */
        enum class Known {
            SPEED,
            QUALITY,
        }

        /**
         * An enum containing [Prioritize]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Prioritize] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SPEED,
            QUALITY,
            /**
             * An enum member indicating that [Prioritize] was instantiated with an unknown value.
             */
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
                SPEED -> Value.SPEED
                QUALITY -> Value.QUALITY
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
                SPEED -> Known.SPEED
                QUALITY -> Known.QUALITY
                else -> throw BrandDevInvalidDataException("Unknown Prioritize: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BrandDevInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                BrandDevInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Prioritize = apply {
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

            return other is Prioritize && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandStyleguideParams &&
            directUrl == other.directUrl &&
            domain == other.domain &&
            prioritize == other.prioritize &&
            timeoutMs == other.timeoutMs &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            directUrl,
            domain,
            prioritize,
            timeoutMs,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BrandStyleguideParams{directUrl=$directUrl, domain=$domain, prioritize=$prioritize, timeoutMs=$timeoutMs, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
