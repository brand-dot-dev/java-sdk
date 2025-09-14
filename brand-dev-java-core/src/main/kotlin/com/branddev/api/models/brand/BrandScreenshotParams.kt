// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.Enum
import com.branddev.api.core.JsonField
import com.branddev.api.core.Params
import com.branddev.api.core.checkRequired
import com.branddev.api.core.http.Headers
import com.branddev.api.core.http.QueryParams
import com.branddev.api.errors.BrandDevInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Beta feature: Capture a screenshot of a website. Supports both viewport (standard browser view)
 * and full-page screenshots. Can also screenshot specific page types (login, pricing, etc.) by
 * using heuristics to find the appropriate URL. Returns a URL to the uploaded screenshot image
 * hosted on our CDN.
 */
class BrandScreenshotParams
private constructor(
    private val domain: String,
    private val fullScreenshot: FullScreenshot?,
    private val page: Page?,
    private val prioritize: Prioritize?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Domain name to take screenshot of (e.g., 'example.com', 'google.com'). The domain will be
     * automatically normalized and validated.
     */
    fun domain(): String = domain

    /**
     * Optional parameter to determine screenshot type. If 'true', takes a full page screenshot
     * capturing all content. If 'false' or not provided, takes a viewport screenshot (standard
     * browser view).
     */
    fun fullScreenshot(): Optional<FullScreenshot> = Optional.ofNullable(fullScreenshot)

    /**
     * Optional parameter to specify which page type to screenshot. If provided, the system will
     * scrape the domain's links and use heuristics to find the most appropriate URL for the
     * specified page type (30 supported languages). If not provided, screenshots the main domain
     * landing page.
     */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /**
     * Optional parameter to prioritize screenshot capture. If 'speed', optimizes for faster capture
     * with basic quality. If 'quality', optimizes for higher quality with longer wait times.
     * Defaults to 'quality' if not provided.
     */
    fun prioritize(): Optional<Prioritize> = Optional.ofNullable(prioritize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrandScreenshotParams].
         *
         * The following fields are required:
         * ```java
         * .domain()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandScreenshotParams]. */
    class Builder internal constructor() {

        private var domain: String? = null
        private var fullScreenshot: FullScreenshot? = null
        private var page: Page? = null
        private var prioritize: Prioritize? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandScreenshotParams: BrandScreenshotParams) = apply {
            domain = brandScreenshotParams.domain
            fullScreenshot = brandScreenshotParams.fullScreenshot
            page = brandScreenshotParams.page
            prioritize = brandScreenshotParams.prioritize
            additionalHeaders = brandScreenshotParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandScreenshotParams.additionalQueryParams.toBuilder()
        }

        /**
         * Domain name to take screenshot of (e.g., 'example.com', 'google.com'). The domain will be
         * automatically normalized and validated.
         */
        fun domain(domain: String) = apply { this.domain = domain }

        /**
         * Optional parameter to determine screenshot type. If 'true', takes a full page screenshot
         * capturing all content. If 'false' or not provided, takes a viewport screenshot (standard
         * browser view).
         */
        fun fullScreenshot(fullScreenshot: FullScreenshot?) = apply {
            this.fullScreenshot = fullScreenshot
        }

        /** Alias for calling [Builder.fullScreenshot] with `fullScreenshot.orElse(null)`. */
        fun fullScreenshot(fullScreenshot: Optional<FullScreenshot>) =
            fullScreenshot(fullScreenshot.getOrNull())

        /**
         * Optional parameter to specify which page type to screenshot. If provided, the system will
         * scrape the domain's links and use heuristics to find the most appropriate URL for the
         * specified page type (30 supported languages). If not provided, screenshots the main
         * domain landing page.
         */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

        /**
         * Optional parameter to prioritize screenshot capture. If 'speed', optimizes for faster
         * capture with basic quality. If 'quality', optimizes for higher quality with longer wait
         * times. Defaults to 'quality' if not provided.
         */
        fun prioritize(prioritize: Prioritize?) = apply { this.prioritize = prioritize }

        /** Alias for calling [Builder.prioritize] with `prioritize.orElse(null)`. */
        fun prioritize(prioritize: Optional<Prioritize>) = prioritize(prioritize.getOrNull())

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
         * Returns an immutable instance of [BrandScreenshotParams].
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
        fun build(): BrandScreenshotParams =
            BrandScreenshotParams(
                checkRequired("domain", domain),
                fullScreenshot,
                page,
                prioritize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("domain", domain)
                fullScreenshot?.let { put("fullScreenshot", it.toString()) }
                page?.let { put("page", it.toString()) }
                prioritize?.let { put("prioritize", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Optional parameter to determine screenshot type. If 'true', takes a full page screenshot
     * capturing all content. If 'false' or not provided, takes a viewport screenshot (standard
     * browser view).
     */
    class FullScreenshot @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmStatic fun of(value: String) = FullScreenshot(JsonField.of(value))
        }

        /** An enum containing [FullScreenshot]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
        }

        /**
         * An enum containing [FullScreenshot]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FullScreenshot] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            /**
             * An enum member indicating that [FullScreenshot] was instantiated with an unknown
             * value.
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
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
                FALSE -> Known.FALSE
                else -> throw BrandDevInvalidDataException("Unknown FullScreenshot: $value")
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

        fun validate(): FullScreenshot = apply {
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

            return other is FullScreenshot && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Optional parameter to specify which page type to screenshot. If provided, the system will
     * scrape the domain's links and use heuristics to find the most appropriate URL for the
     * specified page type (30 supported languages). If not provided, screenshots the main domain
     * landing page.
     */
    class Page @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LOGIN = of("login")

            @JvmField val SIGNUP = of("signup")

            @JvmField val BLOG = of("blog")

            @JvmField val CAREERS = of("careers")

            @JvmField val PRICING = of("pricing")

            @JvmField val TERMS = of("terms")

            @JvmField val PRIVACY = of("privacy")

            @JvmField val CONTACT = of("contact")

            @JvmStatic fun of(value: String) = Page(JsonField.of(value))
        }

        /** An enum containing [Page]'s known values. */
        enum class Known {
            LOGIN,
            SIGNUP,
            BLOG,
            CAREERS,
            PRICING,
            TERMS,
            PRIVACY,
            CONTACT,
        }

        /**
         * An enum containing [Page]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Page] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOGIN,
            SIGNUP,
            BLOG,
            CAREERS,
            PRICING,
            TERMS,
            PRIVACY,
            CONTACT,
            /** An enum member indicating that [Page] was instantiated with an unknown value. */
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
                LOGIN -> Value.LOGIN
                SIGNUP -> Value.SIGNUP
                BLOG -> Value.BLOG
                CAREERS -> Value.CAREERS
                PRICING -> Value.PRICING
                TERMS -> Value.TERMS
                PRIVACY -> Value.PRIVACY
                CONTACT -> Value.CONTACT
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
                LOGIN -> Known.LOGIN
                SIGNUP -> Known.SIGNUP
                BLOG -> Known.BLOG
                CAREERS -> Known.CAREERS
                PRICING -> Known.PRICING
                TERMS -> Known.TERMS
                PRIVACY -> Known.PRIVACY
                CONTACT -> Known.CONTACT
                else -> throw BrandDevInvalidDataException("Unknown Page: $value")
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

        fun validate(): Page = apply {
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

            return other is Page && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Optional parameter to prioritize screenshot capture. If 'speed', optimizes for faster capture
     * with basic quality. If 'quality', optimizes for higher quality with longer wait times.
     * Defaults to 'quality' if not provided.
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

        return other is BrandScreenshotParams &&
            domain == other.domain &&
            fullScreenshot == other.fullScreenshot &&
            page == other.page &&
            prioritize == other.prioritize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            domain,
            fullScreenshot,
            page,
            prioritize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BrandScreenshotParams{domain=$domain, fullScreenshot=$fullScreenshot, page=$page, prioritize=$prioritize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
