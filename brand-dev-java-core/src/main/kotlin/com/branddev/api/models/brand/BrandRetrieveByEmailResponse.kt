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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BrandRetrieveByEmailResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brand: JsonField<Brand>,
    private val code: JsonField<Long>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brand") @ExcludeMissing brand: JsonField<Brand> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(brand, code, status, mutableMapOf())

    /**
     * Detailed brand information
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brand(): Optional<Brand> = brand.getOptional("brand")

    /**
     * HTTP status code
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<Long> = code.getOptional("code")

    /**
     * Status of the response, e.g., 'ok'
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [brand].
     *
     * Unlike [brand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<Brand> = brand

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

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

        /**
         * Returns a mutable builder for constructing an instance of [BrandRetrieveByEmailResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandRetrieveByEmailResponse]. */
    class Builder internal constructor() {

        private var brand: JsonField<Brand> = JsonMissing.of()
        private var code: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandRetrieveByEmailResponse: BrandRetrieveByEmailResponse) = apply {
            brand = brandRetrieveByEmailResponse.brand
            code = brandRetrieveByEmailResponse.code
            status = brandRetrieveByEmailResponse.status
            additionalProperties = brandRetrieveByEmailResponse.additionalProperties.toMutableMap()
        }

        /** Detailed brand information */
        fun brand(brand: Brand) = brand(JsonField.of(brand))

        /**
         * Sets [Builder.brand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brand] with a well-typed [Brand] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brand(brand: JsonField<Brand>) = apply { this.brand = brand }

        /** HTTP status code */
        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

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
         * Returns an immutable instance of [BrandRetrieveByEmailResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandRetrieveByEmailResponse =
            BrandRetrieveByEmailResponse(brand, code, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): BrandRetrieveByEmailResponse = apply {
        if (validated) {
            return@apply
        }

        brand().ifPresent { it.validate() }
        code()
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
        (brand.asKnown().getOrNull()?.validity() ?: 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    /** Detailed brand information */
    class Brand
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val backdrops: JsonField<List<Backdrop>>,
        private val colors: JsonField<List<Color>>,
        private val description: JsonField<String>,
        private val domain: JsonField<String>,
        private val email: JsonField<String>,
        private val industries: JsonField<Industries>,
        private val isNsfw: JsonField<Boolean>,
        private val links: JsonField<Links>,
        private val logos: JsonField<List<Logo>>,
        private val phone: JsonField<String>,
        private val slogan: JsonField<String>,
        private val socials: JsonField<List<Social>>,
        private val stock: JsonField<Stock>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("backdrops")
            @ExcludeMissing
            backdrops: JsonField<List<Backdrop>> = JsonMissing.of(),
            @JsonProperty("colors")
            @ExcludeMissing
            colors: JsonField<List<Color>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("industries")
            @ExcludeMissing
            industries: JsonField<Industries> = JsonMissing.of(),
            @JsonProperty("is_nsfw") @ExcludeMissing isNsfw: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("links") @ExcludeMissing links: JsonField<Links> = JsonMissing.of(),
            @JsonProperty("logos") @ExcludeMissing logos: JsonField<List<Logo>> = JsonMissing.of(),
            @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("slogan") @ExcludeMissing slogan: JsonField<String> = JsonMissing.of(),
            @JsonProperty("socials")
            @ExcludeMissing
            socials: JsonField<List<Social>> = JsonMissing.of(),
            @JsonProperty("stock") @ExcludeMissing stock: JsonField<Stock> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            backdrops,
            colors,
            description,
            domain,
            email,
            industries,
            isNsfw,
            links,
            logos,
            phone,
            slogan,
            socials,
            stock,
            title,
            mutableMapOf(),
        )

        /**
         * Physical address of the brand
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun address(): Optional<Address> = address.getOptional("address")

        /**
         * An array of backdrop images for the brand
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun backdrops(): Optional<List<Backdrop>> = backdrops.getOptional("backdrops")

        /**
         * An array of brand colors
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun colors(): Optional<List<Color>> = colors.getOptional("colors")

        /**
         * A brief description of the brand
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The domain name of the brand
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun domain(): Optional<String> = domain.getOptional("domain")

        /**
         * Company email address
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * Industry classification information for the brand
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun industries(): Optional<Industries> = industries.getOptional("industries")

        /**
         * Indicates whether the brand content is not safe for work (NSFW)
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isNsfw(): Optional<Boolean> = isNsfw.getOptional("is_nsfw")

        /**
         * Important website links for the brand
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun links(): Optional<Links> = links.getOptional("links")

        /**
         * An array of logos associated with the brand
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun logos(): Optional<List<Logo>> = logos.getOptional("logos")

        /**
         * Company phone number
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun phone(): Optional<String> = phone.getOptional("phone")

        /**
         * The brand's slogan
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun slogan(): Optional<String> = slogan.getOptional("slogan")

        /**
         * An array of social media links for the brand
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun socials(): Optional<List<Social>> = socials.getOptional("socials")

        /**
         * Stock market information for this brand (will be null if not a publicly traded company)
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun stock(): Optional<Stock> = stock.getOptional("stock")

        /**
         * The title or name of the brand
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [backdrops].
         *
         * Unlike [backdrops], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("backdrops")
        @ExcludeMissing
        fun _backdrops(): JsonField<List<Backdrop>> = backdrops

        /**
         * Returns the raw JSON value of [colors].
         *
         * Unlike [colors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("colors") @ExcludeMissing fun _colors(): JsonField<List<Color>> = colors

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [domain].
         *
         * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [industries].
         *
         * Unlike [industries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("industries")
        @ExcludeMissing
        fun _industries(): JsonField<Industries> = industries

        /**
         * Returns the raw JSON value of [isNsfw].
         *
         * Unlike [isNsfw], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_nsfw") @ExcludeMissing fun _isNsfw(): JsonField<Boolean> = isNsfw

        /**
         * Returns the raw JSON value of [links].
         *
         * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<Links> = links

        /**
         * Returns the raw JSON value of [logos].
         *
         * Unlike [logos], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logos") @ExcludeMissing fun _logos(): JsonField<List<Logo>> = logos

        /**
         * Returns the raw JSON value of [phone].
         *
         * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

        /**
         * Returns the raw JSON value of [slogan].
         *
         * Unlike [slogan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("slogan") @ExcludeMissing fun _slogan(): JsonField<String> = slogan

        /**
         * Returns the raw JSON value of [socials].
         *
         * Unlike [socials], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("socials") @ExcludeMissing fun _socials(): JsonField<List<Social>> = socials

        /**
         * Returns the raw JSON value of [stock].
         *
         * Unlike [stock], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stock") @ExcludeMissing fun _stock(): JsonField<Stock> = stock

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

            /** Returns a mutable builder for constructing an instance of [Brand]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Brand]. */
        class Builder internal constructor() {

            private var address: JsonField<Address> = JsonMissing.of()
            private var backdrops: JsonField<MutableList<Backdrop>>? = null
            private var colors: JsonField<MutableList<Color>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var domain: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var industries: JsonField<Industries> = JsonMissing.of()
            private var isNsfw: JsonField<Boolean> = JsonMissing.of()
            private var links: JsonField<Links> = JsonMissing.of()
            private var logos: JsonField<MutableList<Logo>>? = null
            private var phone: JsonField<String> = JsonMissing.of()
            private var slogan: JsonField<String> = JsonMissing.of()
            private var socials: JsonField<MutableList<Social>>? = null
            private var stock: JsonField<Stock> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(brand: Brand) = apply {
                address = brand.address
                backdrops = brand.backdrops.map { it.toMutableList() }
                colors = brand.colors.map { it.toMutableList() }
                description = brand.description
                domain = brand.domain
                email = brand.email
                industries = brand.industries
                isNsfw = brand.isNsfw
                links = brand.links
                logos = brand.logos.map { it.toMutableList() }
                phone = brand.phone
                slogan = brand.slogan
                socials = brand.socials.map { it.toMutableList() }
                stock = brand.stock
                title = brand.title
                additionalProperties = brand.additionalProperties.toMutableMap()
            }

            /** Physical address of the brand */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** An array of backdrop images for the brand */
            fun backdrops(backdrops: List<Backdrop>) = backdrops(JsonField.of(backdrops))

            /**
             * Sets [Builder.backdrops] to an arbitrary JSON value.
             *
             * You should usually call [Builder.backdrops] with a well-typed `List<Backdrop>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun backdrops(backdrops: JsonField<List<Backdrop>>) = apply {
                this.backdrops = backdrops.map { it.toMutableList() }
            }

            /**
             * Adds a single [Backdrop] to [backdrops].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBackdrop(backdrop: Backdrop) = apply {
                backdrops =
                    (backdrops ?: JsonField.of(mutableListOf())).also {
                        checkKnown("backdrops", it).add(backdrop)
                    }
            }

            /** An array of brand colors */
            fun colors(colors: List<Color>) = colors(JsonField.of(colors))

            /**
             * Sets [Builder.colors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.colors] with a well-typed `List<Color>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun colors(colors: JsonField<List<Color>>) = apply {
                this.colors = colors.map { it.toMutableList() }
            }

            /**
             * Adds a single [Color] to [colors].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addColor(color: Color) = apply {
                colors =
                    (colors ?: JsonField.of(mutableListOf())).also {
                        checkKnown("colors", it).add(color)
                    }
            }

            /** A brief description of the brand */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The domain name of the brand */
            fun domain(domain: String) = domain(JsonField.of(domain))

            /**
             * Sets [Builder.domain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domain] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domain(domain: JsonField<String>) = apply { this.domain = domain }

            /** Company email address */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Industry classification information for the brand */
            fun industries(industries: Industries) = industries(JsonField.of(industries))

            /**
             * Sets [Builder.industries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.industries] with a well-typed [Industries] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun industries(industries: JsonField<Industries>) = apply {
                this.industries = industries
            }

            /** Indicates whether the brand content is not safe for work (NSFW) */
            fun isNsfw(isNsfw: Boolean) = isNsfw(JsonField.of(isNsfw))

            /**
             * Sets [Builder.isNsfw] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isNsfw] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isNsfw(isNsfw: JsonField<Boolean>) = apply { this.isNsfw = isNsfw }

            /** Important website links for the brand */
            fun links(links: Links) = links(JsonField.of(links))

            /**
             * Sets [Builder.links] to an arbitrary JSON value.
             *
             * You should usually call [Builder.links] with a well-typed [Links] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun links(links: JsonField<Links>) = apply { this.links = links }

            /** An array of logos associated with the brand */
            fun logos(logos: List<Logo>) = logos(JsonField.of(logos))

            /**
             * Sets [Builder.logos] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logos] with a well-typed `List<Logo>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logos(logos: JsonField<List<Logo>>) = apply {
                this.logos = logos.map { it.toMutableList() }
            }

            /**
             * Adds a single [Logo] to [logos].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLogo(logo: Logo) = apply {
                logos =
                    (logos ?: JsonField.of(mutableListOf())).also {
                        checkKnown("logos", it).add(logo)
                    }
            }

            /** Company phone number */
            fun phone(phone: String) = phone(JsonField.of(phone))

            /**
             * Sets [Builder.phone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            /** The brand's slogan */
            fun slogan(slogan: String) = slogan(JsonField.of(slogan))

            /**
             * Sets [Builder.slogan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slogan] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun slogan(slogan: JsonField<String>) = apply { this.slogan = slogan }

            /** An array of social media links for the brand */
            fun socials(socials: List<Social>) = socials(JsonField.of(socials))

            /**
             * Sets [Builder.socials] to an arbitrary JSON value.
             *
             * You should usually call [Builder.socials] with a well-typed `List<Social>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun socials(socials: JsonField<List<Social>>) = apply {
                this.socials = socials.map { it.toMutableList() }
            }

            /**
             * Adds a single [Social] to [socials].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSocial(social: Social) = apply {
                socials =
                    (socials ?: JsonField.of(mutableListOf())).also {
                        checkKnown("socials", it).add(social)
                    }
            }

            /**
             * Stock market information for this brand (will be null if not a publicly traded
             * company)
             */
            fun stock(stock: Stock) = stock(JsonField.of(stock))

            /**
             * Sets [Builder.stock] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stock] with a well-typed [Stock] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun stock(stock: JsonField<Stock>) = apply { this.stock = stock }

            /** The title or name of the brand */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Brand].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Brand =
                Brand(
                    address,
                    (backdrops ?: JsonMissing.of()).map { it.toImmutable() },
                    (colors ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    domain,
                    email,
                    industries,
                    isNsfw,
                    links,
                    (logos ?: JsonMissing.of()).map { it.toImmutable() },
                    phone,
                    slogan,
                    (socials ?: JsonMissing.of()).map { it.toImmutable() },
                    stock,
                    title,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Brand = apply {
            if (validated) {
                return@apply
            }

            address().ifPresent { it.validate() }
            backdrops().ifPresent { it.forEach { it.validate() } }
            colors().ifPresent { it.forEach { it.validate() } }
            description()
            domain()
            email()
            industries().ifPresent { it.validate() }
            isNsfw()
            links().ifPresent { it.validate() }
            logos().ifPresent { it.forEach { it.validate() } }
            phone()
            slogan()
            socials().ifPresent { it.forEach { it.validate() } }
            stock().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (address.asKnown().getOrNull()?.validity() ?: 0) +
                (backdrops.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (colors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (domain.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (industries.asKnown().getOrNull()?.validity() ?: 0) +
                (if (isNsfw.asKnown().isPresent) 1 else 0) +
                (links.asKnown().getOrNull()?.validity() ?: 0) +
                (logos.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phone.asKnown().isPresent) 1 else 0) +
                (if (slogan.asKnown().isPresent) 1 else 0) +
                (socials.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (stock.asKnown().getOrNull()?.validity() ?: 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        /** Physical address of the brand */
        class Address
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val city: JsonField<String>,
            private val country: JsonField<String>,
            private val countryCode: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val stateCode: JsonField<String>,
            private val stateProvince: JsonField<String>,
            private val street: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country_code")
                @ExcludeMissing
                countryCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state_code")
                @ExcludeMissing
                stateCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state_province")
                @ExcludeMissing
                stateProvince: JsonField<String> = JsonMissing.of(),
                @JsonProperty("street") @ExcludeMissing street: JsonField<String> = JsonMissing.of(),
            ) : this(
                city,
                country,
                countryCode,
                postalCode,
                stateCode,
                stateProvince,
                street,
                mutableMapOf(),
            )

            /**
             * City name
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun city(): Optional<String> = city.getOptional("city")

            /**
             * Country name
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun country(): Optional<String> = country.getOptional("country")

            /**
             * Country code
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

            /**
             * Postal or ZIP code
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

            /**
             * State or province code
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun stateCode(): Optional<String> = stateCode.getOptional("state_code")

            /**
             * State or province name
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun stateProvince(): Optional<String> = stateProvince.getOptional("state_province")

            /**
             * Street address
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun street(): Optional<String> = street.getOptional("street")

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [countryCode].
             *
             * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("country_code")
            @ExcludeMissing
            fun _countryCode(): JsonField<String> = countryCode

            /**
             * Returns the raw JSON value of [postalCode].
             *
             * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /**
             * Returns the raw JSON value of [stateCode].
             *
             * Unlike [stateCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("state_code")
            @ExcludeMissing
            fun _stateCode(): JsonField<String> = stateCode

            /**
             * Returns the raw JSON value of [stateProvince].
             *
             * Unlike [stateProvince], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("state_province")
            @ExcludeMissing
            fun _stateProvince(): JsonField<String> = stateProvince

            /**
             * Returns the raw JSON value of [street].
             *
             * Unlike [street], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

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

                /** Returns a mutable builder for constructing an instance of [Address]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Address]. */
            class Builder internal constructor() {

                private var city: JsonField<String> = JsonMissing.of()
                private var country: JsonField<String> = JsonMissing.of()
                private var countryCode: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var stateCode: JsonField<String> = JsonMissing.of()
                private var stateProvince: JsonField<String> = JsonMissing.of()
                private var street: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    country = address.country
                    countryCode = address.countryCode
                    postalCode = address.postalCode
                    stateCode = address.stateCode
                    stateProvince = address.stateProvince
                    street = address.street
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** City name */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** Country name */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** Country code */
                fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

                /**
                 * Sets [Builder.countryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countryCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun countryCode(countryCode: JsonField<String>) = apply {
                    this.countryCode = countryCode
                }

                /** Postal or ZIP code */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /**
                 * Sets [Builder.postalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postalCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** State or province code */
                fun stateCode(stateCode: String) = stateCode(JsonField.of(stateCode))

                /**
                 * Sets [Builder.stateCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stateCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stateCode(stateCode: JsonField<String>) = apply { this.stateCode = stateCode }

                /** State or province name */
                fun stateProvince(stateProvince: String) =
                    stateProvince(JsonField.of(stateProvince))

                /**
                 * Sets [Builder.stateProvince] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stateProvince] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stateProvince(stateProvince: JsonField<String>) = apply {
                    this.stateProvince = stateProvince
                }

                /** Street address */
                fun street(street: String) = street(JsonField.of(street))

                /**
                 * Sets [Builder.street] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.street] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun street(street: JsonField<String>) = apply { this.street = street }

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
                 * Returns an immutable instance of [Address].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Address =
                    Address(
                        city,
                        country,
                        countryCode,
                        postalCode,
                        stateCode,
                        stateProvince,
                        street,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Address = apply {
                if (validated) {
                    return@apply
                }

                city()
                country()
                countryCode()
                postalCode()
                stateCode()
                stateProvince()
                street()
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
                (if (city.asKnown().isPresent) 1 else 0) +
                    (if (country.asKnown().isPresent) 1 else 0) +
                    (if (countryCode.asKnown().isPresent) 1 else 0) +
                    (if (postalCode.asKnown().isPresent) 1 else 0) +
                    (if (stateCode.asKnown().isPresent) 1 else 0) +
                    (if (stateProvince.asKnown().isPresent) 1 else 0) +
                    (if (street.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    city == other.city &&
                    country == other.country &&
                    countryCode == other.countryCode &&
                    postalCode == other.postalCode &&
                    stateCode == other.stateCode &&
                    stateProvince == other.stateProvince &&
                    street == other.street &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    city,
                    country,
                    countryCode,
                    postalCode,
                    stateCode,
                    stateProvince,
                    street,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, country=$country, countryCode=$countryCode, postalCode=$postalCode, stateCode=$stateCode, stateProvince=$stateProvince, street=$street, additionalProperties=$additionalProperties}"
        }

        class Backdrop
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val colors: JsonField<List<Color>>,
            private val resolution: JsonField<Resolution>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("colors")
                @ExcludeMissing
                colors: JsonField<List<Color>> = JsonMissing.of(),
                @JsonProperty("resolution")
                @ExcludeMissing
                resolution: JsonField<Resolution> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(colors, resolution, url, mutableMapOf())

            /**
             * Array of colors in the backdrop image
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun colors(): Optional<List<Color>> = colors.getOptional("colors")

            /**
             * Resolution of the backdrop image
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun resolution(): Optional<Resolution> = resolution.getOptional("resolution")

            /**
             * URL of the backdrop image
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [colors].
             *
             * Unlike [colors], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("colors") @ExcludeMissing fun _colors(): JsonField<List<Color>> = colors

            /**
             * Returns the raw JSON value of [resolution].
             *
             * Unlike [resolution], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("resolution")
            @ExcludeMissing
            fun _resolution(): JsonField<Resolution> = resolution

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

                /** Returns a mutable builder for constructing an instance of [Backdrop]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Backdrop]. */
            class Builder internal constructor() {

                private var colors: JsonField<MutableList<Color>>? = null
                private var resolution: JsonField<Resolution> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(backdrop: Backdrop) = apply {
                    colors = backdrop.colors.map { it.toMutableList() }
                    resolution = backdrop.resolution
                    url = backdrop.url
                    additionalProperties = backdrop.additionalProperties.toMutableMap()
                }

                /** Array of colors in the backdrop image */
                fun colors(colors: List<Color>) = colors(JsonField.of(colors))

                /**
                 * Sets [Builder.colors] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.colors] with a well-typed `List<Color>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun colors(colors: JsonField<List<Color>>) = apply {
                    this.colors = colors.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Color] to [colors].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addColor(color: Color) = apply {
                    colors =
                        (colors ?: JsonField.of(mutableListOf())).also {
                            checkKnown("colors", it).add(color)
                        }
                }

                /** Resolution of the backdrop image */
                fun resolution(resolution: Resolution) = resolution(JsonField.of(resolution))

                /**
                 * Sets [Builder.resolution] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resolution] with a well-typed [Resolution] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun resolution(resolution: JsonField<Resolution>) = apply {
                    this.resolution = resolution
                }

                /** URL of the backdrop image */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [Backdrop].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Backdrop =
                    Backdrop(
                        (colors ?: JsonMissing.of()).map { it.toImmutable() },
                        resolution,
                        url,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Backdrop = apply {
                if (validated) {
                    return@apply
                }

                colors().ifPresent { it.forEach { it.validate() } }
                resolution().ifPresent { it.validate() }
                url()
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
                (colors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (resolution.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (url.asKnown().isPresent) 1 else 0)

            class Color
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val hex: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("hex") @ExcludeMissing hex: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                ) : this(hex, name, mutableMapOf())

                /**
                 * Color in hexadecimal format
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun hex(): Optional<String> = hex.getOptional("hex")

                /**
                 * Name of the color
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Returns the raw JSON value of [hex].
                 *
                 * Unlike [hex], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("hex") @ExcludeMissing fun _hex(): JsonField<String> = hex

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                    /** Returns a mutable builder for constructing an instance of [Color]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Color]. */
                class Builder internal constructor() {

                    private var hex: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(color: Color) = apply {
                        hex = color.hex
                        name = color.name
                        additionalProperties = color.additionalProperties.toMutableMap()
                    }

                    /** Color in hexadecimal format */
                    fun hex(hex: String) = hex(JsonField.of(hex))

                    /**
                     * Sets [Builder.hex] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.hex] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun hex(hex: JsonField<String>) = apply { this.hex = hex }

                    /** Name of the color */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

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
                     * Returns an immutable instance of [Color].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Color = Color(hex, name, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Color = apply {
                    if (validated) {
                        return@apply
                    }

                    hex()
                    name()
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
                    (if (hex.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Color &&
                        hex == other.hex &&
                        name == other.name &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(hex, name, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Color{hex=$hex, name=$name, additionalProperties=$additionalProperties}"
            }

            /** Resolution of the backdrop image */
            class Resolution
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val aspectRatio: JsonField<Double>,
                private val height: JsonField<Long>,
                private val width: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("aspect_ratio")
                    @ExcludeMissing
                    aspectRatio: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("height")
                    @ExcludeMissing
                    height: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
                ) : this(aspectRatio, height, width, mutableMapOf())

                /**
                 * Aspect ratio of the image (width/height)
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun aspectRatio(): Optional<Double> = aspectRatio.getOptional("aspect_ratio")

                /**
                 * Height of the image in pixels
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun height(): Optional<Long> = height.getOptional("height")

                /**
                 * Width of the image in pixels
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun width(): Optional<Long> = width.getOptional("width")

                /**
                 * Returns the raw JSON value of [aspectRatio].
                 *
                 * Unlike [aspectRatio], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("aspect_ratio")
                @ExcludeMissing
                fun _aspectRatio(): JsonField<Double> = aspectRatio

                /**
                 * Returns the raw JSON value of [height].
                 *
                 * Unlike [height], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Long> = height

                /**
                 * Returns the raw JSON value of [width].
                 *
                 * Unlike [width], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Long> = width

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

                    /** Returns a mutable builder for constructing an instance of [Resolution]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Resolution]. */
                class Builder internal constructor() {

                    private var aspectRatio: JsonField<Double> = JsonMissing.of()
                    private var height: JsonField<Long> = JsonMissing.of()
                    private var width: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(resolution: Resolution) = apply {
                        aspectRatio = resolution.aspectRatio
                        height = resolution.height
                        width = resolution.width
                        additionalProperties = resolution.additionalProperties.toMutableMap()
                    }

                    /** Aspect ratio of the image (width/height) */
                    fun aspectRatio(aspectRatio: Double) = aspectRatio(JsonField.of(aspectRatio))

                    /**
                     * Sets [Builder.aspectRatio] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.aspectRatio] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun aspectRatio(aspectRatio: JsonField<Double>) = apply {
                        this.aspectRatio = aspectRatio
                    }

                    /** Height of the image in pixels */
                    fun height(height: Long) = height(JsonField.of(height))

                    /**
                     * Sets [Builder.height] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.height] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun height(height: JsonField<Long>) = apply { this.height = height }

                    /** Width of the image in pixels */
                    fun width(width: Long) = width(JsonField.of(width))

                    /**
                     * Sets [Builder.width] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.width] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun width(width: JsonField<Long>) = apply { this.width = width }

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
                     * Returns an immutable instance of [Resolution].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Resolution =
                        Resolution(aspectRatio, height, width, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Resolution = apply {
                    if (validated) {
                        return@apply
                    }

                    aspectRatio()
                    height()
                    width()
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
                    (if (aspectRatio.asKnown().isPresent) 1 else 0) +
                        (if (height.asKnown().isPresent) 1 else 0) +
                        (if (width.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Resolution &&
                        aspectRatio == other.aspectRatio &&
                        height == other.height &&
                        width == other.width &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(aspectRatio, height, width, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Resolution{aspectRatio=$aspectRatio, height=$height, width=$width, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Backdrop &&
                    colors == other.colors &&
                    resolution == other.resolution &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(colors, resolution, url, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Backdrop{colors=$colors, resolution=$resolution, url=$url, additionalProperties=$additionalProperties}"
        }

        class Color
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val hex: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("hex") @ExcludeMissing hex: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(hex, name, mutableMapOf())

            /**
             * Color in hexadecimal format
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun hex(): Optional<String> = hex.getOptional("hex")

            /**
             * Name of the color
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [hex].
             *
             * Unlike [hex], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hex") @ExcludeMissing fun _hex(): JsonField<String> = hex

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                /** Returns a mutable builder for constructing an instance of [Color]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Color]. */
            class Builder internal constructor() {

                private var hex: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(color: Color) = apply {
                    hex = color.hex
                    name = color.name
                    additionalProperties = color.additionalProperties.toMutableMap()
                }

                /** Color in hexadecimal format */
                fun hex(hex: String) = hex(JsonField.of(hex))

                /**
                 * Sets [Builder.hex] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hex] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun hex(hex: JsonField<String>) = apply { this.hex = hex }

                /** Name of the color */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Color].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Color = Color(hex, name, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Color = apply {
                if (validated) {
                    return@apply
                }

                hex()
                name()
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
                (if (hex.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Color &&
                    hex == other.hex &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(hex, name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Color{hex=$hex, name=$name, additionalProperties=$additionalProperties}"
        }

        /** Industry classification information for the brand */
        class Industries
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val eic: JsonField<List<Eic>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("eic") @ExcludeMissing eic: JsonField<List<Eic>> = JsonMissing.of()
            ) : this(eic, mutableMapOf())

            /**
             * Easy Industry Classification - array of industry and subindustry pairs
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun eic(): Optional<List<Eic>> = eic.getOptional("eic")

            /**
             * Returns the raw JSON value of [eic].
             *
             * Unlike [eic], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("eic") @ExcludeMissing fun _eic(): JsonField<List<Eic>> = eic

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

                /** Returns a mutable builder for constructing an instance of [Industries]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Industries]. */
            class Builder internal constructor() {

                private var eic: JsonField<MutableList<Eic>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(industries: Industries) = apply {
                    eic = industries.eic.map { it.toMutableList() }
                    additionalProperties = industries.additionalProperties.toMutableMap()
                }

                /** Easy Industry Classification - array of industry and subindustry pairs */
                fun eic(eic: List<Eic>) = eic(JsonField.of(eic))

                /**
                 * Sets [Builder.eic] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eic] with a well-typed `List<Eic>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eic(eic: JsonField<List<Eic>>) = apply {
                    this.eic = eic.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Eic] to [Builder.eic].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEic(eic: Eic) = apply {
                    this.eic =
                        (this.eic ?: JsonField.of(mutableListOf())).also {
                            checkKnown("eic", it).add(eic)
                        }
                }

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
                 * Returns an immutable instance of [Industries].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Industries =
                    Industries(
                        (eic ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Industries = apply {
                if (validated) {
                    return@apply
                }

                eic().ifPresent { it.forEach { it.validate() } }
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
                (eic.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Eic
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val industry: JsonField<Industry>,
                private val subindustry: JsonField<Subindustry>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("industry")
                    @ExcludeMissing
                    industry: JsonField<Industry> = JsonMissing.of(),
                    @JsonProperty("subindustry")
                    @ExcludeMissing
                    subindustry: JsonField<Subindustry> = JsonMissing.of(),
                ) : this(industry, subindustry, mutableMapOf())

                /**
                 * Industry classification enum
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun industry(): Industry = industry.getRequired("industry")

                /**
                 * Subindustry classification enum
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun subindustry(): Subindustry = subindustry.getRequired("subindustry")

                /**
                 * Returns the raw JSON value of [industry].
                 *
                 * Unlike [industry], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("industry")
                @ExcludeMissing
                fun _industry(): JsonField<Industry> = industry

                /**
                 * Returns the raw JSON value of [subindustry].
                 *
                 * Unlike [subindustry], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("subindustry")
                @ExcludeMissing
                fun _subindustry(): JsonField<Subindustry> = subindustry

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
                     * Returns a mutable builder for constructing an instance of [Eic].
                     *
                     * The following fields are required:
                     * ```java
                     * .industry()
                     * .subindustry()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Eic]. */
                class Builder internal constructor() {

                    private var industry: JsonField<Industry>? = null
                    private var subindustry: JsonField<Subindustry>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(eic: Eic) = apply {
                        industry = eic.industry
                        subindustry = eic.subindustry
                        additionalProperties = eic.additionalProperties.toMutableMap()
                    }

                    /** Industry classification enum */
                    fun industry(industry: Industry) = industry(JsonField.of(industry))

                    /**
                     * Sets [Builder.industry] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.industry] with a well-typed [Industry] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun industry(industry: JsonField<Industry>) = apply { this.industry = industry }

                    /** Subindustry classification enum */
                    fun subindustry(subindustry: Subindustry) =
                        subindustry(JsonField.of(subindustry))

                    /**
                     * Sets [Builder.subindustry] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subindustry] with a well-typed [Subindustry]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun subindustry(subindustry: JsonField<Subindustry>) = apply {
                        this.subindustry = subindustry
                    }

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
                     * Returns an immutable instance of [Eic].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .industry()
                     * .subindustry()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Eic =
                        Eic(
                            checkRequired("industry", industry),
                            checkRequired("subindustry", subindustry),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Eic = apply {
                    if (validated) {
                        return@apply
                    }

                    industry().validate()
                    subindustry().validate()
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
                    (industry.asKnown().getOrNull()?.validity() ?: 0) +
                        (subindustry.asKnown().getOrNull()?.validity() ?: 0)

                /** Industry classification enum */
                class Industry
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val AEROSPACE_DEFENSE = of("Aerospace & Defense")

                        @JvmField val TECHNOLOGY = of("Technology")

                        @JvmField val FINANCE = of("Finance")

                        @JvmField val HEALTHCARE = of("Healthcare")

                        @JvmField val RETAIL_E_COMMERCE = of("Retail & E-commerce")

                        @JvmField val ENTERTAINMENT = of("Entertainment")

                        @JvmField val EDUCATION = of("Education")

                        @JvmField val GOVERNMENT_NONPROFIT = of("Government & Nonprofit")

                        @JvmField val INDUSTRIAL_ENERGY = of("Industrial & Energy")

                        @JvmField val AUTOMOTIVE_TRANSPORTATION = of("Automotive & Transportation")

                        @JvmField val LIFESTYLE_LEISURE = of("Lifestyle & Leisure")

                        @JvmField val LUXURY_FASHION = of("Luxury & Fashion")

                        @JvmField val NEWS_MEDIA = of("News & Media")

                        @JvmField val SPORTS = of("Sports")

                        @JvmField val REAL_ESTATE_PROP_TECH = of("Real Estate & PropTech")

                        @JvmField val LEGAL_COMPLIANCE = of("Legal & Compliance")

                        @JvmField val TELECOMMUNICATIONS = of("Telecommunications")

                        @JvmField val AGRICULTURE_FOOD = of("Agriculture & Food")

                        @JvmField
                        val PROFESSIONAL_SERVICES_AGENCIES = of("Professional Services & Agencies")

                        @JvmField val CHEMICALS_MATERIALS = of("Chemicals & Materials")

                        @JvmField val LOGISTICS_SUPPLY_CHAIN = of("Logistics & Supply Chain")

                        @JvmField val HOSPITALITY_TOURISM = of("Hospitality & Tourism")

                        @JvmField
                        val CONSTRUCTION_BUILT_ENVIRONMENT = of("Construction & Built Environment")

                        @JvmField
                        val CONSUMER_PACKAGED_GOODS_CPG = of("Consumer Packaged Goods (CPG)")

                        @JvmStatic fun of(value: String) = Industry(JsonField.of(value))
                    }

                    /** An enum containing [Industry]'s known values. */
                    enum class Known {
                        AEROSPACE_DEFENSE,
                        TECHNOLOGY,
                        FINANCE,
                        HEALTHCARE,
                        RETAIL_E_COMMERCE,
                        ENTERTAINMENT,
                        EDUCATION,
                        GOVERNMENT_NONPROFIT,
                        INDUSTRIAL_ENERGY,
                        AUTOMOTIVE_TRANSPORTATION,
                        LIFESTYLE_LEISURE,
                        LUXURY_FASHION,
                        NEWS_MEDIA,
                        SPORTS,
                        REAL_ESTATE_PROP_TECH,
                        LEGAL_COMPLIANCE,
                        TELECOMMUNICATIONS,
                        AGRICULTURE_FOOD,
                        PROFESSIONAL_SERVICES_AGENCIES,
                        CHEMICALS_MATERIALS,
                        LOGISTICS_SUPPLY_CHAIN,
                        HOSPITALITY_TOURISM,
                        CONSTRUCTION_BUILT_ENVIRONMENT,
                        CONSUMER_PACKAGED_GOODS_CPG,
                    }

                    /**
                     * An enum containing [Industry]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Industry] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        AEROSPACE_DEFENSE,
                        TECHNOLOGY,
                        FINANCE,
                        HEALTHCARE,
                        RETAIL_E_COMMERCE,
                        ENTERTAINMENT,
                        EDUCATION,
                        GOVERNMENT_NONPROFIT,
                        INDUSTRIAL_ENERGY,
                        AUTOMOTIVE_TRANSPORTATION,
                        LIFESTYLE_LEISURE,
                        LUXURY_FASHION,
                        NEWS_MEDIA,
                        SPORTS,
                        REAL_ESTATE_PROP_TECH,
                        LEGAL_COMPLIANCE,
                        TELECOMMUNICATIONS,
                        AGRICULTURE_FOOD,
                        PROFESSIONAL_SERVICES_AGENCIES,
                        CHEMICALS_MATERIALS,
                        LOGISTICS_SUPPLY_CHAIN,
                        HOSPITALITY_TOURISM,
                        CONSTRUCTION_BUILT_ENVIRONMENT,
                        CONSUMER_PACKAGED_GOODS_CPG,
                        /**
                         * An enum member indicating that [Industry] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            AEROSPACE_DEFENSE -> Value.AEROSPACE_DEFENSE
                            TECHNOLOGY -> Value.TECHNOLOGY
                            FINANCE -> Value.FINANCE
                            HEALTHCARE -> Value.HEALTHCARE
                            RETAIL_E_COMMERCE -> Value.RETAIL_E_COMMERCE
                            ENTERTAINMENT -> Value.ENTERTAINMENT
                            EDUCATION -> Value.EDUCATION
                            GOVERNMENT_NONPROFIT -> Value.GOVERNMENT_NONPROFIT
                            INDUSTRIAL_ENERGY -> Value.INDUSTRIAL_ENERGY
                            AUTOMOTIVE_TRANSPORTATION -> Value.AUTOMOTIVE_TRANSPORTATION
                            LIFESTYLE_LEISURE -> Value.LIFESTYLE_LEISURE
                            LUXURY_FASHION -> Value.LUXURY_FASHION
                            NEWS_MEDIA -> Value.NEWS_MEDIA
                            SPORTS -> Value.SPORTS
                            REAL_ESTATE_PROP_TECH -> Value.REAL_ESTATE_PROP_TECH
                            LEGAL_COMPLIANCE -> Value.LEGAL_COMPLIANCE
                            TELECOMMUNICATIONS -> Value.TELECOMMUNICATIONS
                            AGRICULTURE_FOOD -> Value.AGRICULTURE_FOOD
                            PROFESSIONAL_SERVICES_AGENCIES -> Value.PROFESSIONAL_SERVICES_AGENCIES
                            CHEMICALS_MATERIALS -> Value.CHEMICALS_MATERIALS
                            LOGISTICS_SUPPLY_CHAIN -> Value.LOGISTICS_SUPPLY_CHAIN
                            HOSPITALITY_TOURISM -> Value.HOSPITALITY_TOURISM
                            CONSTRUCTION_BUILT_ENVIRONMENT -> Value.CONSTRUCTION_BUILT_ENVIRONMENT
                            CONSUMER_PACKAGED_GOODS_CPG -> Value.CONSUMER_PACKAGED_GOODS_CPG
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws BrandDevInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            AEROSPACE_DEFENSE -> Known.AEROSPACE_DEFENSE
                            TECHNOLOGY -> Known.TECHNOLOGY
                            FINANCE -> Known.FINANCE
                            HEALTHCARE -> Known.HEALTHCARE
                            RETAIL_E_COMMERCE -> Known.RETAIL_E_COMMERCE
                            ENTERTAINMENT -> Known.ENTERTAINMENT
                            EDUCATION -> Known.EDUCATION
                            GOVERNMENT_NONPROFIT -> Known.GOVERNMENT_NONPROFIT
                            INDUSTRIAL_ENERGY -> Known.INDUSTRIAL_ENERGY
                            AUTOMOTIVE_TRANSPORTATION -> Known.AUTOMOTIVE_TRANSPORTATION
                            LIFESTYLE_LEISURE -> Known.LIFESTYLE_LEISURE
                            LUXURY_FASHION -> Known.LUXURY_FASHION
                            NEWS_MEDIA -> Known.NEWS_MEDIA
                            SPORTS -> Known.SPORTS
                            REAL_ESTATE_PROP_TECH -> Known.REAL_ESTATE_PROP_TECH
                            LEGAL_COMPLIANCE -> Known.LEGAL_COMPLIANCE
                            TELECOMMUNICATIONS -> Known.TELECOMMUNICATIONS
                            AGRICULTURE_FOOD -> Known.AGRICULTURE_FOOD
                            PROFESSIONAL_SERVICES_AGENCIES -> Known.PROFESSIONAL_SERVICES_AGENCIES
                            CHEMICALS_MATERIALS -> Known.CHEMICALS_MATERIALS
                            LOGISTICS_SUPPLY_CHAIN -> Known.LOGISTICS_SUPPLY_CHAIN
                            HOSPITALITY_TOURISM -> Known.HOSPITALITY_TOURISM
                            CONSTRUCTION_BUILT_ENVIRONMENT -> Known.CONSTRUCTION_BUILT_ENVIRONMENT
                            CONSUMER_PACKAGED_GOODS_CPG -> Known.CONSUMER_PACKAGED_GOODS_CPG
                            else -> throw BrandDevInvalidDataException("Unknown Industry: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws BrandDevInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            BrandDevInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Industry = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Industry && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Subindustry classification enum */
                class Subindustry
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField
                        val DEFENSE_SYSTEMS_MILITARY_HARDWARE =
                            of("Defense Systems & Military Hardware")

                        @JvmField val AEROSPACE_MANUFACTURING = of("Aerospace Manufacturing")

                        @JvmField
                        val AVIONICS_NAVIGATION_TECHNOLOGY = of("Avionics & Navigation Technology")

                        @JvmField
                        val SUBSEA_NAVAL_DEFENSE_SYSTEMS = of("Subsea & Naval Defense Systems")

                        @JvmField
                        val SPACE_SATELLITE_TECHNOLOGY = of("Space & Satellite Technology")

                        @JvmField
                        val DEFENSE_IT_SYSTEMS_INTEGRATION = of("Defense IT & Systems Integration")

                        @JvmField val SOFTWARE_B2_B = of("Software (B2B)")

                        @JvmField val SOFTWARE_B2_C = of("Software (B2C)")

                        @JvmField
                        val CLOUD_INFRASTRUCTURE_DEV_OPS = of("Cloud Infrastructure & DevOps")

                        @JvmField val CYBERSECURITY = of("Cybersecurity")

                        @JvmField
                        val ARTIFICIAL_INTELLIGENCE_MACHINE_LEARNING =
                            of("Artificial Intelligence & Machine Learning")

                        @JvmField
                        val DATA_INFRASTRUCTURE_ANALYTICS = of("Data Infrastructure & Analytics")

                        @JvmField val HARDWARE_SEMICONDUCTORS = of("Hardware & Semiconductors")

                        @JvmField val FINTECH_INFRASTRUCTURE = of("Fintech Infrastructure")

                        @JvmField
                        val E_COMMERCE_MARKETPLACE_PLATFORMS =
                            of("eCommerce & Marketplace Platforms")

                        @JvmField val DEVELOPER_TOOLS_APIS = of("Developer Tools & APIs")

                        @JvmField val WEB3_BLOCKCHAIN = of("Web3 & Blockchain")

                        @JvmField val XR_SPATIAL_COMPUTING = of("XR & Spatial Computing")

                        @JvmField val BANKING_LENDING = of("Banking & Lending")

                        @JvmField
                        val INVESTMENT_MANAGEMENT_WEALTH_TECH =
                            of("Investment Management & WealthTech")

                        @JvmField val INSURANCE_INSUR_TECH = of("Insurance & InsurTech")

                        @JvmField val PAYMENTS_MONEY_MOVEMENT = of("Payments & Money Movement")

                        @JvmField
                        val ACCOUNTING_TAX_FINANCIAL_PLANNING_TOOLS =
                            of("Accounting, Tax & Financial Planning Tools")

                        @JvmField
                        val CAPITAL_MARKETS_TRADING_PLATFORMS =
                            of("Capital Markets & Trading Platforms")

                        @JvmField
                        val FINANCIAL_INFRASTRUCTURE_APIS = of("Financial Infrastructure & APIs")

                        @JvmField
                        val CREDIT_SCORING_RISK_MANAGEMENT = of("Credit Scoring & Risk Management")

                        @JvmField
                        val CRYPTOCURRENCY_DIGITAL_ASSETS = of("Cryptocurrency & Digital Assets")

                        @JvmField
                        val BNPL_ALTERNATIVE_FINANCING = of("BNPL & Alternative Financing")

                        @JvmField
                        val HEALTHCARE_PROVIDERS_SERVICES = of("Healthcare Providers & Services")

                        @JvmField
                        val PHARMACEUTICALS_DRUG_DEVELOPMENT =
                            of("Pharmaceuticals & Drug Development")

                        @JvmField
                        val MEDICAL_DEVICES_DIAGNOSTICS = of("Medical Devices & Diagnostics")

                        @JvmField val BIOTECHNOLOGY_GENOMICS = of("Biotechnology & Genomics")

                        @JvmField
                        val DIGITAL_HEALTH_TELEMEDICINE = of("Digital Health & Telemedicine")

                        @JvmField
                        val HEALTH_INSURANCE_BENEFITS_TECH = of("Health Insurance & Benefits Tech")

                        @JvmField
                        val CLINICAL_TRIALS_RESEARCH_PLATFORMS =
                            of("Clinical Trials & Research Platforms")

                        @JvmField val MENTAL_HEALTH_WELLNESS = of("Mental Health & Wellness")

                        @JvmField val HEALTHCARE_IT_EHR_SYSTEMS = of("Healthcare IT & EHR Systems")

                        @JvmField
                        val CONSUMER_HEALTH_WELLNESS_PRODUCTS =
                            of("Consumer Health & Wellness Products")

                        @JvmField val ONLINE_MARKETPLACES = of("Online Marketplaces")

                        @JvmField
                        val DIRECT_TO_CONSUMER_DTC_BRANDS = of("Direct-to-Consumer (DTC) Brands")

                        @JvmField
                        val RETAIL_TECH_POINT_OF_SALE_SYSTEMS =
                            of("Retail Tech & Point-of-Sale Systems")

                        @JvmField
                        val OMNICHANNEL_IN_STORE_RETAIL = of("Omnichannel & In-Store Retail")

                        @JvmField
                        val E_COMMERCE_ENABLEMENT_INFRASTRUCTURE =
                            of("E-commerce Enablement & Infrastructure")

                        @JvmField
                        val SUBSCRIPTION_MEMBERSHIP_COMMERCE =
                            of("Subscription & Membership Commerce")

                        @JvmField
                        val SOCIAL_COMMERCE_INFLUENCER_PLATFORMS =
                            of("Social Commerce & Influencer Platforms")

                        @JvmField val FASHION_APPAREL_RETAIL = of("Fashion & Apparel Retail")

                        @JvmField
                        val FOOD_BEVERAGE_GROCERY_E_COMMERCE =
                            of("Food, Beverage & Grocery E-commerce")

                        @JvmField
                        val STREAMING_PLATFORMS_VIDEO_MUSIC_AUDIO =
                            of("Streaming Platforms (Video, Music, Audio)")

                        @JvmField
                        val GAMING_INTERACTIVE_ENTERTAINMENT =
                            of("Gaming & Interactive Entertainment")

                        @JvmField
                        val CREATOR_ECONOMY_INFLUENCER_PLATFORMS =
                            of("Creator Economy & Influencer Platforms")

                        @JvmField
                        val ADVERTISING_ADTECH_MEDIA_BUYING =
                            of("Advertising, Adtech & Media Buying")

                        @JvmField
                        val FILM_TV_PRODUCTION_STUDIOS = of("Film, TV & Production Studios")

                        @JvmField
                        val EVENTS_VENUES_LIVE_ENTERTAINMENT =
                            of("Events, Venues & Live Entertainment")

                        @JvmField
                        val VIRTUAL_WORLDS_METAVERSE_EXPERIENCES =
                            of("Virtual Worlds & Metaverse Experiences")

                        @JvmField
                        val K_12_EDUCATION_PLATFORMS_TOOLS = of("K-12 Education Platforms & Tools")

                        @JvmField
                        val HIGHER_EDUCATION_UNIVERSITY_TECH =
                            of("Higher Education & University Tech")

                        @JvmField val ONLINE_LEARNING_MOO_CS = of("Online Learning & MOOCs")

                        @JvmField val TEST_PREP_CERTIFICATION = of("Test Prep & Certification")

                        @JvmField
                        val CORPORATE_TRAINING_UPSKILLING = of("Corporate Training & Upskilling")

                        @JvmField
                        val TUTORING_SUPPLEMENTAL_LEARNING = of("Tutoring & Supplemental Learning")

                        @JvmField
                        val EDUCATION_MANAGEMENT_SYSTEMS_LMS_SIS =
                            of("Education Management Systems (LMS/SIS)")

                        @JvmField val LANGUAGE_LEARNING = of("Language Learning")

                        @JvmField
                        val CREATOR_LED_COHORT_BASED_COURSES =
                            of("Creator-Led & Cohort-Based Courses")

                        @JvmField
                        val SPECIAL_EDUCATION_ACCESSIBILITY_TOOLS =
                            of("Special Education & Accessibility Tools")

                        @JvmField
                        val GOVERNMENT_TECHNOLOGY_DIGITAL_SERVICES =
                            of("Government Technology & Digital Services")

                        @JvmField
                        val CIVIC_ENGAGEMENT_POLICY_PLATFORMS =
                            of("Civic Engagement & Policy Platforms")

                        @JvmField
                        val INTERNATIONAL_DEVELOPMENT_HUMANITARIAN_AID =
                            of("International Development & Humanitarian Aid")

                        @JvmField val PHILANTHROPY_GRANTMAKING = of("Philanthropy & Grantmaking")

                        @JvmField
                        val NONPROFIT_OPERATIONS_FUNDRAISING_TOOLS =
                            of("Nonprofit Operations & Fundraising Tools")

                        @JvmField
                        val PUBLIC_HEALTH_SOCIAL_SERVICES = of("Public Health & Social Services")

                        @JvmField
                        val EDUCATION_YOUTH_DEVELOPMENT_PROGRAMS =
                            of("Education & Youth Development Programs")

                        @JvmField
                        val ENVIRONMENTAL_CLIMATE_ACTION_ORGANIZATIONS =
                            of("Environmental & Climate Action Organizations")

                        @JvmField
                        val LEGAL_AID_SOCIAL_JUSTICE_ADVOCACY =
                            of("Legal Aid & Social Justice Advocacy")

                        @JvmField
                        val MUNICIPAL_INFRASTRUCTURE_SERVICES =
                            of("Municipal & Infrastructure Services")

                        @JvmField
                        val MANUFACTURING_INDUSTRIAL_AUTOMATION =
                            of("Manufacturing & Industrial Automation")

                        @JvmField
                        val ENERGY_PRODUCTION_OIL_GAS_NUCLEAR =
                            of("Energy Production (Oil, Gas, Nuclear)")

                        @JvmField
                        val RENEWABLE_ENERGY_CLEANTECH = of("Renewable Energy & Cleantech")

                        @JvmField
                        val UTILITIES_GRID_INFRASTRUCTURE = of("Utilities & Grid Infrastructure")

                        @JvmField
                        val INDUSTRIAL_IO_T_MONITORING_SYSTEMS =
                            of("Industrial IoT & Monitoring Systems")

                        @JvmField
                        val CONSTRUCTION_HEAVY_EQUIPMENT = of("Construction & Heavy Equipment")

                        @JvmField val MINING_NATURAL_RESOURCES = of("Mining & Natural Resources")

                        @JvmField
                        val ENVIRONMENTAL_ENGINEERING_SUSTAINABILITY =
                            of("Environmental Engineering & Sustainability")

                        @JvmField
                        val ENERGY_STORAGE_BATTERY_TECHNOLOGY =
                            of("Energy Storage & Battery Technology")

                        @JvmField
                        val AUTOMOTIVE_OE_MS_VEHICLE_MANUFACTURING =
                            of("Automotive OEMs & Vehicle Manufacturing")

                        @JvmField
                        val ELECTRIC_VEHICLES_E_VS_CHARGING_INFRASTRUCTURE =
                            of("Electric Vehicles (EVs) & Charging Infrastructure")

                        @JvmField
                        val MOBILITY_AS_A_SERVICE_MAA_S = of("Mobility-as-a-Service (MaaS)")

                        @JvmField val FLEET_MANAGEMENT = of("Fleet Management")

                        @JvmField
                        val PUBLIC_TRANSIT_URBAN_MOBILITY = of("Public Transit & Urban Mobility")

                        @JvmField val AUTONOMOUS_VEHICLES_ADAS = of("Autonomous Vehicles & ADAS")

                        @JvmField
                        val AFTERMARKET_PARTS_SERVICES = of("Aftermarket Parts & Services")

                        @JvmField
                        val TELEMATICS_VEHICLE_CONNECTIVITY =
                            of("Telematics & Vehicle Connectivity")

                        @JvmField
                        val AVIATION_AEROSPACE_TRANSPORT = of("Aviation & Aerospace Transport")

                        @JvmField val MARITIME_SHIPPING = of("Maritime Shipping")

                        @JvmField val FITNESS_WELLNESS = of("Fitness & Wellness")

                        @JvmField val BEAUTY_PERSONAL_CARE = of("Beauty & Personal Care")

                        @JvmField val HOME_LIVING = of("Home & Living")

                        @JvmField val DATING_RELATIONSHIPS = of("Dating & Relationships")

                        @JvmField val HOBBIES_CRAFTS_DIY = of("Hobbies, Crafts & DIY")

                        @JvmField val OUTDOOR_RECREATIONAL_GEAR = of("Outdoor & Recreational Gear")

                        @JvmField
                        val EVENTS_EXPERIENCES_TICKETING_PLATFORMS =
                            of("Events, Experiences & Ticketing Platforms")

                        @JvmField val DESIGNER_LUXURY_APPAREL = of("Designer & Luxury Apparel")

                        @JvmField
                        val ACCESSORIES_JEWELRY_WATCHES = of("Accessories, Jewelry & Watches")

                        @JvmField val FOOTWEAR_LEATHER_GOODS = of("Footwear & Leather Goods")

                        @JvmField val BEAUTY_FRAGRANCE_SKINCARE = of("Beauty, Fragrance & Skincare")

                        @JvmField
                        val FASHION_MARKETPLACES_RETAIL_PLATFORMS =
                            of("Fashion Marketplaces & Retail Platforms")

                        @JvmField
                        val SUSTAINABLE_ETHICAL_FASHION = of("Sustainable & Ethical Fashion")

                        @JvmField
                        val RESALE_VINTAGE_CIRCULAR_FASHION =
                            of("Resale, Vintage & Circular Fashion")

                        @JvmField
                        val FASHION_TECH_VIRTUAL_TRY_ONS = of("Fashion Tech & Virtual Try-Ons")

                        @JvmField
                        val STREETWEAR_EMERGING_LUXURY = of("Streetwear & Emerging Luxury")

                        @JvmField val COUTURE_MADE_TO_MEASURE = of("Couture & Made-to-Measure")

                        @JvmField
                        val NEWS_PUBLISHING_JOURNALISM = of("News Publishing & Journalism")

                        @JvmField
                        val DIGITAL_MEDIA_CONTENT_PLATFORMS =
                            of("Digital Media & Content Platforms")

                        @JvmField val BROADCASTING_TV_RADIO = of("Broadcasting (TV & Radio)")

                        @JvmField val PODCASTING_AUDIO_MEDIA = of("Podcasting & Audio Media")

                        @JvmField
                        val NEWS_AGGREGATORS_CURATION_TOOLS =
                            of("News Aggregators & Curation Tools")

                        @JvmField
                        val INDEPENDENT_CREATOR_LED_MEDIA = of("Independent & Creator-Led Media")

                        @JvmField
                        val NEWSLETTERS_SUBSTACK_STYLE_PLATFORMS =
                            of("Newsletters & Substack-Style Platforms")

                        @JvmField
                        val POLITICAL_INVESTIGATIVE_MEDIA = of("Political & Investigative Media")

                        @JvmField val TRADE_NICHE_PUBLICATIONS = of("Trade & Niche Publications")

                        @JvmField
                        val MEDIA_MONITORING_ANALYTICS = of("Media Monitoring & Analytics")

                        @JvmField
                        val PROFESSIONAL_TEAMS_LEAGUES = of("Professional Teams & Leagues")

                        @JvmField val SPORTS_MEDIA_BROADCASTING = of("Sports Media & Broadcasting")

                        @JvmField
                        val SPORTS_BETTING_FANTASY_SPORTS = of("Sports Betting & Fantasy Sports")

                        @JvmField
                        val FITNESS_ATHLETIC_TRAINING_PLATFORMS =
                            of("Fitness & Athletic Training Platforms")

                        @JvmField val SPORTSWEAR_EQUIPMENT = of("Sportswear & Equipment")

                        @JvmField
                        val ESPORTS_COMPETITIVE_GAMING = of("Esports & Competitive Gaming")

                        @JvmField
                        val SPORTS_VENUES_EVENT_MANAGEMENT = of("Sports Venues & Event Management")

                        @JvmField
                        val ATHLETE_MANAGEMENT_TALENT_AGENCIES =
                            of("Athlete Management & Talent Agencies")

                        @JvmField
                        val SPORTS_TECH_PERFORMANCE_ANALYTICS =
                            of("Sports Tech & Performance Analytics")

                        @JvmField
                        val YOUTH_AMATEUR_COLLEGIATE_SPORTS =
                            of("Youth, Amateur & Collegiate Sports")

                        @JvmField val REAL_ESTATE_MARKETPLACES = of("Real Estate Marketplaces")

                        @JvmField
                        val PROPERTY_MANAGEMENT_SOFTWARE = of("Property Management Software")

                        @JvmField val RENTAL_PLATFORMS = of("Rental Platforms")

                        @JvmField val MORTGAGE_LENDING_TECH = of("Mortgage & Lending Tech")

                        @JvmField
                        val REAL_ESTATE_INVESTMENT_PLATFORMS =
                            of("Real Estate Investment Platforms")

                        @JvmField val LAW_FIRMS_LEGAL_SERVICES = of("Law Firms & Legal Services")

                        @JvmField val LEGAL_TECH_AUTOMATION = of("Legal Tech & Automation")

                        @JvmField val REGULATORY_COMPLIANCE = of("Regulatory Compliance")

                        @JvmField
                        val E_DISCOVERY_LITIGATION_TOOLS = of("E-Discovery & Litigation Tools")

                        @JvmField val CONTRACT_MANAGEMENT = of("Contract Management")

                        @JvmField
                        val GOVERNANCE_RISK_COMPLIANCE_GRC =
                            of("Governance, Risk & Compliance (GRC)")

                        @JvmField val IP_TRADEMARK_MANAGEMENT = of("IP & Trademark Management")

                        @JvmField
                        val LEGAL_RESEARCH_INTELLIGENCE = of("Legal Research & Intelligence")

                        @JvmField
                        val COMPLIANCE_TRAINING_CERTIFICATION =
                            of("Compliance Training & Certification")

                        @JvmField
                        val WHISTLEBLOWER_ETHICS_REPORTING = of("Whistleblower & Ethics Reporting")

                        @JvmField
                        val MOBILE_WIRELESS_NETWORKS_3_G_4_G_5_G =
                            of("Mobile & Wireless Networks (3G/4G/5G)")

                        @JvmField val BROADBAND_FIBER_INTERNET = of("Broadband & Fiber Internet")

                        @JvmField
                        val SATELLITE_SPACE_BASED_COMMUNICATIONS =
                            of("Satellite & Space-Based Communications")

                        @JvmField
                        val NETWORK_EQUIPMENT_INFRASTRUCTURE =
                            of("Network Equipment & Infrastructure")

                        @JvmField
                        val TELECOM_BILLING_OSS_BSS_SYSTEMS =
                            of("Telecom Billing & OSS/BSS Systems")

                        @JvmField
                        val VO_IP_UNIFIED_COMMUNICATIONS = of("VoIP & Unified Communications")

                        @JvmField
                        val INTERNET_SERVICE_PROVIDERS_IS_PS =
                            of("Internet Service Providers (ISPs)")

                        @JvmField
                        val EDGE_COMPUTING_NETWORK_VIRTUALIZATION =
                            of("Edge Computing & Network Virtualization")

                        @JvmField val IO_T_CONNECTIVITY_PLATFORMS = of("IoT Connectivity Platforms")

                        @JvmField
                        val PRECISION_AGRICULTURE_AG_TECH = of("Precision Agriculture & AgTech")

                        @JvmField val CROP_LIVESTOCK_PRODUCTION = of("Crop & Livestock Production")

                        @JvmField
                        val FOOD_BEVERAGE_MANUFACTURING_PROCESSING =
                            of("Food & Beverage Manufacturing & Processing")

                        @JvmField val FOOD_DISTRIBUTION = of("Food Distribution")

                        @JvmField val RESTAURANTS_FOOD_SERVICE = of("Restaurants & Food Service")

                        @JvmField
                        val AGRICULTURAL_INPUTS_EQUIPMENT = of("Agricultural Inputs & Equipment")

                        @JvmField
                        val SUSTAINABLE_REGENERATIVE_AGRICULTURE =
                            of("Sustainable & Regenerative Agriculture")

                        @JvmField val SEAFOOD_AQUACULTURE = of("Seafood & Aquaculture")

                        @JvmField val MANAGEMENT_CONSULTING = of("Management Consulting")

                        @JvmField
                        val MARKETING_ADVERTISING_AGENCIES = of("Marketing & Advertising Agencies")

                        @JvmField
                        val DESIGN_BRANDING_CREATIVE_STUDIOS =
                            of("Design, Branding & Creative Studios")

                        @JvmField
                        val IT_SERVICES_MANAGED_SERVICES = of("IT Services & Managed Services")

                        @JvmField
                        val STAFFING_RECRUITING_TALENT = of("Staffing, Recruiting & Talent")

                        @JvmField val ACCOUNTING_TAX_FIRMS = of("Accounting & Tax Firms")

                        @JvmField
                        val PUBLIC_RELATIONS_COMMUNICATIONS =
                            of("Public Relations & Communications")

                        @JvmField
                        val BUSINESS_PROCESS_OUTSOURCING_BPO =
                            of("Business Process Outsourcing (BPO)")

                        @JvmField
                        val PROFESSIONAL_TRAINING_COACHING = of("Professional Training & Coaching")

                        @JvmField val SPECIALTY_CHEMICALS = of("Specialty Chemicals")

                        @JvmField val COMMODITY_PETROCHEMICALS = of("Commodity & Petrochemicals")

                        @JvmField val POLYMERS_PLASTICS_RUBBER = of("Polymers, Plastics & Rubber")

                        @JvmField
                        val COATINGS_ADHESIVES_SEALANTS = of("Coatings, Adhesives & Sealants")

                        @JvmField val INDUSTRIAL_GASES = of("Industrial Gases")

                        @JvmField
                        val ADVANCED_MATERIALS_COMPOSITES = of("Advanced Materials & Composites")

                        @JvmField
                        val BATTERY_MATERIALS_ENERGY_STORAGE =
                            of("Battery Materials & Energy Storage")

                        @JvmField
                        val ELECTRONIC_MATERIALS_SEMICONDUCTOR_CHEMICALS =
                            of("Electronic Materials & Semiconductor Chemicals")

                        @JvmField val AGROCHEMICALS_FERTILIZERS = of("Agrochemicals & Fertilizers")

                        @JvmField
                        val FREIGHT_TRANSPORTATION_TECH = of("Freight & Transportation Tech")

                        @JvmField val LAST_MILE_DELIVERY = of("Last-Mile Delivery")

                        @JvmField val WAREHOUSE_AUTOMATION = of("Warehouse Automation")

                        @JvmField
                        val SUPPLY_CHAIN_VISIBILITY_PLATFORMS =
                            of("Supply Chain Visibility Platforms")

                        @JvmField val LOGISTICS_MARKETPLACES = of("Logistics Marketplaces")

                        @JvmField
                        val SHIPPING_FREIGHT_FORWARDING = of("Shipping & Freight Forwarding")

                        @JvmField val COLD_CHAIN_LOGISTICS = of("Cold Chain Logistics")

                        @JvmField val REVERSE_LOGISTICS_RETURNS = of("Reverse Logistics & Returns")

                        @JvmField val CROSS_BORDER_TRADE_TECH = of("Cross-Border Trade Tech")

                        @JvmField
                        val TRANSPORTATION_MANAGEMENT_SYSTEMS_TMS =
                            of("Transportation Management Systems (TMS)")

                        @JvmField val HOTELS_ACCOMMODATION = of("Hotels & Accommodation")

                        @JvmField
                        val VACATION_RENTALS_SHORT_TERM_STAYS =
                            of("Vacation Rentals & Short-Term Stays")

                        @JvmField
                        val RESTAURANT_TECH_MANAGEMENT = of("Restaurant Tech & Management")

                        @JvmField val TRAVEL_BOOKING_PLATFORMS = of("Travel Booking Platforms")

                        @JvmField
                        val TOURISM_EXPERIENCES_ACTIVITIES = of("Tourism Experiences & Activities")

                        @JvmField
                        val CRUISE_LINES_MARINE_TOURISM = of("Cruise Lines & Marine Tourism")

                        @JvmField
                        val HOSPITALITY_MANAGEMENT_SYSTEMS = of("Hospitality Management Systems")

                        @JvmField val EVENT_VENUE_MANAGEMENT = of("Event & Venue Management")

                        @JvmField
                        val CORPORATE_TRAVEL_MANAGEMENT = of("Corporate Travel Management")

                        @JvmField
                        val TRAVEL_INSURANCE_PROTECTION = of("Travel Insurance & Protection")

                        @JvmField
                        val CONSTRUCTION_MANAGEMENT_SOFTWARE =
                            of("Construction Management Software")

                        @JvmField val BIM_CAD_DESIGN_TOOLS = of("BIM/CAD & Design Tools")

                        @JvmField val CONSTRUCTION_MARKETPLACES = of("Construction Marketplaces")

                        @JvmField
                        val EQUIPMENT_RENTAL_MANAGEMENT = of("Equipment Rental & Management")

                        @JvmField
                        val BUILDING_MATERIALS_PROCUREMENT = of("Building Materials & Procurement")

                        @JvmField
                        val CONSTRUCTION_WORKFORCE_MANAGEMENT =
                            of("Construction Workforce Management")

                        @JvmField
                        val PROJECT_ESTIMATION_BIDDING = of("Project Estimation & Bidding")

                        @JvmField
                        val MODULAR_PREFAB_CONSTRUCTION = of("Modular & Prefab Construction")

                        @JvmField
                        val CONSTRUCTION_SAFETY_COMPLIANCE = of("Construction Safety & Compliance")

                        @JvmField val SMART_BUILDING_TECHNOLOGY = of("Smart Building Technology")

                        @JvmField val FOOD_BEVERAGE_CPG = of("Food & Beverage CPG")

                        @JvmField val HOME_PERSONAL_CARE_CPG = of("Home & Personal Care CPG")

                        @JvmField val CPG_ANALYTICS_INSIGHTS = of("CPG Analytics & Insights")

                        @JvmField
                        val DIRECT_TO_CONSUMER_CPG_BRANDS = of("Direct-to-Consumer CPG Brands")

                        @JvmField
                        val CPG_SUPPLY_CHAIN_DISTRIBUTION = of("CPG Supply Chain & Distribution")

                        @JvmField
                        val PRIVATE_LABEL_MANUFACTURING = of("Private Label Manufacturing")

                        @JvmField val CPG_RETAIL_INTELLIGENCE = of("CPG Retail Intelligence")

                        @JvmField val SUSTAINABLE_CPG_PACKAGING = of("Sustainable CPG & Packaging")

                        @JvmField val BEAUTY_COSMETICS_CPG = of("Beauty & Cosmetics CPG")

                        @JvmField val HEALTH_WELLNESS_CPG = of("Health & Wellness CPG")

                        @JvmStatic fun of(value: String) = Subindustry(JsonField.of(value))
                    }

                    /** An enum containing [Subindustry]'s known values. */
                    enum class Known {
                        DEFENSE_SYSTEMS_MILITARY_HARDWARE,
                        AEROSPACE_MANUFACTURING,
                        AVIONICS_NAVIGATION_TECHNOLOGY,
                        SUBSEA_NAVAL_DEFENSE_SYSTEMS,
                        SPACE_SATELLITE_TECHNOLOGY,
                        DEFENSE_IT_SYSTEMS_INTEGRATION,
                        SOFTWARE_B2_B,
                        SOFTWARE_B2_C,
                        CLOUD_INFRASTRUCTURE_DEV_OPS,
                        CYBERSECURITY,
                        ARTIFICIAL_INTELLIGENCE_MACHINE_LEARNING,
                        DATA_INFRASTRUCTURE_ANALYTICS,
                        HARDWARE_SEMICONDUCTORS,
                        FINTECH_INFRASTRUCTURE,
                        E_COMMERCE_MARKETPLACE_PLATFORMS,
                        DEVELOPER_TOOLS_APIS,
                        WEB3_BLOCKCHAIN,
                        XR_SPATIAL_COMPUTING,
                        BANKING_LENDING,
                        INVESTMENT_MANAGEMENT_WEALTH_TECH,
                        INSURANCE_INSUR_TECH,
                        PAYMENTS_MONEY_MOVEMENT,
                        ACCOUNTING_TAX_FINANCIAL_PLANNING_TOOLS,
                        CAPITAL_MARKETS_TRADING_PLATFORMS,
                        FINANCIAL_INFRASTRUCTURE_APIS,
                        CREDIT_SCORING_RISK_MANAGEMENT,
                        CRYPTOCURRENCY_DIGITAL_ASSETS,
                        BNPL_ALTERNATIVE_FINANCING,
                        HEALTHCARE_PROVIDERS_SERVICES,
                        PHARMACEUTICALS_DRUG_DEVELOPMENT,
                        MEDICAL_DEVICES_DIAGNOSTICS,
                        BIOTECHNOLOGY_GENOMICS,
                        DIGITAL_HEALTH_TELEMEDICINE,
                        HEALTH_INSURANCE_BENEFITS_TECH,
                        CLINICAL_TRIALS_RESEARCH_PLATFORMS,
                        MENTAL_HEALTH_WELLNESS,
                        HEALTHCARE_IT_EHR_SYSTEMS,
                        CONSUMER_HEALTH_WELLNESS_PRODUCTS,
                        ONLINE_MARKETPLACES,
                        DIRECT_TO_CONSUMER_DTC_BRANDS,
                        RETAIL_TECH_POINT_OF_SALE_SYSTEMS,
                        OMNICHANNEL_IN_STORE_RETAIL,
                        E_COMMERCE_ENABLEMENT_INFRASTRUCTURE,
                        SUBSCRIPTION_MEMBERSHIP_COMMERCE,
                        SOCIAL_COMMERCE_INFLUENCER_PLATFORMS,
                        FASHION_APPAREL_RETAIL,
                        FOOD_BEVERAGE_GROCERY_E_COMMERCE,
                        STREAMING_PLATFORMS_VIDEO_MUSIC_AUDIO,
                        GAMING_INTERACTIVE_ENTERTAINMENT,
                        CREATOR_ECONOMY_INFLUENCER_PLATFORMS,
                        ADVERTISING_ADTECH_MEDIA_BUYING,
                        FILM_TV_PRODUCTION_STUDIOS,
                        EVENTS_VENUES_LIVE_ENTERTAINMENT,
                        VIRTUAL_WORLDS_METAVERSE_EXPERIENCES,
                        K_12_EDUCATION_PLATFORMS_TOOLS,
                        HIGHER_EDUCATION_UNIVERSITY_TECH,
                        ONLINE_LEARNING_MOO_CS,
                        TEST_PREP_CERTIFICATION,
                        CORPORATE_TRAINING_UPSKILLING,
                        TUTORING_SUPPLEMENTAL_LEARNING,
                        EDUCATION_MANAGEMENT_SYSTEMS_LMS_SIS,
                        LANGUAGE_LEARNING,
                        CREATOR_LED_COHORT_BASED_COURSES,
                        SPECIAL_EDUCATION_ACCESSIBILITY_TOOLS,
                        GOVERNMENT_TECHNOLOGY_DIGITAL_SERVICES,
                        CIVIC_ENGAGEMENT_POLICY_PLATFORMS,
                        INTERNATIONAL_DEVELOPMENT_HUMANITARIAN_AID,
                        PHILANTHROPY_GRANTMAKING,
                        NONPROFIT_OPERATIONS_FUNDRAISING_TOOLS,
                        PUBLIC_HEALTH_SOCIAL_SERVICES,
                        EDUCATION_YOUTH_DEVELOPMENT_PROGRAMS,
                        ENVIRONMENTAL_CLIMATE_ACTION_ORGANIZATIONS,
                        LEGAL_AID_SOCIAL_JUSTICE_ADVOCACY,
                        MUNICIPAL_INFRASTRUCTURE_SERVICES,
                        MANUFACTURING_INDUSTRIAL_AUTOMATION,
                        ENERGY_PRODUCTION_OIL_GAS_NUCLEAR,
                        RENEWABLE_ENERGY_CLEANTECH,
                        UTILITIES_GRID_INFRASTRUCTURE,
                        INDUSTRIAL_IO_T_MONITORING_SYSTEMS,
                        CONSTRUCTION_HEAVY_EQUIPMENT,
                        MINING_NATURAL_RESOURCES,
                        ENVIRONMENTAL_ENGINEERING_SUSTAINABILITY,
                        ENERGY_STORAGE_BATTERY_TECHNOLOGY,
                        AUTOMOTIVE_OE_MS_VEHICLE_MANUFACTURING,
                        ELECTRIC_VEHICLES_E_VS_CHARGING_INFRASTRUCTURE,
                        MOBILITY_AS_A_SERVICE_MAA_S,
                        FLEET_MANAGEMENT,
                        PUBLIC_TRANSIT_URBAN_MOBILITY,
                        AUTONOMOUS_VEHICLES_ADAS,
                        AFTERMARKET_PARTS_SERVICES,
                        TELEMATICS_VEHICLE_CONNECTIVITY,
                        AVIATION_AEROSPACE_TRANSPORT,
                        MARITIME_SHIPPING,
                        FITNESS_WELLNESS,
                        BEAUTY_PERSONAL_CARE,
                        HOME_LIVING,
                        DATING_RELATIONSHIPS,
                        HOBBIES_CRAFTS_DIY,
                        OUTDOOR_RECREATIONAL_GEAR,
                        EVENTS_EXPERIENCES_TICKETING_PLATFORMS,
                        DESIGNER_LUXURY_APPAREL,
                        ACCESSORIES_JEWELRY_WATCHES,
                        FOOTWEAR_LEATHER_GOODS,
                        BEAUTY_FRAGRANCE_SKINCARE,
                        FASHION_MARKETPLACES_RETAIL_PLATFORMS,
                        SUSTAINABLE_ETHICAL_FASHION,
                        RESALE_VINTAGE_CIRCULAR_FASHION,
                        FASHION_TECH_VIRTUAL_TRY_ONS,
                        STREETWEAR_EMERGING_LUXURY,
                        COUTURE_MADE_TO_MEASURE,
                        NEWS_PUBLISHING_JOURNALISM,
                        DIGITAL_MEDIA_CONTENT_PLATFORMS,
                        BROADCASTING_TV_RADIO,
                        PODCASTING_AUDIO_MEDIA,
                        NEWS_AGGREGATORS_CURATION_TOOLS,
                        INDEPENDENT_CREATOR_LED_MEDIA,
                        NEWSLETTERS_SUBSTACK_STYLE_PLATFORMS,
                        POLITICAL_INVESTIGATIVE_MEDIA,
                        TRADE_NICHE_PUBLICATIONS,
                        MEDIA_MONITORING_ANALYTICS,
                        PROFESSIONAL_TEAMS_LEAGUES,
                        SPORTS_MEDIA_BROADCASTING,
                        SPORTS_BETTING_FANTASY_SPORTS,
                        FITNESS_ATHLETIC_TRAINING_PLATFORMS,
                        SPORTSWEAR_EQUIPMENT,
                        ESPORTS_COMPETITIVE_GAMING,
                        SPORTS_VENUES_EVENT_MANAGEMENT,
                        ATHLETE_MANAGEMENT_TALENT_AGENCIES,
                        SPORTS_TECH_PERFORMANCE_ANALYTICS,
                        YOUTH_AMATEUR_COLLEGIATE_SPORTS,
                        REAL_ESTATE_MARKETPLACES,
                        PROPERTY_MANAGEMENT_SOFTWARE,
                        RENTAL_PLATFORMS,
                        MORTGAGE_LENDING_TECH,
                        REAL_ESTATE_INVESTMENT_PLATFORMS,
                        LAW_FIRMS_LEGAL_SERVICES,
                        LEGAL_TECH_AUTOMATION,
                        REGULATORY_COMPLIANCE,
                        E_DISCOVERY_LITIGATION_TOOLS,
                        CONTRACT_MANAGEMENT,
                        GOVERNANCE_RISK_COMPLIANCE_GRC,
                        IP_TRADEMARK_MANAGEMENT,
                        LEGAL_RESEARCH_INTELLIGENCE,
                        COMPLIANCE_TRAINING_CERTIFICATION,
                        WHISTLEBLOWER_ETHICS_REPORTING,
                        MOBILE_WIRELESS_NETWORKS_3_G_4_G_5_G,
                        BROADBAND_FIBER_INTERNET,
                        SATELLITE_SPACE_BASED_COMMUNICATIONS,
                        NETWORK_EQUIPMENT_INFRASTRUCTURE,
                        TELECOM_BILLING_OSS_BSS_SYSTEMS,
                        VO_IP_UNIFIED_COMMUNICATIONS,
                        INTERNET_SERVICE_PROVIDERS_IS_PS,
                        EDGE_COMPUTING_NETWORK_VIRTUALIZATION,
                        IO_T_CONNECTIVITY_PLATFORMS,
                        PRECISION_AGRICULTURE_AG_TECH,
                        CROP_LIVESTOCK_PRODUCTION,
                        FOOD_BEVERAGE_MANUFACTURING_PROCESSING,
                        FOOD_DISTRIBUTION,
                        RESTAURANTS_FOOD_SERVICE,
                        AGRICULTURAL_INPUTS_EQUIPMENT,
                        SUSTAINABLE_REGENERATIVE_AGRICULTURE,
                        SEAFOOD_AQUACULTURE,
                        MANAGEMENT_CONSULTING,
                        MARKETING_ADVERTISING_AGENCIES,
                        DESIGN_BRANDING_CREATIVE_STUDIOS,
                        IT_SERVICES_MANAGED_SERVICES,
                        STAFFING_RECRUITING_TALENT,
                        ACCOUNTING_TAX_FIRMS,
                        PUBLIC_RELATIONS_COMMUNICATIONS,
                        BUSINESS_PROCESS_OUTSOURCING_BPO,
                        PROFESSIONAL_TRAINING_COACHING,
                        SPECIALTY_CHEMICALS,
                        COMMODITY_PETROCHEMICALS,
                        POLYMERS_PLASTICS_RUBBER,
                        COATINGS_ADHESIVES_SEALANTS,
                        INDUSTRIAL_GASES,
                        ADVANCED_MATERIALS_COMPOSITES,
                        BATTERY_MATERIALS_ENERGY_STORAGE,
                        ELECTRONIC_MATERIALS_SEMICONDUCTOR_CHEMICALS,
                        AGROCHEMICALS_FERTILIZERS,
                        FREIGHT_TRANSPORTATION_TECH,
                        LAST_MILE_DELIVERY,
                        WAREHOUSE_AUTOMATION,
                        SUPPLY_CHAIN_VISIBILITY_PLATFORMS,
                        LOGISTICS_MARKETPLACES,
                        SHIPPING_FREIGHT_FORWARDING,
                        COLD_CHAIN_LOGISTICS,
                        REVERSE_LOGISTICS_RETURNS,
                        CROSS_BORDER_TRADE_TECH,
                        TRANSPORTATION_MANAGEMENT_SYSTEMS_TMS,
                        HOTELS_ACCOMMODATION,
                        VACATION_RENTALS_SHORT_TERM_STAYS,
                        RESTAURANT_TECH_MANAGEMENT,
                        TRAVEL_BOOKING_PLATFORMS,
                        TOURISM_EXPERIENCES_ACTIVITIES,
                        CRUISE_LINES_MARINE_TOURISM,
                        HOSPITALITY_MANAGEMENT_SYSTEMS,
                        EVENT_VENUE_MANAGEMENT,
                        CORPORATE_TRAVEL_MANAGEMENT,
                        TRAVEL_INSURANCE_PROTECTION,
                        CONSTRUCTION_MANAGEMENT_SOFTWARE,
                        BIM_CAD_DESIGN_TOOLS,
                        CONSTRUCTION_MARKETPLACES,
                        EQUIPMENT_RENTAL_MANAGEMENT,
                        BUILDING_MATERIALS_PROCUREMENT,
                        CONSTRUCTION_WORKFORCE_MANAGEMENT,
                        PROJECT_ESTIMATION_BIDDING,
                        MODULAR_PREFAB_CONSTRUCTION,
                        CONSTRUCTION_SAFETY_COMPLIANCE,
                        SMART_BUILDING_TECHNOLOGY,
                        FOOD_BEVERAGE_CPG,
                        HOME_PERSONAL_CARE_CPG,
                        CPG_ANALYTICS_INSIGHTS,
                        DIRECT_TO_CONSUMER_CPG_BRANDS,
                        CPG_SUPPLY_CHAIN_DISTRIBUTION,
                        PRIVATE_LABEL_MANUFACTURING,
                        CPG_RETAIL_INTELLIGENCE,
                        SUSTAINABLE_CPG_PACKAGING,
                        BEAUTY_COSMETICS_CPG,
                        HEALTH_WELLNESS_CPG,
                    }

                    /**
                     * An enum containing [Subindustry]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Subindustry] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DEFENSE_SYSTEMS_MILITARY_HARDWARE,
                        AEROSPACE_MANUFACTURING,
                        AVIONICS_NAVIGATION_TECHNOLOGY,
                        SUBSEA_NAVAL_DEFENSE_SYSTEMS,
                        SPACE_SATELLITE_TECHNOLOGY,
                        DEFENSE_IT_SYSTEMS_INTEGRATION,
                        SOFTWARE_B2_B,
                        SOFTWARE_B2_C,
                        CLOUD_INFRASTRUCTURE_DEV_OPS,
                        CYBERSECURITY,
                        ARTIFICIAL_INTELLIGENCE_MACHINE_LEARNING,
                        DATA_INFRASTRUCTURE_ANALYTICS,
                        HARDWARE_SEMICONDUCTORS,
                        FINTECH_INFRASTRUCTURE,
                        E_COMMERCE_MARKETPLACE_PLATFORMS,
                        DEVELOPER_TOOLS_APIS,
                        WEB3_BLOCKCHAIN,
                        XR_SPATIAL_COMPUTING,
                        BANKING_LENDING,
                        INVESTMENT_MANAGEMENT_WEALTH_TECH,
                        INSURANCE_INSUR_TECH,
                        PAYMENTS_MONEY_MOVEMENT,
                        ACCOUNTING_TAX_FINANCIAL_PLANNING_TOOLS,
                        CAPITAL_MARKETS_TRADING_PLATFORMS,
                        FINANCIAL_INFRASTRUCTURE_APIS,
                        CREDIT_SCORING_RISK_MANAGEMENT,
                        CRYPTOCURRENCY_DIGITAL_ASSETS,
                        BNPL_ALTERNATIVE_FINANCING,
                        HEALTHCARE_PROVIDERS_SERVICES,
                        PHARMACEUTICALS_DRUG_DEVELOPMENT,
                        MEDICAL_DEVICES_DIAGNOSTICS,
                        BIOTECHNOLOGY_GENOMICS,
                        DIGITAL_HEALTH_TELEMEDICINE,
                        HEALTH_INSURANCE_BENEFITS_TECH,
                        CLINICAL_TRIALS_RESEARCH_PLATFORMS,
                        MENTAL_HEALTH_WELLNESS,
                        HEALTHCARE_IT_EHR_SYSTEMS,
                        CONSUMER_HEALTH_WELLNESS_PRODUCTS,
                        ONLINE_MARKETPLACES,
                        DIRECT_TO_CONSUMER_DTC_BRANDS,
                        RETAIL_TECH_POINT_OF_SALE_SYSTEMS,
                        OMNICHANNEL_IN_STORE_RETAIL,
                        E_COMMERCE_ENABLEMENT_INFRASTRUCTURE,
                        SUBSCRIPTION_MEMBERSHIP_COMMERCE,
                        SOCIAL_COMMERCE_INFLUENCER_PLATFORMS,
                        FASHION_APPAREL_RETAIL,
                        FOOD_BEVERAGE_GROCERY_E_COMMERCE,
                        STREAMING_PLATFORMS_VIDEO_MUSIC_AUDIO,
                        GAMING_INTERACTIVE_ENTERTAINMENT,
                        CREATOR_ECONOMY_INFLUENCER_PLATFORMS,
                        ADVERTISING_ADTECH_MEDIA_BUYING,
                        FILM_TV_PRODUCTION_STUDIOS,
                        EVENTS_VENUES_LIVE_ENTERTAINMENT,
                        VIRTUAL_WORLDS_METAVERSE_EXPERIENCES,
                        K_12_EDUCATION_PLATFORMS_TOOLS,
                        HIGHER_EDUCATION_UNIVERSITY_TECH,
                        ONLINE_LEARNING_MOO_CS,
                        TEST_PREP_CERTIFICATION,
                        CORPORATE_TRAINING_UPSKILLING,
                        TUTORING_SUPPLEMENTAL_LEARNING,
                        EDUCATION_MANAGEMENT_SYSTEMS_LMS_SIS,
                        LANGUAGE_LEARNING,
                        CREATOR_LED_COHORT_BASED_COURSES,
                        SPECIAL_EDUCATION_ACCESSIBILITY_TOOLS,
                        GOVERNMENT_TECHNOLOGY_DIGITAL_SERVICES,
                        CIVIC_ENGAGEMENT_POLICY_PLATFORMS,
                        INTERNATIONAL_DEVELOPMENT_HUMANITARIAN_AID,
                        PHILANTHROPY_GRANTMAKING,
                        NONPROFIT_OPERATIONS_FUNDRAISING_TOOLS,
                        PUBLIC_HEALTH_SOCIAL_SERVICES,
                        EDUCATION_YOUTH_DEVELOPMENT_PROGRAMS,
                        ENVIRONMENTAL_CLIMATE_ACTION_ORGANIZATIONS,
                        LEGAL_AID_SOCIAL_JUSTICE_ADVOCACY,
                        MUNICIPAL_INFRASTRUCTURE_SERVICES,
                        MANUFACTURING_INDUSTRIAL_AUTOMATION,
                        ENERGY_PRODUCTION_OIL_GAS_NUCLEAR,
                        RENEWABLE_ENERGY_CLEANTECH,
                        UTILITIES_GRID_INFRASTRUCTURE,
                        INDUSTRIAL_IO_T_MONITORING_SYSTEMS,
                        CONSTRUCTION_HEAVY_EQUIPMENT,
                        MINING_NATURAL_RESOURCES,
                        ENVIRONMENTAL_ENGINEERING_SUSTAINABILITY,
                        ENERGY_STORAGE_BATTERY_TECHNOLOGY,
                        AUTOMOTIVE_OE_MS_VEHICLE_MANUFACTURING,
                        ELECTRIC_VEHICLES_E_VS_CHARGING_INFRASTRUCTURE,
                        MOBILITY_AS_A_SERVICE_MAA_S,
                        FLEET_MANAGEMENT,
                        PUBLIC_TRANSIT_URBAN_MOBILITY,
                        AUTONOMOUS_VEHICLES_ADAS,
                        AFTERMARKET_PARTS_SERVICES,
                        TELEMATICS_VEHICLE_CONNECTIVITY,
                        AVIATION_AEROSPACE_TRANSPORT,
                        MARITIME_SHIPPING,
                        FITNESS_WELLNESS,
                        BEAUTY_PERSONAL_CARE,
                        HOME_LIVING,
                        DATING_RELATIONSHIPS,
                        HOBBIES_CRAFTS_DIY,
                        OUTDOOR_RECREATIONAL_GEAR,
                        EVENTS_EXPERIENCES_TICKETING_PLATFORMS,
                        DESIGNER_LUXURY_APPAREL,
                        ACCESSORIES_JEWELRY_WATCHES,
                        FOOTWEAR_LEATHER_GOODS,
                        BEAUTY_FRAGRANCE_SKINCARE,
                        FASHION_MARKETPLACES_RETAIL_PLATFORMS,
                        SUSTAINABLE_ETHICAL_FASHION,
                        RESALE_VINTAGE_CIRCULAR_FASHION,
                        FASHION_TECH_VIRTUAL_TRY_ONS,
                        STREETWEAR_EMERGING_LUXURY,
                        COUTURE_MADE_TO_MEASURE,
                        NEWS_PUBLISHING_JOURNALISM,
                        DIGITAL_MEDIA_CONTENT_PLATFORMS,
                        BROADCASTING_TV_RADIO,
                        PODCASTING_AUDIO_MEDIA,
                        NEWS_AGGREGATORS_CURATION_TOOLS,
                        INDEPENDENT_CREATOR_LED_MEDIA,
                        NEWSLETTERS_SUBSTACK_STYLE_PLATFORMS,
                        POLITICAL_INVESTIGATIVE_MEDIA,
                        TRADE_NICHE_PUBLICATIONS,
                        MEDIA_MONITORING_ANALYTICS,
                        PROFESSIONAL_TEAMS_LEAGUES,
                        SPORTS_MEDIA_BROADCASTING,
                        SPORTS_BETTING_FANTASY_SPORTS,
                        FITNESS_ATHLETIC_TRAINING_PLATFORMS,
                        SPORTSWEAR_EQUIPMENT,
                        ESPORTS_COMPETITIVE_GAMING,
                        SPORTS_VENUES_EVENT_MANAGEMENT,
                        ATHLETE_MANAGEMENT_TALENT_AGENCIES,
                        SPORTS_TECH_PERFORMANCE_ANALYTICS,
                        YOUTH_AMATEUR_COLLEGIATE_SPORTS,
                        REAL_ESTATE_MARKETPLACES,
                        PROPERTY_MANAGEMENT_SOFTWARE,
                        RENTAL_PLATFORMS,
                        MORTGAGE_LENDING_TECH,
                        REAL_ESTATE_INVESTMENT_PLATFORMS,
                        LAW_FIRMS_LEGAL_SERVICES,
                        LEGAL_TECH_AUTOMATION,
                        REGULATORY_COMPLIANCE,
                        E_DISCOVERY_LITIGATION_TOOLS,
                        CONTRACT_MANAGEMENT,
                        GOVERNANCE_RISK_COMPLIANCE_GRC,
                        IP_TRADEMARK_MANAGEMENT,
                        LEGAL_RESEARCH_INTELLIGENCE,
                        COMPLIANCE_TRAINING_CERTIFICATION,
                        WHISTLEBLOWER_ETHICS_REPORTING,
                        MOBILE_WIRELESS_NETWORKS_3_G_4_G_5_G,
                        BROADBAND_FIBER_INTERNET,
                        SATELLITE_SPACE_BASED_COMMUNICATIONS,
                        NETWORK_EQUIPMENT_INFRASTRUCTURE,
                        TELECOM_BILLING_OSS_BSS_SYSTEMS,
                        VO_IP_UNIFIED_COMMUNICATIONS,
                        INTERNET_SERVICE_PROVIDERS_IS_PS,
                        EDGE_COMPUTING_NETWORK_VIRTUALIZATION,
                        IO_T_CONNECTIVITY_PLATFORMS,
                        PRECISION_AGRICULTURE_AG_TECH,
                        CROP_LIVESTOCK_PRODUCTION,
                        FOOD_BEVERAGE_MANUFACTURING_PROCESSING,
                        FOOD_DISTRIBUTION,
                        RESTAURANTS_FOOD_SERVICE,
                        AGRICULTURAL_INPUTS_EQUIPMENT,
                        SUSTAINABLE_REGENERATIVE_AGRICULTURE,
                        SEAFOOD_AQUACULTURE,
                        MANAGEMENT_CONSULTING,
                        MARKETING_ADVERTISING_AGENCIES,
                        DESIGN_BRANDING_CREATIVE_STUDIOS,
                        IT_SERVICES_MANAGED_SERVICES,
                        STAFFING_RECRUITING_TALENT,
                        ACCOUNTING_TAX_FIRMS,
                        PUBLIC_RELATIONS_COMMUNICATIONS,
                        BUSINESS_PROCESS_OUTSOURCING_BPO,
                        PROFESSIONAL_TRAINING_COACHING,
                        SPECIALTY_CHEMICALS,
                        COMMODITY_PETROCHEMICALS,
                        POLYMERS_PLASTICS_RUBBER,
                        COATINGS_ADHESIVES_SEALANTS,
                        INDUSTRIAL_GASES,
                        ADVANCED_MATERIALS_COMPOSITES,
                        BATTERY_MATERIALS_ENERGY_STORAGE,
                        ELECTRONIC_MATERIALS_SEMICONDUCTOR_CHEMICALS,
                        AGROCHEMICALS_FERTILIZERS,
                        FREIGHT_TRANSPORTATION_TECH,
                        LAST_MILE_DELIVERY,
                        WAREHOUSE_AUTOMATION,
                        SUPPLY_CHAIN_VISIBILITY_PLATFORMS,
                        LOGISTICS_MARKETPLACES,
                        SHIPPING_FREIGHT_FORWARDING,
                        COLD_CHAIN_LOGISTICS,
                        REVERSE_LOGISTICS_RETURNS,
                        CROSS_BORDER_TRADE_TECH,
                        TRANSPORTATION_MANAGEMENT_SYSTEMS_TMS,
                        HOTELS_ACCOMMODATION,
                        VACATION_RENTALS_SHORT_TERM_STAYS,
                        RESTAURANT_TECH_MANAGEMENT,
                        TRAVEL_BOOKING_PLATFORMS,
                        TOURISM_EXPERIENCES_ACTIVITIES,
                        CRUISE_LINES_MARINE_TOURISM,
                        HOSPITALITY_MANAGEMENT_SYSTEMS,
                        EVENT_VENUE_MANAGEMENT,
                        CORPORATE_TRAVEL_MANAGEMENT,
                        TRAVEL_INSURANCE_PROTECTION,
                        CONSTRUCTION_MANAGEMENT_SOFTWARE,
                        BIM_CAD_DESIGN_TOOLS,
                        CONSTRUCTION_MARKETPLACES,
                        EQUIPMENT_RENTAL_MANAGEMENT,
                        BUILDING_MATERIALS_PROCUREMENT,
                        CONSTRUCTION_WORKFORCE_MANAGEMENT,
                        PROJECT_ESTIMATION_BIDDING,
                        MODULAR_PREFAB_CONSTRUCTION,
                        CONSTRUCTION_SAFETY_COMPLIANCE,
                        SMART_BUILDING_TECHNOLOGY,
                        FOOD_BEVERAGE_CPG,
                        HOME_PERSONAL_CARE_CPG,
                        CPG_ANALYTICS_INSIGHTS,
                        DIRECT_TO_CONSUMER_CPG_BRANDS,
                        CPG_SUPPLY_CHAIN_DISTRIBUTION,
                        PRIVATE_LABEL_MANUFACTURING,
                        CPG_RETAIL_INTELLIGENCE,
                        SUSTAINABLE_CPG_PACKAGING,
                        BEAUTY_COSMETICS_CPG,
                        HEALTH_WELLNESS_CPG,
                        /**
                         * An enum member indicating that [Subindustry] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DEFENSE_SYSTEMS_MILITARY_HARDWARE ->
                                Value.DEFENSE_SYSTEMS_MILITARY_HARDWARE
                            AEROSPACE_MANUFACTURING -> Value.AEROSPACE_MANUFACTURING
                            AVIONICS_NAVIGATION_TECHNOLOGY -> Value.AVIONICS_NAVIGATION_TECHNOLOGY
                            SUBSEA_NAVAL_DEFENSE_SYSTEMS -> Value.SUBSEA_NAVAL_DEFENSE_SYSTEMS
                            SPACE_SATELLITE_TECHNOLOGY -> Value.SPACE_SATELLITE_TECHNOLOGY
                            DEFENSE_IT_SYSTEMS_INTEGRATION -> Value.DEFENSE_IT_SYSTEMS_INTEGRATION
                            SOFTWARE_B2_B -> Value.SOFTWARE_B2_B
                            SOFTWARE_B2_C -> Value.SOFTWARE_B2_C
                            CLOUD_INFRASTRUCTURE_DEV_OPS -> Value.CLOUD_INFRASTRUCTURE_DEV_OPS
                            CYBERSECURITY -> Value.CYBERSECURITY
                            ARTIFICIAL_INTELLIGENCE_MACHINE_LEARNING ->
                                Value.ARTIFICIAL_INTELLIGENCE_MACHINE_LEARNING
                            DATA_INFRASTRUCTURE_ANALYTICS -> Value.DATA_INFRASTRUCTURE_ANALYTICS
                            HARDWARE_SEMICONDUCTORS -> Value.HARDWARE_SEMICONDUCTORS
                            FINTECH_INFRASTRUCTURE -> Value.FINTECH_INFRASTRUCTURE
                            E_COMMERCE_MARKETPLACE_PLATFORMS ->
                                Value.E_COMMERCE_MARKETPLACE_PLATFORMS
                            DEVELOPER_TOOLS_APIS -> Value.DEVELOPER_TOOLS_APIS
                            WEB3_BLOCKCHAIN -> Value.WEB3_BLOCKCHAIN
                            XR_SPATIAL_COMPUTING -> Value.XR_SPATIAL_COMPUTING
                            BANKING_LENDING -> Value.BANKING_LENDING
                            INVESTMENT_MANAGEMENT_WEALTH_TECH ->
                                Value.INVESTMENT_MANAGEMENT_WEALTH_TECH
                            INSURANCE_INSUR_TECH -> Value.INSURANCE_INSUR_TECH
                            PAYMENTS_MONEY_MOVEMENT -> Value.PAYMENTS_MONEY_MOVEMENT
                            ACCOUNTING_TAX_FINANCIAL_PLANNING_TOOLS ->
                                Value.ACCOUNTING_TAX_FINANCIAL_PLANNING_TOOLS
                            CAPITAL_MARKETS_TRADING_PLATFORMS ->
                                Value.CAPITAL_MARKETS_TRADING_PLATFORMS
                            FINANCIAL_INFRASTRUCTURE_APIS -> Value.FINANCIAL_INFRASTRUCTURE_APIS
                            CREDIT_SCORING_RISK_MANAGEMENT -> Value.CREDIT_SCORING_RISK_MANAGEMENT
                            CRYPTOCURRENCY_DIGITAL_ASSETS -> Value.CRYPTOCURRENCY_DIGITAL_ASSETS
                            BNPL_ALTERNATIVE_FINANCING -> Value.BNPL_ALTERNATIVE_FINANCING
                            HEALTHCARE_PROVIDERS_SERVICES -> Value.HEALTHCARE_PROVIDERS_SERVICES
                            PHARMACEUTICALS_DRUG_DEVELOPMENT ->
                                Value.PHARMACEUTICALS_DRUG_DEVELOPMENT
                            MEDICAL_DEVICES_DIAGNOSTICS -> Value.MEDICAL_DEVICES_DIAGNOSTICS
                            BIOTECHNOLOGY_GENOMICS -> Value.BIOTECHNOLOGY_GENOMICS
                            DIGITAL_HEALTH_TELEMEDICINE -> Value.DIGITAL_HEALTH_TELEMEDICINE
                            HEALTH_INSURANCE_BENEFITS_TECH -> Value.HEALTH_INSURANCE_BENEFITS_TECH
                            CLINICAL_TRIALS_RESEARCH_PLATFORMS ->
                                Value.CLINICAL_TRIALS_RESEARCH_PLATFORMS
                            MENTAL_HEALTH_WELLNESS -> Value.MENTAL_HEALTH_WELLNESS
                            HEALTHCARE_IT_EHR_SYSTEMS -> Value.HEALTHCARE_IT_EHR_SYSTEMS
                            CONSUMER_HEALTH_WELLNESS_PRODUCTS ->
                                Value.CONSUMER_HEALTH_WELLNESS_PRODUCTS
                            ONLINE_MARKETPLACES -> Value.ONLINE_MARKETPLACES
                            DIRECT_TO_CONSUMER_DTC_BRANDS -> Value.DIRECT_TO_CONSUMER_DTC_BRANDS
                            RETAIL_TECH_POINT_OF_SALE_SYSTEMS ->
                                Value.RETAIL_TECH_POINT_OF_SALE_SYSTEMS
                            OMNICHANNEL_IN_STORE_RETAIL -> Value.OMNICHANNEL_IN_STORE_RETAIL
                            E_COMMERCE_ENABLEMENT_INFRASTRUCTURE ->
                                Value.E_COMMERCE_ENABLEMENT_INFRASTRUCTURE
                            SUBSCRIPTION_MEMBERSHIP_COMMERCE ->
                                Value.SUBSCRIPTION_MEMBERSHIP_COMMERCE
                            SOCIAL_COMMERCE_INFLUENCER_PLATFORMS ->
                                Value.SOCIAL_COMMERCE_INFLUENCER_PLATFORMS
                            FASHION_APPAREL_RETAIL -> Value.FASHION_APPAREL_RETAIL
                            FOOD_BEVERAGE_GROCERY_E_COMMERCE ->
                                Value.FOOD_BEVERAGE_GROCERY_E_COMMERCE
                            STREAMING_PLATFORMS_VIDEO_MUSIC_AUDIO ->
                                Value.STREAMING_PLATFORMS_VIDEO_MUSIC_AUDIO
                            GAMING_INTERACTIVE_ENTERTAINMENT ->
                                Value.GAMING_INTERACTIVE_ENTERTAINMENT
                            CREATOR_ECONOMY_INFLUENCER_PLATFORMS ->
                                Value.CREATOR_ECONOMY_INFLUENCER_PLATFORMS
                            ADVERTISING_ADTECH_MEDIA_BUYING -> Value.ADVERTISING_ADTECH_MEDIA_BUYING
                            FILM_TV_PRODUCTION_STUDIOS -> Value.FILM_TV_PRODUCTION_STUDIOS
                            EVENTS_VENUES_LIVE_ENTERTAINMENT ->
                                Value.EVENTS_VENUES_LIVE_ENTERTAINMENT
                            VIRTUAL_WORLDS_METAVERSE_EXPERIENCES ->
                                Value.VIRTUAL_WORLDS_METAVERSE_EXPERIENCES
                            K_12_EDUCATION_PLATFORMS_TOOLS -> Value.K_12_EDUCATION_PLATFORMS_TOOLS
                            HIGHER_EDUCATION_UNIVERSITY_TECH ->
                                Value.HIGHER_EDUCATION_UNIVERSITY_TECH
                            ONLINE_LEARNING_MOO_CS -> Value.ONLINE_LEARNING_MOO_CS
                            TEST_PREP_CERTIFICATION -> Value.TEST_PREP_CERTIFICATION
                            CORPORATE_TRAINING_UPSKILLING -> Value.CORPORATE_TRAINING_UPSKILLING
                            TUTORING_SUPPLEMENTAL_LEARNING -> Value.TUTORING_SUPPLEMENTAL_LEARNING
                            EDUCATION_MANAGEMENT_SYSTEMS_LMS_SIS ->
                                Value.EDUCATION_MANAGEMENT_SYSTEMS_LMS_SIS
                            LANGUAGE_LEARNING -> Value.LANGUAGE_LEARNING
                            CREATOR_LED_COHORT_BASED_COURSES ->
                                Value.CREATOR_LED_COHORT_BASED_COURSES
                            SPECIAL_EDUCATION_ACCESSIBILITY_TOOLS ->
                                Value.SPECIAL_EDUCATION_ACCESSIBILITY_TOOLS
                            GOVERNMENT_TECHNOLOGY_DIGITAL_SERVICES ->
                                Value.GOVERNMENT_TECHNOLOGY_DIGITAL_SERVICES
                            CIVIC_ENGAGEMENT_POLICY_PLATFORMS ->
                                Value.CIVIC_ENGAGEMENT_POLICY_PLATFORMS
                            INTERNATIONAL_DEVELOPMENT_HUMANITARIAN_AID ->
                                Value.INTERNATIONAL_DEVELOPMENT_HUMANITARIAN_AID
                            PHILANTHROPY_GRANTMAKING -> Value.PHILANTHROPY_GRANTMAKING
                            NONPROFIT_OPERATIONS_FUNDRAISING_TOOLS ->
                                Value.NONPROFIT_OPERATIONS_FUNDRAISING_TOOLS
                            PUBLIC_HEALTH_SOCIAL_SERVICES -> Value.PUBLIC_HEALTH_SOCIAL_SERVICES
                            EDUCATION_YOUTH_DEVELOPMENT_PROGRAMS ->
                                Value.EDUCATION_YOUTH_DEVELOPMENT_PROGRAMS
                            ENVIRONMENTAL_CLIMATE_ACTION_ORGANIZATIONS ->
                                Value.ENVIRONMENTAL_CLIMATE_ACTION_ORGANIZATIONS
                            LEGAL_AID_SOCIAL_JUSTICE_ADVOCACY ->
                                Value.LEGAL_AID_SOCIAL_JUSTICE_ADVOCACY
                            MUNICIPAL_INFRASTRUCTURE_SERVICES ->
                                Value.MUNICIPAL_INFRASTRUCTURE_SERVICES
                            MANUFACTURING_INDUSTRIAL_AUTOMATION ->
                                Value.MANUFACTURING_INDUSTRIAL_AUTOMATION
                            ENERGY_PRODUCTION_OIL_GAS_NUCLEAR ->
                                Value.ENERGY_PRODUCTION_OIL_GAS_NUCLEAR
                            RENEWABLE_ENERGY_CLEANTECH -> Value.RENEWABLE_ENERGY_CLEANTECH
                            UTILITIES_GRID_INFRASTRUCTURE -> Value.UTILITIES_GRID_INFRASTRUCTURE
                            INDUSTRIAL_IO_T_MONITORING_SYSTEMS ->
                                Value.INDUSTRIAL_IO_T_MONITORING_SYSTEMS
                            CONSTRUCTION_HEAVY_EQUIPMENT -> Value.CONSTRUCTION_HEAVY_EQUIPMENT
                            MINING_NATURAL_RESOURCES -> Value.MINING_NATURAL_RESOURCES
                            ENVIRONMENTAL_ENGINEERING_SUSTAINABILITY ->
                                Value.ENVIRONMENTAL_ENGINEERING_SUSTAINABILITY
                            ENERGY_STORAGE_BATTERY_TECHNOLOGY ->
                                Value.ENERGY_STORAGE_BATTERY_TECHNOLOGY
                            AUTOMOTIVE_OE_MS_VEHICLE_MANUFACTURING ->
                                Value.AUTOMOTIVE_OE_MS_VEHICLE_MANUFACTURING
                            ELECTRIC_VEHICLES_E_VS_CHARGING_INFRASTRUCTURE ->
                                Value.ELECTRIC_VEHICLES_E_VS_CHARGING_INFRASTRUCTURE
                            MOBILITY_AS_A_SERVICE_MAA_S -> Value.MOBILITY_AS_A_SERVICE_MAA_S
                            FLEET_MANAGEMENT -> Value.FLEET_MANAGEMENT
                            PUBLIC_TRANSIT_URBAN_MOBILITY -> Value.PUBLIC_TRANSIT_URBAN_MOBILITY
                            AUTONOMOUS_VEHICLES_ADAS -> Value.AUTONOMOUS_VEHICLES_ADAS
                            AFTERMARKET_PARTS_SERVICES -> Value.AFTERMARKET_PARTS_SERVICES
                            TELEMATICS_VEHICLE_CONNECTIVITY -> Value.TELEMATICS_VEHICLE_CONNECTIVITY
                            AVIATION_AEROSPACE_TRANSPORT -> Value.AVIATION_AEROSPACE_TRANSPORT
                            MARITIME_SHIPPING -> Value.MARITIME_SHIPPING
                            FITNESS_WELLNESS -> Value.FITNESS_WELLNESS
                            BEAUTY_PERSONAL_CARE -> Value.BEAUTY_PERSONAL_CARE
                            HOME_LIVING -> Value.HOME_LIVING
                            DATING_RELATIONSHIPS -> Value.DATING_RELATIONSHIPS
                            HOBBIES_CRAFTS_DIY -> Value.HOBBIES_CRAFTS_DIY
                            OUTDOOR_RECREATIONAL_GEAR -> Value.OUTDOOR_RECREATIONAL_GEAR
                            EVENTS_EXPERIENCES_TICKETING_PLATFORMS ->
                                Value.EVENTS_EXPERIENCES_TICKETING_PLATFORMS
                            DESIGNER_LUXURY_APPAREL -> Value.DESIGNER_LUXURY_APPAREL
                            ACCESSORIES_JEWELRY_WATCHES -> Value.ACCESSORIES_JEWELRY_WATCHES
                            FOOTWEAR_LEATHER_GOODS -> Value.FOOTWEAR_LEATHER_GOODS
                            BEAUTY_FRAGRANCE_SKINCARE -> Value.BEAUTY_FRAGRANCE_SKINCARE
                            FASHION_MARKETPLACES_RETAIL_PLATFORMS ->
                                Value.FASHION_MARKETPLACES_RETAIL_PLATFORMS
                            SUSTAINABLE_ETHICAL_FASHION -> Value.SUSTAINABLE_ETHICAL_FASHION
                            RESALE_VINTAGE_CIRCULAR_FASHION -> Value.RESALE_VINTAGE_CIRCULAR_FASHION
                            FASHION_TECH_VIRTUAL_TRY_ONS -> Value.FASHION_TECH_VIRTUAL_TRY_ONS
                            STREETWEAR_EMERGING_LUXURY -> Value.STREETWEAR_EMERGING_LUXURY
                            COUTURE_MADE_TO_MEASURE -> Value.COUTURE_MADE_TO_MEASURE
                            NEWS_PUBLISHING_JOURNALISM -> Value.NEWS_PUBLISHING_JOURNALISM
                            DIGITAL_MEDIA_CONTENT_PLATFORMS -> Value.DIGITAL_MEDIA_CONTENT_PLATFORMS
                            BROADCASTING_TV_RADIO -> Value.BROADCASTING_TV_RADIO
                            PODCASTING_AUDIO_MEDIA -> Value.PODCASTING_AUDIO_MEDIA
                            NEWS_AGGREGATORS_CURATION_TOOLS -> Value.NEWS_AGGREGATORS_CURATION_TOOLS
                            INDEPENDENT_CREATOR_LED_MEDIA -> Value.INDEPENDENT_CREATOR_LED_MEDIA
                            NEWSLETTERS_SUBSTACK_STYLE_PLATFORMS ->
                                Value.NEWSLETTERS_SUBSTACK_STYLE_PLATFORMS
                            POLITICAL_INVESTIGATIVE_MEDIA -> Value.POLITICAL_INVESTIGATIVE_MEDIA
                            TRADE_NICHE_PUBLICATIONS -> Value.TRADE_NICHE_PUBLICATIONS
                            MEDIA_MONITORING_ANALYTICS -> Value.MEDIA_MONITORING_ANALYTICS
                            PROFESSIONAL_TEAMS_LEAGUES -> Value.PROFESSIONAL_TEAMS_LEAGUES
                            SPORTS_MEDIA_BROADCASTING -> Value.SPORTS_MEDIA_BROADCASTING
                            SPORTS_BETTING_FANTASY_SPORTS -> Value.SPORTS_BETTING_FANTASY_SPORTS
                            FITNESS_ATHLETIC_TRAINING_PLATFORMS ->
                                Value.FITNESS_ATHLETIC_TRAINING_PLATFORMS
                            SPORTSWEAR_EQUIPMENT -> Value.SPORTSWEAR_EQUIPMENT
                            ESPORTS_COMPETITIVE_GAMING -> Value.ESPORTS_COMPETITIVE_GAMING
                            SPORTS_VENUES_EVENT_MANAGEMENT -> Value.SPORTS_VENUES_EVENT_MANAGEMENT
                            ATHLETE_MANAGEMENT_TALENT_AGENCIES ->
                                Value.ATHLETE_MANAGEMENT_TALENT_AGENCIES
                            SPORTS_TECH_PERFORMANCE_ANALYTICS ->
                                Value.SPORTS_TECH_PERFORMANCE_ANALYTICS
                            YOUTH_AMATEUR_COLLEGIATE_SPORTS -> Value.YOUTH_AMATEUR_COLLEGIATE_SPORTS
                            REAL_ESTATE_MARKETPLACES -> Value.REAL_ESTATE_MARKETPLACES
                            PROPERTY_MANAGEMENT_SOFTWARE -> Value.PROPERTY_MANAGEMENT_SOFTWARE
                            RENTAL_PLATFORMS -> Value.RENTAL_PLATFORMS
                            MORTGAGE_LENDING_TECH -> Value.MORTGAGE_LENDING_TECH
                            REAL_ESTATE_INVESTMENT_PLATFORMS ->
                                Value.REAL_ESTATE_INVESTMENT_PLATFORMS
                            LAW_FIRMS_LEGAL_SERVICES -> Value.LAW_FIRMS_LEGAL_SERVICES
                            LEGAL_TECH_AUTOMATION -> Value.LEGAL_TECH_AUTOMATION
                            REGULATORY_COMPLIANCE -> Value.REGULATORY_COMPLIANCE
                            E_DISCOVERY_LITIGATION_TOOLS -> Value.E_DISCOVERY_LITIGATION_TOOLS
                            CONTRACT_MANAGEMENT -> Value.CONTRACT_MANAGEMENT
                            GOVERNANCE_RISK_COMPLIANCE_GRC -> Value.GOVERNANCE_RISK_COMPLIANCE_GRC
                            IP_TRADEMARK_MANAGEMENT -> Value.IP_TRADEMARK_MANAGEMENT
                            LEGAL_RESEARCH_INTELLIGENCE -> Value.LEGAL_RESEARCH_INTELLIGENCE
                            COMPLIANCE_TRAINING_CERTIFICATION ->
                                Value.COMPLIANCE_TRAINING_CERTIFICATION
                            WHISTLEBLOWER_ETHICS_REPORTING -> Value.WHISTLEBLOWER_ETHICS_REPORTING
                            MOBILE_WIRELESS_NETWORKS_3_G_4_G_5_G ->
                                Value.MOBILE_WIRELESS_NETWORKS_3_G_4_G_5_G
                            BROADBAND_FIBER_INTERNET -> Value.BROADBAND_FIBER_INTERNET
                            SATELLITE_SPACE_BASED_COMMUNICATIONS ->
                                Value.SATELLITE_SPACE_BASED_COMMUNICATIONS
                            NETWORK_EQUIPMENT_INFRASTRUCTURE ->
                                Value.NETWORK_EQUIPMENT_INFRASTRUCTURE
                            TELECOM_BILLING_OSS_BSS_SYSTEMS -> Value.TELECOM_BILLING_OSS_BSS_SYSTEMS
                            VO_IP_UNIFIED_COMMUNICATIONS -> Value.VO_IP_UNIFIED_COMMUNICATIONS
                            INTERNET_SERVICE_PROVIDERS_IS_PS ->
                                Value.INTERNET_SERVICE_PROVIDERS_IS_PS
                            EDGE_COMPUTING_NETWORK_VIRTUALIZATION ->
                                Value.EDGE_COMPUTING_NETWORK_VIRTUALIZATION
                            IO_T_CONNECTIVITY_PLATFORMS -> Value.IO_T_CONNECTIVITY_PLATFORMS
                            PRECISION_AGRICULTURE_AG_TECH -> Value.PRECISION_AGRICULTURE_AG_TECH
                            CROP_LIVESTOCK_PRODUCTION -> Value.CROP_LIVESTOCK_PRODUCTION
                            FOOD_BEVERAGE_MANUFACTURING_PROCESSING ->
                                Value.FOOD_BEVERAGE_MANUFACTURING_PROCESSING
                            FOOD_DISTRIBUTION -> Value.FOOD_DISTRIBUTION
                            RESTAURANTS_FOOD_SERVICE -> Value.RESTAURANTS_FOOD_SERVICE
                            AGRICULTURAL_INPUTS_EQUIPMENT -> Value.AGRICULTURAL_INPUTS_EQUIPMENT
                            SUSTAINABLE_REGENERATIVE_AGRICULTURE ->
                                Value.SUSTAINABLE_REGENERATIVE_AGRICULTURE
                            SEAFOOD_AQUACULTURE -> Value.SEAFOOD_AQUACULTURE
                            MANAGEMENT_CONSULTING -> Value.MANAGEMENT_CONSULTING
                            MARKETING_ADVERTISING_AGENCIES -> Value.MARKETING_ADVERTISING_AGENCIES
                            DESIGN_BRANDING_CREATIVE_STUDIOS ->
                                Value.DESIGN_BRANDING_CREATIVE_STUDIOS
                            IT_SERVICES_MANAGED_SERVICES -> Value.IT_SERVICES_MANAGED_SERVICES
                            STAFFING_RECRUITING_TALENT -> Value.STAFFING_RECRUITING_TALENT
                            ACCOUNTING_TAX_FIRMS -> Value.ACCOUNTING_TAX_FIRMS
                            PUBLIC_RELATIONS_COMMUNICATIONS -> Value.PUBLIC_RELATIONS_COMMUNICATIONS
                            BUSINESS_PROCESS_OUTSOURCING_BPO ->
                                Value.BUSINESS_PROCESS_OUTSOURCING_BPO
                            PROFESSIONAL_TRAINING_COACHING -> Value.PROFESSIONAL_TRAINING_COACHING
                            SPECIALTY_CHEMICALS -> Value.SPECIALTY_CHEMICALS
                            COMMODITY_PETROCHEMICALS -> Value.COMMODITY_PETROCHEMICALS
                            POLYMERS_PLASTICS_RUBBER -> Value.POLYMERS_PLASTICS_RUBBER
                            COATINGS_ADHESIVES_SEALANTS -> Value.COATINGS_ADHESIVES_SEALANTS
                            INDUSTRIAL_GASES -> Value.INDUSTRIAL_GASES
                            ADVANCED_MATERIALS_COMPOSITES -> Value.ADVANCED_MATERIALS_COMPOSITES
                            BATTERY_MATERIALS_ENERGY_STORAGE ->
                                Value.BATTERY_MATERIALS_ENERGY_STORAGE
                            ELECTRONIC_MATERIALS_SEMICONDUCTOR_CHEMICALS ->
                                Value.ELECTRONIC_MATERIALS_SEMICONDUCTOR_CHEMICALS
                            AGROCHEMICALS_FERTILIZERS -> Value.AGROCHEMICALS_FERTILIZERS
                            FREIGHT_TRANSPORTATION_TECH -> Value.FREIGHT_TRANSPORTATION_TECH
                            LAST_MILE_DELIVERY -> Value.LAST_MILE_DELIVERY
                            WAREHOUSE_AUTOMATION -> Value.WAREHOUSE_AUTOMATION
                            SUPPLY_CHAIN_VISIBILITY_PLATFORMS ->
                                Value.SUPPLY_CHAIN_VISIBILITY_PLATFORMS
                            LOGISTICS_MARKETPLACES -> Value.LOGISTICS_MARKETPLACES
                            SHIPPING_FREIGHT_FORWARDING -> Value.SHIPPING_FREIGHT_FORWARDING
                            COLD_CHAIN_LOGISTICS -> Value.COLD_CHAIN_LOGISTICS
                            REVERSE_LOGISTICS_RETURNS -> Value.REVERSE_LOGISTICS_RETURNS
                            CROSS_BORDER_TRADE_TECH -> Value.CROSS_BORDER_TRADE_TECH
                            TRANSPORTATION_MANAGEMENT_SYSTEMS_TMS ->
                                Value.TRANSPORTATION_MANAGEMENT_SYSTEMS_TMS
                            HOTELS_ACCOMMODATION -> Value.HOTELS_ACCOMMODATION
                            VACATION_RENTALS_SHORT_TERM_STAYS ->
                                Value.VACATION_RENTALS_SHORT_TERM_STAYS
                            RESTAURANT_TECH_MANAGEMENT -> Value.RESTAURANT_TECH_MANAGEMENT
                            TRAVEL_BOOKING_PLATFORMS -> Value.TRAVEL_BOOKING_PLATFORMS
                            TOURISM_EXPERIENCES_ACTIVITIES -> Value.TOURISM_EXPERIENCES_ACTIVITIES
                            CRUISE_LINES_MARINE_TOURISM -> Value.CRUISE_LINES_MARINE_TOURISM
                            HOSPITALITY_MANAGEMENT_SYSTEMS -> Value.HOSPITALITY_MANAGEMENT_SYSTEMS
                            EVENT_VENUE_MANAGEMENT -> Value.EVENT_VENUE_MANAGEMENT
                            CORPORATE_TRAVEL_MANAGEMENT -> Value.CORPORATE_TRAVEL_MANAGEMENT
                            TRAVEL_INSURANCE_PROTECTION -> Value.TRAVEL_INSURANCE_PROTECTION
                            CONSTRUCTION_MANAGEMENT_SOFTWARE ->
                                Value.CONSTRUCTION_MANAGEMENT_SOFTWARE
                            BIM_CAD_DESIGN_TOOLS -> Value.BIM_CAD_DESIGN_TOOLS
                            CONSTRUCTION_MARKETPLACES -> Value.CONSTRUCTION_MARKETPLACES
                            EQUIPMENT_RENTAL_MANAGEMENT -> Value.EQUIPMENT_RENTAL_MANAGEMENT
                            BUILDING_MATERIALS_PROCUREMENT -> Value.BUILDING_MATERIALS_PROCUREMENT
                            CONSTRUCTION_WORKFORCE_MANAGEMENT ->
                                Value.CONSTRUCTION_WORKFORCE_MANAGEMENT
                            PROJECT_ESTIMATION_BIDDING -> Value.PROJECT_ESTIMATION_BIDDING
                            MODULAR_PREFAB_CONSTRUCTION -> Value.MODULAR_PREFAB_CONSTRUCTION
                            CONSTRUCTION_SAFETY_COMPLIANCE -> Value.CONSTRUCTION_SAFETY_COMPLIANCE
                            SMART_BUILDING_TECHNOLOGY -> Value.SMART_BUILDING_TECHNOLOGY
                            FOOD_BEVERAGE_CPG -> Value.FOOD_BEVERAGE_CPG
                            HOME_PERSONAL_CARE_CPG -> Value.HOME_PERSONAL_CARE_CPG
                            CPG_ANALYTICS_INSIGHTS -> Value.CPG_ANALYTICS_INSIGHTS
                            DIRECT_TO_CONSUMER_CPG_BRANDS -> Value.DIRECT_TO_CONSUMER_CPG_BRANDS
                            CPG_SUPPLY_CHAIN_DISTRIBUTION -> Value.CPG_SUPPLY_CHAIN_DISTRIBUTION
                            PRIVATE_LABEL_MANUFACTURING -> Value.PRIVATE_LABEL_MANUFACTURING
                            CPG_RETAIL_INTELLIGENCE -> Value.CPG_RETAIL_INTELLIGENCE
                            SUSTAINABLE_CPG_PACKAGING -> Value.SUSTAINABLE_CPG_PACKAGING
                            BEAUTY_COSMETICS_CPG -> Value.BEAUTY_COSMETICS_CPG
                            HEALTH_WELLNESS_CPG -> Value.HEALTH_WELLNESS_CPG
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws BrandDevInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DEFENSE_SYSTEMS_MILITARY_HARDWARE ->
                                Known.DEFENSE_SYSTEMS_MILITARY_HARDWARE
                            AEROSPACE_MANUFACTURING -> Known.AEROSPACE_MANUFACTURING
                            AVIONICS_NAVIGATION_TECHNOLOGY -> Known.AVIONICS_NAVIGATION_TECHNOLOGY
                            SUBSEA_NAVAL_DEFENSE_SYSTEMS -> Known.SUBSEA_NAVAL_DEFENSE_SYSTEMS
                            SPACE_SATELLITE_TECHNOLOGY -> Known.SPACE_SATELLITE_TECHNOLOGY
                            DEFENSE_IT_SYSTEMS_INTEGRATION -> Known.DEFENSE_IT_SYSTEMS_INTEGRATION
                            SOFTWARE_B2_B -> Known.SOFTWARE_B2_B
                            SOFTWARE_B2_C -> Known.SOFTWARE_B2_C
                            CLOUD_INFRASTRUCTURE_DEV_OPS -> Known.CLOUD_INFRASTRUCTURE_DEV_OPS
                            CYBERSECURITY -> Known.CYBERSECURITY
                            ARTIFICIAL_INTELLIGENCE_MACHINE_LEARNING ->
                                Known.ARTIFICIAL_INTELLIGENCE_MACHINE_LEARNING
                            DATA_INFRASTRUCTURE_ANALYTICS -> Known.DATA_INFRASTRUCTURE_ANALYTICS
                            HARDWARE_SEMICONDUCTORS -> Known.HARDWARE_SEMICONDUCTORS
                            FINTECH_INFRASTRUCTURE -> Known.FINTECH_INFRASTRUCTURE
                            E_COMMERCE_MARKETPLACE_PLATFORMS ->
                                Known.E_COMMERCE_MARKETPLACE_PLATFORMS
                            DEVELOPER_TOOLS_APIS -> Known.DEVELOPER_TOOLS_APIS
                            WEB3_BLOCKCHAIN -> Known.WEB3_BLOCKCHAIN
                            XR_SPATIAL_COMPUTING -> Known.XR_SPATIAL_COMPUTING
                            BANKING_LENDING -> Known.BANKING_LENDING
                            INVESTMENT_MANAGEMENT_WEALTH_TECH ->
                                Known.INVESTMENT_MANAGEMENT_WEALTH_TECH
                            INSURANCE_INSUR_TECH -> Known.INSURANCE_INSUR_TECH
                            PAYMENTS_MONEY_MOVEMENT -> Known.PAYMENTS_MONEY_MOVEMENT
                            ACCOUNTING_TAX_FINANCIAL_PLANNING_TOOLS ->
                                Known.ACCOUNTING_TAX_FINANCIAL_PLANNING_TOOLS
                            CAPITAL_MARKETS_TRADING_PLATFORMS ->
                                Known.CAPITAL_MARKETS_TRADING_PLATFORMS
                            FINANCIAL_INFRASTRUCTURE_APIS -> Known.FINANCIAL_INFRASTRUCTURE_APIS
                            CREDIT_SCORING_RISK_MANAGEMENT -> Known.CREDIT_SCORING_RISK_MANAGEMENT
                            CRYPTOCURRENCY_DIGITAL_ASSETS -> Known.CRYPTOCURRENCY_DIGITAL_ASSETS
                            BNPL_ALTERNATIVE_FINANCING -> Known.BNPL_ALTERNATIVE_FINANCING
                            HEALTHCARE_PROVIDERS_SERVICES -> Known.HEALTHCARE_PROVIDERS_SERVICES
                            PHARMACEUTICALS_DRUG_DEVELOPMENT ->
                                Known.PHARMACEUTICALS_DRUG_DEVELOPMENT
                            MEDICAL_DEVICES_DIAGNOSTICS -> Known.MEDICAL_DEVICES_DIAGNOSTICS
                            BIOTECHNOLOGY_GENOMICS -> Known.BIOTECHNOLOGY_GENOMICS
                            DIGITAL_HEALTH_TELEMEDICINE -> Known.DIGITAL_HEALTH_TELEMEDICINE
                            HEALTH_INSURANCE_BENEFITS_TECH -> Known.HEALTH_INSURANCE_BENEFITS_TECH
                            CLINICAL_TRIALS_RESEARCH_PLATFORMS ->
                                Known.CLINICAL_TRIALS_RESEARCH_PLATFORMS
                            MENTAL_HEALTH_WELLNESS -> Known.MENTAL_HEALTH_WELLNESS
                            HEALTHCARE_IT_EHR_SYSTEMS -> Known.HEALTHCARE_IT_EHR_SYSTEMS
                            CONSUMER_HEALTH_WELLNESS_PRODUCTS ->
                                Known.CONSUMER_HEALTH_WELLNESS_PRODUCTS
                            ONLINE_MARKETPLACES -> Known.ONLINE_MARKETPLACES
                            DIRECT_TO_CONSUMER_DTC_BRANDS -> Known.DIRECT_TO_CONSUMER_DTC_BRANDS
                            RETAIL_TECH_POINT_OF_SALE_SYSTEMS ->
                                Known.RETAIL_TECH_POINT_OF_SALE_SYSTEMS
                            OMNICHANNEL_IN_STORE_RETAIL -> Known.OMNICHANNEL_IN_STORE_RETAIL
                            E_COMMERCE_ENABLEMENT_INFRASTRUCTURE ->
                                Known.E_COMMERCE_ENABLEMENT_INFRASTRUCTURE
                            SUBSCRIPTION_MEMBERSHIP_COMMERCE ->
                                Known.SUBSCRIPTION_MEMBERSHIP_COMMERCE
                            SOCIAL_COMMERCE_INFLUENCER_PLATFORMS ->
                                Known.SOCIAL_COMMERCE_INFLUENCER_PLATFORMS
                            FASHION_APPAREL_RETAIL -> Known.FASHION_APPAREL_RETAIL
                            FOOD_BEVERAGE_GROCERY_E_COMMERCE ->
                                Known.FOOD_BEVERAGE_GROCERY_E_COMMERCE
                            STREAMING_PLATFORMS_VIDEO_MUSIC_AUDIO ->
                                Known.STREAMING_PLATFORMS_VIDEO_MUSIC_AUDIO
                            GAMING_INTERACTIVE_ENTERTAINMENT ->
                                Known.GAMING_INTERACTIVE_ENTERTAINMENT
                            CREATOR_ECONOMY_INFLUENCER_PLATFORMS ->
                                Known.CREATOR_ECONOMY_INFLUENCER_PLATFORMS
                            ADVERTISING_ADTECH_MEDIA_BUYING -> Known.ADVERTISING_ADTECH_MEDIA_BUYING
                            FILM_TV_PRODUCTION_STUDIOS -> Known.FILM_TV_PRODUCTION_STUDIOS
                            EVENTS_VENUES_LIVE_ENTERTAINMENT ->
                                Known.EVENTS_VENUES_LIVE_ENTERTAINMENT
                            VIRTUAL_WORLDS_METAVERSE_EXPERIENCES ->
                                Known.VIRTUAL_WORLDS_METAVERSE_EXPERIENCES
                            K_12_EDUCATION_PLATFORMS_TOOLS -> Known.K_12_EDUCATION_PLATFORMS_TOOLS
                            HIGHER_EDUCATION_UNIVERSITY_TECH ->
                                Known.HIGHER_EDUCATION_UNIVERSITY_TECH
                            ONLINE_LEARNING_MOO_CS -> Known.ONLINE_LEARNING_MOO_CS
                            TEST_PREP_CERTIFICATION -> Known.TEST_PREP_CERTIFICATION
                            CORPORATE_TRAINING_UPSKILLING -> Known.CORPORATE_TRAINING_UPSKILLING
                            TUTORING_SUPPLEMENTAL_LEARNING -> Known.TUTORING_SUPPLEMENTAL_LEARNING
                            EDUCATION_MANAGEMENT_SYSTEMS_LMS_SIS ->
                                Known.EDUCATION_MANAGEMENT_SYSTEMS_LMS_SIS
                            LANGUAGE_LEARNING -> Known.LANGUAGE_LEARNING
                            CREATOR_LED_COHORT_BASED_COURSES ->
                                Known.CREATOR_LED_COHORT_BASED_COURSES
                            SPECIAL_EDUCATION_ACCESSIBILITY_TOOLS ->
                                Known.SPECIAL_EDUCATION_ACCESSIBILITY_TOOLS
                            GOVERNMENT_TECHNOLOGY_DIGITAL_SERVICES ->
                                Known.GOVERNMENT_TECHNOLOGY_DIGITAL_SERVICES
                            CIVIC_ENGAGEMENT_POLICY_PLATFORMS ->
                                Known.CIVIC_ENGAGEMENT_POLICY_PLATFORMS
                            INTERNATIONAL_DEVELOPMENT_HUMANITARIAN_AID ->
                                Known.INTERNATIONAL_DEVELOPMENT_HUMANITARIAN_AID
                            PHILANTHROPY_GRANTMAKING -> Known.PHILANTHROPY_GRANTMAKING
                            NONPROFIT_OPERATIONS_FUNDRAISING_TOOLS ->
                                Known.NONPROFIT_OPERATIONS_FUNDRAISING_TOOLS
                            PUBLIC_HEALTH_SOCIAL_SERVICES -> Known.PUBLIC_HEALTH_SOCIAL_SERVICES
                            EDUCATION_YOUTH_DEVELOPMENT_PROGRAMS ->
                                Known.EDUCATION_YOUTH_DEVELOPMENT_PROGRAMS
                            ENVIRONMENTAL_CLIMATE_ACTION_ORGANIZATIONS ->
                                Known.ENVIRONMENTAL_CLIMATE_ACTION_ORGANIZATIONS
                            LEGAL_AID_SOCIAL_JUSTICE_ADVOCACY ->
                                Known.LEGAL_AID_SOCIAL_JUSTICE_ADVOCACY
                            MUNICIPAL_INFRASTRUCTURE_SERVICES ->
                                Known.MUNICIPAL_INFRASTRUCTURE_SERVICES
                            MANUFACTURING_INDUSTRIAL_AUTOMATION ->
                                Known.MANUFACTURING_INDUSTRIAL_AUTOMATION
                            ENERGY_PRODUCTION_OIL_GAS_NUCLEAR ->
                                Known.ENERGY_PRODUCTION_OIL_GAS_NUCLEAR
                            RENEWABLE_ENERGY_CLEANTECH -> Known.RENEWABLE_ENERGY_CLEANTECH
                            UTILITIES_GRID_INFRASTRUCTURE -> Known.UTILITIES_GRID_INFRASTRUCTURE
                            INDUSTRIAL_IO_T_MONITORING_SYSTEMS ->
                                Known.INDUSTRIAL_IO_T_MONITORING_SYSTEMS
                            CONSTRUCTION_HEAVY_EQUIPMENT -> Known.CONSTRUCTION_HEAVY_EQUIPMENT
                            MINING_NATURAL_RESOURCES -> Known.MINING_NATURAL_RESOURCES
                            ENVIRONMENTAL_ENGINEERING_SUSTAINABILITY ->
                                Known.ENVIRONMENTAL_ENGINEERING_SUSTAINABILITY
                            ENERGY_STORAGE_BATTERY_TECHNOLOGY ->
                                Known.ENERGY_STORAGE_BATTERY_TECHNOLOGY
                            AUTOMOTIVE_OE_MS_VEHICLE_MANUFACTURING ->
                                Known.AUTOMOTIVE_OE_MS_VEHICLE_MANUFACTURING
                            ELECTRIC_VEHICLES_E_VS_CHARGING_INFRASTRUCTURE ->
                                Known.ELECTRIC_VEHICLES_E_VS_CHARGING_INFRASTRUCTURE
                            MOBILITY_AS_A_SERVICE_MAA_S -> Known.MOBILITY_AS_A_SERVICE_MAA_S
                            FLEET_MANAGEMENT -> Known.FLEET_MANAGEMENT
                            PUBLIC_TRANSIT_URBAN_MOBILITY -> Known.PUBLIC_TRANSIT_URBAN_MOBILITY
                            AUTONOMOUS_VEHICLES_ADAS -> Known.AUTONOMOUS_VEHICLES_ADAS
                            AFTERMARKET_PARTS_SERVICES -> Known.AFTERMARKET_PARTS_SERVICES
                            TELEMATICS_VEHICLE_CONNECTIVITY -> Known.TELEMATICS_VEHICLE_CONNECTIVITY
                            AVIATION_AEROSPACE_TRANSPORT -> Known.AVIATION_AEROSPACE_TRANSPORT
                            MARITIME_SHIPPING -> Known.MARITIME_SHIPPING
                            FITNESS_WELLNESS -> Known.FITNESS_WELLNESS
                            BEAUTY_PERSONAL_CARE -> Known.BEAUTY_PERSONAL_CARE
                            HOME_LIVING -> Known.HOME_LIVING
                            DATING_RELATIONSHIPS -> Known.DATING_RELATIONSHIPS
                            HOBBIES_CRAFTS_DIY -> Known.HOBBIES_CRAFTS_DIY
                            OUTDOOR_RECREATIONAL_GEAR -> Known.OUTDOOR_RECREATIONAL_GEAR
                            EVENTS_EXPERIENCES_TICKETING_PLATFORMS ->
                                Known.EVENTS_EXPERIENCES_TICKETING_PLATFORMS
                            DESIGNER_LUXURY_APPAREL -> Known.DESIGNER_LUXURY_APPAREL
                            ACCESSORIES_JEWELRY_WATCHES -> Known.ACCESSORIES_JEWELRY_WATCHES
                            FOOTWEAR_LEATHER_GOODS -> Known.FOOTWEAR_LEATHER_GOODS
                            BEAUTY_FRAGRANCE_SKINCARE -> Known.BEAUTY_FRAGRANCE_SKINCARE
                            FASHION_MARKETPLACES_RETAIL_PLATFORMS ->
                                Known.FASHION_MARKETPLACES_RETAIL_PLATFORMS
                            SUSTAINABLE_ETHICAL_FASHION -> Known.SUSTAINABLE_ETHICAL_FASHION
                            RESALE_VINTAGE_CIRCULAR_FASHION -> Known.RESALE_VINTAGE_CIRCULAR_FASHION
                            FASHION_TECH_VIRTUAL_TRY_ONS -> Known.FASHION_TECH_VIRTUAL_TRY_ONS
                            STREETWEAR_EMERGING_LUXURY -> Known.STREETWEAR_EMERGING_LUXURY
                            COUTURE_MADE_TO_MEASURE -> Known.COUTURE_MADE_TO_MEASURE
                            NEWS_PUBLISHING_JOURNALISM -> Known.NEWS_PUBLISHING_JOURNALISM
                            DIGITAL_MEDIA_CONTENT_PLATFORMS -> Known.DIGITAL_MEDIA_CONTENT_PLATFORMS
                            BROADCASTING_TV_RADIO -> Known.BROADCASTING_TV_RADIO
                            PODCASTING_AUDIO_MEDIA -> Known.PODCASTING_AUDIO_MEDIA
                            NEWS_AGGREGATORS_CURATION_TOOLS -> Known.NEWS_AGGREGATORS_CURATION_TOOLS
                            INDEPENDENT_CREATOR_LED_MEDIA -> Known.INDEPENDENT_CREATOR_LED_MEDIA
                            NEWSLETTERS_SUBSTACK_STYLE_PLATFORMS ->
                                Known.NEWSLETTERS_SUBSTACK_STYLE_PLATFORMS
                            POLITICAL_INVESTIGATIVE_MEDIA -> Known.POLITICAL_INVESTIGATIVE_MEDIA
                            TRADE_NICHE_PUBLICATIONS -> Known.TRADE_NICHE_PUBLICATIONS
                            MEDIA_MONITORING_ANALYTICS -> Known.MEDIA_MONITORING_ANALYTICS
                            PROFESSIONAL_TEAMS_LEAGUES -> Known.PROFESSIONAL_TEAMS_LEAGUES
                            SPORTS_MEDIA_BROADCASTING -> Known.SPORTS_MEDIA_BROADCASTING
                            SPORTS_BETTING_FANTASY_SPORTS -> Known.SPORTS_BETTING_FANTASY_SPORTS
                            FITNESS_ATHLETIC_TRAINING_PLATFORMS ->
                                Known.FITNESS_ATHLETIC_TRAINING_PLATFORMS
                            SPORTSWEAR_EQUIPMENT -> Known.SPORTSWEAR_EQUIPMENT
                            ESPORTS_COMPETITIVE_GAMING -> Known.ESPORTS_COMPETITIVE_GAMING
                            SPORTS_VENUES_EVENT_MANAGEMENT -> Known.SPORTS_VENUES_EVENT_MANAGEMENT
                            ATHLETE_MANAGEMENT_TALENT_AGENCIES ->
                                Known.ATHLETE_MANAGEMENT_TALENT_AGENCIES
                            SPORTS_TECH_PERFORMANCE_ANALYTICS ->
                                Known.SPORTS_TECH_PERFORMANCE_ANALYTICS
                            YOUTH_AMATEUR_COLLEGIATE_SPORTS -> Known.YOUTH_AMATEUR_COLLEGIATE_SPORTS
                            REAL_ESTATE_MARKETPLACES -> Known.REAL_ESTATE_MARKETPLACES
                            PROPERTY_MANAGEMENT_SOFTWARE -> Known.PROPERTY_MANAGEMENT_SOFTWARE
                            RENTAL_PLATFORMS -> Known.RENTAL_PLATFORMS
                            MORTGAGE_LENDING_TECH -> Known.MORTGAGE_LENDING_TECH
                            REAL_ESTATE_INVESTMENT_PLATFORMS ->
                                Known.REAL_ESTATE_INVESTMENT_PLATFORMS
                            LAW_FIRMS_LEGAL_SERVICES -> Known.LAW_FIRMS_LEGAL_SERVICES
                            LEGAL_TECH_AUTOMATION -> Known.LEGAL_TECH_AUTOMATION
                            REGULATORY_COMPLIANCE -> Known.REGULATORY_COMPLIANCE
                            E_DISCOVERY_LITIGATION_TOOLS -> Known.E_DISCOVERY_LITIGATION_TOOLS
                            CONTRACT_MANAGEMENT -> Known.CONTRACT_MANAGEMENT
                            GOVERNANCE_RISK_COMPLIANCE_GRC -> Known.GOVERNANCE_RISK_COMPLIANCE_GRC
                            IP_TRADEMARK_MANAGEMENT -> Known.IP_TRADEMARK_MANAGEMENT
                            LEGAL_RESEARCH_INTELLIGENCE -> Known.LEGAL_RESEARCH_INTELLIGENCE
                            COMPLIANCE_TRAINING_CERTIFICATION ->
                                Known.COMPLIANCE_TRAINING_CERTIFICATION
                            WHISTLEBLOWER_ETHICS_REPORTING -> Known.WHISTLEBLOWER_ETHICS_REPORTING
                            MOBILE_WIRELESS_NETWORKS_3_G_4_G_5_G ->
                                Known.MOBILE_WIRELESS_NETWORKS_3_G_4_G_5_G
                            BROADBAND_FIBER_INTERNET -> Known.BROADBAND_FIBER_INTERNET
                            SATELLITE_SPACE_BASED_COMMUNICATIONS ->
                                Known.SATELLITE_SPACE_BASED_COMMUNICATIONS
                            NETWORK_EQUIPMENT_INFRASTRUCTURE ->
                                Known.NETWORK_EQUIPMENT_INFRASTRUCTURE
                            TELECOM_BILLING_OSS_BSS_SYSTEMS -> Known.TELECOM_BILLING_OSS_BSS_SYSTEMS
                            VO_IP_UNIFIED_COMMUNICATIONS -> Known.VO_IP_UNIFIED_COMMUNICATIONS
                            INTERNET_SERVICE_PROVIDERS_IS_PS ->
                                Known.INTERNET_SERVICE_PROVIDERS_IS_PS
                            EDGE_COMPUTING_NETWORK_VIRTUALIZATION ->
                                Known.EDGE_COMPUTING_NETWORK_VIRTUALIZATION
                            IO_T_CONNECTIVITY_PLATFORMS -> Known.IO_T_CONNECTIVITY_PLATFORMS
                            PRECISION_AGRICULTURE_AG_TECH -> Known.PRECISION_AGRICULTURE_AG_TECH
                            CROP_LIVESTOCK_PRODUCTION -> Known.CROP_LIVESTOCK_PRODUCTION
                            FOOD_BEVERAGE_MANUFACTURING_PROCESSING ->
                                Known.FOOD_BEVERAGE_MANUFACTURING_PROCESSING
                            FOOD_DISTRIBUTION -> Known.FOOD_DISTRIBUTION
                            RESTAURANTS_FOOD_SERVICE -> Known.RESTAURANTS_FOOD_SERVICE
                            AGRICULTURAL_INPUTS_EQUIPMENT -> Known.AGRICULTURAL_INPUTS_EQUIPMENT
                            SUSTAINABLE_REGENERATIVE_AGRICULTURE ->
                                Known.SUSTAINABLE_REGENERATIVE_AGRICULTURE
                            SEAFOOD_AQUACULTURE -> Known.SEAFOOD_AQUACULTURE
                            MANAGEMENT_CONSULTING -> Known.MANAGEMENT_CONSULTING
                            MARKETING_ADVERTISING_AGENCIES -> Known.MARKETING_ADVERTISING_AGENCIES
                            DESIGN_BRANDING_CREATIVE_STUDIOS ->
                                Known.DESIGN_BRANDING_CREATIVE_STUDIOS
                            IT_SERVICES_MANAGED_SERVICES -> Known.IT_SERVICES_MANAGED_SERVICES
                            STAFFING_RECRUITING_TALENT -> Known.STAFFING_RECRUITING_TALENT
                            ACCOUNTING_TAX_FIRMS -> Known.ACCOUNTING_TAX_FIRMS
                            PUBLIC_RELATIONS_COMMUNICATIONS -> Known.PUBLIC_RELATIONS_COMMUNICATIONS
                            BUSINESS_PROCESS_OUTSOURCING_BPO ->
                                Known.BUSINESS_PROCESS_OUTSOURCING_BPO
                            PROFESSIONAL_TRAINING_COACHING -> Known.PROFESSIONAL_TRAINING_COACHING
                            SPECIALTY_CHEMICALS -> Known.SPECIALTY_CHEMICALS
                            COMMODITY_PETROCHEMICALS -> Known.COMMODITY_PETROCHEMICALS
                            POLYMERS_PLASTICS_RUBBER -> Known.POLYMERS_PLASTICS_RUBBER
                            COATINGS_ADHESIVES_SEALANTS -> Known.COATINGS_ADHESIVES_SEALANTS
                            INDUSTRIAL_GASES -> Known.INDUSTRIAL_GASES
                            ADVANCED_MATERIALS_COMPOSITES -> Known.ADVANCED_MATERIALS_COMPOSITES
                            BATTERY_MATERIALS_ENERGY_STORAGE ->
                                Known.BATTERY_MATERIALS_ENERGY_STORAGE
                            ELECTRONIC_MATERIALS_SEMICONDUCTOR_CHEMICALS ->
                                Known.ELECTRONIC_MATERIALS_SEMICONDUCTOR_CHEMICALS
                            AGROCHEMICALS_FERTILIZERS -> Known.AGROCHEMICALS_FERTILIZERS
                            FREIGHT_TRANSPORTATION_TECH -> Known.FREIGHT_TRANSPORTATION_TECH
                            LAST_MILE_DELIVERY -> Known.LAST_MILE_DELIVERY
                            WAREHOUSE_AUTOMATION -> Known.WAREHOUSE_AUTOMATION
                            SUPPLY_CHAIN_VISIBILITY_PLATFORMS ->
                                Known.SUPPLY_CHAIN_VISIBILITY_PLATFORMS
                            LOGISTICS_MARKETPLACES -> Known.LOGISTICS_MARKETPLACES
                            SHIPPING_FREIGHT_FORWARDING -> Known.SHIPPING_FREIGHT_FORWARDING
                            COLD_CHAIN_LOGISTICS -> Known.COLD_CHAIN_LOGISTICS
                            REVERSE_LOGISTICS_RETURNS -> Known.REVERSE_LOGISTICS_RETURNS
                            CROSS_BORDER_TRADE_TECH -> Known.CROSS_BORDER_TRADE_TECH
                            TRANSPORTATION_MANAGEMENT_SYSTEMS_TMS ->
                                Known.TRANSPORTATION_MANAGEMENT_SYSTEMS_TMS
                            HOTELS_ACCOMMODATION -> Known.HOTELS_ACCOMMODATION
                            VACATION_RENTALS_SHORT_TERM_STAYS ->
                                Known.VACATION_RENTALS_SHORT_TERM_STAYS
                            RESTAURANT_TECH_MANAGEMENT -> Known.RESTAURANT_TECH_MANAGEMENT
                            TRAVEL_BOOKING_PLATFORMS -> Known.TRAVEL_BOOKING_PLATFORMS
                            TOURISM_EXPERIENCES_ACTIVITIES -> Known.TOURISM_EXPERIENCES_ACTIVITIES
                            CRUISE_LINES_MARINE_TOURISM -> Known.CRUISE_LINES_MARINE_TOURISM
                            HOSPITALITY_MANAGEMENT_SYSTEMS -> Known.HOSPITALITY_MANAGEMENT_SYSTEMS
                            EVENT_VENUE_MANAGEMENT -> Known.EVENT_VENUE_MANAGEMENT
                            CORPORATE_TRAVEL_MANAGEMENT -> Known.CORPORATE_TRAVEL_MANAGEMENT
                            TRAVEL_INSURANCE_PROTECTION -> Known.TRAVEL_INSURANCE_PROTECTION
                            CONSTRUCTION_MANAGEMENT_SOFTWARE ->
                                Known.CONSTRUCTION_MANAGEMENT_SOFTWARE
                            BIM_CAD_DESIGN_TOOLS -> Known.BIM_CAD_DESIGN_TOOLS
                            CONSTRUCTION_MARKETPLACES -> Known.CONSTRUCTION_MARKETPLACES
                            EQUIPMENT_RENTAL_MANAGEMENT -> Known.EQUIPMENT_RENTAL_MANAGEMENT
                            BUILDING_MATERIALS_PROCUREMENT -> Known.BUILDING_MATERIALS_PROCUREMENT
                            CONSTRUCTION_WORKFORCE_MANAGEMENT ->
                                Known.CONSTRUCTION_WORKFORCE_MANAGEMENT
                            PROJECT_ESTIMATION_BIDDING -> Known.PROJECT_ESTIMATION_BIDDING
                            MODULAR_PREFAB_CONSTRUCTION -> Known.MODULAR_PREFAB_CONSTRUCTION
                            CONSTRUCTION_SAFETY_COMPLIANCE -> Known.CONSTRUCTION_SAFETY_COMPLIANCE
                            SMART_BUILDING_TECHNOLOGY -> Known.SMART_BUILDING_TECHNOLOGY
                            FOOD_BEVERAGE_CPG -> Known.FOOD_BEVERAGE_CPG
                            HOME_PERSONAL_CARE_CPG -> Known.HOME_PERSONAL_CARE_CPG
                            CPG_ANALYTICS_INSIGHTS -> Known.CPG_ANALYTICS_INSIGHTS
                            DIRECT_TO_CONSUMER_CPG_BRANDS -> Known.DIRECT_TO_CONSUMER_CPG_BRANDS
                            CPG_SUPPLY_CHAIN_DISTRIBUTION -> Known.CPG_SUPPLY_CHAIN_DISTRIBUTION
                            PRIVATE_LABEL_MANUFACTURING -> Known.PRIVATE_LABEL_MANUFACTURING
                            CPG_RETAIL_INTELLIGENCE -> Known.CPG_RETAIL_INTELLIGENCE
                            SUSTAINABLE_CPG_PACKAGING -> Known.SUSTAINABLE_CPG_PACKAGING
                            BEAUTY_COSMETICS_CPG -> Known.BEAUTY_COSMETICS_CPG
                            HEALTH_WELLNESS_CPG -> Known.HEALTH_WELLNESS_CPG
                            else ->
                                throw BrandDevInvalidDataException("Unknown Subindustry: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws BrandDevInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            BrandDevInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Subindustry = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Subindustry && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Eic &&
                        industry == other.industry &&
                        subindustry == other.subindustry &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(industry, subindustry, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Eic{industry=$industry, subindustry=$subindustry, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Industries &&
                    eic == other.eic &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(eic, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Industries{eic=$eic, additionalProperties=$additionalProperties}"
        }

        /** Important website links for the brand */
        class Links
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val blog: JsonField<String>,
            private val careers: JsonField<String>,
            private val contact: JsonField<String>,
            private val pricing: JsonField<String>,
            private val privacy: JsonField<String>,
            private val terms: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("blog") @ExcludeMissing blog: JsonField<String> = JsonMissing.of(),
                @JsonProperty("careers")
                @ExcludeMissing
                careers: JsonField<String> = JsonMissing.of(),
                @JsonProperty("contact")
                @ExcludeMissing
                contact: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pricing")
                @ExcludeMissing
                pricing: JsonField<String> = JsonMissing.of(),
                @JsonProperty("privacy")
                @ExcludeMissing
                privacy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("terms") @ExcludeMissing terms: JsonField<String> = JsonMissing.of(),
            ) : this(blog, careers, contact, pricing, privacy, terms, mutableMapOf())

            /**
             * URL to the brand's blog or news page
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun blog(): Optional<String> = blog.getOptional("blog")

            /**
             * URL to the brand's careers or job opportunities page
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun careers(): Optional<String> = careers.getOptional("careers")

            /**
             * URL to the brand's contact or contact us page
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun contact(): Optional<String> = contact.getOptional("contact")

            /**
             * URL to the brand's pricing or plans page
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pricing(): Optional<String> = pricing.getOptional("pricing")

            /**
             * URL to the brand's privacy policy page
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun privacy(): Optional<String> = privacy.getOptional("privacy")

            /**
             * URL to the brand's terms of service or terms and conditions page
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun terms(): Optional<String> = terms.getOptional("terms")

            /**
             * Returns the raw JSON value of [blog].
             *
             * Unlike [blog], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("blog") @ExcludeMissing fun _blog(): JsonField<String> = blog

            /**
             * Returns the raw JSON value of [careers].
             *
             * Unlike [careers], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("careers") @ExcludeMissing fun _careers(): JsonField<String> = careers

            /**
             * Returns the raw JSON value of [contact].
             *
             * Unlike [contact], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("contact") @ExcludeMissing fun _contact(): JsonField<String> = contact

            /**
             * Returns the raw JSON value of [pricing].
             *
             * Unlike [pricing], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pricing") @ExcludeMissing fun _pricing(): JsonField<String> = pricing

            /**
             * Returns the raw JSON value of [privacy].
             *
             * Unlike [privacy], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("privacy") @ExcludeMissing fun _privacy(): JsonField<String> = privacy

            /**
             * Returns the raw JSON value of [terms].
             *
             * Unlike [terms], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("terms") @ExcludeMissing fun _terms(): JsonField<String> = terms

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

                /** Returns a mutable builder for constructing an instance of [Links]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Links]. */
            class Builder internal constructor() {

                private var blog: JsonField<String> = JsonMissing.of()
                private var careers: JsonField<String> = JsonMissing.of()
                private var contact: JsonField<String> = JsonMissing.of()
                private var pricing: JsonField<String> = JsonMissing.of()
                private var privacy: JsonField<String> = JsonMissing.of()
                private var terms: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(links: Links) = apply {
                    blog = links.blog
                    careers = links.careers
                    contact = links.contact
                    pricing = links.pricing
                    privacy = links.privacy
                    terms = links.terms
                    additionalProperties = links.additionalProperties.toMutableMap()
                }

                /** URL to the brand's blog or news page */
                fun blog(blog: String?) = blog(JsonField.ofNullable(blog))

                /** Alias for calling [Builder.blog] with `blog.orElse(null)`. */
                fun blog(blog: Optional<String>) = blog(blog.getOrNull())

                /**
                 * Sets [Builder.blog] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blog] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun blog(blog: JsonField<String>) = apply { this.blog = blog }

                /** URL to the brand's careers or job opportunities page */
                fun careers(careers: String?) = careers(JsonField.ofNullable(careers))

                /** Alias for calling [Builder.careers] with `careers.orElse(null)`. */
                fun careers(careers: Optional<String>) = careers(careers.getOrNull())

                /**
                 * Sets [Builder.careers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.careers] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun careers(careers: JsonField<String>) = apply { this.careers = careers }

                /** URL to the brand's contact or contact us page */
                fun contact(contact: String?) = contact(JsonField.ofNullable(contact))

                /** Alias for calling [Builder.contact] with `contact.orElse(null)`. */
                fun contact(contact: Optional<String>) = contact(contact.getOrNull())

                /**
                 * Sets [Builder.contact] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contact] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contact(contact: JsonField<String>) = apply { this.contact = contact }

                /** URL to the brand's pricing or plans page */
                fun pricing(pricing: String?) = pricing(JsonField.ofNullable(pricing))

                /** Alias for calling [Builder.pricing] with `pricing.orElse(null)`. */
                fun pricing(pricing: Optional<String>) = pricing(pricing.getOrNull())

                /**
                 * Sets [Builder.pricing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pricing] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pricing(pricing: JsonField<String>) = apply { this.pricing = pricing }

                /** URL to the brand's privacy policy page */
                fun privacy(privacy: String?) = privacy(JsonField.ofNullable(privacy))

                /** Alias for calling [Builder.privacy] with `privacy.orElse(null)`. */
                fun privacy(privacy: Optional<String>) = privacy(privacy.getOrNull())

                /**
                 * Sets [Builder.privacy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.privacy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun privacy(privacy: JsonField<String>) = apply { this.privacy = privacy }

                /** URL to the brand's terms of service or terms and conditions page */
                fun terms(terms: String?) = terms(JsonField.ofNullable(terms))

                /** Alias for calling [Builder.terms] with `terms.orElse(null)`. */
                fun terms(terms: Optional<String>) = terms(terms.getOrNull())

                /**
                 * Sets [Builder.terms] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.terms] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun terms(terms: JsonField<String>) = apply { this.terms = terms }

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
                 * Returns an immutable instance of [Links].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Links =
                    Links(
                        blog,
                        careers,
                        contact,
                        pricing,
                        privacy,
                        terms,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Links = apply {
                if (validated) {
                    return@apply
                }

                blog()
                careers()
                contact()
                pricing()
                privacy()
                terms()
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
                (if (blog.asKnown().isPresent) 1 else 0) +
                    (if (careers.asKnown().isPresent) 1 else 0) +
                    (if (contact.asKnown().isPresent) 1 else 0) +
                    (if (pricing.asKnown().isPresent) 1 else 0) +
                    (if (privacy.asKnown().isPresent) 1 else 0) +
                    (if (terms.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Links &&
                    blog == other.blog &&
                    careers == other.careers &&
                    contact == other.contact &&
                    pricing == other.pricing &&
                    privacy == other.privacy &&
                    terms == other.terms &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(blog, careers, contact, pricing, privacy, terms, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Links{blog=$blog, careers=$careers, contact=$contact, pricing=$pricing, privacy=$privacy, terms=$terms, additionalProperties=$additionalProperties}"
        }

        class Logo
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val colors: JsonField<List<Color>>,
            private val mode: JsonField<Mode>,
            private val resolution: JsonField<Resolution>,
            private val type: JsonField<Type>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("colors")
                @ExcludeMissing
                colors: JsonField<List<Color>> = JsonMissing.of(),
                @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
                @JsonProperty("resolution")
                @ExcludeMissing
                resolution: JsonField<Resolution> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(colors, mode, resolution, type, url, mutableMapOf())

            /**
             * Array of colors in the logo
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun colors(): Optional<List<Color>> = colors.getOptional("colors")

            /**
             * Indicates when this logo is best used: 'light' = best for light mode, 'dark' = best
             * for dark mode, 'has_opaque_background' = can be used for either as image has its own
             * background
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun mode(): Optional<Mode> = mode.getOptional("mode")

            /**
             * Resolution of the logo image
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun resolution(): Optional<Resolution> = resolution.getOptional("resolution")

            /**
             * Type of the logo based on resolution (e.g., 'icon', 'logo')
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * CDN hosted url of the logo (ready for display)
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [colors].
             *
             * Unlike [colors], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("colors") @ExcludeMissing fun _colors(): JsonField<List<Color>> = colors

            /**
             * Returns the raw JSON value of [mode].
             *
             * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

            /**
             * Returns the raw JSON value of [resolution].
             *
             * Unlike [resolution], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("resolution")
            @ExcludeMissing
            fun _resolution(): JsonField<Resolution> = resolution

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

                /** Returns a mutable builder for constructing an instance of [Logo]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Logo]. */
            class Builder internal constructor() {

                private var colors: JsonField<MutableList<Color>>? = null
                private var mode: JsonField<Mode> = JsonMissing.of()
                private var resolution: JsonField<Resolution> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(logo: Logo) = apply {
                    colors = logo.colors.map { it.toMutableList() }
                    mode = logo.mode
                    resolution = logo.resolution
                    type = logo.type
                    url = logo.url
                    additionalProperties = logo.additionalProperties.toMutableMap()
                }

                /** Array of colors in the logo */
                fun colors(colors: List<Color>) = colors(JsonField.of(colors))

                /**
                 * Sets [Builder.colors] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.colors] with a well-typed `List<Color>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun colors(colors: JsonField<List<Color>>) = apply {
                    this.colors = colors.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Color] to [colors].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addColor(color: Color) = apply {
                    colors =
                        (colors ?: JsonField.of(mutableListOf())).also {
                            checkKnown("colors", it).add(color)
                        }
                }

                /**
                 * Indicates when this logo is best used: 'light' = best for light mode, 'dark' =
                 * best for dark mode, 'has_opaque_background' = can be used for either as image has
                 * its own background
                 */
                fun mode(mode: Mode) = mode(JsonField.of(mode))

                /**
                 * Sets [Builder.mode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mode] with a well-typed [Mode] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                /** Resolution of the logo image */
                fun resolution(resolution: Resolution) = resolution(JsonField.of(resolution))

                /**
                 * Sets [Builder.resolution] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resolution] with a well-typed [Resolution] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun resolution(resolution: JsonField<Resolution>) = apply {
                    this.resolution = resolution
                }

                /** Type of the logo based on resolution (e.g., 'icon', 'logo') */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** CDN hosted url of the logo (ready for display) */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [Logo].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Logo =
                    Logo(
                        (colors ?: JsonMissing.of()).map { it.toImmutable() },
                        mode,
                        resolution,
                        type,
                        url,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Logo = apply {
                if (validated) {
                    return@apply
                }

                colors().ifPresent { it.forEach { it.validate() } }
                mode().ifPresent { it.validate() }
                resolution().ifPresent { it.validate() }
                type().ifPresent { it.validate() }
                url()
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
                (colors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (mode.asKnown().getOrNull()?.validity() ?: 0) +
                    (resolution.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (url.asKnown().isPresent) 1 else 0)

            class Color
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val hex: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("hex") @ExcludeMissing hex: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                ) : this(hex, name, mutableMapOf())

                /**
                 * Color in hexadecimal format
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun hex(): Optional<String> = hex.getOptional("hex")

                /**
                 * Name of the color
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Returns the raw JSON value of [hex].
                 *
                 * Unlike [hex], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("hex") @ExcludeMissing fun _hex(): JsonField<String> = hex

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                    /** Returns a mutable builder for constructing an instance of [Color]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Color]. */
                class Builder internal constructor() {

                    private var hex: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(color: Color) = apply {
                        hex = color.hex
                        name = color.name
                        additionalProperties = color.additionalProperties.toMutableMap()
                    }

                    /** Color in hexadecimal format */
                    fun hex(hex: String) = hex(JsonField.of(hex))

                    /**
                     * Sets [Builder.hex] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.hex] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun hex(hex: JsonField<String>) = apply { this.hex = hex }

                    /** Name of the color */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

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
                     * Returns an immutable instance of [Color].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Color = Color(hex, name, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Color = apply {
                    if (validated) {
                        return@apply
                    }

                    hex()
                    name()
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
                    (if (hex.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Color &&
                        hex == other.hex &&
                        name == other.name &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(hex, name, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Color{hex=$hex, name=$name, additionalProperties=$additionalProperties}"
            }

            /**
             * Indicates when this logo is best used: 'light' = best for light mode, 'dark' = best
             * for dark mode, 'has_opaque_background' = can be used for either as image has its own
             * background
             */
            class Mode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LIGHT = of("light")

                    @JvmField val DARK = of("dark")

                    @JvmField val HAS_OPAQUE_BACKGROUND = of("has_opaque_background")

                    @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
                }

                /** An enum containing [Mode]'s known values. */
                enum class Known {
                    LIGHT,
                    DARK,
                    HAS_OPAQUE_BACKGROUND,
                }

                /**
                 * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Mode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LIGHT,
                    DARK,
                    HAS_OPAQUE_BACKGROUND,
                    /**
                     * An enum member indicating that [Mode] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        LIGHT -> Value.LIGHT
                        DARK -> Value.DARK
                        HAS_OPAQUE_BACKGROUND -> Value.HAS_OPAQUE_BACKGROUND
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BrandDevInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        LIGHT -> Known.LIGHT
                        DARK -> Known.DARK
                        HAS_OPAQUE_BACKGROUND -> Known.HAS_OPAQUE_BACKGROUND
                        else -> throw BrandDevInvalidDataException("Unknown Mode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BrandDevInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BrandDevInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Mode = apply {
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

                    return other is Mode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Resolution of the logo image */
            class Resolution
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val aspectRatio: JsonField<Double>,
                private val height: JsonField<Long>,
                private val width: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("aspect_ratio")
                    @ExcludeMissing
                    aspectRatio: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("height")
                    @ExcludeMissing
                    height: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
                ) : this(aspectRatio, height, width, mutableMapOf())

                /**
                 * Aspect ratio of the image (width/height)
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun aspectRatio(): Optional<Double> = aspectRatio.getOptional("aspect_ratio")

                /**
                 * Height of the image in pixels
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun height(): Optional<Long> = height.getOptional("height")

                /**
                 * Width of the image in pixels
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun width(): Optional<Long> = width.getOptional("width")

                /**
                 * Returns the raw JSON value of [aspectRatio].
                 *
                 * Unlike [aspectRatio], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("aspect_ratio")
                @ExcludeMissing
                fun _aspectRatio(): JsonField<Double> = aspectRatio

                /**
                 * Returns the raw JSON value of [height].
                 *
                 * Unlike [height], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Long> = height

                /**
                 * Returns the raw JSON value of [width].
                 *
                 * Unlike [width], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Long> = width

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

                    /** Returns a mutable builder for constructing an instance of [Resolution]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Resolution]. */
                class Builder internal constructor() {

                    private var aspectRatio: JsonField<Double> = JsonMissing.of()
                    private var height: JsonField<Long> = JsonMissing.of()
                    private var width: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(resolution: Resolution) = apply {
                        aspectRatio = resolution.aspectRatio
                        height = resolution.height
                        width = resolution.width
                        additionalProperties = resolution.additionalProperties.toMutableMap()
                    }

                    /** Aspect ratio of the image (width/height) */
                    fun aspectRatio(aspectRatio: Double) = aspectRatio(JsonField.of(aspectRatio))

                    /**
                     * Sets [Builder.aspectRatio] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.aspectRatio] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun aspectRatio(aspectRatio: JsonField<Double>) = apply {
                        this.aspectRatio = aspectRatio
                    }

                    /** Height of the image in pixels */
                    fun height(height: Long) = height(JsonField.of(height))

                    /**
                     * Sets [Builder.height] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.height] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun height(height: JsonField<Long>) = apply { this.height = height }

                    /** Width of the image in pixels */
                    fun width(width: Long) = width(JsonField.of(width))

                    /**
                     * Sets [Builder.width] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.width] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun width(width: JsonField<Long>) = apply { this.width = width }

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
                     * Returns an immutable instance of [Resolution].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Resolution =
                        Resolution(aspectRatio, height, width, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Resolution = apply {
                    if (validated) {
                        return@apply
                    }

                    aspectRatio()
                    height()
                    width()
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
                    (if (aspectRatio.asKnown().isPresent) 1 else 0) +
                        (if (height.asKnown().isPresent) 1 else 0) +
                        (if (width.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Resolution &&
                        aspectRatio == other.aspectRatio &&
                        height == other.height &&
                        width == other.width &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(aspectRatio, height, width, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Resolution{aspectRatio=$aspectRatio, height=$height, width=$width, additionalProperties=$additionalProperties}"
            }

            /** Type of the logo based on resolution (e.g., 'icon', 'logo') */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ICON = of("icon")

                    @JvmField val LOGO = of("logo")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    ICON,
                    LOGO,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ICON,
                    LOGO,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ICON -> Value.ICON
                        LOGO -> Value.LOGO
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BrandDevInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ICON -> Known.ICON
                        LOGO -> Known.LOGO
                        else -> throw BrandDevInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BrandDevInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BrandDevInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Logo &&
                    colors == other.colors &&
                    mode == other.mode &&
                    resolution == other.resolution &&
                    type == other.type &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(colors, mode, resolution, type, url, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Logo{colors=$colors, mode=$mode, resolution=$resolution, type=$type, url=$url, additionalProperties=$additionalProperties}"
        }

        class Social
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<String>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(type, url, mutableMapOf())

            /**
             * Type of social media, e.g., 'facebook', 'twitter'
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * URL of the social media page
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

                /** Returns a mutable builder for constructing an instance of [Social]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Social]. */
            class Builder internal constructor() {

                private var type: JsonField<String> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(social: Social) = apply {
                    type = social.type
                    url = social.url
                    additionalProperties = social.additionalProperties.toMutableMap()
                }

                /** Type of social media, e.g., 'facebook', 'twitter' */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

                /** URL of the social media page */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [Social].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Social = Social(type, url, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Social = apply {
                if (validated) {
                    return@apply
                }

                type()
                url()
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
                (if (type.asKnown().isPresent) 1 else 0) + (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Social &&
                    type == other.type &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, url, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Social{type=$type, url=$url, additionalProperties=$additionalProperties}"
        }

        /**
         * Stock market information for this brand (will be null if not a publicly traded company)
         */
        class Stock
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val exchange: JsonField<String>,
            private val ticker: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("exchange")
                @ExcludeMissing
                exchange: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ticker") @ExcludeMissing ticker: JsonField<String> = JsonMissing.of(),
            ) : this(exchange, ticker, mutableMapOf())

            /**
             * Stock exchange name
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun exchange(): Optional<String> = exchange.getOptional("exchange")

            /**
             * Stock ticker symbol
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun ticker(): Optional<String> = ticker.getOptional("ticker")

            /**
             * Returns the raw JSON value of [exchange].
             *
             * Unlike [exchange], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("exchange") @ExcludeMissing fun _exchange(): JsonField<String> = exchange

            /**
             * Returns the raw JSON value of [ticker].
             *
             * Unlike [ticker], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ticker") @ExcludeMissing fun _ticker(): JsonField<String> = ticker

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

                /** Returns a mutable builder for constructing an instance of [Stock]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Stock]. */
            class Builder internal constructor() {

                private var exchange: JsonField<String> = JsonMissing.of()
                private var ticker: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(stock: Stock) = apply {
                    exchange = stock.exchange
                    ticker = stock.ticker
                    additionalProperties = stock.additionalProperties.toMutableMap()
                }

                /** Stock exchange name */
                fun exchange(exchange: String) = exchange(JsonField.of(exchange))

                /**
                 * Sets [Builder.exchange] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.exchange] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun exchange(exchange: JsonField<String>) = apply { this.exchange = exchange }

                /** Stock ticker symbol */
                fun ticker(ticker: String) = ticker(JsonField.of(ticker))

                /**
                 * Sets [Builder.ticker] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ticker] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ticker(ticker: JsonField<String>) = apply { this.ticker = ticker }

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
                 * Returns an immutable instance of [Stock].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Stock = Stock(exchange, ticker, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Stock = apply {
                if (validated) {
                    return@apply
                }

                exchange()
                ticker()
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
                (if (exchange.asKnown().isPresent) 1 else 0) +
                    (if (ticker.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Stock &&
                    exchange == other.exchange &&
                    ticker == other.ticker &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(exchange, ticker, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Stock{exchange=$exchange, ticker=$ticker, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Brand &&
                address == other.address &&
                backdrops == other.backdrops &&
                colors == other.colors &&
                description == other.description &&
                domain == other.domain &&
                email == other.email &&
                industries == other.industries &&
                isNsfw == other.isNsfw &&
                links == other.links &&
                logos == other.logos &&
                phone == other.phone &&
                slogan == other.slogan &&
                socials == other.socials &&
                stock == other.stock &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                backdrops,
                colors,
                description,
                domain,
                email,
                industries,
                isNsfw,
                links,
                logos,
                phone,
                slogan,
                socials,
                stock,
                title,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Brand{address=$address, backdrops=$backdrops, colors=$colors, description=$description, domain=$domain, email=$email, industries=$industries, isNsfw=$isNsfw, links=$links, logos=$logos, phone=$phone, slogan=$slogan, socials=$socials, stock=$stock, title=$title, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandRetrieveByEmailResponse &&
            brand == other.brand &&
            code == other.code &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(brand, code, status, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandRetrieveByEmailResponse{brand=$brand, code=$code, status=$status, additionalProperties=$additionalProperties}"
}
