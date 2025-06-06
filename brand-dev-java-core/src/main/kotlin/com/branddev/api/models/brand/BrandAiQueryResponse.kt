// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.BaseDeserializer
import com.branddev.api.core.BaseSerializer
import com.branddev.api.core.ExcludeMissing
import com.branddev.api.core.JsonField
import com.branddev.api.core.JsonMissing
import com.branddev.api.core.JsonValue
import com.branddev.api.core.allMaxBy
import com.branddev.api.core.checkKnown
import com.branddev.api.core.getOrThrow
import com.branddev.api.core.toImmutable
import com.branddev.api.errors.BrandDevInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BrandAiQueryResponse
private constructor(
    private val dataExtracted: JsonField<List<DataExtracted>>,
    private val domain: JsonField<String>,
    private val urlsAnalyzed: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data_extracted")
        @ExcludeMissing
        dataExtracted: JsonField<List<DataExtracted>> = JsonMissing.of(),
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("urls_analyzed")
        @ExcludeMissing
        urlsAnalyzed: JsonField<List<String>> = JsonMissing.of(),
    ) : this(dataExtracted, domain, urlsAnalyzed, mutableMapOf())

    /**
     * Array of extracted data points
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataExtracted(): Optional<List<DataExtracted>> = dataExtracted.getOptional("data_extracted")

    /**
     * The domain that was analyzed
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domain(): Optional<String> = domain.getOptional("domain")

    /**
     * List of URLs that were analyzed
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun urlsAnalyzed(): Optional<List<String>> = urlsAnalyzed.getOptional("urls_analyzed")

    /**
     * Returns the raw JSON value of [dataExtracted].
     *
     * Unlike [dataExtracted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_extracted")
    @ExcludeMissing
    fun _dataExtracted(): JsonField<List<DataExtracted>> = dataExtracted

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

    /**
     * Returns the raw JSON value of [urlsAnalyzed].
     *
     * Unlike [urlsAnalyzed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("urls_analyzed")
    @ExcludeMissing
    fun _urlsAnalyzed(): JsonField<List<String>> = urlsAnalyzed

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

        /** Returns a mutable builder for constructing an instance of [BrandAiQueryResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandAiQueryResponse]. */
    class Builder internal constructor() {

        private var dataExtracted: JsonField<MutableList<DataExtracted>>? = null
        private var domain: JsonField<String> = JsonMissing.of()
        private var urlsAnalyzed: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandAiQueryResponse: BrandAiQueryResponse) = apply {
            dataExtracted = brandAiQueryResponse.dataExtracted.map { it.toMutableList() }
            domain = brandAiQueryResponse.domain
            urlsAnalyzed = brandAiQueryResponse.urlsAnalyzed.map { it.toMutableList() }
            additionalProperties = brandAiQueryResponse.additionalProperties.toMutableMap()
        }

        /** Array of extracted data points */
        fun dataExtracted(dataExtracted: List<DataExtracted>) =
            dataExtracted(JsonField.of(dataExtracted))

        /**
         * Sets [Builder.dataExtracted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataExtracted] with a well-typed `List<DataExtracted>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dataExtracted(dataExtracted: JsonField<List<DataExtracted>>) = apply {
            this.dataExtracted = dataExtracted.map { it.toMutableList() }
        }

        /**
         * Adds a single [DataExtracted] to [Builder.dataExtracted].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDataExtracted(dataExtracted: DataExtracted) = apply {
            this.dataExtracted =
                (this.dataExtracted ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dataExtracted", it).add(dataExtracted)
                }
        }

        /** The domain that was analyzed */
        fun domain(domain: String) = domain(JsonField.of(domain))

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { this.domain = domain }

        /** List of URLs that were analyzed */
        fun urlsAnalyzed(urlsAnalyzed: List<String>) = urlsAnalyzed(JsonField.of(urlsAnalyzed))

        /**
         * Sets [Builder.urlsAnalyzed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urlsAnalyzed] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun urlsAnalyzed(urlsAnalyzed: JsonField<List<String>>) = apply {
            this.urlsAnalyzed = urlsAnalyzed.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.urlsAnalyzed].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUrlsAnalyzed(urlsAnalyzed: String) = apply {
            this.urlsAnalyzed =
                (this.urlsAnalyzed ?: JsonField.of(mutableListOf())).also {
                    checkKnown("urlsAnalyzed", it).add(urlsAnalyzed)
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
         * Returns an immutable instance of [BrandAiQueryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandAiQueryResponse =
            BrandAiQueryResponse(
                (dataExtracted ?: JsonMissing.of()).map { it.toImmutable() },
                domain,
                (urlsAnalyzed ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandAiQueryResponse = apply {
        if (validated) {
            return@apply
        }

        dataExtracted().ifPresent { it.forEach { it.validate() } }
        domain()
        urlsAnalyzed()
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
        (dataExtracted.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (domain.asKnown().isPresent) 1 else 0) +
            (urlsAnalyzed.asKnown().getOrNull()?.size ?: 0)

    class DataExtracted
    private constructor(
        private val datapointName: JsonField<String>,
        private val datapointValue: JsonField<DatapointValue>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("datapoint_name")
            @ExcludeMissing
            datapointName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("datapoint_value")
            @ExcludeMissing
            datapointValue: JsonField<DatapointValue> = JsonMissing.of(),
        ) : this(datapointName, datapointValue, mutableMapOf())

        /**
         * Name of the extracted data point
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun datapointName(): Optional<String> = datapointName.getOptional("datapoint_name")

        /**
         * Value of the extracted data point
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun datapointValue(): Optional<DatapointValue> =
            datapointValue.getOptional("datapoint_value")

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
         * Returns the raw JSON value of [datapointValue].
         *
         * Unlike [datapointValue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("datapoint_value")
        @ExcludeMissing
        fun _datapointValue(): JsonField<DatapointValue> = datapointValue

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

            /** Returns a mutable builder for constructing an instance of [DataExtracted]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DataExtracted]. */
        class Builder internal constructor() {

            private var datapointName: JsonField<String> = JsonMissing.of()
            private var datapointValue: JsonField<DatapointValue> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dataExtracted: DataExtracted) = apply {
                datapointName = dataExtracted.datapointName
                datapointValue = dataExtracted.datapointValue
                additionalProperties = dataExtracted.additionalProperties.toMutableMap()
            }

            /** Name of the extracted data point */
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

            /** Value of the extracted data point */
            fun datapointValue(datapointValue: DatapointValue) =
                datapointValue(JsonField.of(datapointValue))

            /**
             * Sets [Builder.datapointValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datapointValue] with a well-typed [DatapointValue]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun datapointValue(datapointValue: JsonField<DatapointValue>) = apply {
                this.datapointValue = datapointValue
            }

            /** Alias for calling [datapointValue] with `DatapointValue.ofString(string)`. */
            fun datapointValue(string: String) = datapointValue(DatapointValue.ofString(string))

            /** Alias for calling [datapointValue] with `DatapointValue.ofNumber(number)`. */
            fun datapointValue(number: Double) = datapointValue(DatapointValue.ofNumber(number))

            /** Alias for calling [datapointValue] with `DatapointValue.ofBool(bool)`. */
            fun datapointValue(bool: Boolean) = datapointValue(DatapointValue.ofBool(bool))

            /** Alias for calling [datapointValue] with `DatapointValue.ofStrings(strings)`. */
            fun datapointValueOfStrings(strings: List<String>) =
                datapointValue(DatapointValue.ofStrings(strings))

            /** Alias for calling [datapointValue] with `DatapointValue.ofNumber(number)`. */
            fun datapointValueOfNumber(number: List<Double>) =
                datapointValue(DatapointValue.ofNumber(number))

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
             * Returns an immutable instance of [DataExtracted].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DataExtracted =
                DataExtracted(datapointName, datapointValue, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): DataExtracted = apply {
            if (validated) {
                return@apply
            }

            datapointName()
            datapointValue().ifPresent { it.validate() }
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
            (if (datapointName.asKnown().isPresent) 1 else 0) +
                (datapointValue.asKnown().getOrNull()?.validity() ?: 0)

        /** Value of the extracted data point */
        @JsonDeserialize(using = DatapointValue.Deserializer::class)
        @JsonSerialize(using = DatapointValue.Serializer::class)
        class DatapointValue
        private constructor(
            private val string: String? = null,
            private val number: Double? = null,
            private val bool: Boolean? = null,
            private val strings: List<String>? = null,
            private val number: List<Double>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun number(): Optional<Double> = Optional.ofNullable(number)

            fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

            fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

            fun number(): Optional<List<Double>> = Optional.ofNullable(number)

            fun isString(): Boolean = string != null

            fun isNumber(): Boolean = number != null

            fun isBool(): Boolean = bool != null

            fun isStrings(): Boolean = strings != null

            fun isNumber(): Boolean = number != null

            fun asString(): String = string.getOrThrow("string")

            fun asNumber(): Double = number.getOrThrow("number")

            fun asBool(): Boolean = bool.getOrThrow("bool")

            fun asStrings(): List<String> = strings.getOrThrow("strings")

            fun asNumber(): List<Double> = number.getOrThrow("number")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    number != null -> visitor.visitNumber(number)
                    bool != null -> visitor.visitBool(bool)
                    strings != null -> visitor.visitStrings(strings)
                    number != null -> visitor.visitNumber(number)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): DatapointValue = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitNumber(number: Double) {}

                        override fun visitBool(bool: Boolean) {}

                        override fun visitStrings(strings: List<String>) {}

                        override fun visitNumber(number: List<Double>) {}
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitNumber(number: Double) = 1

                        override fun visitBool(bool: Boolean) = 1

                        override fun visitStrings(strings: List<String>) = strings.size

                        override fun visitNumber(number: List<Double>) = number.size

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DatapointValue && string == other.string && number == other.number && bool == other.bool && strings == other.strings && number == other.number /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, number, bool, strings, number) /* spotless:on */

            override fun toString(): String =
                when {
                    string != null -> "DatapointValue{string=$string}"
                    number != null -> "DatapointValue{number=$number}"
                    bool != null -> "DatapointValue{bool=$bool}"
                    strings != null -> "DatapointValue{strings=$strings}"
                    number != null -> "DatapointValue{number=$number}"
                    _json != null -> "DatapointValue{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid DatapointValue")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = DatapointValue(string = string)

                @JvmStatic fun ofNumber(number: Double) = DatapointValue(number = number)

                @JvmStatic fun ofBool(bool: Boolean) = DatapointValue(bool = bool)

                @JvmStatic fun ofStrings(strings: List<String>) = DatapointValue(strings = strings)

                @JvmStatic fun ofNumber(number: List<Double>) = DatapointValue(number = number)
            }

            /**
             * An interface that defines how to map each variant of [DatapointValue] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitNumber(number: Double): T

                fun visitBool(bool: Boolean): T

                fun visitStrings(strings: List<String>): T

                fun visitNumber(number: List<Double>): T

                /**
                 * Maps an unknown variant of [DatapointValue] to a value of type [T].
                 *
                 * An instance of [DatapointValue] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws BrandDevInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw BrandDevInvalidDataException("Unknown DatapointValue: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<DatapointValue>(DatapointValue::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): DatapointValue {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    DatapointValue(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    DatapointValue(number = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                    DatapointValue(bool = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                    DatapointValue(strings = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<Double>>())?.let {
                                    DatapointValue(number = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> DatapointValue(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<DatapointValue>(DatapointValue::class) {

                override fun serialize(
                    value: DatapointValue,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.number != null -> generator.writeObject(value.number)
                        value.bool != null -> generator.writeObject(value.bool)
                        value.strings != null -> generator.writeObject(value.strings)
                        value.number != null -> generator.writeObject(value.number)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid DatapointValue")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DataExtracted && datapointName == other.datapointName && datapointValue == other.datapointValue && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(datapointName, datapointValue, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DataExtracted{datapointName=$datapointName, datapointValue=$datapointValue, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BrandAiQueryResponse && dataExtracted == other.dataExtracted && domain == other.domain && urlsAnalyzed == other.urlsAnalyzed && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(dataExtracted, domain, urlsAnalyzed, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandAiQueryResponse{dataExtracted=$dataExtracted, domain=$domain, urlsAnalyzed=$urlsAnalyzed, additionalProperties=$additionalProperties}"
}
