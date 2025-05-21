// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.Enum
import com.branddev.api.core.JsonField
import com.branddev.api.core.Params
import com.branddev.api.core.checkRequired
import com.branddev.api.core.http.Headers
import com.branddev.api.core.http.QueryParams
import com.branddev.api.errors.BrandDevInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve brand data by domain */
class BrandRetrieveParams
private constructor(
    private val domain: String,
    private val forceLanguage: ForceLanguage?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Domain name to retrieve brand data for */
    fun domain(): String = domain

    /** Optional parameter to force the language of the retrieved brand data */
    fun forceLanguage(): Optional<ForceLanguage> = Optional.ofNullable(forceLanguage)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrandRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .domain()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandRetrieveParams]. */
    class Builder internal constructor() {

        private var domain: String? = null
        private var forceLanguage: ForceLanguage? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandRetrieveParams: BrandRetrieveParams) = apply {
            domain = brandRetrieveParams.domain
            forceLanguage = brandRetrieveParams.forceLanguage
            additionalHeaders = brandRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** Domain name to retrieve brand data for */
        fun domain(domain: String) = apply { this.domain = domain }

        /** Optional parameter to force the language of the retrieved brand data */
        fun forceLanguage(forceLanguage: ForceLanguage?) = apply {
            this.forceLanguage = forceLanguage
        }

        /** Alias for calling [Builder.forceLanguage] with `forceLanguage.orElse(null)`. */
        fun forceLanguage(forceLanguage: Optional<ForceLanguage>) =
            forceLanguage(forceLanguage.getOrNull())

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
         * Returns an immutable instance of [BrandRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .domain()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandRetrieveParams =
            BrandRetrieveParams(
                checkRequired("domain", domain),
                forceLanguage,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("domain", domain)
                forceLanguage?.let { put("force_language", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Optional parameter to force the language of the retrieved brand data */
    class ForceLanguage @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ALBANIAN = of("albanian")

            @JvmField val ARABIC = of("arabic")

            @JvmField val AZERI = of("azeri")

            @JvmField val BENGALI = of("bengali")

            @JvmField val BULGARIAN = of("bulgarian")

            @JvmField val CEBUANO = of("cebuano")

            @JvmField val CROATIAN = of("croatian")

            @JvmField val CZECH = of("czech")

            @JvmField val DANISH = of("danish")

            @JvmField val DUTCH = of("dutch")

            @JvmField val ENGLISH = of("english")

            @JvmField val ESTONIAN = of("estonian")

            @JvmField val FARSI = of("farsi")

            @JvmField val FINNISH = of("finnish")

            @JvmField val FRENCH = of("french")

            @JvmField val GERMAN = of("german")

            @JvmField val HAUSA = of("hausa")

            @JvmField val HAWAIIAN = of("hawaiian")

            @JvmField val HINDI = of("hindi")

            @JvmField val HUNGARIAN = of("hungarian")

            @JvmField val ICELANDIC = of("icelandic")

            @JvmField val INDONESIAN = of("indonesian")

            @JvmField val ITALIAN = of("italian")

            @JvmField val KAZAKH = of("kazakh")

            @JvmField val KYRGYZ = of("kyrgyz")

            @JvmField val LATIN = of("latin")

            @JvmField val LATVIAN = of("latvian")

            @JvmField val LITHUANIAN = of("lithuanian")

            @JvmField val MACEDONIAN = of("macedonian")

            @JvmField val MONGOLIAN = of("mongolian")

            @JvmField val NEPALI = of("nepali")

            @JvmField val NORWEGIAN = of("norwegian")

            @JvmField val PASHTO = of("pashto")

            @JvmField val PIDGIN = of("pidgin")

            @JvmField val POLISH = of("polish")

            @JvmField val PORTUGUESE = of("portuguese")

            @JvmField val ROMANIAN = of("romanian")

            @JvmField val RUSSIAN = of("russian")

            @JvmField val SERBIAN = of("serbian")

            @JvmField val SLOVAK = of("slovak")

            @JvmField val SLOVENE = of("slovene")

            @JvmField val SOMALI = of("somali")

            @JvmField val SPANISH = of("spanish")

            @JvmField val SWAHILI = of("swahili")

            @JvmField val SWEDISH = of("swedish")

            @JvmField val TAGALOG = of("tagalog")

            @JvmField val TURKISH = of("turkish")

            @JvmField val UKRAINIAN = of("ukrainian")

            @JvmField val URDU = of("urdu")

            @JvmField val UZBEK = of("uzbek")

            @JvmField val VIETNAMESE = of("vietnamese")

            @JvmField val WELSH = of("welsh")

            @JvmStatic fun of(value: String) = ForceLanguage(JsonField.of(value))
        }

        /** An enum containing [ForceLanguage]'s known values. */
        enum class Known {
            ALBANIAN,
            ARABIC,
            AZERI,
            BENGALI,
            BULGARIAN,
            CEBUANO,
            CROATIAN,
            CZECH,
            DANISH,
            DUTCH,
            ENGLISH,
            ESTONIAN,
            FARSI,
            FINNISH,
            FRENCH,
            GERMAN,
            HAUSA,
            HAWAIIAN,
            HINDI,
            HUNGARIAN,
            ICELANDIC,
            INDONESIAN,
            ITALIAN,
            KAZAKH,
            KYRGYZ,
            LATIN,
            LATVIAN,
            LITHUANIAN,
            MACEDONIAN,
            MONGOLIAN,
            NEPALI,
            NORWEGIAN,
            PASHTO,
            PIDGIN,
            POLISH,
            PORTUGUESE,
            ROMANIAN,
            RUSSIAN,
            SERBIAN,
            SLOVAK,
            SLOVENE,
            SOMALI,
            SPANISH,
            SWAHILI,
            SWEDISH,
            TAGALOG,
            TURKISH,
            UKRAINIAN,
            URDU,
            UZBEK,
            VIETNAMESE,
            WELSH,
        }

        /**
         * An enum containing [ForceLanguage]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ForceLanguage] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALBANIAN,
            ARABIC,
            AZERI,
            BENGALI,
            BULGARIAN,
            CEBUANO,
            CROATIAN,
            CZECH,
            DANISH,
            DUTCH,
            ENGLISH,
            ESTONIAN,
            FARSI,
            FINNISH,
            FRENCH,
            GERMAN,
            HAUSA,
            HAWAIIAN,
            HINDI,
            HUNGARIAN,
            ICELANDIC,
            INDONESIAN,
            ITALIAN,
            KAZAKH,
            KYRGYZ,
            LATIN,
            LATVIAN,
            LITHUANIAN,
            MACEDONIAN,
            MONGOLIAN,
            NEPALI,
            NORWEGIAN,
            PASHTO,
            PIDGIN,
            POLISH,
            PORTUGUESE,
            ROMANIAN,
            RUSSIAN,
            SERBIAN,
            SLOVAK,
            SLOVENE,
            SOMALI,
            SPANISH,
            SWAHILI,
            SWEDISH,
            TAGALOG,
            TURKISH,
            UKRAINIAN,
            URDU,
            UZBEK,
            VIETNAMESE,
            WELSH,
            /**
             * An enum member indicating that [ForceLanguage] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ALBANIAN -> Value.ALBANIAN
                ARABIC -> Value.ARABIC
                AZERI -> Value.AZERI
                BENGALI -> Value.BENGALI
                BULGARIAN -> Value.BULGARIAN
                CEBUANO -> Value.CEBUANO
                CROATIAN -> Value.CROATIAN
                CZECH -> Value.CZECH
                DANISH -> Value.DANISH
                DUTCH -> Value.DUTCH
                ENGLISH -> Value.ENGLISH
                ESTONIAN -> Value.ESTONIAN
                FARSI -> Value.FARSI
                FINNISH -> Value.FINNISH
                FRENCH -> Value.FRENCH
                GERMAN -> Value.GERMAN
                HAUSA -> Value.HAUSA
                HAWAIIAN -> Value.HAWAIIAN
                HINDI -> Value.HINDI
                HUNGARIAN -> Value.HUNGARIAN
                ICELANDIC -> Value.ICELANDIC
                INDONESIAN -> Value.INDONESIAN
                ITALIAN -> Value.ITALIAN
                KAZAKH -> Value.KAZAKH
                KYRGYZ -> Value.KYRGYZ
                LATIN -> Value.LATIN
                LATVIAN -> Value.LATVIAN
                LITHUANIAN -> Value.LITHUANIAN
                MACEDONIAN -> Value.MACEDONIAN
                MONGOLIAN -> Value.MONGOLIAN
                NEPALI -> Value.NEPALI
                NORWEGIAN -> Value.NORWEGIAN
                PASHTO -> Value.PASHTO
                PIDGIN -> Value.PIDGIN
                POLISH -> Value.POLISH
                PORTUGUESE -> Value.PORTUGUESE
                ROMANIAN -> Value.ROMANIAN
                RUSSIAN -> Value.RUSSIAN
                SERBIAN -> Value.SERBIAN
                SLOVAK -> Value.SLOVAK
                SLOVENE -> Value.SLOVENE
                SOMALI -> Value.SOMALI
                SPANISH -> Value.SPANISH
                SWAHILI -> Value.SWAHILI
                SWEDISH -> Value.SWEDISH
                TAGALOG -> Value.TAGALOG
                TURKISH -> Value.TURKISH
                UKRAINIAN -> Value.UKRAINIAN
                URDU -> Value.URDU
                UZBEK -> Value.UZBEK
                VIETNAMESE -> Value.VIETNAMESE
                WELSH -> Value.WELSH
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BrandDevInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ALBANIAN -> Known.ALBANIAN
                ARABIC -> Known.ARABIC
                AZERI -> Known.AZERI
                BENGALI -> Known.BENGALI
                BULGARIAN -> Known.BULGARIAN
                CEBUANO -> Known.CEBUANO
                CROATIAN -> Known.CROATIAN
                CZECH -> Known.CZECH
                DANISH -> Known.DANISH
                DUTCH -> Known.DUTCH
                ENGLISH -> Known.ENGLISH
                ESTONIAN -> Known.ESTONIAN
                FARSI -> Known.FARSI
                FINNISH -> Known.FINNISH
                FRENCH -> Known.FRENCH
                GERMAN -> Known.GERMAN
                HAUSA -> Known.HAUSA
                HAWAIIAN -> Known.HAWAIIAN
                HINDI -> Known.HINDI
                HUNGARIAN -> Known.HUNGARIAN
                ICELANDIC -> Known.ICELANDIC
                INDONESIAN -> Known.INDONESIAN
                ITALIAN -> Known.ITALIAN
                KAZAKH -> Known.KAZAKH
                KYRGYZ -> Known.KYRGYZ
                LATIN -> Known.LATIN
                LATVIAN -> Known.LATVIAN
                LITHUANIAN -> Known.LITHUANIAN
                MACEDONIAN -> Known.MACEDONIAN
                MONGOLIAN -> Known.MONGOLIAN
                NEPALI -> Known.NEPALI
                NORWEGIAN -> Known.NORWEGIAN
                PASHTO -> Known.PASHTO
                PIDGIN -> Known.PIDGIN
                POLISH -> Known.POLISH
                PORTUGUESE -> Known.PORTUGUESE
                ROMANIAN -> Known.ROMANIAN
                RUSSIAN -> Known.RUSSIAN
                SERBIAN -> Known.SERBIAN
                SLOVAK -> Known.SLOVAK
                SLOVENE -> Known.SLOVENE
                SOMALI -> Known.SOMALI
                SPANISH -> Known.SPANISH
                SWAHILI -> Known.SWAHILI
                SWEDISH -> Known.SWEDISH
                TAGALOG -> Known.TAGALOG
                TURKISH -> Known.TURKISH
                UKRAINIAN -> Known.UKRAINIAN
                URDU -> Known.URDU
                UZBEK -> Known.UZBEK
                VIETNAMESE -> Known.VIETNAMESE
                WELSH -> Known.WELSH
                else -> throw BrandDevInvalidDataException("Unknown ForceLanguage: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BrandDevInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                BrandDevInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): ForceLanguage = apply {
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

            return /* spotless:off */ other is ForceLanguage && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BrandRetrieveParams && domain == other.domain && forceLanguage == other.forceLanguage && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(domain, forceLanguage, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BrandRetrieveParams{domain=$domain, forceLanguage=$forceLanguage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
