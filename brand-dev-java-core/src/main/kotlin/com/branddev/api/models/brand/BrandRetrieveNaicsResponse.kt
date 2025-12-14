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

class BrandRetrieveNaicsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val codes: JsonField<List<Code>>,
    private val domain: JsonField<String>,
    private val status: JsonField<String>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("codes") @ExcludeMissing codes: JsonField<List<Code>> = JsonMissing.of(),
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(codes, domain, status, type, mutableMapOf())

    /**
     * Array of NAICS codes and titles.
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun codes(): Optional<List<Code>> = codes.getOptional("codes")

    /**
     * Domain found for the brand
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domain(): Optional<String> = domain.getOptional("domain")

    /**
     * Status of the response, e.g., 'ok'
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Industry classification type, for naics api it will be `naics`
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [codes].
     *
     * Unlike [codes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("codes") @ExcludeMissing fun _codes(): JsonField<List<Code>> = codes

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
         * Returns a mutable builder for constructing an instance of [BrandRetrieveNaicsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandRetrieveNaicsResponse]. */
    class Builder internal constructor() {

        private var codes: JsonField<MutableList<Code>>? = null
        private var domain: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandRetrieveNaicsResponse: BrandRetrieveNaicsResponse) = apply {
            codes = brandRetrieveNaicsResponse.codes.map { it.toMutableList() }
            domain = brandRetrieveNaicsResponse.domain
            status = brandRetrieveNaicsResponse.status
            type = brandRetrieveNaicsResponse.type
            additionalProperties = brandRetrieveNaicsResponse.additionalProperties.toMutableMap()
        }

        /** Array of NAICS codes and titles. */
        fun codes(codes: List<Code>) = codes(JsonField.of(codes))

        /**
         * Sets [Builder.codes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.codes] with a well-typed `List<Code>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun codes(codes: JsonField<List<Code>>) = apply {
            this.codes = codes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Code] to [codes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCode(code: Code) = apply {
            codes =
                (codes ?: JsonField.of(mutableListOf())).also { checkKnown("codes", it).add(code) }
        }

        /** Domain found for the brand */
        fun domain(domain: String) = domain(JsonField.of(domain))

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { this.domain = domain }

        /** Status of the response, e.g., 'ok' */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** Industry classification type, for naics api it will be `naics` */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Returns an immutable instance of [BrandRetrieveNaicsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandRetrieveNaicsResponse =
            BrandRetrieveNaicsResponse(
                (codes ?: JsonMissing.of()).map { it.toImmutable() },
                domain,
                status,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandRetrieveNaicsResponse = apply {
        if (validated) {
            return@apply
        }

        codes().ifPresent { it.forEach { it.validate() } }
        domain()
        status()
        type()
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
        (codes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (domain.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0)

    class Code
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val code: JsonField<String>,
        private val confidence: JsonField<Confidence>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("confidence")
            @ExcludeMissing
            confidence: JsonField<Confidence> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(code, confidence, name, mutableMapOf())

        /**
         * NAICS code
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * Confidence level for how well this NAICS code matches the company description
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun confidence(): Confidence = confidence.getRequired("confidence")

        /**
         * NAICS title
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [confidence].
         *
         * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confidence")
        @ExcludeMissing
        fun _confidence(): JsonField<Confidence> = confidence

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

            /**
             * Returns a mutable builder for constructing an instance of [Code].
             *
             * The following fields are required:
             * ```java
             * .code()
             * .confidence()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Code]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var confidence: JsonField<Confidence>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(code: Code) = apply {
                this.code = code.code
                confidence = code.confidence
                name = code.name
                additionalProperties = code.additionalProperties.toMutableMap()
            }

            /** NAICS code */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Confidence level for how well this NAICS code matches the company description */
            fun confidence(confidence: Confidence) = confidence(JsonField.of(confidence))

            /**
             * Sets [Builder.confidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidence] with a well-typed [Confidence] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidence(confidence: JsonField<Confidence>) = apply {
                this.confidence = confidence
            }

            /** NAICS title */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Code].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .code()
             * .confidence()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Code =
                Code(
                    checkRequired("code", code),
                    checkRequired("confidence", confidence),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Code = apply {
            if (validated) {
                return@apply
            }

            code()
            confidence().validate()
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
            (if (code.asKnown().isPresent) 1 else 0) +
                (confidence.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** Confidence level for how well this NAICS code matches the company description */
        class Confidence @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val HIGH = of("high")

                @JvmField val MEDIUM = of("medium")

                @JvmField val LOW = of("low")

                @JvmStatic fun of(value: String) = Confidence(JsonField.of(value))
            }

            /** An enum containing [Confidence]'s known values. */
            enum class Known {
                HIGH,
                MEDIUM,
                LOW,
            }

            /**
             * An enum containing [Confidence]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Confidence] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HIGH,
                MEDIUM,
                LOW,
                /**
                 * An enum member indicating that [Confidence] was instantiated with an unknown
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
                    HIGH -> Value.HIGH
                    MEDIUM -> Value.MEDIUM
                    LOW -> Value.LOW
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
                    HIGH -> Known.HIGH
                    MEDIUM -> Known.MEDIUM
                    LOW -> Known.LOW
                    else -> throw BrandDevInvalidDataException("Unknown Confidence: $value")
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

            fun validate(): Confidence = apply {
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

                return other is Confidence && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Code &&
                code == other.code &&
                confidence == other.confidence &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(code, confidence, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Code{code=$code, confidence=$confidence, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandRetrieveNaicsResponse &&
            codes == other.codes &&
            domain == other.domain &&
            status == other.status &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(codes, domain, status, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandRetrieveNaicsResponse{codes=$codes, domain=$domain, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
