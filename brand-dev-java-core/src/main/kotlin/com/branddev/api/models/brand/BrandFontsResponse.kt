// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

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
import kotlin.jvm.optionals.getOrNull

class BrandFontsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val code: JsonField<Long>,
    private val domain: JsonField<String>,
    private val fonts: JsonField<List<Font>>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fonts") @ExcludeMissing fonts: JsonField<List<Font>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(code, domain, fonts, status, mutableMapOf())

    /**
     * HTTP status code, e.g., 200
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): Long = code.getRequired("code")

    /**
     * The normalized domain that was processed
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun domain(): String = domain.getRequired("domain")

    /**
     * Array of font usage information
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fonts(): List<Font> = fonts.getRequired("fonts")

    /**
     * Status of the response, e.g., 'ok'
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

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
     * Returns the raw JSON value of [fonts].
     *
     * Unlike [fonts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fonts") @ExcludeMissing fun _fonts(): JsonField<List<Font>> = fonts

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
         * Returns a mutable builder for constructing an instance of [BrandFontsResponse].
         *
         * The following fields are required:
         * ```java
         * .code()
         * .domain()
         * .fonts()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandFontsResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var domain: JsonField<String>? = null
        private var fonts: JsonField<MutableList<Font>>? = null
        private var status: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandFontsResponse: BrandFontsResponse) = apply {
            code = brandFontsResponse.code
            domain = brandFontsResponse.domain
            fonts = brandFontsResponse.fonts.map { it.toMutableList() }
            status = brandFontsResponse.status
            additionalProperties = brandFontsResponse.additionalProperties.toMutableMap()
        }

        /** HTTP status code, e.g., 200 */
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

        /** Array of font usage information */
        fun fonts(fonts: List<Font>) = fonts(JsonField.of(fonts))

        /**
         * Sets [Builder.fonts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fonts] with a well-typed `List<Font>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
                (fonts ?: JsonField.of(mutableListOf())).also { checkKnown("fonts", it).add(font) }
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
         * Returns an immutable instance of [BrandFontsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .code()
         * .domain()
         * .fonts()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandFontsResponse =
            BrandFontsResponse(
                checkRequired("code", code),
                checkRequired("domain", domain),
                checkRequired("fonts", fonts).map { it.toImmutable() },
                checkRequired("status", status),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandFontsResponse = apply {
        if (validated) {
            return@apply
        }

        code()
        domain()
        fonts().forEach { it.validate() }
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
            (fonts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    class Font
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fallbacks: JsonField<List<String>>,
        private val font: JsonField<String>,
        private val numElements: JsonField<Double>,
        private val numWords: JsonField<Double>,
        private val percentElements: JsonField<Double>,
        private val percentWords: JsonField<Double>,
        private val uses: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fallbacks")
            @ExcludeMissing
            fallbacks: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("font") @ExcludeMissing font: JsonField<String> = JsonMissing.of(),
            @JsonProperty("num_elements")
            @ExcludeMissing
            numElements: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("num_words")
            @ExcludeMissing
            numWords: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("percent_elements")
            @ExcludeMissing
            percentElements: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("percent_words")
            @ExcludeMissing
            percentWords: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("uses") @ExcludeMissing uses: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            fallbacks,
            font,
            numElements,
            numWords,
            percentElements,
            percentWords,
            uses,
            mutableMapOf(),
        )

        /**
         * Array of fallback font families
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fallbacks(): List<String> = fallbacks.getRequired("fallbacks")

        /**
         * Font family name
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun font(): String = font.getRequired("font")

        /**
         * Number of elements using this font
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun numElements(): Double = numElements.getRequired("num_elements")

        /**
         * Number of words using this font
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun numWords(): Double = numWords.getRequired("num_words")

        /**
         * Percentage of elements using this font
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun percentElements(): Double = percentElements.getRequired("percent_elements")

        /**
         * Percentage of words using this font
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun percentWords(): Double = percentWords.getRequired("percent_words")

        /**
         * Array of CSS selectors or element types where this font is used
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun uses(): List<String> = uses.getRequired("uses")

        /**
         * Returns the raw JSON value of [fallbacks].
         *
         * Unlike [fallbacks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fallbacks")
        @ExcludeMissing
        fun _fallbacks(): JsonField<List<String>> = fallbacks

        /**
         * Returns the raw JSON value of [font].
         *
         * Unlike [font], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("font") @ExcludeMissing fun _font(): JsonField<String> = font

        /**
         * Returns the raw JSON value of [numElements].
         *
         * Unlike [numElements], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_elements")
        @ExcludeMissing
        fun _numElements(): JsonField<Double> = numElements

        /**
         * Returns the raw JSON value of [numWords].
         *
         * Unlike [numWords], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_words") @ExcludeMissing fun _numWords(): JsonField<Double> = numWords

        /**
         * Returns the raw JSON value of [percentElements].
         *
         * Unlike [percentElements], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("percent_elements")
        @ExcludeMissing
        fun _percentElements(): JsonField<Double> = percentElements

        /**
         * Returns the raw JSON value of [percentWords].
         *
         * Unlike [percentWords], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("percent_words")
        @ExcludeMissing
        fun _percentWords(): JsonField<Double> = percentWords

        /**
         * Returns the raw JSON value of [uses].
         *
         * Unlike [uses], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uses") @ExcludeMissing fun _uses(): JsonField<List<String>> = uses

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
             * Returns a mutable builder for constructing an instance of [Font].
             *
             * The following fields are required:
             * ```java
             * .fallbacks()
             * .font()
             * .numElements()
             * .numWords()
             * .percentElements()
             * .percentWords()
             * .uses()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Font]. */
        class Builder internal constructor() {

            private var fallbacks: JsonField<MutableList<String>>? = null
            private var font: JsonField<String>? = null
            private var numElements: JsonField<Double>? = null
            private var numWords: JsonField<Double>? = null
            private var percentElements: JsonField<Double>? = null
            private var percentWords: JsonField<Double>? = null
            private var uses: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(font: Font) = apply {
                fallbacks = font.fallbacks.map { it.toMutableList() }
                this.font = font.font
                numElements = font.numElements
                numWords = font.numWords
                percentElements = font.percentElements
                percentWords = font.percentWords
                uses = font.uses.map { it.toMutableList() }
                additionalProperties = font.additionalProperties.toMutableMap()
            }

            /** Array of fallback font families */
            fun fallbacks(fallbacks: List<String>) = fallbacks(JsonField.of(fallbacks))

            /**
             * Sets [Builder.fallbacks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fallbacks] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fallbacks(fallbacks: JsonField<List<String>>) = apply {
                this.fallbacks = fallbacks.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [fallbacks].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFallback(fallback: String) = apply {
                fallbacks =
                    (fallbacks ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fallbacks", it).add(fallback)
                    }
            }

            /** Font family name */
            fun font(font: String) = font(JsonField.of(font))

            /**
             * Sets [Builder.font] to an arbitrary JSON value.
             *
             * You should usually call [Builder.font] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun font(font: JsonField<String>) = apply { this.font = font }

            /** Number of elements using this font */
            fun numElements(numElements: Double) = numElements(JsonField.of(numElements))

            /**
             * Sets [Builder.numElements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numElements] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numElements(numElements: JsonField<Double>) = apply {
                this.numElements = numElements
            }

            /** Number of words using this font */
            fun numWords(numWords: Double) = numWords(JsonField.of(numWords))

            /**
             * Sets [Builder.numWords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numWords] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numWords(numWords: JsonField<Double>) = apply { this.numWords = numWords }

            /** Percentage of elements using this font */
            fun percentElements(percentElements: Double) =
                percentElements(JsonField.of(percentElements))

            /**
             * Sets [Builder.percentElements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.percentElements] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun percentElements(percentElements: JsonField<Double>) = apply {
                this.percentElements = percentElements
            }

            /** Percentage of words using this font */
            fun percentWords(percentWords: Double) = percentWords(JsonField.of(percentWords))

            /**
             * Sets [Builder.percentWords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.percentWords] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun percentWords(percentWords: JsonField<Double>) = apply {
                this.percentWords = percentWords
            }

            /** Array of CSS selectors or element types where this font is used */
            fun uses(uses: List<String>) = uses(JsonField.of(uses))

            /**
             * Sets [Builder.uses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uses] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uses(uses: JsonField<List<String>>) = apply {
                this.uses = uses.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [uses].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUse(use: String) = apply {
                uses =
                    (uses ?: JsonField.of(mutableListOf())).also { checkKnown("uses", it).add(use) }
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
             * Returns an immutable instance of [Font].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fallbacks()
             * .font()
             * .numElements()
             * .numWords()
             * .percentElements()
             * .percentWords()
             * .uses()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Font =
                Font(
                    checkRequired("fallbacks", fallbacks).map { it.toImmutable() },
                    checkRequired("font", font),
                    checkRequired("numElements", numElements),
                    checkRequired("numWords", numWords),
                    checkRequired("percentElements", percentElements),
                    checkRequired("percentWords", percentWords),
                    checkRequired("uses", uses).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Font = apply {
            if (validated) {
                return@apply
            }

            fallbacks()
            font()
            numElements()
            numWords()
            percentElements()
            percentWords()
            uses()
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
            (fallbacks.asKnown().getOrNull()?.size ?: 0) +
                (if (font.asKnown().isPresent) 1 else 0) +
                (if (numElements.asKnown().isPresent) 1 else 0) +
                (if (numWords.asKnown().isPresent) 1 else 0) +
                (if (percentElements.asKnown().isPresent) 1 else 0) +
                (if (percentWords.asKnown().isPresent) 1 else 0) +
                (uses.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Font &&
                fallbacks == other.fallbacks &&
                font == other.font &&
                numElements == other.numElements &&
                numWords == other.numWords &&
                percentElements == other.percentElements &&
                percentWords == other.percentWords &&
                uses == other.uses &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                fallbacks,
                font,
                numElements,
                numWords,
                percentElements,
                percentWords,
                uses,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Font{fallbacks=$fallbacks, font=$font, numElements=$numElements, numWords=$numWords, percentElements=$percentElements, percentWords=$percentWords, uses=$uses, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandFontsResponse &&
            code == other.code &&
            domain == other.domain &&
            fonts == other.fonts &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(code, domain, fonts, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandFontsResponse{code=$code, domain=$domain, fonts=$fonts, status=$status, additionalProperties=$additionalProperties}"
}
