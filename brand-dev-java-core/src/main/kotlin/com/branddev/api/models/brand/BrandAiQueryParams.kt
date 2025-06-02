// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.Enum
import com.branddev.api.core.ExcludeMissing
import com.branddev.api.core.JsonField
import com.branddev.api.core.JsonMissing
import com.branddev.api.core.JsonValue
import com.branddev.api.core.Params
import com.branddev.api.core.checkKnown
import com.branddev.api.core.checkRequired
import com.branddev.api.core.http.Headers
import com.branddev.api.core.http.QueryParams
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

/**
 * Beta feature: Use AI to extract specific data points from a brand's website. The AI will crawl
 * the website and extract the requested information based on the provided data points.
 */
class BrandAiQueryParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Array of data points to extract from the website
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataToExtract(): List<DataToExtract> = body.dataToExtract()

    /**
     * The domain name to analyze
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun domain(): String = body.domain()

    /**
     * Optional array of specific pages to analyze
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun specificPages(): Optional<List<String>> = body.specificPages()

    /**
     * Returns the raw JSON value of [dataToExtract].
     *
     * Unlike [dataToExtract], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dataToExtract(): JsonField<List<DataToExtract>> = body._dataToExtract()

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _domain(): JsonField<String> = body._domain()

    /**
     * Returns the raw JSON value of [specificPages].
     *
     * Unlike [specificPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _specificPages(): JsonField<List<String>> = body._specificPages()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrandAiQueryParams].
         *
         * The following fields are required:
         * ```java
         * .dataToExtract()
         * .domain()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandAiQueryParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandAiQueryParams: BrandAiQueryParams) = apply {
            body = brandAiQueryParams.body.toBuilder()
            additionalHeaders = brandAiQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandAiQueryParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [dataToExtract]
         * - [domain]
         * - [specificPages]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Array of data points to extract from the website */
        fun dataToExtract(dataToExtract: List<DataToExtract>) = apply {
            body.dataToExtract(dataToExtract)
        }

        /**
         * Sets [Builder.dataToExtract] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataToExtract] with a well-typed `List<DataToExtract>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dataToExtract(dataToExtract: JsonField<List<DataToExtract>>) = apply {
            body.dataToExtract(dataToExtract)
        }

        /**
         * Adds a single [DataToExtract] to [Builder.dataToExtract].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDataToExtract(dataToExtract: DataToExtract) = apply {
            body.addDataToExtract(dataToExtract)
        }

        /** The domain name to analyze */
        fun domain(domain: String) = apply { body.domain(domain) }

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { body.domain(domain) }

        /** Optional array of specific pages to analyze */
        fun specificPages(specificPages: List<String>) = apply { body.specificPages(specificPages) }

        /**
         * Sets [Builder.specificPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specificPages] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun specificPages(specificPages: JsonField<List<String>>) = apply {
            body.specificPages(specificPages)
        }

        /**
         * Adds a single [String] to [specificPages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSpecificPage(specificPage: String) = apply { body.addSpecificPage(specificPage) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [BrandAiQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dataToExtract()
         * .domain()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandAiQueryParams =
            BrandAiQueryParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val dataToExtract: JsonField<List<DataToExtract>>,
        private val domain: JsonField<String>,
        private val specificPages: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data_to_extract")
            @ExcludeMissing
            dataToExtract: JsonField<List<DataToExtract>> = JsonMissing.of(),
            @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("specific_pages")
            @ExcludeMissing
            specificPages: JsonField<List<String>> = JsonMissing.of(),
        ) : this(dataToExtract, domain, specificPages, mutableMapOf())

        /**
         * Array of data points to extract from the website
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dataToExtract(): List<DataToExtract> = dataToExtract.getRequired("data_to_extract")

        /**
         * The domain name to analyze
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun domain(): String = domain.getRequired("domain")

        /**
         * Optional array of specific pages to analyze
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun specificPages(): Optional<List<String>> = specificPages.getOptional("specific_pages")

        /**
         * Returns the raw JSON value of [dataToExtract].
         *
         * Unlike [dataToExtract], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("data_to_extract")
        @ExcludeMissing
        fun _dataToExtract(): JsonField<List<DataToExtract>> = dataToExtract

        /**
         * Returns the raw JSON value of [domain].
         *
         * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

        /**
         * Returns the raw JSON value of [specificPages].
         *
         * Unlike [specificPages], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("specific_pages")
        @ExcludeMissing
        fun _specificPages(): JsonField<List<String>> = specificPages

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .dataToExtract()
             * .domain()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var dataToExtract: JsonField<MutableList<DataToExtract>>? = null
            private var domain: JsonField<String>? = null
            private var specificPages: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                dataToExtract = body.dataToExtract.map { it.toMutableList() }
                domain = body.domain
                specificPages = body.specificPages.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Array of data points to extract from the website */
            fun dataToExtract(dataToExtract: List<DataToExtract>) =
                dataToExtract(JsonField.of(dataToExtract))

            /**
             * Sets [Builder.dataToExtract] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataToExtract] with a well-typed
             * `List<DataToExtract>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun dataToExtract(dataToExtract: JsonField<List<DataToExtract>>) = apply {
                this.dataToExtract = dataToExtract.map { it.toMutableList() }
            }

            /**
             * Adds a single [DataToExtract] to [Builder.dataToExtract].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDataToExtract(dataToExtract: DataToExtract) = apply {
                this.dataToExtract =
                    (this.dataToExtract ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dataToExtract", it).add(dataToExtract)
                    }
            }

            /** The domain name to analyze */
            fun domain(domain: String) = domain(JsonField.of(domain))

            /**
             * Sets [Builder.domain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domain] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domain(domain: JsonField<String>) = apply { this.domain = domain }

            /** Optional array of specific pages to analyze */
            fun specificPages(specificPages: List<String>) =
                specificPages(JsonField.of(specificPages))

            /**
             * Sets [Builder.specificPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specificPages] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun specificPages(specificPages: JsonField<List<String>>) = apply {
                this.specificPages = specificPages.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [specificPages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpecificPage(specificPage: String) = apply {
                specificPages =
                    (specificPages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("specificPages", it).add(specificPage)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .dataToExtract()
             * .domain()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("dataToExtract", dataToExtract).map { it.toImmutable() },
                    checkRequired("domain", domain),
                    (specificPages ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            dataToExtract().forEach { it.validate() }
            domain()
            specificPages()
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
            (dataToExtract.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (domain.asKnown().isPresent) 1 else 0) +
                (specificPages.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && dataToExtract == other.dataToExtract && domain == other.domain && specificPages == other.specificPages && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dataToExtract, domain, specificPages, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{dataToExtract=$dataToExtract, domain=$domain, specificPages=$specificPages, additionalProperties=$additionalProperties}"
    }

    class DataToExtract
    private constructor(
        private val datapointDescription: JsonField<String>,
        private val datapointExample: JsonField<String>,
        private val datapointName: JsonField<String>,
        private val datapointType: JsonField<DatapointType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("datapoint_description")
            @ExcludeMissing
            datapointDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("datapoint_example")
            @ExcludeMissing
            datapointExample: JsonField<String> = JsonMissing.of(),
            @JsonProperty("datapoint_name")
            @ExcludeMissing
            datapointName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("datapoint_type")
            @ExcludeMissing
            datapointType: JsonField<DatapointType> = JsonMissing.of(),
        ) : this(
            datapointDescription,
            datapointExample,
            datapointName,
            datapointType,
            mutableMapOf(),
        )

        /**
         * Description of what to extract
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun datapointDescription(): String =
            datapointDescription.getRequired("datapoint_description")

        /**
         * Example of the expected value
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun datapointExample(): String = datapointExample.getRequired("datapoint_example")

        /**
         * Name of the data point to extract
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun datapointName(): String = datapointName.getRequired("datapoint_name")

        /**
         * Type of the data point
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun datapointType(): DatapointType = datapointType.getRequired("datapoint_type")

        /**
         * Returns the raw JSON value of [datapointDescription].
         *
         * Unlike [datapointDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("datapoint_description")
        @ExcludeMissing
        fun _datapointDescription(): JsonField<String> = datapointDescription

        /**
         * Returns the raw JSON value of [datapointExample].
         *
         * Unlike [datapointExample], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("datapoint_example")
        @ExcludeMissing
        fun _datapointExample(): JsonField<String> = datapointExample

        /**
         * Returns the raw JSON value of [datapointName].
         *
         * Unlike [datapointName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("datapoint_name")
        @ExcludeMissing
        fun _datapointName(): JsonField<String> = datapointName

        /**
         * Returns the raw JSON value of [datapointType].
         *
         * Unlike [datapointType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("datapoint_type")
        @ExcludeMissing
        fun _datapointType(): JsonField<DatapointType> = datapointType

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
             * Returns a mutable builder for constructing an instance of [DataToExtract].
             *
             * The following fields are required:
             * ```java
             * .datapointDescription()
             * .datapointExample()
             * .datapointName()
             * .datapointType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DataToExtract]. */
        class Builder internal constructor() {

            private var datapointDescription: JsonField<String>? = null
            private var datapointExample: JsonField<String>? = null
            private var datapointName: JsonField<String>? = null
            private var datapointType: JsonField<DatapointType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dataToExtract: DataToExtract) = apply {
                datapointDescription = dataToExtract.datapointDescription
                datapointExample = dataToExtract.datapointExample
                datapointName = dataToExtract.datapointName
                datapointType = dataToExtract.datapointType
                additionalProperties = dataToExtract.additionalProperties.toMutableMap()
            }

            /** Description of what to extract */
            fun datapointDescription(datapointDescription: String) =
                datapointDescription(JsonField.of(datapointDescription))

            /**
             * Sets [Builder.datapointDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datapointDescription] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun datapointDescription(datapointDescription: JsonField<String>) = apply {
                this.datapointDescription = datapointDescription
            }

            /** Example of the expected value */
            fun datapointExample(datapointExample: String) =
                datapointExample(JsonField.of(datapointExample))

            /**
             * Sets [Builder.datapointExample] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datapointExample] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datapointExample(datapointExample: JsonField<String>) = apply {
                this.datapointExample = datapointExample
            }

            /** Name of the data point to extract */
            fun datapointName(datapointName: String) = datapointName(JsonField.of(datapointName))

            /**
             * Sets [Builder.datapointName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datapointName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datapointName(datapointName: JsonField<String>) = apply {
                this.datapointName = datapointName
            }

            /** Type of the data point */
            fun datapointType(datapointType: DatapointType) =
                datapointType(JsonField.of(datapointType))

            /**
             * Sets [Builder.datapointType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datapointType] with a well-typed [DatapointType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun datapointType(datapointType: JsonField<DatapointType>) = apply {
                this.datapointType = datapointType
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
             * Returns an immutable instance of [DataToExtract].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .datapointDescription()
             * .datapointExample()
             * .datapointName()
             * .datapointType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DataToExtract =
                DataToExtract(
                    checkRequired("datapointDescription", datapointDescription),
                    checkRequired("datapointExample", datapointExample),
                    checkRequired("datapointName", datapointName),
                    checkRequired("datapointType", datapointType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DataToExtract = apply {
            if (validated) {
                return@apply
            }

            datapointDescription()
            datapointExample()
            datapointName()
            datapointType().validate()
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
            (if (datapointDescription.asKnown().isPresent) 1 else 0) +
                (if (datapointExample.asKnown().isPresent) 1 else 0) +
                (if (datapointName.asKnown().isPresent) 1 else 0) +
                (datapointType.asKnown().getOrNull()?.validity() ?: 0)

        /** Type of the data point */
        class DatapointType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val TEXT = of("text")

                @JvmField val NUMBER = of("number")

                @JvmField val DATE = of("date")

                @JvmField val BOOLEAN = of("boolean")

                @JvmField val LIST = of("list")

                @JvmField val URL = of("url")

                @JvmStatic fun of(value: String) = DatapointType(JsonField.of(value))
            }

            /** An enum containing [DatapointType]'s known values. */
            enum class Known {
                TEXT,
                NUMBER,
                DATE,
                BOOLEAN,
                LIST,
                URL,
            }

            /**
             * An enum containing [DatapointType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DatapointType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TEXT,
                NUMBER,
                DATE,
                BOOLEAN,
                LIST,
                URL,
                /**
                 * An enum member indicating that [DatapointType] was instantiated with an unknown
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
                    TEXT -> Value.TEXT
                    NUMBER -> Value.NUMBER
                    DATE -> Value.DATE
                    BOOLEAN -> Value.BOOLEAN
                    LIST -> Value.LIST
                    URL -> Value.URL
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
                    TEXT -> Known.TEXT
                    NUMBER -> Known.NUMBER
                    DATE -> Known.DATE
                    BOOLEAN -> Known.BOOLEAN
                    LIST -> Known.LIST
                    URL -> Known.URL
                    else -> throw BrandDevInvalidDataException("Unknown DatapointType: $value")
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

            fun validate(): DatapointType = apply {
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

                return /* spotless:off */ other is DatapointType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DataToExtract && datapointDescription == other.datapointDescription && datapointExample == other.datapointExample && datapointName == other.datapointName && datapointType == other.datapointType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(datapointDescription, datapointExample, datapointName, datapointType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DataToExtract{datapointDescription=$datapointDescription, datapointExample=$datapointExample, datapointName=$datapointName, datapointType=$datapointType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BrandAiQueryParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BrandAiQueryParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
