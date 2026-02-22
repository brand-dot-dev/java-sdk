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

class BrandAiProductsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val products: JsonField<List<Product>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("products")
        @ExcludeMissing
        products: JsonField<List<Product>> = JsonMissing.of()
    ) : this(products, mutableMapOf())

    /**
     * Array of products extracted from the website
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun products(): Optional<List<Product>> = products.getOptional("products")

    /**
     * Returns the raw JSON value of [products].
     *
     * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("products") @ExcludeMissing fun _products(): JsonField<List<Product>> = products

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

        /** Returns a mutable builder for constructing an instance of [BrandAiProductsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandAiProductsResponse]. */
    class Builder internal constructor() {

        private var products: JsonField<MutableList<Product>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandAiProductsResponse: BrandAiProductsResponse) = apply {
            products = brandAiProductsResponse.products.map { it.toMutableList() }
            additionalProperties = brandAiProductsResponse.additionalProperties.toMutableMap()
        }

        /** Array of products extracted from the website */
        fun products(products: List<Product>) = products(JsonField.of(products))

        /**
         * Sets [Builder.products] to an arbitrary JSON value.
         *
         * You should usually call [Builder.products] with a well-typed `List<Product>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun products(products: JsonField<List<Product>>) = apply {
            this.products = products.map { it.toMutableList() }
        }

        /**
         * Adds a single [Product] to [products].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProduct(product: Product) = apply {
            products =
                (products ?: JsonField.of(mutableListOf())).also {
                    checkKnown("products", it).add(product)
                }
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
         * Returns an immutable instance of [BrandAiProductsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandAiProductsResponse =
            BrandAiProductsResponse(
                (products ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandAiProductsResponse = apply {
        if (validated) {
            return@apply
        }

        products().ifPresent { it.forEach { it.validate() } }
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
        (products.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Product
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<String>,
        private val features: JsonField<List<String>>,
        private val images: JsonField<List<String>>,
        private val name: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val targetAudience: JsonField<List<String>>,
        private val billingFrequency: JsonField<BillingFrequency>,
        private val category: JsonField<String>,
        private val currency: JsonField<String>,
        private val imageUrl: JsonField<String>,
        private val price: JsonField<Double>,
        private val pricingModel: JsonField<PricingModel>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("features")
            @ExcludeMissing
            features: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("images")
            @ExcludeMissing
            images: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("target_audience")
            @ExcludeMissing
            targetAudience: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("billing_frequency")
            @ExcludeMissing
            billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("image_url")
            @ExcludeMissing
            imageUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("pricing_model")
            @ExcludeMissing
            pricingModel: JsonField<PricingModel> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(
            description,
            features,
            images,
            name,
            tags,
            targetAudience,
            billingFrequency,
            category,
            currency,
            imageUrl,
            price,
            pricingModel,
            url,
            mutableMapOf(),
        )

        /**
         * Description of the product
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * List of product features
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun features(): List<String> = features.getRequired("features")

        /**
         * URLs to product images on the page (up to 7)
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun images(): List<String> = images.getRequired("images")

        /**
         * Name of the product
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Tags associated with the product
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tags(): List<String> = tags.getRequired("tags")

        /**
         * Target audience for the product (array of strings)
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetAudience(): List<String> = targetAudience.getRequired("target_audience")

        /**
         * Billing frequency for the product
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun billingFrequency(): Optional<BillingFrequency> =
            billingFrequency.getOptional("billing_frequency")

        /**
         * Category of the product
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun category(): Optional<String> = category.getOptional("category")

        /**
         * Currency code for the price (e.g., USD, EUR)
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * URL to the product image
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun imageUrl(): Optional<String> = imageUrl.getOptional("image_url")

        /**
         * Price of the product
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun price(): Optional<Double> = price.getOptional("price")

        /**
         * Pricing model for the product
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pricingModel(): Optional<PricingModel> = pricingModel.getOptional("pricing_model")

        /**
         * URL to the product page
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [features].
         *
         * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("features")
        @ExcludeMissing
        fun _features(): JsonField<List<String>> = features

        /**
         * Returns the raw JSON value of [images].
         *
         * Unlike [images], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("images") @ExcludeMissing fun _images(): JsonField<List<String>> = images

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [targetAudience].
         *
         * Unlike [targetAudience], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("target_audience")
        @ExcludeMissing
        fun _targetAudience(): JsonField<List<String>> = targetAudience

        /**
         * Returns the raw JSON value of [billingFrequency].
         *
         * Unlike [billingFrequency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_frequency")
        @ExcludeMissing
        fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [imageUrl].
         *
         * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image_url") @ExcludeMissing fun _imageUrl(): JsonField<String> = imageUrl

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

        /**
         * Returns the raw JSON value of [pricingModel].
         *
         * Unlike [pricingModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pricing_model")
        @ExcludeMissing
        fun _pricingModel(): JsonField<PricingModel> = pricingModel

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

            /**
             * Returns a mutable builder for constructing an instance of [Product].
             *
             * The following fields are required:
             * ```java
             * .description()
             * .features()
             * .images()
             * .name()
             * .tags()
             * .targetAudience()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Product]. */
        class Builder internal constructor() {

            private var description: JsonField<String>? = null
            private var features: JsonField<MutableList<String>>? = null
            private var images: JsonField<MutableList<String>>? = null
            private var name: JsonField<String>? = null
            private var tags: JsonField<MutableList<String>>? = null
            private var targetAudience: JsonField<MutableList<String>>? = null
            private var billingFrequency: JsonField<BillingFrequency> = JsonMissing.of()
            private var category: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var imageUrl: JsonField<String> = JsonMissing.of()
            private var price: JsonField<Double> = JsonMissing.of()
            private var pricingModel: JsonField<PricingModel> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(product: Product) = apply {
                description = product.description
                features = product.features.map { it.toMutableList() }
                images = product.images.map { it.toMutableList() }
                name = product.name
                tags = product.tags.map { it.toMutableList() }
                targetAudience = product.targetAudience.map { it.toMutableList() }
                billingFrequency = product.billingFrequency
                category = product.category
                currency = product.currency
                imageUrl = product.imageUrl
                price = product.price
                pricingModel = product.pricingModel
                url = product.url
                additionalProperties = product.additionalProperties.toMutableMap()
            }

            /** Description of the product */
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

            /** List of product features */
            fun features(features: List<String>) = features(JsonField.of(features))

            /**
             * Sets [Builder.features] to an arbitrary JSON value.
             *
             * You should usually call [Builder.features] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun features(features: JsonField<List<String>>) = apply {
                this.features = features.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [features].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFeature(feature: String) = apply {
                features =
                    (features ?: JsonField.of(mutableListOf())).also {
                        checkKnown("features", it).add(feature)
                    }
            }

            /** URLs to product images on the page (up to 7) */
            fun images(images: List<String>) = images(JsonField.of(images))

            /**
             * Sets [Builder.images] to an arbitrary JSON value.
             *
             * You should usually call [Builder.images] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun images(images: JsonField<List<String>>) = apply {
                this.images = images.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [images].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addImage(image: String) = apply {
                images =
                    (images ?: JsonField.of(mutableListOf())).also {
                        checkKnown("images", it).add(image)
                    }
            }

            /** Name of the product */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Tags associated with the product */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /** Target audience for the product (array of strings) */
            fun targetAudience(targetAudience: List<String>) =
                targetAudience(JsonField.of(targetAudience))

            /**
             * Sets [Builder.targetAudience] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetAudience] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun targetAudience(targetAudience: JsonField<List<String>>) = apply {
                this.targetAudience = targetAudience.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.targetAudience].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTargetAudience(targetAudience: String) = apply {
                this.targetAudience =
                    (this.targetAudience ?: JsonField.of(mutableListOf())).also {
                        checkKnown("targetAudience", it).add(targetAudience)
                    }
            }

            /** Billing frequency for the product */
            fun billingFrequency(billingFrequency: BillingFrequency?) =
                billingFrequency(JsonField.ofNullable(billingFrequency))

            /**
             * Alias for calling [Builder.billingFrequency] with `billingFrequency.orElse(null)`.
             */
            fun billingFrequency(billingFrequency: Optional<BillingFrequency>) =
                billingFrequency(billingFrequency.getOrNull())

            /**
             * Sets [Builder.billingFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingFrequency] with a well-typed
             * [BillingFrequency] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
                this.billingFrequency = billingFrequency
            }

            /** Category of the product */
            fun category(category: String?) = category(JsonField.ofNullable(category))

            /** Alias for calling [Builder.category] with `category.orElse(null)`. */
            fun category(category: Optional<String>) = category(category.getOrNull())

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<String>) = apply { this.category = category }

            /** Currency code for the price (e.g., USD, EUR) */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
            fun currency(currency: Optional<String>) = currency(currency.getOrNull())

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** URL to the product image */
            fun imageUrl(imageUrl: String?) = imageUrl(JsonField.ofNullable(imageUrl))

            /** Alias for calling [Builder.imageUrl] with `imageUrl.orElse(null)`. */
            fun imageUrl(imageUrl: Optional<String>) = imageUrl(imageUrl.getOrNull())

            /**
             * Sets [Builder.imageUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageUrl(imageUrl: JsonField<String>) = apply { this.imageUrl = imageUrl }

            /** Price of the product */
            fun price(price: Double?) = price(JsonField.ofNullable(price))

            /**
             * Alias for [Builder.price].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun price(price: Double) = price(price as Double?)

            /** Alias for calling [Builder.price] with `price.orElse(null)`. */
            fun price(price: Optional<Double>) = price(price.getOrNull())

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun price(price: JsonField<Double>) = apply { this.price = price }

            /** Pricing model for the product */
            fun pricingModel(pricingModel: PricingModel?) =
                pricingModel(JsonField.ofNullable(pricingModel))

            /** Alias for calling [Builder.pricingModel] with `pricingModel.orElse(null)`. */
            fun pricingModel(pricingModel: Optional<PricingModel>) =
                pricingModel(pricingModel.getOrNull())

            /**
             * Sets [Builder.pricingModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricingModel] with a well-typed [PricingModel] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricingModel(pricingModel: JsonField<PricingModel>) = apply {
                this.pricingModel = pricingModel
            }

            /** URL to the product page */
            fun url(url: String?) = url(JsonField.ofNullable(url))

            /** Alias for calling [Builder.url] with `url.orElse(null)`. */
            fun url(url: Optional<String>) = url(url.getOrNull())

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Product].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .description()
             * .features()
             * .images()
             * .name()
             * .tags()
             * .targetAudience()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Product =
                Product(
                    checkRequired("description", description),
                    checkRequired("features", features).map { it.toImmutable() },
                    checkRequired("images", images).map { it.toImmutable() },
                    checkRequired("name", name),
                    checkRequired("tags", tags).map { it.toImmutable() },
                    checkRequired("targetAudience", targetAudience).map { it.toImmutable() },
                    billingFrequency,
                    category,
                    currency,
                    imageUrl,
                    price,
                    pricingModel,
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Product = apply {
            if (validated) {
                return@apply
            }

            description()
            features()
            images()
            name()
            tags()
            targetAudience()
            billingFrequency().ifPresent { it.validate() }
            category()
            currency()
            imageUrl()
            price()
            pricingModel().ifPresent { it.validate() }
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
            (if (description.asKnown().isPresent) 1 else 0) +
                (features.asKnown().getOrNull()?.size ?: 0) +
                (images.asKnown().getOrNull()?.size ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (targetAudience.asKnown().getOrNull()?.size ?: 0) +
                (billingFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (category.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (imageUrl.asKnown().isPresent) 1 else 0) +
                (if (price.asKnown().isPresent) 1 else 0) +
                (pricingModel.asKnown().getOrNull()?.validity() ?: 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        /** Billing frequency for the product */
        class BillingFrequency
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MONTHLY = of("monthly")

                @JvmField val YEARLY = of("yearly")

                @JvmField val ONE_TIME = of("one_time")

                @JvmField val USAGE_BASED = of("usage_based")

                @JvmStatic fun of(value: String) = BillingFrequency(JsonField.of(value))
            }

            /** An enum containing [BillingFrequency]'s known values. */
            enum class Known {
                MONTHLY,
                YEARLY,
                ONE_TIME,
                USAGE_BASED,
            }

            /**
             * An enum containing [BillingFrequency]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [BillingFrequency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MONTHLY,
                YEARLY,
                ONE_TIME,
                USAGE_BASED,
                /**
                 * An enum member indicating that [BillingFrequency] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MONTHLY -> Value.MONTHLY
                    YEARLY -> Value.YEARLY
                    ONE_TIME -> Value.ONE_TIME
                    USAGE_BASED -> Value.USAGE_BASED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BrandDevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    MONTHLY -> Known.MONTHLY
                    YEARLY -> Known.YEARLY
                    ONE_TIME -> Known.ONE_TIME
                    USAGE_BASED -> Known.USAGE_BASED
                    else -> throw BrandDevInvalidDataException("Unknown BillingFrequency: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BrandDevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BrandDevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): BillingFrequency = apply {
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

                return other is BillingFrequency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Pricing model for the product */
        class PricingModel @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PER_SEAT = of("per_seat")

                @JvmField val FLAT = of("flat")

                @JvmField val TIERED = of("tiered")

                @JvmField val FREEMIUM = of("freemium")

                @JvmField val CUSTOM = of("custom")

                @JvmStatic fun of(value: String) = PricingModel(JsonField.of(value))
            }

            /** An enum containing [PricingModel]'s known values. */
            enum class Known {
                PER_SEAT,
                FLAT,
                TIERED,
                FREEMIUM,
                CUSTOM,
            }

            /**
             * An enum containing [PricingModel]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PricingModel] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PER_SEAT,
                FLAT,
                TIERED,
                FREEMIUM,
                CUSTOM,
                /**
                 * An enum member indicating that [PricingModel] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PER_SEAT -> Value.PER_SEAT
                    FLAT -> Value.FLAT
                    TIERED -> Value.TIERED
                    FREEMIUM -> Value.FREEMIUM
                    CUSTOM -> Value.CUSTOM
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BrandDevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PER_SEAT -> Known.PER_SEAT
                    FLAT -> Known.FLAT
                    TIERED -> Known.TIERED
                    FREEMIUM -> Known.FREEMIUM
                    CUSTOM -> Known.CUSTOM
                    else -> throw BrandDevInvalidDataException("Unknown PricingModel: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BrandDevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BrandDevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): PricingModel = apply {
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

                return other is PricingModel && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Product &&
                description == other.description &&
                features == other.features &&
                images == other.images &&
                name == other.name &&
                tags == other.tags &&
                targetAudience == other.targetAudience &&
                billingFrequency == other.billingFrequency &&
                category == other.category &&
                currency == other.currency &&
                imageUrl == other.imageUrl &&
                price == other.price &&
                pricingModel == other.pricingModel &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                description,
                features,
                images,
                name,
                tags,
                targetAudience,
                billingFrequency,
                category,
                currency,
                imageUrl,
                price,
                pricingModel,
                url,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Product{description=$description, features=$features, images=$images, name=$name, tags=$tags, targetAudience=$targetAudience, billingFrequency=$billingFrequency, category=$category, currency=$currency, imageUrl=$imageUrl, price=$price, pricingModel=$pricingModel, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandAiProductsResponse &&
            products == other.products &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(products, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandAiProductsResponse{products=$products, additionalProperties=$additionalProperties}"
}
