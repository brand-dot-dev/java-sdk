// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.Enum
import com.branddev.api.core.ExcludeMissing
import com.branddev.api.core.JsonField
import com.branddev.api.core.JsonMissing
import com.branddev.api.core.JsonValue
import com.branddev.api.errors.BrandDevInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BrandScreenshotResponse
private constructor(
    private val code: JsonField<Long>,
    private val domain: JsonField<String>,
    private val screenshot: JsonField<String>,
    private val screenshotType: JsonField<ScreenshotType>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("screenshot")
        @ExcludeMissing
        screenshot: JsonField<String> = JsonMissing.of(),
        @JsonProperty("screenshotType")
        @ExcludeMissing
        screenshotType: JsonField<ScreenshotType> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(code, domain, screenshot, screenshotType, status, mutableMapOf())

    /**
     * HTTP status code
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<Long> = code.getOptional("code")

    /**
     * The normalized domain that was processed
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domain(): Optional<String> = domain.getOptional("domain")

    /**
     * Public URL of the uploaded screenshot image
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun screenshot(): Optional<String> = screenshot.getOptional("screenshot")

    /**
     * Type of screenshot that was captured
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun screenshotType(): Optional<ScreenshotType> = screenshotType.getOptional("screenshotType")

    /**
     * Status of the response, e.g., 'ok'
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

    /**
     * Returns the raw JSON value of [screenshot].
     *
     * Unlike [screenshot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("screenshot") @ExcludeMissing fun _screenshot(): JsonField<String> = screenshot

    /**
     * Returns the raw JSON value of [screenshotType].
     *
     * Unlike [screenshotType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("screenshotType")
    @ExcludeMissing
    fun _screenshotType(): JsonField<ScreenshotType> = screenshotType

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

        /** Returns a mutable builder for constructing an instance of [BrandScreenshotResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandScreenshotResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long> = JsonMissing.of()
        private var domain: JsonField<String> = JsonMissing.of()
        private var screenshot: JsonField<String> = JsonMissing.of()
        private var screenshotType: JsonField<ScreenshotType> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandScreenshotResponse: BrandScreenshotResponse) = apply {
            code = brandScreenshotResponse.code
            domain = brandScreenshotResponse.domain
            screenshot = brandScreenshotResponse.screenshot
            screenshotType = brandScreenshotResponse.screenshotType
            status = brandScreenshotResponse.status
            additionalProperties = brandScreenshotResponse.additionalProperties.toMutableMap()
        }

        /** HTTP status code */
        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        /** The normalized domain that was processed */
        fun domain(domain: String) = domain(JsonField.of(domain))

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { this.domain = domain }

        /** Public URL of the uploaded screenshot image */
        fun screenshot(screenshot: String) = screenshot(JsonField.of(screenshot))

        /**
         * Sets [Builder.screenshot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.screenshot] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun screenshot(screenshot: JsonField<String>) = apply { this.screenshot = screenshot }

        /** Type of screenshot that was captured */
        fun screenshotType(screenshotType: ScreenshotType) =
            screenshotType(JsonField.of(screenshotType))

        /**
         * Sets [Builder.screenshotType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.screenshotType] with a well-typed [ScreenshotType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun screenshotType(screenshotType: JsonField<ScreenshotType>) = apply {
            this.screenshotType = screenshotType
        }

        /** Status of the response, e.g., 'ok' */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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
         * Returns an immutable instance of [BrandScreenshotResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandScreenshotResponse =
            BrandScreenshotResponse(
                code,
                domain,
                screenshot,
                screenshotType,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandScreenshotResponse = apply {
        if (validated) {
            return@apply
        }

        code()
        domain()
        screenshot()
        screenshotType().ifPresent { it.validate() }
        status()
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
        (if (code.asKnown().isPresent) 1 else 0) +
            (if (domain.asKnown().isPresent) 1 else 0) +
            (if (screenshot.asKnown().isPresent) 1 else 0) +
            (screenshotType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    /** Type of screenshot that was captured */
    class ScreenshotType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val VIEWPORT = of("viewport")

            @JvmField val FULL_PAGE = of("fullPage")

            @JvmStatic fun of(value: String) = ScreenshotType(JsonField.of(value))
        }

        /** An enum containing [ScreenshotType]'s known values. */
        enum class Known {
            VIEWPORT,
            FULL_PAGE,
        }

        /**
         * An enum containing [ScreenshotType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ScreenshotType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VIEWPORT,
            FULL_PAGE,
            /**
             * An enum member indicating that [ScreenshotType] was instantiated with an unknown
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
                VIEWPORT -> Value.VIEWPORT
                FULL_PAGE -> Value.FULL_PAGE
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
                VIEWPORT -> Known.VIEWPORT
                FULL_PAGE -> Known.FULL_PAGE
                else -> throw BrandDevInvalidDataException("Unknown ScreenshotType: $value")
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

        fun validate(): ScreenshotType = apply {
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

            return other is ScreenshotType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandScreenshotResponse &&
            code == other.code &&
            domain == other.domain &&
            screenshot == other.screenshot &&
            screenshotType == other.screenshotType &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(code, domain, screenshot, screenshotType, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandScreenshotResponse{code=$code, domain=$domain, screenshot=$screenshot, screenshotType=$screenshotType, status=$status, additionalProperties=$additionalProperties}"
}
