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

/**
 * Retrieve brand information using an ISIN (International Securities Identification Number). This
 * endpoint looks up the company associated with the ISIN and returns its brand data.
 */
class BrandRetrieveByIsinParams
private constructor(
    private val isin: String,
    private val forceLanguage: ForceLanguage?,
    private val maxSpeed: Boolean?,
    private val timeoutMs: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * ISIN (International Securities Identification Number) to retrieve brand data for (e.g.,
     * 'AU000000IMD5', 'US0378331005'). Must be exactly 12 characters: 2 letters followed by 9
     * alphanumeric characters and ending with a digit.
     */
    fun isin(): String = isin

    /** Optional parameter to force the language of the retrieved brand data. */
    fun forceLanguage(): Optional<ForceLanguage> = Optional.ofNullable(forceLanguage)

    /**
     * Optional parameter to optimize the API call for maximum speed. When set to true, the API will
     * skip time-consuming operations for faster response at the cost of less comprehensive data.
     */
    fun maxSpeed(): Optional<Boolean> = Optional.ofNullable(maxSpeed)

    /**
     * Optional timeout in milliseconds for the request. If the request takes longer than this
     * value, it will be aborted with a 408 status code. Maximum allowed value is 300000ms (5
     * minutes).
     */
    fun timeoutMs(): Optional<Long> = Optional.ofNullable(timeoutMs)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrandRetrieveByIsinParams].
         *
         * The following fields are required:
         * ```java
         * .isin()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandRetrieveByIsinParams]. */
    class Builder internal constructor() {

        private var isin: String? = null
        private var forceLanguage: ForceLanguage? = null
        private var maxSpeed: Boolean? = null
        private var timeoutMs: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandRetrieveByIsinParams: BrandRetrieveByIsinParams) = apply {
            isin = brandRetrieveByIsinParams.isin
            forceLanguage = brandRetrieveByIsinParams.forceLanguage
            maxSpeed = brandRetrieveByIsinParams.maxSpeed
            timeoutMs = brandRetrieveByIsinParams.timeoutMs
            additionalHeaders = brandRetrieveByIsinParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandRetrieveByIsinParams.additionalQueryParams.toBuilder()
        }

        /**
         * ISIN (International Securities Identification Number) to retrieve brand data for (e.g.,
         * 'AU000000IMD5', 'US0378331005'). Must be exactly 12 characters: 2 letters followed by 9
         * alphanumeric characters and ending with a digit.
         */
        fun isin(isin: String) = apply { this.isin = isin }

        /** Optional parameter to force the language of the retrieved brand data. */
        fun forceLanguage(forceLanguage: ForceLanguage?) = apply {
            this.forceLanguage = forceLanguage
        }

        /** Alias for calling [Builder.forceLanguage] with `forceLanguage.orElse(null)`. */
        fun forceLanguage(forceLanguage: Optional<ForceLanguage>) =
            forceLanguage(forceLanguage.getOrNull())

        /**
         * Optional parameter to optimize the API call for maximum speed. When set to true, the API
         * will skip time-consuming operations for faster response at the cost of less comprehensive
         * data.
         */
        fun maxSpeed(maxSpeed: Boolean?) = apply { this.maxSpeed = maxSpeed }

        /**
         * Alias for [Builder.maxSpeed].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxSpeed(maxSpeed: Boolean) = maxSpeed(maxSpeed as Boolean?)

        /** Alias for calling [Builder.maxSpeed] with `maxSpeed.orElse(null)`. */
        fun maxSpeed(maxSpeed: Optional<Boolean>) = maxSpeed(maxSpeed.getOrNull())

        /**
         * Optional timeout in milliseconds for the request. If the request takes longer than this
         * value, it will be aborted with a 408 status code. Maximum allowed value is 300000ms (5
         * minutes).
         */
        fun timeoutMs(timeoutMs: Long?) = apply { this.timeoutMs = timeoutMs }

        /**
         * Alias for [Builder.timeoutMs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun timeoutMs(timeoutMs: Long) = timeoutMs(timeoutMs as Long?)

        /** Alias for calling [Builder.timeoutMs] with `timeoutMs.orElse(null)`. */
        fun timeoutMs(timeoutMs: Optional<Long>) = timeoutMs(timeoutMs.getOrNull())

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
         * Returns an immutable instance of [BrandRetrieveByIsinParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .isin()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandRetrieveByIsinParams =
            BrandRetrieveByIsinParams(
                checkRequired("isin", isin),
                forceLanguage,
                maxSpeed,
                timeoutMs,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("isin", isin)
                forceLanguage?.let { put("force_language", it.toString()) }
                maxSpeed?.let { put("maxSpeed", it.toString()) }
                timeoutMs?.let { put("timeoutMS", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Optional parameter to force the language of the retrieved brand data. */
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

            @JvmField val CANTONESE = of("cantonese")

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

            @JvmField val KOREAN = of("korean")

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

            @JvmField val THAI = of("thai")

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
            CANTONESE,
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
            KOREAN,
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
            THAI,
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
            CANTONESE,
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
            KOREAN,
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
            THAI,
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
                CANTONESE -> Value.CANTONESE
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
                KOREAN -> Value.KOREAN
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
                THAI -> Value.THAI
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
                CANTONESE -> Known.CANTONESE
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
                KOREAN -> Known.KOREAN
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
                THAI -> Known.THAI
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

            return other is ForceLanguage && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandRetrieveByIsinParams &&
            isin == other.isin &&
            forceLanguage == other.forceLanguage &&
            maxSpeed == other.maxSpeed &&
            timeoutMs == other.timeoutMs &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            isin,
            forceLanguage,
            maxSpeed,
            timeoutMs,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BrandRetrieveByIsinParams{isin=$isin, forceLanguage=$forceLanguage, maxSpeed=$maxSpeed, timeoutMs=$timeoutMs, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
