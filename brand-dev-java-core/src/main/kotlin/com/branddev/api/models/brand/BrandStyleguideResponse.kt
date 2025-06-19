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
import kotlin.jvm.optionals.getOrNull

class BrandStyleguideResponse
private constructor(
    private val code: JsonField<Long>,
    private val domain: JsonField<String>,
    private val status: JsonField<String>,
    private val styleguide: JsonField<Styleguide>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("styleguide")
        @ExcludeMissing
        styleguide: JsonField<Styleguide> = JsonMissing.of(),
    ) : this(code, domain, status, styleguide, mutableMapOf())

    /**
     * HTTP status code
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<Long> = code.getOptional("code")

    /**
     * The normalized domain that was processed
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
     * Comprehensive styleguide data extracted from the website
     *
     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun styleguide(): Optional<Styleguide> = styleguide.getOptional("styleguide")

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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [styleguide].
     *
     * Unlike [styleguide], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("styleguide")
    @ExcludeMissing
    fun _styleguide(): JsonField<Styleguide> = styleguide

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

        /** Returns a mutable builder for constructing an instance of [BrandStyleguideResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandStyleguideResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long> = JsonMissing.of()
        private var domain: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var styleguide: JsonField<Styleguide> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandStyleguideResponse: BrandStyleguideResponse) = apply {
            code = brandStyleguideResponse.code
            domain = brandStyleguideResponse.domain
            status = brandStyleguideResponse.status
            styleguide = brandStyleguideResponse.styleguide
            additionalProperties = brandStyleguideResponse.additionalProperties.toMutableMap()
        }

        /** HTTP status code */
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

        /** Status of the response, e.g., 'ok' */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** Comprehensive styleguide data extracted from the website */
        fun styleguide(styleguide: Styleguide) = styleguide(JsonField.of(styleguide))

        /**
         * Sets [Builder.styleguide] to an arbitrary JSON value.
         *
         * You should usually call [Builder.styleguide] with a well-typed [Styleguide] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun styleguide(styleguide: JsonField<Styleguide>) = apply { this.styleguide = styleguide }

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
         * Returns an immutable instance of [BrandStyleguideResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandStyleguideResponse =
            BrandStyleguideResponse(
                code,
                domain,
                status,
                styleguide,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandStyleguideResponse = apply {
        if (validated) {
            return@apply
        }

        code()
        domain()
        status()
        styleguide().ifPresent { it.validate() }
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
            (if (status.asKnown().isPresent) 1 else 0) +
            (styleguide.asKnown().getOrNull()?.validity() ?: 0)

    /** Comprehensive styleguide data extracted from the website */
    class Styleguide
    private constructor(
        private val colors: JsonField<Colors>,
        private val components: JsonField<Components>,
        private val elementSpacing: JsonField<ElementSpacing>,
        private val shadows: JsonField<Shadows>,
        private val typography: JsonField<Typography>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("colors") @ExcludeMissing colors: JsonField<Colors> = JsonMissing.of(),
            @JsonProperty("components")
            @ExcludeMissing
            components: JsonField<Components> = JsonMissing.of(),
            @JsonProperty("elementSpacing")
            @ExcludeMissing
            elementSpacing: JsonField<ElementSpacing> = JsonMissing.of(),
            @JsonProperty("shadows") @ExcludeMissing shadows: JsonField<Shadows> = JsonMissing.of(),
            @JsonProperty("typography")
            @ExcludeMissing
            typography: JsonField<Typography> = JsonMissing.of(),
        ) : this(colors, components, elementSpacing, shadows, typography, mutableMapOf())

        /**
         * Primary colors used on the website
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun colors(): Optional<Colors> = colors.getOptional("colors")

        /**
         * UI component styles
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun components(): Optional<Components> = components.getOptional("components")

        /**
         * Spacing system used on the website
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun elementSpacing(): Optional<ElementSpacing> =
            elementSpacing.getOptional("elementSpacing")

        /**
         * Shadow styles used on the website
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shadows(): Optional<Shadows> = shadows.getOptional("shadows")

        /**
         * Typography styles used on the website
         *
         * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun typography(): Optional<Typography> = typography.getOptional("typography")

        /**
         * Returns the raw JSON value of [colors].
         *
         * Unlike [colors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("colors") @ExcludeMissing fun _colors(): JsonField<Colors> = colors

        /**
         * Returns the raw JSON value of [components].
         *
         * Unlike [components], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("components")
        @ExcludeMissing
        fun _components(): JsonField<Components> = components

        /**
         * Returns the raw JSON value of [elementSpacing].
         *
         * Unlike [elementSpacing], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("elementSpacing")
        @ExcludeMissing
        fun _elementSpacing(): JsonField<ElementSpacing> = elementSpacing

        /**
         * Returns the raw JSON value of [shadows].
         *
         * Unlike [shadows], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shadows") @ExcludeMissing fun _shadows(): JsonField<Shadows> = shadows

        /**
         * Returns the raw JSON value of [typography].
         *
         * Unlike [typography], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("typography")
        @ExcludeMissing
        fun _typography(): JsonField<Typography> = typography

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

            /** Returns a mutable builder for constructing an instance of [Styleguide]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Styleguide]. */
        class Builder internal constructor() {

            private var colors: JsonField<Colors> = JsonMissing.of()
            private var components: JsonField<Components> = JsonMissing.of()
            private var elementSpacing: JsonField<ElementSpacing> = JsonMissing.of()
            private var shadows: JsonField<Shadows> = JsonMissing.of()
            private var typography: JsonField<Typography> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(styleguide: Styleguide) = apply {
                colors = styleguide.colors
                components = styleguide.components
                elementSpacing = styleguide.elementSpacing
                shadows = styleguide.shadows
                typography = styleguide.typography
                additionalProperties = styleguide.additionalProperties.toMutableMap()
            }

            /** Primary colors used on the website */
            fun colors(colors: Colors) = colors(JsonField.of(colors))

            /**
             * Sets [Builder.colors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.colors] with a well-typed [Colors] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun colors(colors: JsonField<Colors>) = apply { this.colors = colors }

            /** UI component styles */
            fun components(components: Components) = components(JsonField.of(components))

            /**
             * Sets [Builder.components] to an arbitrary JSON value.
             *
             * You should usually call [Builder.components] with a well-typed [Components] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun components(components: JsonField<Components>) = apply {
                this.components = components
            }

            /** Spacing system used on the website */
            fun elementSpacing(elementSpacing: ElementSpacing) =
                elementSpacing(JsonField.of(elementSpacing))

            /**
             * Sets [Builder.elementSpacing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elementSpacing] with a well-typed [ElementSpacing]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun elementSpacing(elementSpacing: JsonField<ElementSpacing>) = apply {
                this.elementSpacing = elementSpacing
            }

            /** Shadow styles used on the website */
            fun shadows(shadows: Shadows) = shadows(JsonField.of(shadows))

            /**
             * Sets [Builder.shadows] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shadows] with a well-typed [Shadows] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shadows(shadows: JsonField<Shadows>) = apply { this.shadows = shadows }

            /** Typography styles used on the website */
            fun typography(typography: Typography) = typography(JsonField.of(typography))

            /**
             * Sets [Builder.typography] to an arbitrary JSON value.
             *
             * You should usually call [Builder.typography] with a well-typed [Typography] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun typography(typography: JsonField<Typography>) = apply {
                this.typography = typography
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
             * Returns an immutable instance of [Styleguide].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Styleguide =
                Styleguide(
                    colors,
                    components,
                    elementSpacing,
                    shadows,
                    typography,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Styleguide = apply {
            if (validated) {
                return@apply
            }

            colors().ifPresent { it.validate() }
            components().ifPresent { it.validate() }
            elementSpacing().ifPresent { it.validate() }
            shadows().ifPresent { it.validate() }
            typography().ifPresent { it.validate() }
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
            (colors.asKnown().getOrNull()?.validity() ?: 0) +
                (components.asKnown().getOrNull()?.validity() ?: 0) +
                (elementSpacing.asKnown().getOrNull()?.validity() ?: 0) +
                (shadows.asKnown().getOrNull()?.validity() ?: 0) +
                (typography.asKnown().getOrNull()?.validity() ?: 0)

        /** Primary colors used on the website */
        class Colors
        private constructor(
            private val accent: JsonField<String>,
            private val background: JsonField<String>,
            private val text: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accent")
                @ExcludeMissing
                accent: JsonField<String> = JsonMissing.of(),
                @JsonProperty("background")
                @ExcludeMissing
                background: JsonField<String> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            ) : this(accent, background, text, mutableMapOf())

            /**
             * Accent color of the website (hex format)
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun accent(): Optional<String> = accent.getOptional("accent")

            /**
             * Background color of the website (hex format)
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun background(): Optional<String> = background.getOptional("background")

            /**
             * Text color of the website (hex format)
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun text(): Optional<String> = text.getOptional("text")

            /**
             * Returns the raw JSON value of [accent].
             *
             * Unlike [accent], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("accent") @ExcludeMissing fun _accent(): JsonField<String> = accent

            /**
             * Returns the raw JSON value of [background].
             *
             * Unlike [background], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("background")
            @ExcludeMissing
            fun _background(): JsonField<String> = background

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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

                /** Returns a mutable builder for constructing an instance of [Colors]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Colors]. */
            class Builder internal constructor() {

                private var accent: JsonField<String> = JsonMissing.of()
                private var background: JsonField<String> = JsonMissing.of()
                private var text: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(colors: Colors) = apply {
                    accent = colors.accent
                    background = colors.background
                    text = colors.text
                    additionalProperties = colors.additionalProperties.toMutableMap()
                }

                /** Accent color of the website (hex format) */
                fun accent(accent: String) = accent(JsonField.of(accent))

                /**
                 * Sets [Builder.accent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accent] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accent(accent: JsonField<String>) = apply { this.accent = accent }

                /** Background color of the website (hex format) */
                fun background(background: String) = background(JsonField.of(background))

                /**
                 * Sets [Builder.background] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.background] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun background(background: JsonField<String>) = apply {
                    this.background = background
                }

                /** Text color of the website (hex format) */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

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
                 * Returns an immutable instance of [Colors].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Colors =
                    Colors(accent, background, text, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Colors = apply {
                if (validated) {
                    return@apply
                }

                accent()
                background()
                text()
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
                (if (accent.asKnown().isPresent) 1 else 0) +
                    (if (background.asKnown().isPresent) 1 else 0) +
                    (if (text.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Colors && accent == other.accent && background == other.background && text == other.text && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(accent, background, text, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Colors{accent=$accent, background=$background, text=$text, additionalProperties=$additionalProperties}"
        }

        /** UI component styles */
        class Components
        private constructor(
            private val button: JsonField<Button>,
            private val card: JsonField<Card>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("button")
                @ExcludeMissing
                button: JsonField<Button> = JsonMissing.of(),
                @JsonProperty("card") @ExcludeMissing card: JsonField<Card> = JsonMissing.of(),
            ) : this(button, card, mutableMapOf())

            /**
             * Button component styles
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun button(): Optional<Button> = button.getOptional("button")

            /**
             * Card component style
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun card(): Optional<Card> = card.getOptional("card")

            /**
             * Returns the raw JSON value of [button].
             *
             * Unlike [button], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("button") @ExcludeMissing fun _button(): JsonField<Button> = button

            /**
             * Returns the raw JSON value of [card].
             *
             * Unlike [card], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("card") @ExcludeMissing fun _card(): JsonField<Card> = card

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

                /** Returns a mutable builder for constructing an instance of [Components]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Components]. */
            class Builder internal constructor() {

                private var button: JsonField<Button> = JsonMissing.of()
                private var card: JsonField<Card> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(components: Components) = apply {
                    button = components.button
                    card = components.card
                    additionalProperties = components.additionalProperties.toMutableMap()
                }

                /** Button component styles */
                fun button(button: Button) = button(JsonField.of(button))

                /**
                 * Sets [Builder.button] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.button] with a well-typed [Button] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun button(button: JsonField<Button>) = apply { this.button = button }

                /** Card component style */
                fun card(card: Card) = card(JsonField.of(card))

                /**
                 * Sets [Builder.card] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.card] with a well-typed [Card] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun card(card: JsonField<Card>) = apply { this.card = card }

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
                 * Returns an immutable instance of [Components].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Components =
                    Components(button, card, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Components = apply {
                if (validated) {
                    return@apply
                }

                button().ifPresent { it.validate() }
                card().ifPresent { it.validate() }
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
                (button.asKnown().getOrNull()?.validity() ?: 0) +
                    (card.asKnown().getOrNull()?.validity() ?: 0)

            /** Button component styles */
            class Button
            private constructor(
                private val link: JsonField<Link>,
                private val primary: JsonField<Primary>,
                private val secondary: JsonField<Secondary>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("link") @ExcludeMissing link: JsonField<Link> = JsonMissing.of(),
                    @JsonProperty("primary")
                    @ExcludeMissing
                    primary: JsonField<Primary> = JsonMissing.of(),
                    @JsonProperty("secondary")
                    @ExcludeMissing
                    secondary: JsonField<Secondary> = JsonMissing.of(),
                ) : this(link, primary, secondary, mutableMapOf())

                /**
                 * Link button style
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun link(): Optional<Link> = link.getOptional("link")

                /**
                 * Primary button style
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun primary(): Optional<Primary> = primary.getOptional("primary")

                /**
                 * Secondary button style
                 *
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun secondary(): Optional<Secondary> = secondary.getOptional("secondary")

                /**
                 * Returns the raw JSON value of [link].
                 *
                 * Unlike [link], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("link") @ExcludeMissing fun _link(): JsonField<Link> = link

                /**
                 * Returns the raw JSON value of [primary].
                 *
                 * Unlike [primary], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("primary")
                @ExcludeMissing
                fun _primary(): JsonField<Primary> = primary

                /**
                 * Returns the raw JSON value of [secondary].
                 *
                 * Unlike [secondary], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("secondary")
                @ExcludeMissing
                fun _secondary(): JsonField<Secondary> = secondary

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

                    /** Returns a mutable builder for constructing an instance of [Button]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Button]. */
                class Builder internal constructor() {

                    private var link: JsonField<Link> = JsonMissing.of()
                    private var primary: JsonField<Primary> = JsonMissing.of()
                    private var secondary: JsonField<Secondary> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(button: Button) = apply {
                        link = button.link
                        primary = button.primary
                        secondary = button.secondary
                        additionalProperties = button.additionalProperties.toMutableMap()
                    }

                    /** Link button style */
                    fun link(link: Link) = link(JsonField.of(link))

                    /**
                     * Sets [Builder.link] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.link] with a well-typed [Link] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun link(link: JsonField<Link>) = apply { this.link = link }

                    /** Primary button style */
                    fun primary(primary: Primary) = primary(JsonField.of(primary))

                    /**
                     * Sets [Builder.primary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.primary] with a well-typed [Primary] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun primary(primary: JsonField<Primary>) = apply { this.primary = primary }

                    /** Secondary button style */
                    fun secondary(secondary: Secondary) = secondary(JsonField.of(secondary))

                    /**
                     * Sets [Builder.secondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.secondary] with a well-typed [Secondary]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun secondary(secondary: JsonField<Secondary>) = apply {
                        this.secondary = secondary
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
                     * Returns an immutable instance of [Button].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Button =
                        Button(link, primary, secondary, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Button = apply {
                    if (validated) {
                        return@apply
                    }

                    link().ifPresent { it.validate() }
                    primary().ifPresent { it.validate() }
                    secondary().ifPresent { it.validate() }
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
                    (link.asKnown().getOrNull()?.validity() ?: 0) +
                        (primary.asKnown().getOrNull()?.validity() ?: 0) +
                        (secondary.asKnown().getOrNull()?.validity() ?: 0)

                /** Link button style */
                class Link
                private constructor(
                    private val backgroundColor: JsonField<String>,
                    private val borderColor: JsonField<String>,
                    private val borderRadius: JsonField<String>,
                    private val borderStyle: JsonField<String>,
                    private val borderWidth: JsonField<String>,
                    private val boxShadow: JsonField<String>,
                    private val color: JsonField<String>,
                    private val fontSize: JsonField<String>,
                    private val fontWeight: JsonField<Double>,
                    private val padding: JsonField<String>,
                    private val textDecoration: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("backgroundColor")
                        @ExcludeMissing
                        backgroundColor: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("borderColor")
                        @ExcludeMissing
                        borderColor: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("borderRadius")
                        @ExcludeMissing
                        borderRadius: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("borderStyle")
                        @ExcludeMissing
                        borderStyle: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("borderWidth")
                        @ExcludeMissing
                        borderWidth: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("boxShadow")
                        @ExcludeMissing
                        boxShadow: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("color")
                        @ExcludeMissing
                        color: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontSize")
                        @ExcludeMissing
                        fontSize: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontWeight")
                        @ExcludeMissing
                        fontWeight: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("padding")
                        @ExcludeMissing
                        padding: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("textDecoration")
                        @ExcludeMissing
                        textDecoration: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        backgroundColor,
                        borderColor,
                        borderRadius,
                        borderStyle,
                        borderWidth,
                        boxShadow,
                        color,
                        fontSize,
                        fontWeight,
                        padding,
                        textDecoration,
                        mutableMapOf(),
                    )

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun backgroundColor(): Optional<String> =
                        backgroundColor.getOptional("backgroundColor")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun borderColor(): Optional<String> = borderColor.getOptional("borderColor")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun borderRadius(): Optional<String> = borderRadius.getOptional("borderRadius")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun borderStyle(): Optional<String> = borderStyle.getOptional("borderStyle")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun borderWidth(): Optional<String> = borderWidth.getOptional("borderWidth")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun boxShadow(): Optional<String> = boxShadow.getOptional("boxShadow")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun color(): Optional<String> = color.getOptional("color")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontSize(): Optional<String> = fontSize.getOptional("fontSize")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontWeight(): Optional<Double> = fontWeight.getOptional("fontWeight")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun padding(): Optional<String> = padding.getOptional("padding")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun textDecoration(): Optional<String> =
                        textDecoration.getOptional("textDecoration")

                    /**
                     * Returns the raw JSON value of [backgroundColor].
                     *
                     * Unlike [backgroundColor], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("backgroundColor")
                    @ExcludeMissing
                    fun _backgroundColor(): JsonField<String> = backgroundColor

                    /**
                     * Returns the raw JSON value of [borderColor].
                     *
                     * Unlike [borderColor], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("borderColor")
                    @ExcludeMissing
                    fun _borderColor(): JsonField<String> = borderColor

                    /**
                     * Returns the raw JSON value of [borderRadius].
                     *
                     * Unlike [borderRadius], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("borderRadius")
                    @ExcludeMissing
                    fun _borderRadius(): JsonField<String> = borderRadius

                    /**
                     * Returns the raw JSON value of [borderStyle].
                     *
                     * Unlike [borderStyle], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("borderStyle")
                    @ExcludeMissing
                    fun _borderStyle(): JsonField<String> = borderStyle

                    /**
                     * Returns the raw JSON value of [borderWidth].
                     *
                     * Unlike [borderWidth], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("borderWidth")
                    @ExcludeMissing
                    fun _borderWidth(): JsonField<String> = borderWidth

                    /**
                     * Returns the raw JSON value of [boxShadow].
                     *
                     * Unlike [boxShadow], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("boxShadow")
                    @ExcludeMissing
                    fun _boxShadow(): JsonField<String> = boxShadow

                    /**
                     * Returns the raw JSON value of [color].
                     *
                     * Unlike [color], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

                    /**
                     * Returns the raw JSON value of [fontSize].
                     *
                     * Unlike [fontSize], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontSize")
                    @ExcludeMissing
                    fun _fontSize(): JsonField<String> = fontSize

                    /**
                     * Returns the raw JSON value of [fontWeight].
                     *
                     * Unlike [fontWeight], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontWeight")
                    @ExcludeMissing
                    fun _fontWeight(): JsonField<Double> = fontWeight

                    /**
                     * Returns the raw JSON value of [padding].
                     *
                     * Unlike [padding], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("padding")
                    @ExcludeMissing
                    fun _padding(): JsonField<String> = padding

                    /**
                     * Returns the raw JSON value of [textDecoration].
                     *
                     * Unlike [textDecoration], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("textDecoration")
                    @ExcludeMissing
                    fun _textDecoration(): JsonField<String> = textDecoration

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

                        /** Returns a mutable builder for constructing an instance of [Link]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Link]. */
                    class Builder internal constructor() {

                        private var backgroundColor: JsonField<String> = JsonMissing.of()
                        private var borderColor: JsonField<String> = JsonMissing.of()
                        private var borderRadius: JsonField<String> = JsonMissing.of()
                        private var borderStyle: JsonField<String> = JsonMissing.of()
                        private var borderWidth: JsonField<String> = JsonMissing.of()
                        private var boxShadow: JsonField<String> = JsonMissing.of()
                        private var color: JsonField<String> = JsonMissing.of()
                        private var fontSize: JsonField<String> = JsonMissing.of()
                        private var fontWeight: JsonField<Double> = JsonMissing.of()
                        private var padding: JsonField<String> = JsonMissing.of()
                        private var textDecoration: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(link: Link) = apply {
                            backgroundColor = link.backgroundColor
                            borderColor = link.borderColor
                            borderRadius = link.borderRadius
                            borderStyle = link.borderStyle
                            borderWidth = link.borderWidth
                            boxShadow = link.boxShadow
                            color = link.color
                            fontSize = link.fontSize
                            fontWeight = link.fontWeight
                            padding = link.padding
                            textDecoration = link.textDecoration
                            additionalProperties = link.additionalProperties.toMutableMap()
                        }

                        fun backgroundColor(backgroundColor: String) =
                            backgroundColor(JsonField.of(backgroundColor))

                        /**
                         * Sets [Builder.backgroundColor] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.backgroundColor] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun backgroundColor(backgroundColor: JsonField<String>) = apply {
                            this.backgroundColor = backgroundColor
                        }

                        fun borderColor(borderColor: String) =
                            borderColor(JsonField.of(borderColor))

                        /**
                         * Sets [Builder.borderColor] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.borderColor] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun borderColor(borderColor: JsonField<String>) = apply {
                            this.borderColor = borderColor
                        }

                        fun borderRadius(borderRadius: String) =
                            borderRadius(JsonField.of(borderRadius))

                        /**
                         * Sets [Builder.borderRadius] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.borderRadius] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun borderRadius(borderRadius: JsonField<String>) = apply {
                            this.borderRadius = borderRadius
                        }

                        fun borderStyle(borderStyle: String) =
                            borderStyle(JsonField.of(borderStyle))

                        /**
                         * Sets [Builder.borderStyle] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.borderStyle] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun borderStyle(borderStyle: JsonField<String>) = apply {
                            this.borderStyle = borderStyle
                        }

                        fun borderWidth(borderWidth: String) =
                            borderWidth(JsonField.of(borderWidth))

                        /**
                         * Sets [Builder.borderWidth] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.borderWidth] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun borderWidth(borderWidth: JsonField<String>) = apply {
                            this.borderWidth = borderWidth
                        }

                        fun boxShadow(boxShadow: String) = boxShadow(JsonField.of(boxShadow))

                        /**
                         * Sets [Builder.boxShadow] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.boxShadow] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun boxShadow(boxShadow: JsonField<String>) = apply {
                            this.boxShadow = boxShadow
                        }

                        fun color(color: String) = color(JsonField.of(color))

                        /**
                         * Sets [Builder.color] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.color] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun color(color: JsonField<String>) = apply { this.color = color }

                        fun fontSize(fontSize: String) = fontSize(JsonField.of(fontSize))

                        /**
                         * Sets [Builder.fontSize] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontSize] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontSize(fontSize: JsonField<String>) = apply {
                            this.fontSize = fontSize
                        }

                        fun fontWeight(fontWeight: Double) = fontWeight(JsonField.of(fontWeight))

                        /**
                         * Sets [Builder.fontWeight] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontWeight] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontWeight(fontWeight: JsonField<Double>) = apply {
                            this.fontWeight = fontWeight
                        }

                        fun padding(padding: String) = padding(JsonField.of(padding))

                        /**
                         * Sets [Builder.padding] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.padding] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun padding(padding: JsonField<String>) = apply { this.padding = padding }

                        fun textDecoration(textDecoration: String) =
                            textDecoration(JsonField.of(textDecoration))

                        /**
                         * Sets [Builder.textDecoration] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.textDecoration] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun textDecoration(textDecoration: JsonField<String>) = apply {
                            this.textDecoration = textDecoration
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Link].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Link =
                            Link(
                                backgroundColor,
                                borderColor,
                                borderRadius,
                                borderStyle,
                                borderWidth,
                                boxShadow,
                                color,
                                fontSize,
                                fontWeight,
                                padding,
                                textDecoration,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Link = apply {
                        if (validated) {
                            return@apply
                        }

                        backgroundColor()
                        borderColor()
                        borderRadius()
                        borderStyle()
                        borderWidth()
                        boxShadow()
                        color()
                        fontSize()
                        fontWeight()
                        padding()
                        textDecoration()
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
                        (if (backgroundColor.asKnown().isPresent) 1 else 0) +
                            (if (borderColor.asKnown().isPresent) 1 else 0) +
                            (if (borderRadius.asKnown().isPresent) 1 else 0) +
                            (if (borderStyle.asKnown().isPresent) 1 else 0) +
                            (if (borderWidth.asKnown().isPresent) 1 else 0) +
                            (if (boxShadow.asKnown().isPresent) 1 else 0) +
                            (if (color.asKnown().isPresent) 1 else 0) +
                            (if (fontSize.asKnown().isPresent) 1 else 0) +
                            (if (fontWeight.asKnown().isPresent) 1 else 0) +
                            (if (padding.asKnown().isPresent) 1 else 0) +
                            (if (textDecoration.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Link && backgroundColor == other.backgroundColor && borderColor == other.borderColor && borderRadius == other.borderRadius && borderStyle == other.borderStyle && borderWidth == other.borderWidth && boxShadow == other.boxShadow && color == other.color && fontSize == other.fontSize && fontWeight == other.fontWeight && padding == other.padding && textDecoration == other.textDecoration && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(backgroundColor, borderColor, borderRadius, borderStyle, borderWidth, boxShadow, color, fontSize, fontWeight, padding, textDecoration, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Link{backgroundColor=$backgroundColor, borderColor=$borderColor, borderRadius=$borderRadius, borderStyle=$borderStyle, borderWidth=$borderWidth, boxShadow=$boxShadow, color=$color, fontSize=$fontSize, fontWeight=$fontWeight, padding=$padding, textDecoration=$textDecoration, additionalProperties=$additionalProperties}"
                }

                /** Primary button style */
                class Primary
                private constructor(
                    private val backgroundColor: JsonField<String>,
                    private val borderColor: JsonField<String>,
                    private val borderRadius: JsonField<String>,
                    private val borderStyle: JsonField<String>,
                    private val borderWidth: JsonField<String>,
                    private val boxShadow: JsonField<String>,
                    private val color: JsonField<String>,
                    private val fontSize: JsonField<String>,
                    private val fontWeight: JsonField<Double>,
                    private val padding: JsonField<String>,
                    private val textDecoration: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("backgroundColor")
                        @ExcludeMissing
                        backgroundColor: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("borderColor")
                        @ExcludeMissing
                        borderColor: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("borderRadius")
                        @ExcludeMissing
                        borderRadius: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("borderStyle")
                        @ExcludeMissing
                        borderStyle: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("borderWidth")
                        @ExcludeMissing
                        borderWidth: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("boxShadow")
                        @ExcludeMissing
                        boxShadow: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("color")
                        @ExcludeMissing
                        color: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontSize")
                        @ExcludeMissing
                        fontSize: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontWeight")
                        @ExcludeMissing
                        fontWeight: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("padding")
                        @ExcludeMissing
                        padding: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("textDecoration")
                        @ExcludeMissing
                        textDecoration: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        backgroundColor,
                        borderColor,
                        borderRadius,
                        borderStyle,
                        borderWidth,
                        boxShadow,
                        color,
                        fontSize,
                        fontWeight,
                        padding,
                        textDecoration,
                        mutableMapOf(),
                    )

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun backgroundColor(): Optional<String> =
                        backgroundColor.getOptional("backgroundColor")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun borderColor(): Optional<String> = borderColor.getOptional("borderColor")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun borderRadius(): Optional<String> = borderRadius.getOptional("borderRadius")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun borderStyle(): Optional<String> = borderStyle.getOptional("borderStyle")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun borderWidth(): Optional<String> = borderWidth.getOptional("borderWidth")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun boxShadow(): Optional<String> = boxShadow.getOptional("boxShadow")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun color(): Optional<String> = color.getOptional("color")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontSize(): Optional<String> = fontSize.getOptional("fontSize")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontWeight(): Optional<Double> = fontWeight.getOptional("fontWeight")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun padding(): Optional<String> = padding.getOptional("padding")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun textDecoration(): Optional<String> =
                        textDecoration.getOptional("textDecoration")

                    /**
                     * Returns the raw JSON value of [backgroundColor].
                     *
                     * Unlike [backgroundColor], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("backgroundColor")
                    @ExcludeMissing
                    fun _backgroundColor(): JsonField<String> = backgroundColor

                    /**
                     * Returns the raw JSON value of [borderColor].
                     *
                     * Unlike [borderColor], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("borderColor")
                    @ExcludeMissing
                    fun _borderColor(): JsonField<String> = borderColor

                    /**
                     * Returns the raw JSON value of [borderRadius].
                     *
                     * Unlike [borderRadius], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("borderRadius")
                    @ExcludeMissing
                    fun _borderRadius(): JsonField<String> = borderRadius

                    /**
                     * Returns the raw JSON value of [borderStyle].
                     *
                     * Unlike [borderStyle], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("borderStyle")
                    @ExcludeMissing
                    fun _borderStyle(): JsonField<String> = borderStyle

                    /**
                     * Returns the raw JSON value of [borderWidth].
                     *
                     * Unlike [borderWidth], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("borderWidth")
                    @ExcludeMissing
                    fun _borderWidth(): JsonField<String> = borderWidth

                    /**
                     * Returns the raw JSON value of [boxShadow].
                     *
                     * Unlike [boxShadow], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("boxShadow")
                    @ExcludeMissing
                    fun _boxShadow(): JsonField<String> = boxShadow

                    /**
                     * Returns the raw JSON value of [color].
                     *
                     * Unlike [color], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

                    /**
                     * Returns the raw JSON value of [fontSize].
                     *
                     * Unlike [fontSize], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontSize")
                    @ExcludeMissing
                    fun _fontSize(): JsonField<String> = fontSize

                    /**
                     * Returns the raw JSON value of [fontWeight].
                     *
                     * Unlike [fontWeight], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontWeight")
                    @ExcludeMissing
                    fun _fontWeight(): JsonField<Double> = fontWeight

                    /**
                     * Returns the raw JSON value of [padding].
                     *
                     * Unlike [padding], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("padding")
                    @ExcludeMissing
                    fun _padding(): JsonField<String> = padding

                    /**
                     * Returns the raw JSON value of [textDecoration].
                     *
                     * Unlike [textDecoration], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("textDecoration")
                    @ExcludeMissing
                    fun _textDecoration(): JsonField<String> = textDecoration

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

                        /** Returns a mutable builder for constructing an instance of [Primary]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Primary]. */
                    class Builder internal constructor() {

                        private var backgroundColor: JsonField<String> = JsonMissing.of()
                        private var borderColor: JsonField<String> = JsonMissing.of()
                        private var borderRadius: JsonField<String> = JsonMissing.of()
                        private var borderStyle: JsonField<String> = JsonMissing.of()
                        private var borderWidth: JsonField<String> = JsonMissing.of()
                        private var boxShadow: JsonField<String> = JsonMissing.of()
                        private var color: JsonField<String> = JsonMissing.of()
                        private var fontSize: JsonField<String> = JsonMissing.of()
                        private var fontWeight: JsonField<Double> = JsonMissing.of()
                        private var padding: JsonField<String> = JsonMissing.of()
                        private var textDecoration: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(primary: Primary) = apply {
                            backgroundColor = primary.backgroundColor
                            borderColor = primary.borderColor
                            borderRadius = primary.borderRadius
                            borderStyle = primary.borderStyle
                            borderWidth = primary.borderWidth
                            boxShadow = primary.boxShadow
                            color = primary.color
                            fontSize = primary.fontSize
                            fontWeight = primary.fontWeight
                            padding = primary.padding
                            textDecoration = primary.textDecoration
                            additionalProperties = primary.additionalProperties.toMutableMap()
                        }

                        fun backgroundColor(backgroundColor: String) =
                            backgroundColor(JsonField.of(backgroundColor))

                        /**
                         * Sets [Builder.backgroundColor] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.backgroundColor] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun backgroundColor(backgroundColor: JsonField<String>) = apply {
                            this.backgroundColor = backgroundColor
                        }

                        fun borderColor(borderColor: String) =
                            borderColor(JsonField.of(borderColor))

                        /**
                         * Sets [Builder.borderColor] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.borderColor] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun borderColor(borderColor: JsonField<String>) = apply {
                            this.borderColor = borderColor
                        }

                        fun borderRadius(borderRadius: String) =
                            borderRadius(JsonField.of(borderRadius))

                        /**
                         * Sets [Builder.borderRadius] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.borderRadius] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun borderRadius(borderRadius: JsonField<String>) = apply {
                            this.borderRadius = borderRadius
                        }

                        fun borderStyle(borderStyle: String) =
                            borderStyle(JsonField.of(borderStyle))

                        /**
                         * Sets [Builder.borderStyle] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.borderStyle] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun borderStyle(borderStyle: JsonField<String>) = apply {
                            this.borderStyle = borderStyle
                        }

                        fun borderWidth(borderWidth: String) =
                            borderWidth(JsonField.of(borderWidth))

                        /**
                         * Sets [Builder.borderWidth] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.borderWidth] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun borderWidth(borderWidth: JsonField<String>) = apply {
                            this.borderWidth = borderWidth
                        }

                        fun boxShadow(boxShadow: String) = boxShadow(JsonField.of(boxShadow))

                        /**
                         * Sets [Builder.boxShadow] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.boxShadow] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun boxShadow(boxShadow: JsonField<String>) = apply {
                            this.boxShadow = boxShadow
                        }

                        fun color(color: String) = color(JsonField.of(color))

                        /**
                         * Sets [Builder.color] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.color] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun color(color: JsonField<String>) = apply { this.color = color }

                        fun fontSize(fontSize: String) = fontSize(JsonField.of(fontSize))

                        /**
                         * Sets [Builder.fontSize] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontSize] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontSize(fontSize: JsonField<String>) = apply {
                            this.fontSize = fontSize
                        }

                        fun fontWeight(fontWeight: Double) = fontWeight(JsonField.of(fontWeight))

                        /**
                         * Sets [Builder.fontWeight] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontWeight] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontWeight(fontWeight: JsonField<Double>) = apply {
                            this.fontWeight = fontWeight
                        }

                        fun padding(padding: String) = padding(JsonField.of(padding))

                        /**
                         * Sets [Builder.padding] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.padding] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun padding(padding: JsonField<String>) = apply { this.padding = padding }

                        fun textDecoration(textDecoration: String) =
                            textDecoration(JsonField.of(textDecoration))

                        /**
                         * Sets [Builder.textDecoration] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.textDecoration] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun textDecoration(textDecoration: JsonField<String>) = apply {
                            this.textDecoration = textDecoration
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Primary].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Primary =
                            Primary(
                                backgroundColor,
                                borderColor,
                                borderRadius,
                                borderStyle,
                                borderWidth,
                                boxShadow,
                                color,
                                fontSize,
                                fontWeight,
                                padding,
                                textDecoration,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Primary = apply {
                        if (validated) {
                            return@apply
                        }

                        backgroundColor()
                        borderColor()
                        borderRadius()
                        borderStyle()
                        borderWidth()
                        boxShadow()
                        color()
                        fontSize()
                        fontWeight()
                        padding()
                        textDecoration()
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
                        (if (backgroundColor.asKnown().isPresent) 1 else 0) +
                            (if (borderColor.asKnown().isPresent) 1 else 0) +
                            (if (borderRadius.asKnown().isPresent) 1 else 0) +
                            (if (borderStyle.asKnown().isPresent) 1 else 0) +
                            (if (borderWidth.asKnown().isPresent) 1 else 0) +
                            (if (boxShadow.asKnown().isPresent) 1 else 0) +
                            (if (color.asKnown().isPresent) 1 else 0) +
                            (if (fontSize.asKnown().isPresent) 1 else 0) +
                            (if (fontWeight.asKnown().isPresent) 1 else 0) +
                            (if (padding.asKnown().isPresent) 1 else 0) +
                            (if (textDecoration.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Primary && backgroundColor == other.backgroundColor && borderColor == other.borderColor && borderRadius == other.borderRadius && borderStyle == other.borderStyle && borderWidth == other.borderWidth && boxShadow == other.boxShadow && color == other.color && fontSize == other.fontSize && fontWeight == other.fontWeight && padding == other.padding && textDecoration == other.textDecoration && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(backgroundColor, borderColor, borderRadius, borderStyle, borderWidth, boxShadow, color, fontSize, fontWeight, padding, textDecoration, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Primary{backgroundColor=$backgroundColor, borderColor=$borderColor, borderRadius=$borderRadius, borderStyle=$borderStyle, borderWidth=$borderWidth, boxShadow=$boxShadow, color=$color, fontSize=$fontSize, fontWeight=$fontWeight, padding=$padding, textDecoration=$textDecoration, additionalProperties=$additionalProperties}"
                }

                /** Secondary button style */
                class Secondary
                private constructor(
                    private val backgroundColor: JsonField<String>,
                    private val borderColor: JsonField<String>,
                    private val borderRadius: JsonField<String>,
                    private val borderStyle: JsonField<String>,
                    private val borderWidth: JsonField<String>,
                    private val boxShadow: JsonField<String>,
                    private val color: JsonField<String>,
                    private val fontSize: JsonField<String>,
                    private val fontWeight: JsonField<Double>,
                    private val padding: JsonField<String>,
                    private val textDecoration: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("backgroundColor")
                        @ExcludeMissing
                        backgroundColor: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("borderColor")
                        @ExcludeMissing
                        borderColor: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("borderRadius")
                        @ExcludeMissing
                        borderRadius: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("borderStyle")
                        @ExcludeMissing
                        borderStyle: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("borderWidth")
                        @ExcludeMissing
                        borderWidth: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("boxShadow")
                        @ExcludeMissing
                        boxShadow: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("color")
                        @ExcludeMissing
                        color: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontSize")
                        @ExcludeMissing
                        fontSize: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontWeight")
                        @ExcludeMissing
                        fontWeight: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("padding")
                        @ExcludeMissing
                        padding: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("textDecoration")
                        @ExcludeMissing
                        textDecoration: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        backgroundColor,
                        borderColor,
                        borderRadius,
                        borderStyle,
                        borderWidth,
                        boxShadow,
                        color,
                        fontSize,
                        fontWeight,
                        padding,
                        textDecoration,
                        mutableMapOf(),
                    )

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun backgroundColor(): Optional<String> =
                        backgroundColor.getOptional("backgroundColor")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun borderColor(): Optional<String> = borderColor.getOptional("borderColor")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun borderRadius(): Optional<String> = borderRadius.getOptional("borderRadius")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun borderStyle(): Optional<String> = borderStyle.getOptional("borderStyle")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun borderWidth(): Optional<String> = borderWidth.getOptional("borderWidth")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun boxShadow(): Optional<String> = boxShadow.getOptional("boxShadow")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun color(): Optional<String> = color.getOptional("color")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontSize(): Optional<String> = fontSize.getOptional("fontSize")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontWeight(): Optional<Double> = fontWeight.getOptional("fontWeight")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun padding(): Optional<String> = padding.getOptional("padding")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun textDecoration(): Optional<String> =
                        textDecoration.getOptional("textDecoration")

                    /**
                     * Returns the raw JSON value of [backgroundColor].
                     *
                     * Unlike [backgroundColor], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("backgroundColor")
                    @ExcludeMissing
                    fun _backgroundColor(): JsonField<String> = backgroundColor

                    /**
                     * Returns the raw JSON value of [borderColor].
                     *
                     * Unlike [borderColor], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("borderColor")
                    @ExcludeMissing
                    fun _borderColor(): JsonField<String> = borderColor

                    /**
                     * Returns the raw JSON value of [borderRadius].
                     *
                     * Unlike [borderRadius], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("borderRadius")
                    @ExcludeMissing
                    fun _borderRadius(): JsonField<String> = borderRadius

                    /**
                     * Returns the raw JSON value of [borderStyle].
                     *
                     * Unlike [borderStyle], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("borderStyle")
                    @ExcludeMissing
                    fun _borderStyle(): JsonField<String> = borderStyle

                    /**
                     * Returns the raw JSON value of [borderWidth].
                     *
                     * Unlike [borderWidth], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("borderWidth")
                    @ExcludeMissing
                    fun _borderWidth(): JsonField<String> = borderWidth

                    /**
                     * Returns the raw JSON value of [boxShadow].
                     *
                     * Unlike [boxShadow], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("boxShadow")
                    @ExcludeMissing
                    fun _boxShadow(): JsonField<String> = boxShadow

                    /**
                     * Returns the raw JSON value of [color].
                     *
                     * Unlike [color], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

                    /**
                     * Returns the raw JSON value of [fontSize].
                     *
                     * Unlike [fontSize], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontSize")
                    @ExcludeMissing
                    fun _fontSize(): JsonField<String> = fontSize

                    /**
                     * Returns the raw JSON value of [fontWeight].
                     *
                     * Unlike [fontWeight], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontWeight")
                    @ExcludeMissing
                    fun _fontWeight(): JsonField<Double> = fontWeight

                    /**
                     * Returns the raw JSON value of [padding].
                     *
                     * Unlike [padding], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("padding")
                    @ExcludeMissing
                    fun _padding(): JsonField<String> = padding

                    /**
                     * Returns the raw JSON value of [textDecoration].
                     *
                     * Unlike [textDecoration], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("textDecoration")
                    @ExcludeMissing
                    fun _textDecoration(): JsonField<String> = textDecoration

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
                         * Returns a mutable builder for constructing an instance of [Secondary].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Secondary]. */
                    class Builder internal constructor() {

                        private var backgroundColor: JsonField<String> = JsonMissing.of()
                        private var borderColor: JsonField<String> = JsonMissing.of()
                        private var borderRadius: JsonField<String> = JsonMissing.of()
                        private var borderStyle: JsonField<String> = JsonMissing.of()
                        private var borderWidth: JsonField<String> = JsonMissing.of()
                        private var boxShadow: JsonField<String> = JsonMissing.of()
                        private var color: JsonField<String> = JsonMissing.of()
                        private var fontSize: JsonField<String> = JsonMissing.of()
                        private var fontWeight: JsonField<Double> = JsonMissing.of()
                        private var padding: JsonField<String> = JsonMissing.of()
                        private var textDecoration: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(secondary: Secondary) = apply {
                            backgroundColor = secondary.backgroundColor
                            borderColor = secondary.borderColor
                            borderRadius = secondary.borderRadius
                            borderStyle = secondary.borderStyle
                            borderWidth = secondary.borderWidth
                            boxShadow = secondary.boxShadow
                            color = secondary.color
                            fontSize = secondary.fontSize
                            fontWeight = secondary.fontWeight
                            padding = secondary.padding
                            textDecoration = secondary.textDecoration
                            additionalProperties = secondary.additionalProperties.toMutableMap()
                        }

                        fun backgroundColor(backgroundColor: String) =
                            backgroundColor(JsonField.of(backgroundColor))

                        /**
                         * Sets [Builder.backgroundColor] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.backgroundColor] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun backgroundColor(backgroundColor: JsonField<String>) = apply {
                            this.backgroundColor = backgroundColor
                        }

                        fun borderColor(borderColor: String) =
                            borderColor(JsonField.of(borderColor))

                        /**
                         * Sets [Builder.borderColor] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.borderColor] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun borderColor(borderColor: JsonField<String>) = apply {
                            this.borderColor = borderColor
                        }

                        fun borderRadius(borderRadius: String) =
                            borderRadius(JsonField.of(borderRadius))

                        /**
                         * Sets [Builder.borderRadius] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.borderRadius] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun borderRadius(borderRadius: JsonField<String>) = apply {
                            this.borderRadius = borderRadius
                        }

                        fun borderStyle(borderStyle: String) =
                            borderStyle(JsonField.of(borderStyle))

                        /**
                         * Sets [Builder.borderStyle] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.borderStyle] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun borderStyle(borderStyle: JsonField<String>) = apply {
                            this.borderStyle = borderStyle
                        }

                        fun borderWidth(borderWidth: String) =
                            borderWidth(JsonField.of(borderWidth))

                        /**
                         * Sets [Builder.borderWidth] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.borderWidth] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun borderWidth(borderWidth: JsonField<String>) = apply {
                            this.borderWidth = borderWidth
                        }

                        fun boxShadow(boxShadow: String) = boxShadow(JsonField.of(boxShadow))

                        /**
                         * Sets [Builder.boxShadow] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.boxShadow] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun boxShadow(boxShadow: JsonField<String>) = apply {
                            this.boxShadow = boxShadow
                        }

                        fun color(color: String) = color(JsonField.of(color))

                        /**
                         * Sets [Builder.color] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.color] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun color(color: JsonField<String>) = apply { this.color = color }

                        fun fontSize(fontSize: String) = fontSize(JsonField.of(fontSize))

                        /**
                         * Sets [Builder.fontSize] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontSize] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontSize(fontSize: JsonField<String>) = apply {
                            this.fontSize = fontSize
                        }

                        fun fontWeight(fontWeight: Double) = fontWeight(JsonField.of(fontWeight))

                        /**
                         * Sets [Builder.fontWeight] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontWeight] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontWeight(fontWeight: JsonField<Double>) = apply {
                            this.fontWeight = fontWeight
                        }

                        fun padding(padding: String) = padding(JsonField.of(padding))

                        /**
                         * Sets [Builder.padding] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.padding] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun padding(padding: JsonField<String>) = apply { this.padding = padding }

                        fun textDecoration(textDecoration: String) =
                            textDecoration(JsonField.of(textDecoration))

                        /**
                         * Sets [Builder.textDecoration] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.textDecoration] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun textDecoration(textDecoration: JsonField<String>) = apply {
                            this.textDecoration = textDecoration
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Secondary].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Secondary =
                            Secondary(
                                backgroundColor,
                                borderColor,
                                borderRadius,
                                borderStyle,
                                borderWidth,
                                boxShadow,
                                color,
                                fontSize,
                                fontWeight,
                                padding,
                                textDecoration,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Secondary = apply {
                        if (validated) {
                            return@apply
                        }

                        backgroundColor()
                        borderColor()
                        borderRadius()
                        borderStyle()
                        borderWidth()
                        boxShadow()
                        color()
                        fontSize()
                        fontWeight()
                        padding()
                        textDecoration()
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
                        (if (backgroundColor.asKnown().isPresent) 1 else 0) +
                            (if (borderColor.asKnown().isPresent) 1 else 0) +
                            (if (borderRadius.asKnown().isPresent) 1 else 0) +
                            (if (borderStyle.asKnown().isPresent) 1 else 0) +
                            (if (borderWidth.asKnown().isPresent) 1 else 0) +
                            (if (boxShadow.asKnown().isPresent) 1 else 0) +
                            (if (color.asKnown().isPresent) 1 else 0) +
                            (if (fontSize.asKnown().isPresent) 1 else 0) +
                            (if (fontWeight.asKnown().isPresent) 1 else 0) +
                            (if (padding.asKnown().isPresent) 1 else 0) +
                            (if (textDecoration.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Secondary && backgroundColor == other.backgroundColor && borderColor == other.borderColor && borderRadius == other.borderRadius && borderStyle == other.borderStyle && borderWidth == other.borderWidth && boxShadow == other.boxShadow && color == other.color && fontSize == other.fontSize && fontWeight == other.fontWeight && padding == other.padding && textDecoration == other.textDecoration && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(backgroundColor, borderColor, borderRadius, borderStyle, borderWidth, boxShadow, color, fontSize, fontWeight, padding, textDecoration, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Secondary{backgroundColor=$backgroundColor, borderColor=$borderColor, borderRadius=$borderRadius, borderStyle=$borderStyle, borderWidth=$borderWidth, boxShadow=$boxShadow, color=$color, fontSize=$fontSize, fontWeight=$fontWeight, padding=$padding, textDecoration=$textDecoration, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Button && link == other.link && primary == other.primary && secondary == other.secondary && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(link, primary, secondary, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Button{link=$link, primary=$primary, secondary=$secondary, additionalProperties=$additionalProperties}"
            }

            /** Card component style */
            class Card
            private constructor(
                private val backgroundColor: JsonField<String>,
                private val borderColor: JsonField<String>,
                private val borderRadius: JsonField<String>,
                private val borderStyle: JsonField<String>,
                private val borderWidth: JsonField<String>,
                private val boxShadow: JsonField<String>,
                private val padding: JsonField<String>,
                private val textColor: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("backgroundColor")
                    @ExcludeMissing
                    backgroundColor: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("borderColor")
                    @ExcludeMissing
                    borderColor: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("borderRadius")
                    @ExcludeMissing
                    borderRadius: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("borderStyle")
                    @ExcludeMissing
                    borderStyle: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("borderWidth")
                    @ExcludeMissing
                    borderWidth: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("boxShadow")
                    @ExcludeMissing
                    boxShadow: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("padding")
                    @ExcludeMissing
                    padding: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("textColor")
                    @ExcludeMissing
                    textColor: JsonField<String> = JsonMissing.of(),
                ) : this(
                    backgroundColor,
                    borderColor,
                    borderRadius,
                    borderStyle,
                    borderWidth,
                    boxShadow,
                    padding,
                    textColor,
                    mutableMapOf(),
                )

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun backgroundColor(): Optional<String> =
                    backgroundColor.getOptional("backgroundColor")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun borderColor(): Optional<String> = borderColor.getOptional("borderColor")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun borderRadius(): Optional<String> = borderRadius.getOptional("borderRadius")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun borderStyle(): Optional<String> = borderStyle.getOptional("borderStyle")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun borderWidth(): Optional<String> = borderWidth.getOptional("borderWidth")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun boxShadow(): Optional<String> = boxShadow.getOptional("boxShadow")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun padding(): Optional<String> = padding.getOptional("padding")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun textColor(): Optional<String> = textColor.getOptional("textColor")

                /**
                 * Returns the raw JSON value of [backgroundColor].
                 *
                 * Unlike [backgroundColor], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("backgroundColor")
                @ExcludeMissing
                fun _backgroundColor(): JsonField<String> = backgroundColor

                /**
                 * Returns the raw JSON value of [borderColor].
                 *
                 * Unlike [borderColor], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("borderColor")
                @ExcludeMissing
                fun _borderColor(): JsonField<String> = borderColor

                /**
                 * Returns the raw JSON value of [borderRadius].
                 *
                 * Unlike [borderRadius], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("borderRadius")
                @ExcludeMissing
                fun _borderRadius(): JsonField<String> = borderRadius

                /**
                 * Returns the raw JSON value of [borderStyle].
                 *
                 * Unlike [borderStyle], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("borderStyle")
                @ExcludeMissing
                fun _borderStyle(): JsonField<String> = borderStyle

                /**
                 * Returns the raw JSON value of [borderWidth].
                 *
                 * Unlike [borderWidth], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("borderWidth")
                @ExcludeMissing
                fun _borderWidth(): JsonField<String> = borderWidth

                /**
                 * Returns the raw JSON value of [boxShadow].
                 *
                 * Unlike [boxShadow], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("boxShadow")
                @ExcludeMissing
                fun _boxShadow(): JsonField<String> = boxShadow

                /**
                 * Returns the raw JSON value of [padding].
                 *
                 * Unlike [padding], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("padding") @ExcludeMissing fun _padding(): JsonField<String> = padding

                /**
                 * Returns the raw JSON value of [textColor].
                 *
                 * Unlike [textColor], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("textColor")
                @ExcludeMissing
                fun _textColor(): JsonField<String> = textColor

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

                    /** Returns a mutable builder for constructing an instance of [Card]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Card]. */
                class Builder internal constructor() {

                    private var backgroundColor: JsonField<String> = JsonMissing.of()
                    private var borderColor: JsonField<String> = JsonMissing.of()
                    private var borderRadius: JsonField<String> = JsonMissing.of()
                    private var borderStyle: JsonField<String> = JsonMissing.of()
                    private var borderWidth: JsonField<String> = JsonMissing.of()
                    private var boxShadow: JsonField<String> = JsonMissing.of()
                    private var padding: JsonField<String> = JsonMissing.of()
                    private var textColor: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(card: Card) = apply {
                        backgroundColor = card.backgroundColor
                        borderColor = card.borderColor
                        borderRadius = card.borderRadius
                        borderStyle = card.borderStyle
                        borderWidth = card.borderWidth
                        boxShadow = card.boxShadow
                        padding = card.padding
                        textColor = card.textColor
                        additionalProperties = card.additionalProperties.toMutableMap()
                    }

                    fun backgroundColor(backgroundColor: String) =
                        backgroundColor(JsonField.of(backgroundColor))

                    /**
                     * Sets [Builder.backgroundColor] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.backgroundColor] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun backgroundColor(backgroundColor: JsonField<String>) = apply {
                        this.backgroundColor = backgroundColor
                    }

                    fun borderColor(borderColor: String) = borderColor(JsonField.of(borderColor))

                    /**
                     * Sets [Builder.borderColor] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.borderColor] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun borderColor(borderColor: JsonField<String>) = apply {
                        this.borderColor = borderColor
                    }

                    fun borderRadius(borderRadius: String) =
                        borderRadius(JsonField.of(borderRadius))

                    /**
                     * Sets [Builder.borderRadius] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.borderRadius] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun borderRadius(borderRadius: JsonField<String>) = apply {
                        this.borderRadius = borderRadius
                    }

                    fun borderStyle(borderStyle: String) = borderStyle(JsonField.of(borderStyle))

                    /**
                     * Sets [Builder.borderStyle] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.borderStyle] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun borderStyle(borderStyle: JsonField<String>) = apply {
                        this.borderStyle = borderStyle
                    }

                    fun borderWidth(borderWidth: String) = borderWidth(JsonField.of(borderWidth))

                    /**
                     * Sets [Builder.borderWidth] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.borderWidth] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun borderWidth(borderWidth: JsonField<String>) = apply {
                        this.borderWidth = borderWidth
                    }

                    fun boxShadow(boxShadow: String) = boxShadow(JsonField.of(boxShadow))

                    /**
                     * Sets [Builder.boxShadow] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.boxShadow] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun boxShadow(boxShadow: JsonField<String>) = apply {
                        this.boxShadow = boxShadow
                    }

                    fun padding(padding: String) = padding(JsonField.of(padding))

                    /**
                     * Sets [Builder.padding] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.padding] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun padding(padding: JsonField<String>) = apply { this.padding = padding }

                    fun textColor(textColor: String) = textColor(JsonField.of(textColor))

                    /**
                     * Sets [Builder.textColor] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.textColor] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun textColor(textColor: JsonField<String>) = apply {
                        this.textColor = textColor
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
                     * Returns an immutable instance of [Card].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Card =
                        Card(
                            backgroundColor,
                            borderColor,
                            borderRadius,
                            borderStyle,
                            borderWidth,
                            boxShadow,
                            padding,
                            textColor,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Card = apply {
                    if (validated) {
                        return@apply
                    }

                    backgroundColor()
                    borderColor()
                    borderRadius()
                    borderStyle()
                    borderWidth()
                    boxShadow()
                    padding()
                    textColor()
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
                    (if (backgroundColor.asKnown().isPresent) 1 else 0) +
                        (if (borderColor.asKnown().isPresent) 1 else 0) +
                        (if (borderRadius.asKnown().isPresent) 1 else 0) +
                        (if (borderStyle.asKnown().isPresent) 1 else 0) +
                        (if (borderWidth.asKnown().isPresent) 1 else 0) +
                        (if (boxShadow.asKnown().isPresent) 1 else 0) +
                        (if (padding.asKnown().isPresent) 1 else 0) +
                        (if (textColor.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Card && backgroundColor == other.backgroundColor && borderColor == other.borderColor && borderRadius == other.borderRadius && borderStyle == other.borderStyle && borderWidth == other.borderWidth && boxShadow == other.boxShadow && padding == other.padding && textColor == other.textColor && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(backgroundColor, borderColor, borderRadius, borderStyle, borderWidth, boxShadow, padding, textColor, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Card{backgroundColor=$backgroundColor, borderColor=$borderColor, borderRadius=$borderRadius, borderStyle=$borderStyle, borderWidth=$borderWidth, boxShadow=$boxShadow, padding=$padding, textColor=$textColor, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Components && button == other.button && card == other.card && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(button, card, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Components{button=$button, card=$card, additionalProperties=$additionalProperties}"
        }

        /** Spacing system used on the website */
        class ElementSpacing
        private constructor(
            private val lg: JsonField<String>,
            private val md: JsonField<String>,
            private val sm: JsonField<String>,
            private val xl: JsonField<String>,
            private val xs: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lg") @ExcludeMissing lg: JsonField<String> = JsonMissing.of(),
                @JsonProperty("md") @ExcludeMissing md: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sm") @ExcludeMissing sm: JsonField<String> = JsonMissing.of(),
                @JsonProperty("xl") @ExcludeMissing xl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("xs") @ExcludeMissing xs: JsonField<String> = JsonMissing.of(),
            ) : this(lg, md, sm, xl, xs, mutableMapOf())

            /**
             * Large spacing value
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun lg(): Optional<String> = lg.getOptional("lg")

            /**
             * Medium spacing value
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun md(): Optional<String> = md.getOptional("md")

            /**
             * Small spacing value
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun sm(): Optional<String> = sm.getOptional("sm")

            /**
             * Extra large spacing value
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun xl(): Optional<String> = xl.getOptional("xl")

            /**
             * Extra small spacing value
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun xs(): Optional<String> = xs.getOptional("xs")

            /**
             * Returns the raw JSON value of [lg].
             *
             * Unlike [lg], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lg") @ExcludeMissing fun _lg(): JsonField<String> = lg

            /**
             * Returns the raw JSON value of [md].
             *
             * Unlike [md], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("md") @ExcludeMissing fun _md(): JsonField<String> = md

            /**
             * Returns the raw JSON value of [sm].
             *
             * Unlike [sm], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sm") @ExcludeMissing fun _sm(): JsonField<String> = sm

            /**
             * Returns the raw JSON value of [xl].
             *
             * Unlike [xl], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("xl") @ExcludeMissing fun _xl(): JsonField<String> = xl

            /**
             * Returns the raw JSON value of [xs].
             *
             * Unlike [xs], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("xs") @ExcludeMissing fun _xs(): JsonField<String> = xs

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

                /** Returns a mutable builder for constructing an instance of [ElementSpacing]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ElementSpacing]. */
            class Builder internal constructor() {

                private var lg: JsonField<String> = JsonMissing.of()
                private var md: JsonField<String> = JsonMissing.of()
                private var sm: JsonField<String> = JsonMissing.of()
                private var xl: JsonField<String> = JsonMissing.of()
                private var xs: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(elementSpacing: ElementSpacing) = apply {
                    lg = elementSpacing.lg
                    md = elementSpacing.md
                    sm = elementSpacing.sm
                    xl = elementSpacing.xl
                    xs = elementSpacing.xs
                    additionalProperties = elementSpacing.additionalProperties.toMutableMap()
                }

                /** Large spacing value */
                fun lg(lg: String) = lg(JsonField.of(lg))

                /**
                 * Sets [Builder.lg] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lg] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lg(lg: JsonField<String>) = apply { this.lg = lg }

                /** Medium spacing value */
                fun md(md: String) = md(JsonField.of(md))

                /**
                 * Sets [Builder.md] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.md] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun md(md: JsonField<String>) = apply { this.md = md }

                /** Small spacing value */
                fun sm(sm: String) = sm(JsonField.of(sm))

                /**
                 * Sets [Builder.sm] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sm] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun sm(sm: JsonField<String>) = apply { this.sm = sm }

                /** Extra large spacing value */
                fun xl(xl: String) = xl(JsonField.of(xl))

                /**
                 * Sets [Builder.xl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xl] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun xl(xl: JsonField<String>) = apply { this.xl = xl }

                /** Extra small spacing value */
                fun xs(xs: String) = xs(JsonField.of(xs))

                /**
                 * Sets [Builder.xs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xs] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun xs(xs: JsonField<String>) = apply { this.xs = xs }

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
                 * Returns an immutable instance of [ElementSpacing].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ElementSpacing =
                    ElementSpacing(lg, md, sm, xl, xs, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): ElementSpacing = apply {
                if (validated) {
                    return@apply
                }

                lg()
                md()
                sm()
                xl()
                xs()
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
                (if (lg.asKnown().isPresent) 1 else 0) +
                    (if (md.asKnown().isPresent) 1 else 0) +
                    (if (sm.asKnown().isPresent) 1 else 0) +
                    (if (xl.asKnown().isPresent) 1 else 0) +
                    (if (xs.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ElementSpacing && lg == other.lg && md == other.md && sm == other.sm && xl == other.xl && xs == other.xs && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lg, md, sm, xl, xs, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ElementSpacing{lg=$lg, md=$md, sm=$sm, xl=$xl, xs=$xs, additionalProperties=$additionalProperties}"
        }

        /** Shadow styles used on the website */
        class Shadows
        private constructor(
            private val inner: JsonField<String>,
            private val lg: JsonField<String>,
            private val md: JsonField<String>,
            private val sm: JsonField<String>,
            private val xl: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("inner") @ExcludeMissing inner: JsonField<String> = JsonMissing.of(),
                @JsonProperty("lg") @ExcludeMissing lg: JsonField<String> = JsonMissing.of(),
                @JsonProperty("md") @ExcludeMissing md: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sm") @ExcludeMissing sm: JsonField<String> = JsonMissing.of(),
                @JsonProperty("xl") @ExcludeMissing xl: JsonField<String> = JsonMissing.of(),
            ) : this(inner, lg, md, sm, xl, mutableMapOf())

            /**
             * Inner shadow value
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun inner(): Optional<String> = inner.getOptional("inner")

            /**
             * Large shadow value
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun lg(): Optional<String> = lg.getOptional("lg")

            /**
             * Medium shadow value
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun md(): Optional<String> = md.getOptional("md")

            /**
             * Small shadow value
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun sm(): Optional<String> = sm.getOptional("sm")

            /**
             * Extra large shadow value
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun xl(): Optional<String> = xl.getOptional("xl")

            /**
             * Returns the raw JSON value of [inner].
             *
             * Unlike [inner], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("inner") @ExcludeMissing fun _inner(): JsonField<String> = inner

            /**
             * Returns the raw JSON value of [lg].
             *
             * Unlike [lg], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lg") @ExcludeMissing fun _lg(): JsonField<String> = lg

            /**
             * Returns the raw JSON value of [md].
             *
             * Unlike [md], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("md") @ExcludeMissing fun _md(): JsonField<String> = md

            /**
             * Returns the raw JSON value of [sm].
             *
             * Unlike [sm], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sm") @ExcludeMissing fun _sm(): JsonField<String> = sm

            /**
             * Returns the raw JSON value of [xl].
             *
             * Unlike [xl], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("xl") @ExcludeMissing fun _xl(): JsonField<String> = xl

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

                /** Returns a mutable builder for constructing an instance of [Shadows]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Shadows]. */
            class Builder internal constructor() {

                private var inner: JsonField<String> = JsonMissing.of()
                private var lg: JsonField<String> = JsonMissing.of()
                private var md: JsonField<String> = JsonMissing.of()
                private var sm: JsonField<String> = JsonMissing.of()
                private var xl: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(shadows: Shadows) = apply {
                    inner = shadows.inner
                    lg = shadows.lg
                    md = shadows.md
                    sm = shadows.sm
                    xl = shadows.xl
                    additionalProperties = shadows.additionalProperties.toMutableMap()
                }

                /** Inner shadow value */
                fun inner(inner: String) = inner(JsonField.of(inner))

                /**
                 * Sets [Builder.inner] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inner] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun inner(inner: JsonField<String>) = apply { this.inner = inner }

                /** Large shadow value */
                fun lg(lg: String) = lg(JsonField.of(lg))

                /**
                 * Sets [Builder.lg] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lg] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lg(lg: JsonField<String>) = apply { this.lg = lg }

                /** Medium shadow value */
                fun md(md: String) = md(JsonField.of(md))

                /**
                 * Sets [Builder.md] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.md] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun md(md: JsonField<String>) = apply { this.md = md }

                /** Small shadow value */
                fun sm(sm: String) = sm(JsonField.of(sm))

                /**
                 * Sets [Builder.sm] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sm] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun sm(sm: JsonField<String>) = apply { this.sm = sm }

                /** Extra large shadow value */
                fun xl(xl: String) = xl(JsonField.of(xl))

                /**
                 * Sets [Builder.xl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xl] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun xl(xl: JsonField<String>) = apply { this.xl = xl }

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
                 * Returns an immutable instance of [Shadows].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Shadows =
                    Shadows(inner, lg, md, sm, xl, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Shadows = apply {
                if (validated) {
                    return@apply
                }

                inner()
                lg()
                md()
                sm()
                xl()
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
                (if (inner.asKnown().isPresent) 1 else 0) +
                    (if (lg.asKnown().isPresent) 1 else 0) +
                    (if (md.asKnown().isPresent) 1 else 0) +
                    (if (sm.asKnown().isPresent) 1 else 0) +
                    (if (xl.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Shadows && inner == other.inner && lg == other.lg && md == other.md && sm == other.sm && xl == other.xl && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(inner, lg, md, sm, xl, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Shadows{inner=$inner, lg=$lg, md=$md, sm=$sm, xl=$xl, additionalProperties=$additionalProperties}"
        }

        /** Typography styles used on the website */
        class Typography
        private constructor(
            private val headings: JsonField<Headings>,
            private val p: JsonField<P>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("headings")
                @ExcludeMissing
                headings: JsonField<Headings> = JsonMissing.of(),
                @JsonProperty("p") @ExcludeMissing p: JsonField<P> = JsonMissing.of(),
            ) : this(headings, p, mutableMapOf())

            /**
             * Heading styles
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun headings(): Optional<Headings> = headings.getOptional("headings")

            /**
             * Paragraph text styles
             *
             * @throws BrandDevInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun p(): Optional<P> = p.getOptional("p")

            /**
             * Returns the raw JSON value of [headings].
             *
             * Unlike [headings], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("headings")
            @ExcludeMissing
            fun _headings(): JsonField<Headings> = headings

            /**
             * Returns the raw JSON value of [p].
             *
             * Unlike [p], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("p") @ExcludeMissing fun _p(): JsonField<P> = p

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

                /** Returns a mutable builder for constructing an instance of [Typography]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Typography]. */
            class Builder internal constructor() {

                private var headings: JsonField<Headings> = JsonMissing.of()
                private var p: JsonField<P> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(typography: Typography) = apply {
                    headings = typography.headings
                    p = typography.p
                    additionalProperties = typography.additionalProperties.toMutableMap()
                }

                /** Heading styles */
                fun headings(headings: Headings) = headings(JsonField.of(headings))

                /**
                 * Sets [Builder.headings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.headings] with a well-typed [Headings] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun headings(headings: JsonField<Headings>) = apply { this.headings = headings }

                /** Paragraph text styles */
                fun p(p: P) = p(JsonField.of(p))

                /**
                 * Sets [Builder.p] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.p] with a well-typed [P] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun p(p: JsonField<P>) = apply { this.p = p }

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
                 * Returns an immutable instance of [Typography].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Typography =
                    Typography(headings, p, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Typography = apply {
                if (validated) {
                    return@apply
                }

                headings().ifPresent { it.validate() }
                p().ifPresent { it.validate() }
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
                (headings.asKnown().getOrNull()?.validity() ?: 0) +
                    (p.asKnown().getOrNull()?.validity() ?: 0)

            /** Heading styles */
            class Headings
            private constructor(
                private val h1: JsonField<H1>,
                private val h2: JsonField<H2>,
                private val h3: JsonField<H3>,
                private val h4: JsonField<H4>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("h1") @ExcludeMissing h1: JsonField<H1> = JsonMissing.of(),
                    @JsonProperty("h2") @ExcludeMissing h2: JsonField<H2> = JsonMissing.of(),
                    @JsonProperty("h3") @ExcludeMissing h3: JsonField<H3> = JsonMissing.of(),
                    @JsonProperty("h4") @ExcludeMissing h4: JsonField<H4> = JsonMissing.of(),
                ) : this(h1, h2, h3, h4, mutableMapOf())

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun h1(): Optional<H1> = h1.getOptional("h1")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun h2(): Optional<H2> = h2.getOptional("h2")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun h3(): Optional<H3> = h3.getOptional("h3")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun h4(): Optional<H4> = h4.getOptional("h4")

                /**
                 * Returns the raw JSON value of [h1].
                 *
                 * Unlike [h1], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("h1") @ExcludeMissing fun _h1(): JsonField<H1> = h1

                /**
                 * Returns the raw JSON value of [h2].
                 *
                 * Unlike [h2], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("h2") @ExcludeMissing fun _h2(): JsonField<H2> = h2

                /**
                 * Returns the raw JSON value of [h3].
                 *
                 * Unlike [h3], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("h3") @ExcludeMissing fun _h3(): JsonField<H3> = h3

                /**
                 * Returns the raw JSON value of [h4].
                 *
                 * Unlike [h4], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("h4") @ExcludeMissing fun _h4(): JsonField<H4> = h4

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

                    /** Returns a mutable builder for constructing an instance of [Headings]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Headings]. */
                class Builder internal constructor() {

                    private var h1: JsonField<H1> = JsonMissing.of()
                    private var h2: JsonField<H2> = JsonMissing.of()
                    private var h3: JsonField<H3> = JsonMissing.of()
                    private var h4: JsonField<H4> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(headings: Headings) = apply {
                        h1 = headings.h1
                        h2 = headings.h2
                        h3 = headings.h3
                        h4 = headings.h4
                        additionalProperties = headings.additionalProperties.toMutableMap()
                    }

                    fun h1(h1: H1) = h1(JsonField.of(h1))

                    /**
                     * Sets [Builder.h1] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.h1] with a well-typed [H1] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun h1(h1: JsonField<H1>) = apply { this.h1 = h1 }

                    fun h2(h2: H2) = h2(JsonField.of(h2))

                    /**
                     * Sets [Builder.h2] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.h2] with a well-typed [H2] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun h2(h2: JsonField<H2>) = apply { this.h2 = h2 }

                    fun h3(h3: H3) = h3(JsonField.of(h3))

                    /**
                     * Sets [Builder.h3] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.h3] with a well-typed [H3] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun h3(h3: JsonField<H3>) = apply { this.h3 = h3 }

                    fun h4(h4: H4) = h4(JsonField.of(h4))

                    /**
                     * Sets [Builder.h4] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.h4] with a well-typed [H4] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun h4(h4: JsonField<H4>) = apply { this.h4 = h4 }

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
                     * Returns an immutable instance of [Headings].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Headings =
                        Headings(h1, h2, h3, h4, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Headings = apply {
                    if (validated) {
                        return@apply
                    }

                    h1().ifPresent { it.validate() }
                    h2().ifPresent { it.validate() }
                    h3().ifPresent { it.validate() }
                    h4().ifPresent { it.validate() }
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
                    (h1.asKnown().getOrNull()?.validity() ?: 0) +
                        (h2.asKnown().getOrNull()?.validity() ?: 0) +
                        (h3.asKnown().getOrNull()?.validity() ?: 0) +
                        (h4.asKnown().getOrNull()?.validity() ?: 0)

                class H1
                private constructor(
                    private val fontFamily: JsonField<String>,
                    private val fontSize: JsonField<String>,
                    private val fontWeight: JsonField<Double>,
                    private val letterSpacing: JsonField<String>,
                    private val lineHeight: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("fontFamily")
                        @ExcludeMissing
                        fontFamily: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontSize")
                        @ExcludeMissing
                        fontSize: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontWeight")
                        @ExcludeMissing
                        fontWeight: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("letterSpacing")
                        @ExcludeMissing
                        letterSpacing: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("lineHeight")
                        @ExcludeMissing
                        lineHeight: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        fontFamily,
                        fontSize,
                        fontWeight,
                        letterSpacing,
                        lineHeight,
                        mutableMapOf(),
                    )

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontFamily(): Optional<String> = fontFamily.getOptional("fontFamily")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontSize(): Optional<String> = fontSize.getOptional("fontSize")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontWeight(): Optional<Double> = fontWeight.getOptional("fontWeight")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun letterSpacing(): Optional<String> =
                        letterSpacing.getOptional("letterSpacing")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun lineHeight(): Optional<String> = lineHeight.getOptional("lineHeight")

                    /**
                     * Returns the raw JSON value of [fontFamily].
                     *
                     * Unlike [fontFamily], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontFamily")
                    @ExcludeMissing
                    fun _fontFamily(): JsonField<String> = fontFamily

                    /**
                     * Returns the raw JSON value of [fontSize].
                     *
                     * Unlike [fontSize], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontSize")
                    @ExcludeMissing
                    fun _fontSize(): JsonField<String> = fontSize

                    /**
                     * Returns the raw JSON value of [fontWeight].
                     *
                     * Unlike [fontWeight], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontWeight")
                    @ExcludeMissing
                    fun _fontWeight(): JsonField<Double> = fontWeight

                    /**
                     * Returns the raw JSON value of [letterSpacing].
                     *
                     * Unlike [letterSpacing], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("letterSpacing")
                    @ExcludeMissing
                    fun _letterSpacing(): JsonField<String> = letterSpacing

                    /**
                     * Returns the raw JSON value of [lineHeight].
                     *
                     * Unlike [lineHeight], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("lineHeight")
                    @ExcludeMissing
                    fun _lineHeight(): JsonField<String> = lineHeight

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

                        /** Returns a mutable builder for constructing an instance of [H1]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [H1]. */
                    class Builder internal constructor() {

                        private var fontFamily: JsonField<String> = JsonMissing.of()
                        private var fontSize: JsonField<String> = JsonMissing.of()
                        private var fontWeight: JsonField<Double> = JsonMissing.of()
                        private var letterSpacing: JsonField<String> = JsonMissing.of()
                        private var lineHeight: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(h1: H1) = apply {
                            fontFamily = h1.fontFamily
                            fontSize = h1.fontSize
                            fontWeight = h1.fontWeight
                            letterSpacing = h1.letterSpacing
                            lineHeight = h1.lineHeight
                            additionalProperties = h1.additionalProperties.toMutableMap()
                        }

                        fun fontFamily(fontFamily: String) = fontFamily(JsonField.of(fontFamily))

                        /**
                         * Sets [Builder.fontFamily] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontFamily] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontFamily(fontFamily: JsonField<String>) = apply {
                            this.fontFamily = fontFamily
                        }

                        fun fontSize(fontSize: String) = fontSize(JsonField.of(fontSize))

                        /**
                         * Sets [Builder.fontSize] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontSize] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontSize(fontSize: JsonField<String>) = apply {
                            this.fontSize = fontSize
                        }

                        fun fontWeight(fontWeight: Double) = fontWeight(JsonField.of(fontWeight))

                        /**
                         * Sets [Builder.fontWeight] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontWeight] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontWeight(fontWeight: JsonField<Double>) = apply {
                            this.fontWeight = fontWeight
                        }

                        fun letterSpacing(letterSpacing: String) =
                            letterSpacing(JsonField.of(letterSpacing))

                        /**
                         * Sets [Builder.letterSpacing] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.letterSpacing] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun letterSpacing(letterSpacing: JsonField<String>) = apply {
                            this.letterSpacing = letterSpacing
                        }

                        fun lineHeight(lineHeight: String) = lineHeight(JsonField.of(lineHeight))

                        /**
                         * Sets [Builder.lineHeight] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lineHeight] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lineHeight(lineHeight: JsonField<String>) = apply {
                            this.lineHeight = lineHeight
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [H1].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): H1 =
                            H1(
                                fontFamily,
                                fontSize,
                                fontWeight,
                                letterSpacing,
                                lineHeight,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): H1 = apply {
                        if (validated) {
                            return@apply
                        }

                        fontFamily()
                        fontSize()
                        fontWeight()
                        letterSpacing()
                        lineHeight()
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
                        (if (fontFamily.asKnown().isPresent) 1 else 0) +
                            (if (fontSize.asKnown().isPresent) 1 else 0) +
                            (if (fontWeight.asKnown().isPresent) 1 else 0) +
                            (if (letterSpacing.asKnown().isPresent) 1 else 0) +
                            (if (lineHeight.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is H1 && fontFamily == other.fontFamily && fontSize == other.fontSize && fontWeight == other.fontWeight && letterSpacing == other.letterSpacing && lineHeight == other.lineHeight && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(fontFamily, fontSize, fontWeight, letterSpacing, lineHeight, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "H1{fontFamily=$fontFamily, fontSize=$fontSize, fontWeight=$fontWeight, letterSpacing=$letterSpacing, lineHeight=$lineHeight, additionalProperties=$additionalProperties}"
                }

                class H2
                private constructor(
                    private val fontFamily: JsonField<String>,
                    private val fontSize: JsonField<String>,
                    private val fontWeight: JsonField<Double>,
                    private val letterSpacing: JsonField<String>,
                    private val lineHeight: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("fontFamily")
                        @ExcludeMissing
                        fontFamily: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontSize")
                        @ExcludeMissing
                        fontSize: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontWeight")
                        @ExcludeMissing
                        fontWeight: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("letterSpacing")
                        @ExcludeMissing
                        letterSpacing: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("lineHeight")
                        @ExcludeMissing
                        lineHeight: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        fontFamily,
                        fontSize,
                        fontWeight,
                        letterSpacing,
                        lineHeight,
                        mutableMapOf(),
                    )

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontFamily(): Optional<String> = fontFamily.getOptional("fontFamily")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontSize(): Optional<String> = fontSize.getOptional("fontSize")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontWeight(): Optional<Double> = fontWeight.getOptional("fontWeight")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun letterSpacing(): Optional<String> =
                        letterSpacing.getOptional("letterSpacing")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun lineHeight(): Optional<String> = lineHeight.getOptional("lineHeight")

                    /**
                     * Returns the raw JSON value of [fontFamily].
                     *
                     * Unlike [fontFamily], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontFamily")
                    @ExcludeMissing
                    fun _fontFamily(): JsonField<String> = fontFamily

                    /**
                     * Returns the raw JSON value of [fontSize].
                     *
                     * Unlike [fontSize], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontSize")
                    @ExcludeMissing
                    fun _fontSize(): JsonField<String> = fontSize

                    /**
                     * Returns the raw JSON value of [fontWeight].
                     *
                     * Unlike [fontWeight], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontWeight")
                    @ExcludeMissing
                    fun _fontWeight(): JsonField<Double> = fontWeight

                    /**
                     * Returns the raw JSON value of [letterSpacing].
                     *
                     * Unlike [letterSpacing], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("letterSpacing")
                    @ExcludeMissing
                    fun _letterSpacing(): JsonField<String> = letterSpacing

                    /**
                     * Returns the raw JSON value of [lineHeight].
                     *
                     * Unlike [lineHeight], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("lineHeight")
                    @ExcludeMissing
                    fun _lineHeight(): JsonField<String> = lineHeight

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

                        /** Returns a mutable builder for constructing an instance of [H2]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [H2]. */
                    class Builder internal constructor() {

                        private var fontFamily: JsonField<String> = JsonMissing.of()
                        private var fontSize: JsonField<String> = JsonMissing.of()
                        private var fontWeight: JsonField<Double> = JsonMissing.of()
                        private var letterSpacing: JsonField<String> = JsonMissing.of()
                        private var lineHeight: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(h2: H2) = apply {
                            fontFamily = h2.fontFamily
                            fontSize = h2.fontSize
                            fontWeight = h2.fontWeight
                            letterSpacing = h2.letterSpacing
                            lineHeight = h2.lineHeight
                            additionalProperties = h2.additionalProperties.toMutableMap()
                        }

                        fun fontFamily(fontFamily: String) = fontFamily(JsonField.of(fontFamily))

                        /**
                         * Sets [Builder.fontFamily] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontFamily] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontFamily(fontFamily: JsonField<String>) = apply {
                            this.fontFamily = fontFamily
                        }

                        fun fontSize(fontSize: String) = fontSize(JsonField.of(fontSize))

                        /**
                         * Sets [Builder.fontSize] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontSize] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontSize(fontSize: JsonField<String>) = apply {
                            this.fontSize = fontSize
                        }

                        fun fontWeight(fontWeight: Double) = fontWeight(JsonField.of(fontWeight))

                        /**
                         * Sets [Builder.fontWeight] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontWeight] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontWeight(fontWeight: JsonField<Double>) = apply {
                            this.fontWeight = fontWeight
                        }

                        fun letterSpacing(letterSpacing: String) =
                            letterSpacing(JsonField.of(letterSpacing))

                        /**
                         * Sets [Builder.letterSpacing] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.letterSpacing] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun letterSpacing(letterSpacing: JsonField<String>) = apply {
                            this.letterSpacing = letterSpacing
                        }

                        fun lineHeight(lineHeight: String) = lineHeight(JsonField.of(lineHeight))

                        /**
                         * Sets [Builder.lineHeight] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lineHeight] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lineHeight(lineHeight: JsonField<String>) = apply {
                            this.lineHeight = lineHeight
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [H2].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): H2 =
                            H2(
                                fontFamily,
                                fontSize,
                                fontWeight,
                                letterSpacing,
                                lineHeight,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): H2 = apply {
                        if (validated) {
                            return@apply
                        }

                        fontFamily()
                        fontSize()
                        fontWeight()
                        letterSpacing()
                        lineHeight()
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
                        (if (fontFamily.asKnown().isPresent) 1 else 0) +
                            (if (fontSize.asKnown().isPresent) 1 else 0) +
                            (if (fontWeight.asKnown().isPresent) 1 else 0) +
                            (if (letterSpacing.asKnown().isPresent) 1 else 0) +
                            (if (lineHeight.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is H2 && fontFamily == other.fontFamily && fontSize == other.fontSize && fontWeight == other.fontWeight && letterSpacing == other.letterSpacing && lineHeight == other.lineHeight && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(fontFamily, fontSize, fontWeight, letterSpacing, lineHeight, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "H2{fontFamily=$fontFamily, fontSize=$fontSize, fontWeight=$fontWeight, letterSpacing=$letterSpacing, lineHeight=$lineHeight, additionalProperties=$additionalProperties}"
                }

                class H3
                private constructor(
                    private val fontFamily: JsonField<String>,
                    private val fontSize: JsonField<String>,
                    private val fontWeight: JsonField<Double>,
                    private val letterSpacing: JsonField<String>,
                    private val lineHeight: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("fontFamily")
                        @ExcludeMissing
                        fontFamily: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontSize")
                        @ExcludeMissing
                        fontSize: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontWeight")
                        @ExcludeMissing
                        fontWeight: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("letterSpacing")
                        @ExcludeMissing
                        letterSpacing: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("lineHeight")
                        @ExcludeMissing
                        lineHeight: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        fontFamily,
                        fontSize,
                        fontWeight,
                        letterSpacing,
                        lineHeight,
                        mutableMapOf(),
                    )

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontFamily(): Optional<String> = fontFamily.getOptional("fontFamily")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontSize(): Optional<String> = fontSize.getOptional("fontSize")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontWeight(): Optional<Double> = fontWeight.getOptional("fontWeight")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun letterSpacing(): Optional<String> =
                        letterSpacing.getOptional("letterSpacing")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun lineHeight(): Optional<String> = lineHeight.getOptional("lineHeight")

                    /**
                     * Returns the raw JSON value of [fontFamily].
                     *
                     * Unlike [fontFamily], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontFamily")
                    @ExcludeMissing
                    fun _fontFamily(): JsonField<String> = fontFamily

                    /**
                     * Returns the raw JSON value of [fontSize].
                     *
                     * Unlike [fontSize], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontSize")
                    @ExcludeMissing
                    fun _fontSize(): JsonField<String> = fontSize

                    /**
                     * Returns the raw JSON value of [fontWeight].
                     *
                     * Unlike [fontWeight], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontWeight")
                    @ExcludeMissing
                    fun _fontWeight(): JsonField<Double> = fontWeight

                    /**
                     * Returns the raw JSON value of [letterSpacing].
                     *
                     * Unlike [letterSpacing], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("letterSpacing")
                    @ExcludeMissing
                    fun _letterSpacing(): JsonField<String> = letterSpacing

                    /**
                     * Returns the raw JSON value of [lineHeight].
                     *
                     * Unlike [lineHeight], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("lineHeight")
                    @ExcludeMissing
                    fun _lineHeight(): JsonField<String> = lineHeight

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

                        /** Returns a mutable builder for constructing an instance of [H3]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [H3]. */
                    class Builder internal constructor() {

                        private var fontFamily: JsonField<String> = JsonMissing.of()
                        private var fontSize: JsonField<String> = JsonMissing.of()
                        private var fontWeight: JsonField<Double> = JsonMissing.of()
                        private var letterSpacing: JsonField<String> = JsonMissing.of()
                        private var lineHeight: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(h3: H3) = apply {
                            fontFamily = h3.fontFamily
                            fontSize = h3.fontSize
                            fontWeight = h3.fontWeight
                            letterSpacing = h3.letterSpacing
                            lineHeight = h3.lineHeight
                            additionalProperties = h3.additionalProperties.toMutableMap()
                        }

                        fun fontFamily(fontFamily: String) = fontFamily(JsonField.of(fontFamily))

                        /**
                         * Sets [Builder.fontFamily] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontFamily] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontFamily(fontFamily: JsonField<String>) = apply {
                            this.fontFamily = fontFamily
                        }

                        fun fontSize(fontSize: String) = fontSize(JsonField.of(fontSize))

                        /**
                         * Sets [Builder.fontSize] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontSize] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontSize(fontSize: JsonField<String>) = apply {
                            this.fontSize = fontSize
                        }

                        fun fontWeight(fontWeight: Double) = fontWeight(JsonField.of(fontWeight))

                        /**
                         * Sets [Builder.fontWeight] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontWeight] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontWeight(fontWeight: JsonField<Double>) = apply {
                            this.fontWeight = fontWeight
                        }

                        fun letterSpacing(letterSpacing: String) =
                            letterSpacing(JsonField.of(letterSpacing))

                        /**
                         * Sets [Builder.letterSpacing] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.letterSpacing] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun letterSpacing(letterSpacing: JsonField<String>) = apply {
                            this.letterSpacing = letterSpacing
                        }

                        fun lineHeight(lineHeight: String) = lineHeight(JsonField.of(lineHeight))

                        /**
                         * Sets [Builder.lineHeight] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lineHeight] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lineHeight(lineHeight: JsonField<String>) = apply {
                            this.lineHeight = lineHeight
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [H3].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): H3 =
                            H3(
                                fontFamily,
                                fontSize,
                                fontWeight,
                                letterSpacing,
                                lineHeight,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): H3 = apply {
                        if (validated) {
                            return@apply
                        }

                        fontFamily()
                        fontSize()
                        fontWeight()
                        letterSpacing()
                        lineHeight()
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
                        (if (fontFamily.asKnown().isPresent) 1 else 0) +
                            (if (fontSize.asKnown().isPresent) 1 else 0) +
                            (if (fontWeight.asKnown().isPresent) 1 else 0) +
                            (if (letterSpacing.asKnown().isPresent) 1 else 0) +
                            (if (lineHeight.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is H3 && fontFamily == other.fontFamily && fontSize == other.fontSize && fontWeight == other.fontWeight && letterSpacing == other.letterSpacing && lineHeight == other.lineHeight && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(fontFamily, fontSize, fontWeight, letterSpacing, lineHeight, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "H3{fontFamily=$fontFamily, fontSize=$fontSize, fontWeight=$fontWeight, letterSpacing=$letterSpacing, lineHeight=$lineHeight, additionalProperties=$additionalProperties}"
                }

                class H4
                private constructor(
                    private val fontFamily: JsonField<String>,
                    private val fontSize: JsonField<String>,
                    private val fontWeight: JsonField<Double>,
                    private val letterSpacing: JsonField<String>,
                    private val lineHeight: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("fontFamily")
                        @ExcludeMissing
                        fontFamily: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontSize")
                        @ExcludeMissing
                        fontSize: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("fontWeight")
                        @ExcludeMissing
                        fontWeight: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("letterSpacing")
                        @ExcludeMissing
                        letterSpacing: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("lineHeight")
                        @ExcludeMissing
                        lineHeight: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        fontFamily,
                        fontSize,
                        fontWeight,
                        letterSpacing,
                        lineHeight,
                        mutableMapOf(),
                    )

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontFamily(): Optional<String> = fontFamily.getOptional("fontFamily")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontSize(): Optional<String> = fontSize.getOptional("fontSize")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fontWeight(): Optional<Double> = fontWeight.getOptional("fontWeight")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun letterSpacing(): Optional<String> =
                        letterSpacing.getOptional("letterSpacing")

                    /**
                     * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun lineHeight(): Optional<String> = lineHeight.getOptional("lineHeight")

                    /**
                     * Returns the raw JSON value of [fontFamily].
                     *
                     * Unlike [fontFamily], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontFamily")
                    @ExcludeMissing
                    fun _fontFamily(): JsonField<String> = fontFamily

                    /**
                     * Returns the raw JSON value of [fontSize].
                     *
                     * Unlike [fontSize], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontSize")
                    @ExcludeMissing
                    fun _fontSize(): JsonField<String> = fontSize

                    /**
                     * Returns the raw JSON value of [fontWeight].
                     *
                     * Unlike [fontWeight], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fontWeight")
                    @ExcludeMissing
                    fun _fontWeight(): JsonField<Double> = fontWeight

                    /**
                     * Returns the raw JSON value of [letterSpacing].
                     *
                     * Unlike [letterSpacing], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("letterSpacing")
                    @ExcludeMissing
                    fun _letterSpacing(): JsonField<String> = letterSpacing

                    /**
                     * Returns the raw JSON value of [lineHeight].
                     *
                     * Unlike [lineHeight], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("lineHeight")
                    @ExcludeMissing
                    fun _lineHeight(): JsonField<String> = lineHeight

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

                        /** Returns a mutable builder for constructing an instance of [H4]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [H4]. */
                    class Builder internal constructor() {

                        private var fontFamily: JsonField<String> = JsonMissing.of()
                        private var fontSize: JsonField<String> = JsonMissing.of()
                        private var fontWeight: JsonField<Double> = JsonMissing.of()
                        private var letterSpacing: JsonField<String> = JsonMissing.of()
                        private var lineHeight: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(h4: H4) = apply {
                            fontFamily = h4.fontFamily
                            fontSize = h4.fontSize
                            fontWeight = h4.fontWeight
                            letterSpacing = h4.letterSpacing
                            lineHeight = h4.lineHeight
                            additionalProperties = h4.additionalProperties.toMutableMap()
                        }

                        fun fontFamily(fontFamily: String) = fontFamily(JsonField.of(fontFamily))

                        /**
                         * Sets [Builder.fontFamily] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontFamily] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontFamily(fontFamily: JsonField<String>) = apply {
                            this.fontFamily = fontFamily
                        }

                        fun fontSize(fontSize: String) = fontSize(JsonField.of(fontSize))

                        /**
                         * Sets [Builder.fontSize] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontSize] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontSize(fontSize: JsonField<String>) = apply {
                            this.fontSize = fontSize
                        }

                        fun fontWeight(fontWeight: Double) = fontWeight(JsonField.of(fontWeight))

                        /**
                         * Sets [Builder.fontWeight] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fontWeight] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fontWeight(fontWeight: JsonField<Double>) = apply {
                            this.fontWeight = fontWeight
                        }

                        fun letterSpacing(letterSpacing: String) =
                            letterSpacing(JsonField.of(letterSpacing))

                        /**
                         * Sets [Builder.letterSpacing] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.letterSpacing] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun letterSpacing(letterSpacing: JsonField<String>) = apply {
                            this.letterSpacing = letterSpacing
                        }

                        fun lineHeight(lineHeight: String) = lineHeight(JsonField.of(lineHeight))

                        /**
                         * Sets [Builder.lineHeight] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lineHeight] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lineHeight(lineHeight: JsonField<String>) = apply {
                            this.lineHeight = lineHeight
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [H4].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): H4 =
                            H4(
                                fontFamily,
                                fontSize,
                                fontWeight,
                                letterSpacing,
                                lineHeight,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): H4 = apply {
                        if (validated) {
                            return@apply
                        }

                        fontFamily()
                        fontSize()
                        fontWeight()
                        letterSpacing()
                        lineHeight()
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
                        (if (fontFamily.asKnown().isPresent) 1 else 0) +
                            (if (fontSize.asKnown().isPresent) 1 else 0) +
                            (if (fontWeight.asKnown().isPresent) 1 else 0) +
                            (if (letterSpacing.asKnown().isPresent) 1 else 0) +
                            (if (lineHeight.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is H4 && fontFamily == other.fontFamily && fontSize == other.fontSize && fontWeight == other.fontWeight && letterSpacing == other.letterSpacing && lineHeight == other.lineHeight && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(fontFamily, fontSize, fontWeight, letterSpacing, lineHeight, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "H4{fontFamily=$fontFamily, fontSize=$fontSize, fontWeight=$fontWeight, letterSpacing=$letterSpacing, lineHeight=$lineHeight, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Headings && h1 == other.h1 && h2 == other.h2 && h3 == other.h3 && h4 == other.h4 && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(h1, h2, h3, h4, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Headings{h1=$h1, h2=$h2, h3=$h3, h4=$h4, additionalProperties=$additionalProperties}"
            }

            /** Paragraph text styles */
            class P
            private constructor(
                private val fontFamily: JsonField<String>,
                private val fontSize: JsonField<String>,
                private val fontWeight: JsonField<Double>,
                private val letterSpacing: JsonField<String>,
                private val lineHeight: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("fontFamily")
                    @ExcludeMissing
                    fontFamily: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fontSize")
                    @ExcludeMissing
                    fontSize: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fontWeight")
                    @ExcludeMissing
                    fontWeight: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("letterSpacing")
                    @ExcludeMissing
                    letterSpacing: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("lineHeight")
                    @ExcludeMissing
                    lineHeight: JsonField<String> = JsonMissing.of(),
                ) : this(
                    fontFamily,
                    fontSize,
                    fontWeight,
                    letterSpacing,
                    lineHeight,
                    mutableMapOf(),
                )

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun fontFamily(): Optional<String> = fontFamily.getOptional("fontFamily")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun fontSize(): Optional<String> = fontSize.getOptional("fontSize")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun fontWeight(): Optional<Double> = fontWeight.getOptional("fontWeight")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun letterSpacing(): Optional<String> = letterSpacing.getOptional("letterSpacing")

                /**
                 * @throws BrandDevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun lineHeight(): Optional<String> = lineHeight.getOptional("lineHeight")

                /**
                 * Returns the raw JSON value of [fontFamily].
                 *
                 * Unlike [fontFamily], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fontFamily")
                @ExcludeMissing
                fun _fontFamily(): JsonField<String> = fontFamily

                /**
                 * Returns the raw JSON value of [fontSize].
                 *
                 * Unlike [fontSize], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fontSize")
                @ExcludeMissing
                fun _fontSize(): JsonField<String> = fontSize

                /**
                 * Returns the raw JSON value of [fontWeight].
                 *
                 * Unlike [fontWeight], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fontWeight")
                @ExcludeMissing
                fun _fontWeight(): JsonField<Double> = fontWeight

                /**
                 * Returns the raw JSON value of [letterSpacing].
                 *
                 * Unlike [letterSpacing], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("letterSpacing")
                @ExcludeMissing
                fun _letterSpacing(): JsonField<String> = letterSpacing

                /**
                 * Returns the raw JSON value of [lineHeight].
                 *
                 * Unlike [lineHeight], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("lineHeight")
                @ExcludeMissing
                fun _lineHeight(): JsonField<String> = lineHeight

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

                    /** Returns a mutable builder for constructing an instance of [P]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [P]. */
                class Builder internal constructor() {

                    private var fontFamily: JsonField<String> = JsonMissing.of()
                    private var fontSize: JsonField<String> = JsonMissing.of()
                    private var fontWeight: JsonField<Double> = JsonMissing.of()
                    private var letterSpacing: JsonField<String> = JsonMissing.of()
                    private var lineHeight: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(p: P) = apply {
                        fontFamily = p.fontFamily
                        fontSize = p.fontSize
                        fontWeight = p.fontWeight
                        letterSpacing = p.letterSpacing
                        lineHeight = p.lineHeight
                        additionalProperties = p.additionalProperties.toMutableMap()
                    }

                    fun fontFamily(fontFamily: String) = fontFamily(JsonField.of(fontFamily))

                    /**
                     * Sets [Builder.fontFamily] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fontFamily] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fontFamily(fontFamily: JsonField<String>) = apply {
                        this.fontFamily = fontFamily
                    }

                    fun fontSize(fontSize: String) = fontSize(JsonField.of(fontSize))

                    /**
                     * Sets [Builder.fontSize] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fontSize] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fontSize(fontSize: JsonField<String>) = apply { this.fontSize = fontSize }

                    fun fontWeight(fontWeight: Double) = fontWeight(JsonField.of(fontWeight))

                    /**
                     * Sets [Builder.fontWeight] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fontWeight] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fontWeight(fontWeight: JsonField<Double>) = apply {
                        this.fontWeight = fontWeight
                    }

                    fun letterSpacing(letterSpacing: String) =
                        letterSpacing(JsonField.of(letterSpacing))

                    /**
                     * Sets [Builder.letterSpacing] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.letterSpacing] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun letterSpacing(letterSpacing: JsonField<String>) = apply {
                        this.letterSpacing = letterSpacing
                    }

                    fun lineHeight(lineHeight: String) = lineHeight(JsonField.of(lineHeight))

                    /**
                     * Sets [Builder.lineHeight] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lineHeight] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lineHeight(lineHeight: JsonField<String>) = apply {
                        this.lineHeight = lineHeight
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
                     * Returns an immutable instance of [P].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): P =
                        P(
                            fontFamily,
                            fontSize,
                            fontWeight,
                            letterSpacing,
                            lineHeight,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): P = apply {
                    if (validated) {
                        return@apply
                    }

                    fontFamily()
                    fontSize()
                    fontWeight()
                    letterSpacing()
                    lineHeight()
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
                    (if (fontFamily.asKnown().isPresent) 1 else 0) +
                        (if (fontSize.asKnown().isPresent) 1 else 0) +
                        (if (fontWeight.asKnown().isPresent) 1 else 0) +
                        (if (letterSpacing.asKnown().isPresent) 1 else 0) +
                        (if (lineHeight.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is P && fontFamily == other.fontFamily && fontSize == other.fontSize && fontWeight == other.fontWeight && letterSpacing == other.letterSpacing && lineHeight == other.lineHeight && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(fontFamily, fontSize, fontWeight, letterSpacing, lineHeight, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "P{fontFamily=$fontFamily, fontSize=$fontSize, fontWeight=$fontWeight, letterSpacing=$letterSpacing, lineHeight=$lineHeight, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Typography && headings == other.headings && p == other.p && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(headings, p, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Typography{headings=$headings, p=$p, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Styleguide && colors == other.colors && components == other.components && elementSpacing == other.elementSpacing && shadows == other.shadows && typography == other.typography && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(colors, components, elementSpacing, shadows, typography, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Styleguide{colors=$colors, components=$components, elementSpacing=$elementSpacing, shadows=$shadows, typography=$typography, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BrandStyleguideResponse && code == other.code && domain == other.domain && status == other.status && styleguide == other.styleguide && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, domain, status, styleguide, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandStyleguideResponse{code=$code, domain=$domain, status=$status, styleguide=$styleguide, additionalProperties=$additionalProperties}"
}
