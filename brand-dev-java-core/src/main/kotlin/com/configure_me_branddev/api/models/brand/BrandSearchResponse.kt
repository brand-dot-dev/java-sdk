// File generated from our OpenAPI spec by Stainless.

package com.configure_me_branddev.api.models.brand

import com.configure_me_branddev.api.core.ExcludeMissing
import com.configure_me_branddev.api.core.JsonField
import com.configure_me_branddev.api.core.JsonMissing
import com.configure_me_branddev.api.core.JsonValue
import com.configure_me_branddev.api.errors.BrandDevInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

class BrandSearchResponse
private constructor(
    private val domain: JsonField<String>,
    private val logo: JsonField<String>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logo") @ExcludeMissing logo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(domain, logo, title, mutableMapOf())

    /**
     * Domain name of the brand
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domain(): Optional<String> = domain.getOptional("domain")

    /**
     * URL of the brand's logo
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logo(): Optional<String> = logo.getOptional("logo")

    /**
     * Title or name of the brand
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

    /**
     * Returns the raw JSON value of [logo].
     *
     * Unlike [logo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logo") @ExcludeMissing fun _logo(): JsonField<String> = logo

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

        /** Returns a mutable builder for constructing an instance of [BrandSearchResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandSearchResponse]. */
    class Builder internal constructor() {

        private var domain: JsonField<String> = JsonMissing.of()
        private var logo: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandSearchResponse: BrandSearchResponse) = apply {
            domain = brandSearchResponse.domain
            logo = brandSearchResponse.logo
            title = brandSearchResponse.title
            additionalProperties = brandSearchResponse.additionalProperties.toMutableMap()
        }

        /** Domain name of the brand */
        fun domain(domain: String) = domain(JsonField.of(domain))

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { this.domain = domain }

        /** URL of the brand's logo */
        fun logo(logo: String) = logo(JsonField.of(logo))

        /**
         * Sets [Builder.logo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logo(logo: JsonField<String>) = apply { this.logo = logo }

        /** Title or name of the brand */
        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

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
         * Returns an immutable instance of [BrandSearchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandSearchResponse =
            BrandSearchResponse(domain, logo, title, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): BrandSearchResponse = apply {
        if (validated) {
            return@apply
        }

        domain()
        logo()
        title()
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
            (if (logo.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BrandSearchResponse && domain == other.domain && logo == other.logo && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(domain, logo, title, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandSearchResponse{domain=$domain, logo=$logo, title=$title, additionalProperties=$additionalProperties}"
}
