// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.ExcludeMissing
import com.branddev.api.core.JsonField
import com.branddev.api.core.JsonMissing
import com.branddev.api.core.JsonValue
import com.branddev.api.core.checkKnown
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

class BrandRetrieveResponse
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

        /** Returns a mutable builder for constructing an instance of [BrandRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandRetrieveResponse]. */
    class Builder internal constructor() {

        private var brand: JsonField<Brand> = JsonMissing.of()
        private var code: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandRetrieveResponse: BrandRetrieveResponse) = apply {
            brand = brandRetrieveResponse.brand
            code = brandRetrieveResponse.code
            status = brandRetrieveResponse.status
            additionalProperties = brandRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [BrandRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandRetrieveResponse =
            BrandRetrieveResponse(brand, code, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): BrandRetrieveResponse = apply {
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
    private constructor(
        private val address: JsonField<Address>,
        private val backdrops: JsonField<List<Backdrop>>,
        private val colors: JsonField<List<Color>>,
        private val description: JsonField<String>,
        private val domain: JsonField<String>,
        private val fonts: JsonField<List<Font>>,
        private val logos: JsonField<List<Logo>>,
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
            @JsonProperty("fonts") @ExcludeMissing fonts: JsonField<List<Font>> = JsonMissing.of(),
            @JsonProperty("logos") @ExcludeMissing logos: JsonField<List<Logo>> = JsonMissing.of(),
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
            fonts,
            logos,
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
         * An array of fonts used by the brand's website
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fonts(): Optional<List<Font>> = fonts.getOptional("fonts")

        /**
         * An array of logos associated with the brand
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun logos(): Optional<List<Logo>> = logos.getOptional("logos")

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
         * Returns the raw JSON value of [fonts].
         *
         * Unlike [fonts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fonts") @ExcludeMissing fun _fonts(): JsonField<List<Font>> = fonts

        /**
         * Returns the raw JSON value of [logos].
         *
         * Unlike [logos], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logos") @ExcludeMissing fun _logos(): JsonField<List<Logo>> = logos

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
            private var fonts: JsonField<MutableList<Font>>? = null
            private var logos: JsonField<MutableList<Logo>>? = null
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
                fonts = brand.fonts.map { it.toMutableList() }
                logos = brand.logos.map { it.toMutableList() }
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

            /** An array of fonts used by the brand's website */
            fun fonts(fonts: List<Font>) = fonts(JsonField.of(fonts))

            /**
             * Sets [Builder.fonts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fonts] with a well-typed `List<Font>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fonts(fonts: JsonField<List<Font>>) = apply {
                this.fonts = fonts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Font] to [fonts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFont(font: Font) = apply {
                fonts =
                    (fonts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fonts", it).add(font)
                    }
            }

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
                    (fonts ?: JsonMissing.of()).map { it.toImmutable() },
                    (logos ?: JsonMissing.of()).map { it.toImmutable() },
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
            fonts().ifPresent { it.forEach { it.validate() } }
            logos().ifPresent { it.forEach { it.validate() } }
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
                (fonts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (logos.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (slogan.asKnown().isPresent) 1 else 0) +
                (socials.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (stock.asKnown().getOrNull()?.validity() ?: 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        /** Physical address of the brand */
        class Address
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

                return /* spotless:off */ other is Address && city == other.city && country == other.country && countryCode == other.countryCode && postalCode == other.postalCode && stateCode == other.stateCode && stateProvince == other.stateProvince && street == other.street && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, country, countryCode, postalCode, stateCode, stateProvince, street, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, country=$country, countryCode=$countryCode, postalCode=$postalCode, stateCode=$stateCode, stateProvince=$stateProvince, street=$street, additionalProperties=$additionalProperties}"
        }

        class Backdrop
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

                    return /* spotless:off */ other is Color && hex == other.hex && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(hex, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Color{hex=$hex, name=$name, additionalProperties=$additionalProperties}"
            }

            /** Resolution of the backdrop image */
            class Resolution
            private constructor(
                private val height: JsonField<Long>,
                private val width: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("height")
                    @ExcludeMissing
                    height: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
                ) : this(height, width, mutableMapOf())

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

                    private var height: JsonField<Long> = JsonMissing.of()
                    private var width: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(resolution: Resolution) = apply {
                        height = resolution.height
                        width = resolution.width
                        additionalProperties = resolution.additionalProperties.toMutableMap()
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
                        Resolution(height, width, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Resolution = apply {
                    if (validated) {
                        return@apply
                    }

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
                    (if (height.asKnown().isPresent) 1 else 0) +
                        (if (width.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Resolution && height == other.height && width == other.width && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(height, width, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Resolution{height=$height, width=$width, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Backdrop && colors == other.colors && resolution == other.resolution && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(colors, resolution, url, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Backdrop{colors=$colors, resolution=$resolution, url=$url, additionalProperties=$additionalProperties}"
        }

        class Color
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

                return /* spotless:off */ other is Color && hex == other.hex && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(hex, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Color{hex=$hex, name=$name, additionalProperties=$additionalProperties}"
        }

        class Font
        private constructor(
            private val name: JsonField<String>,
            private val usage: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("usage") @ExcludeMissing usage: JsonField<String> = JsonMissing.of(),
            ) : this(name, usage, mutableMapOf())

            /**
             * Name of the font
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Usage of the font, e.g., 'title', 'body', 'button'
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun usage(): Optional<String> = usage.getOptional("usage")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [usage].
             *
             * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<String> = usage

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

                /** Returns a mutable builder for constructing an instance of [Font]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Font]. */
            class Builder internal constructor() {

                private var name: JsonField<String> = JsonMissing.of()
                private var usage: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(font: Font) = apply {
                    name = font.name
                    usage = font.usage
                    additionalProperties = font.additionalProperties.toMutableMap()
                }

                /** Name of the font */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Usage of the font, e.g., 'title', 'body', 'button' */
                fun usage(usage: String) = usage(JsonField.of(usage))

                /**
                 * Sets [Builder.usage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usage] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun usage(usage: JsonField<String>) = apply { this.usage = usage }

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
                 * Returns an immutable instance of [Font].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Font = Font(name, usage, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Font = apply {
                if (validated) {
                    return@apply
                }

                name()
                usage()
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
                (if (name.asKnown().isPresent) 1 else 0) + (if (usage.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Font && name == other.name && usage == other.usage && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, usage, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Font{name=$name, usage=$usage, additionalProperties=$additionalProperties}"
        }

        class Logo
        private constructor(
            private val colors: JsonField<List<Color>>,
            private val group: JsonField<Long>,
            private val mode: JsonField<String>,
            private val resolution: JsonField<Resolution>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("colors")
                @ExcludeMissing
                colors: JsonField<List<Color>> = JsonMissing.of(),
                @JsonProperty("group") @ExcludeMissing group: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("mode") @ExcludeMissing mode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("resolution")
                @ExcludeMissing
                resolution: JsonField<Resolution> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(colors, group, mode, resolution, url, mutableMapOf())

            /**
             * Array of colors in the logo
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun colors(): Optional<List<Color>> = colors.getOptional("colors")

            /**
             * Group identifier for logos
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun group(): Optional<Long> = group.getOptional("group")

            /**
             * Mode of the logo, e.g., 'dark', 'light'
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun mode(): Optional<String> = mode.getOptional("mode")

            /**
             * Resolution of the logo image
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun resolution(): Optional<Resolution> = resolution.getOptional("resolution")

            /**
             * URL of the logo image
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
             * Returns the raw JSON value of [group].
             *
             * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<Long> = group

            /**
             * Returns the raw JSON value of [mode].
             *
             * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<String> = mode

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

                /** Returns a mutable builder for constructing an instance of [Logo]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Logo]. */
            class Builder internal constructor() {

                private var colors: JsonField<MutableList<Color>>? = null
                private var group: JsonField<Long> = JsonMissing.of()
                private var mode: JsonField<String> = JsonMissing.of()
                private var resolution: JsonField<Resolution> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(logo: Logo) = apply {
                    colors = logo.colors.map { it.toMutableList() }
                    group = logo.group
                    mode = logo.mode
                    resolution = logo.resolution
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

                /** Group identifier for logos */
                fun group(group: Long) = group(JsonField.of(group))

                /**
                 * Sets [Builder.group] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.group] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun group(group: JsonField<Long>) = apply { this.group = group }

                /** Mode of the logo, e.g., 'dark', 'light' */
                fun mode(mode: String) = mode(JsonField.of(mode))

                /**
                 * Sets [Builder.mode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mode] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mode(mode: JsonField<String>) = apply { this.mode = mode }

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

                /** URL of the logo image */
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
                        group,
                        mode,
                        resolution,
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
                group()
                mode()
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
                    (if (group.asKnown().isPresent) 1 else 0) +
                    (if (mode.asKnown().isPresent) 1 else 0) +
                    (resolution.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (url.asKnown().isPresent) 1 else 0)

            class Color
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

                    return /* spotless:off */ other is Color && hex == other.hex && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(hex, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Color{hex=$hex, name=$name, additionalProperties=$additionalProperties}"
            }

            /** Resolution of the logo image */
            class Resolution
            private constructor(
                private val height: JsonField<Long>,
                private val width: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("height")
                    @ExcludeMissing
                    height: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
                ) : this(height, width, mutableMapOf())

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

                    private var height: JsonField<Long> = JsonMissing.of()
                    private var width: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(resolution: Resolution) = apply {
                        height = resolution.height
                        width = resolution.width
                        additionalProperties = resolution.additionalProperties.toMutableMap()
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
                        Resolution(height, width, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Resolution = apply {
                    if (validated) {
                        return@apply
                    }

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
                    (if (height.asKnown().isPresent) 1 else 0) +
                        (if (width.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Resolution && height == other.height && width == other.width && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(height, width, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Resolution{height=$height, width=$width, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Logo && colors == other.colors && group == other.group && mode == other.mode && resolution == other.resolution && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(colors, group, mode, resolution, url, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Logo{colors=$colors, group=$group, mode=$mode, resolution=$resolution, url=$url, additionalProperties=$additionalProperties}"
        }

        class Social
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

                return /* spotless:off */ other is Social && type == other.type && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, url, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Social{type=$type, url=$url, additionalProperties=$additionalProperties}"
        }

        /**
         * Stock market information for this brand (will be null if not a publicly traded company)
         */
        class Stock
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

                return /* spotless:off */ other is Stock && exchange == other.exchange && ticker == other.ticker && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(exchange, ticker, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Stock{exchange=$exchange, ticker=$ticker, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Brand && address == other.address && backdrops == other.backdrops && colors == other.colors && description == other.description && domain == other.domain && fonts == other.fonts && logos == other.logos && slogan == other.slogan && socials == other.socials && stock == other.stock && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, backdrops, colors, description, domain, fonts, logos, slogan, socials, stock, title, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Brand{address=$address, backdrops=$backdrops, colors=$colors, description=$description, domain=$domain, fonts=$fonts, logos=$logos, slogan=$slogan, socials=$socials, stock=$stock, title=$title, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BrandRetrieveResponse && brand == other.brand && code == other.code && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(brand, code, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandRetrieveResponse{brand=$brand, code=$code, status=$status, additionalProperties=$additionalProperties}"
}
