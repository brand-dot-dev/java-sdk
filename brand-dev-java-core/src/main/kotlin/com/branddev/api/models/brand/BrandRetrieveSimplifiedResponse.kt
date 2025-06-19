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

class BrandRetrieveSimplifiedResponse
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
     * Simplified brand information
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brand(): Optional<Brand> = brand.getOptional("brand")

    /**
     * HTTP status code of the response
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
         * Returns a mutable builder for constructing an instance of
         * [BrandRetrieveSimplifiedResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandRetrieveSimplifiedResponse]. */
    class Builder internal constructor() {

        private var brand: JsonField<Brand> = JsonMissing.of()
        private var code: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandRetrieveSimplifiedResponse: BrandRetrieveSimplifiedResponse) =
            apply {
                brand = brandRetrieveSimplifiedResponse.brand
                code = brandRetrieveSimplifiedResponse.code
                status = brandRetrieveSimplifiedResponse.status
                additionalProperties =
                    brandRetrieveSimplifiedResponse.additionalProperties.toMutableMap()
            }

        /** Simplified brand information */
        fun brand(brand: Brand) = brand(JsonField.of(brand))

        /**
         * Sets [Builder.brand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brand] with a well-typed [Brand] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brand(brand: JsonField<Brand>) = apply { this.brand = brand }

        /** HTTP status code of the response */
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
         * Returns an immutable instance of [BrandRetrieveSimplifiedResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandRetrieveSimplifiedResponse =
            BrandRetrieveSimplifiedResponse(
                brand,
                code,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandRetrieveSimplifiedResponse = apply {
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

    /** Simplified brand information */
    class Brand
    private constructor(
        private val backdrops: JsonField<List<Backdrop>>,
        private val colors: JsonField<List<Color>>,
        private val domain: JsonField<String>,
        private val logos: JsonField<List<Logo>>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("backdrops")
            @ExcludeMissing
            backdrops: JsonField<List<Backdrop>> = JsonMissing.of(),
            @JsonProperty("colors")
            @ExcludeMissing
            colors: JsonField<List<Color>> = JsonMissing.of(),
            @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("logos") @ExcludeMissing logos: JsonField<List<Logo>> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(backdrops, colors, domain, logos, title, mutableMapOf())

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
         * The domain name of the brand
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun domain(): Optional<String> = domain.getOptional("domain")

        /**
         * An array of logos associated with the brand
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun logos(): Optional<List<Logo>> = logos.getOptional("logos")

        /**
         * The title or name of the brand
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

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
         * Returns the raw JSON value of [domain].
         *
         * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

        /**
         * Returns the raw JSON value of [logos].
         *
         * Unlike [logos], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logos") @ExcludeMissing fun _logos(): JsonField<List<Logo>> = logos

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

            private var backdrops: JsonField<MutableList<Backdrop>>? = null
            private var colors: JsonField<MutableList<Color>>? = null
            private var domain: JsonField<String> = JsonMissing.of()
            private var logos: JsonField<MutableList<Logo>>? = null
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(brand: Brand) = apply {
                backdrops = brand.backdrops.map { it.toMutableList() }
                colors = brand.colors.map { it.toMutableList() }
                domain = brand.domain
                logos = brand.logos.map { it.toMutableList() }
                title = brand.title
                additionalProperties = brand.additionalProperties.toMutableMap()
            }

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
                    (backdrops ?: JsonMissing.of()).map { it.toImmutable() },
                    (colors ?: JsonMissing.of()).map { it.toImmutable() },
                    domain,
                    (logos ?: JsonMissing.of()).map { it.toImmutable() },
                    title,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Brand = apply {
            if (validated) {
                return@apply
            }

            backdrops().ifPresent { it.forEach { it.validate() } }
            colors().ifPresent { it.forEach { it.validate() } }
            domain()
            logos().ifPresent { it.forEach { it.validate() } }
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
            (backdrops.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (colors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (domain.asKnown().isPresent) 1 else 0) +
                (logos.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (title.asKnown().isPresent) 1 else 0)

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

                    return /* spotless:off */ other is Resolution && aspectRatio == other.aspectRatio && height == other.height && width == other.width && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(aspectRatio, height, width, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Resolution{aspectRatio=$aspectRatio, height=$height, width=$width, additionalProperties=$additionalProperties}"
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

        class Logo
        private constructor(
            private val colors: JsonField<List<Color>>,
            private val group: JsonField<Long>,
            private val mode: JsonField<String>,
            private val resolution: JsonField<Resolution>,
            private val type: JsonField<String>,
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
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(colors, group, mode, resolution, type, url, mutableMapOf())

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
             * Type of the logo based on resolution (e.g., 'icon', 'logo', 'banner')
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

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

                /** Returns a mutable builder for constructing an instance of [Logo]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Logo]. */
            class Builder internal constructor() {

                private var colors: JsonField<MutableList<Color>>? = null
                private var group: JsonField<Long> = JsonMissing.of()
                private var mode: JsonField<String> = JsonMissing.of()
                private var resolution: JsonField<Resolution> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(logo: Logo) = apply {
                    colors = logo.colors.map { it.toMutableList() }
                    group = logo.group
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

                /** Type of the logo based on resolution (e.g., 'icon', 'logo', 'banner') */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                group()
                mode()
                resolution().ifPresent { it.validate() }
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
                (colors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (group.asKnown().isPresent) 1 else 0) +
                    (if (mode.asKnown().isPresent) 1 else 0) +
                    (resolution.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (type.asKnown().isPresent) 1 else 0) +
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

                    return /* spotless:off */ other is Resolution && aspectRatio == other.aspectRatio && height == other.height && width == other.width && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(aspectRatio, height, width, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Resolution{aspectRatio=$aspectRatio, height=$height, width=$width, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Logo && colors == other.colors && group == other.group && mode == other.mode && resolution == other.resolution && type == other.type && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(colors, group, mode, resolution, type, url, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Logo{colors=$colors, group=$group, mode=$mode, resolution=$resolution, type=$type, url=$url, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Brand && backdrops == other.backdrops && colors == other.colors && domain == other.domain && logos == other.logos && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(backdrops, colors, domain, logos, title, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Brand{backdrops=$backdrops, colors=$colors, domain=$domain, logos=$logos, title=$title, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BrandRetrieveSimplifiedResponse && brand == other.brand && code == other.code && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(brand, code, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandRetrieveSimplifiedResponse{brand=$brand, code=$code, status=$status, additionalProperties=$additionalProperties}"
}
