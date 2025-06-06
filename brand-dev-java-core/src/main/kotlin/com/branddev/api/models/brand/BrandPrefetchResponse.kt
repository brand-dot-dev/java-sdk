// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

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

class BrandPrefetchResponse
private constructor(
    private val domain: JsonField<String>,
    private val message: JsonField<String>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(domain, message, status, mutableMapOf())

    /**
     * The domain that was queued for prefetching
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domain(): Optional<String> = domain.getOptional("domain")

    /**
     * Success message
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * Status of the response, e.g., 'ok'
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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

        /** Returns a mutable builder for constructing an instance of [BrandPrefetchResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandPrefetchResponse]. */
    class Builder internal constructor() {

        private var domain: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandPrefetchResponse: BrandPrefetchResponse) = apply {
            domain = brandPrefetchResponse.domain
            message = brandPrefetchResponse.message
            status = brandPrefetchResponse.status
            additionalProperties = brandPrefetchResponse.additionalProperties.toMutableMap()
        }

        /** The domain that was queued for prefetching */
        fun domain(domain: String) = domain(JsonField.of(domain))

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { this.domain = domain }

        /** Success message */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

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
         * Returns an immutable instance of [BrandPrefetchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandPrefetchResponse =
            BrandPrefetchResponse(domain, message, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): BrandPrefetchResponse = apply {
        if (validated) {
            return@apply
        }

        domain()
        message()
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
        (if (domain.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BrandPrefetchResponse && domain == other.domain && message == other.message && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(domain, message, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandPrefetchResponse{domain=$domain, message=$message, status=$status, additionalProperties=$additionalProperties}"
}
