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
 * Retrieve brand information using a stock ticker symbol. This endpoint looks up the company
 * associated with the ticker and returns its brand data.
 */
class BrandRetrieveByTickerParams
private constructor(
    private val ticker: String,
    private val forceLanguage: ForceLanguage?,
    private val maxSpeed: Boolean?,
    private val tickerExchange: TickerExchange?,
    private val timeoutMs: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Stock ticker symbol to retrieve brand data for (e.g., 'AAPL', 'GOOGL', 'BRK.A'). Must be 1-15
     * characters, letters/numbers/dots only.
     */
    fun ticker(): String = ticker

    /** Optional parameter to force the language of the retrieved brand data. */
    fun forceLanguage(): Optional<ForceLanguage> = Optional.ofNullable(forceLanguage)

    /**
     * Optional parameter to optimize the API call for maximum speed. When set to true, the API will
     * skip time-consuming operations for faster response at the cost of less comprehensive data.
     */
    fun maxSpeed(): Optional<Boolean> = Optional.ofNullable(maxSpeed)

    /** Optional stock exchange for the ticker. Defaults to NASDAQ if not specified. */
    fun tickerExchange(): Optional<TickerExchange> = Optional.ofNullable(tickerExchange)

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
         * Returns a mutable builder for constructing an instance of [BrandRetrieveByTickerParams].
         *
         * The following fields are required:
         * ```java
         * .ticker()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandRetrieveByTickerParams]. */
    class Builder internal constructor() {

        private var ticker: String? = null
        private var forceLanguage: ForceLanguage? = null
        private var maxSpeed: Boolean? = null
        private var tickerExchange: TickerExchange? = null
        private var timeoutMs: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandRetrieveByTickerParams: BrandRetrieveByTickerParams) = apply {
            ticker = brandRetrieveByTickerParams.ticker
            forceLanguage = brandRetrieveByTickerParams.forceLanguage
            maxSpeed = brandRetrieveByTickerParams.maxSpeed
            tickerExchange = brandRetrieveByTickerParams.tickerExchange
            timeoutMs = brandRetrieveByTickerParams.timeoutMs
            additionalHeaders = brandRetrieveByTickerParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandRetrieveByTickerParams.additionalQueryParams.toBuilder()
        }

        /**
         * Stock ticker symbol to retrieve brand data for (e.g., 'AAPL', 'GOOGL', 'BRK.A'). Must be
         * 1-15 characters, letters/numbers/dots only.
         */
        fun ticker(ticker: String) = apply { this.ticker = ticker }

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

        /** Optional stock exchange for the ticker. Defaults to NASDAQ if not specified. */
        fun tickerExchange(tickerExchange: TickerExchange?) = apply {
            this.tickerExchange = tickerExchange
        }

        /** Alias for calling [Builder.tickerExchange] with `tickerExchange.orElse(null)`. */
        fun tickerExchange(tickerExchange: Optional<TickerExchange>) =
            tickerExchange(tickerExchange.getOrNull())

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
         * Returns an immutable instance of [BrandRetrieveByTickerParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .ticker()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandRetrieveByTickerParams =
            BrandRetrieveByTickerParams(
                checkRequired("ticker", ticker),
                forceLanguage,
                maxSpeed,
                tickerExchange,
                timeoutMs,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("ticker", ticker)
                forceLanguage?.let { put("force_language", it.toString()) }
                maxSpeed?.let { put("maxSpeed", it.toString()) }
                tickerExchange?.let { put("ticker_exchange", it.toString()) }
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

            return other is ForceLanguage && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Optional stock exchange for the ticker. Defaults to NASDAQ if not specified. */
    class TickerExchange @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val AMEX = of("AMEX")

            @JvmField val AMS = of("AMS")

            @JvmField val AQS = of("AQS")

            @JvmField val ASX = of("ASX")

            @JvmField val ATH = of("ATH")

            @JvmField val BER = of("BER")

            @JvmField val BME = of("BME")

            @JvmField val BRU = of("BRU")

            @JvmField val BSE = of("BSE")

            @JvmField val BUD = of("BUD")

            @JvmField val BUE = of("BUE")

            @JvmField val BVC = of("BVC")

            @JvmField val CBOE = of("CBOE")

            @JvmField val CNQ = of("CNQ")

            @JvmField val CPH = of("CPH")

            @JvmField val DFM = of("DFM")

            @JvmField val DOH = of("DOH")

            @JvmField val DUB = of("DUB")

            @JvmField val DUS = of("DUS")

            @JvmField val DXE = of("DXE")

            @JvmField val EGX = of("EGX")

            @JvmField val FSX = of("FSX")

            @JvmField val HAM = of("HAM")

            @JvmField val HEL = of("HEL")

            @JvmField val HKSE = of("HKSE")

            @JvmField val HOSE = of("HOSE")

            @JvmField val ICE = of("ICE")

            @JvmField val IOB = of("IOB")

            @JvmField val IST = of("IST")

            @JvmField val JKT = of("JKT")

            @JvmField val JNB = of("JNB")

            @JvmField val JPX = of("JPX")

            @JvmField val KLS = of("KLS")

            @JvmField val KOE = of("KOE")

            @JvmField val KSC = of("KSC")

            @JvmField val KUW = of("KUW")

            @JvmField val LIS = of("LIS")

            @JvmField val LSE = of("LSE")

            @JvmField val MCX = of("MCX")

            @JvmField val MEX = of("MEX")

            @JvmField val MIL = of("MIL")

            @JvmField val MUN = of("MUN")

            @JvmField val NASDAQ = of("NASDAQ")

            @JvmField val NEO = of("NEO")

            @JvmField val NSE = of("NSE")

            @JvmField val NYSE = of("NYSE")

            @JvmField val NZE = of("NZE")

            @JvmField val OSL = of("OSL")

            @JvmField val OTC = of("OTC")

            @JvmField val PAR = of("PAR")

            @JvmField val PNK = of("PNK")

            @JvmField val PRA = of("PRA")

            @JvmField val RIS = of("RIS")

            @JvmField val SAO = of("SAO")

            @JvmField val SAU = of("SAU")

            @JvmField val SES = of("SES")

            @JvmField val SET = of("SET")

            @JvmField val SGO = of("SGO")

            @JvmField val SHH = of("SHH")

            @JvmField val SHZ = of("SHZ")

            @JvmField val SIX = of("SIX")

            @JvmField val STO = of("STO")

            @JvmField val STU = of("STU")

            @JvmField val TAI = of("TAI")

            @JvmField val TAL = of("TAL")

            @JvmField val TLV = of("TLV")

            @JvmField val TSX = of("TSX")

            @JvmField val TSXV = of("TSXV")

            @JvmField val TWO = of("TWO")

            @JvmField val VIE = of("VIE")

            @JvmField val WSE = of("WSE")

            @JvmField val XETRA = of("XETRA")

            @JvmStatic fun of(value: String) = TickerExchange(JsonField.of(value))
        }

        /** An enum containing [TickerExchange]'s known values. */
        enum class Known {
            AMEX,
            AMS,
            AQS,
            ASX,
            ATH,
            BER,
            BME,
            BRU,
            BSE,
            BUD,
            BUE,
            BVC,
            CBOE,
            CNQ,
            CPH,
            DFM,
            DOH,
            DUB,
            DUS,
            DXE,
            EGX,
            FSX,
            HAM,
            HEL,
            HKSE,
            HOSE,
            ICE,
            IOB,
            IST,
            JKT,
            JNB,
            JPX,
            KLS,
            KOE,
            KSC,
            KUW,
            LIS,
            LSE,
            MCX,
            MEX,
            MIL,
            MUN,
            NASDAQ,
            NEO,
            NSE,
            NYSE,
            NZE,
            OSL,
            OTC,
            PAR,
            PNK,
            PRA,
            RIS,
            SAO,
            SAU,
            SES,
            SET,
            SGO,
            SHH,
            SHZ,
            SIX,
            STO,
            STU,
            TAI,
            TAL,
            TLV,
            TSX,
            TSXV,
            TWO,
            VIE,
            WSE,
            XETRA,
        }

        /**
         * An enum containing [TickerExchange]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TickerExchange] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AMEX,
            AMS,
            AQS,
            ASX,
            ATH,
            BER,
            BME,
            BRU,
            BSE,
            BUD,
            BUE,
            BVC,
            CBOE,
            CNQ,
            CPH,
            DFM,
            DOH,
            DUB,
            DUS,
            DXE,
            EGX,
            FSX,
            HAM,
            HEL,
            HKSE,
            HOSE,
            ICE,
            IOB,
            IST,
            JKT,
            JNB,
            JPX,
            KLS,
            KOE,
            KSC,
            KUW,
            LIS,
            LSE,
            MCX,
            MEX,
            MIL,
            MUN,
            NASDAQ,
            NEO,
            NSE,
            NYSE,
            NZE,
            OSL,
            OTC,
            PAR,
            PNK,
            PRA,
            RIS,
            SAO,
            SAU,
            SES,
            SET,
            SGO,
            SHH,
            SHZ,
            SIX,
            STO,
            STU,
            TAI,
            TAL,
            TLV,
            TSX,
            TSXV,
            TWO,
            VIE,
            WSE,
            XETRA,
            /**
             * An enum member indicating that [TickerExchange] was instantiated with an unknown
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
                AMEX -> Value.AMEX
                AMS -> Value.AMS
                AQS -> Value.AQS
                ASX -> Value.ASX
                ATH -> Value.ATH
                BER -> Value.BER
                BME -> Value.BME
                BRU -> Value.BRU
                BSE -> Value.BSE
                BUD -> Value.BUD
                BUE -> Value.BUE
                BVC -> Value.BVC
                CBOE -> Value.CBOE
                CNQ -> Value.CNQ
                CPH -> Value.CPH
                DFM -> Value.DFM
                DOH -> Value.DOH
                DUB -> Value.DUB
                DUS -> Value.DUS
                DXE -> Value.DXE
                EGX -> Value.EGX
                FSX -> Value.FSX
                HAM -> Value.HAM
                HEL -> Value.HEL
                HKSE -> Value.HKSE
                HOSE -> Value.HOSE
                ICE -> Value.ICE
                IOB -> Value.IOB
                IST -> Value.IST
                JKT -> Value.JKT
                JNB -> Value.JNB
                JPX -> Value.JPX
                KLS -> Value.KLS
                KOE -> Value.KOE
                KSC -> Value.KSC
                KUW -> Value.KUW
                LIS -> Value.LIS
                LSE -> Value.LSE
                MCX -> Value.MCX
                MEX -> Value.MEX
                MIL -> Value.MIL
                MUN -> Value.MUN
                NASDAQ -> Value.NASDAQ
                NEO -> Value.NEO
                NSE -> Value.NSE
                NYSE -> Value.NYSE
                NZE -> Value.NZE
                OSL -> Value.OSL
                OTC -> Value.OTC
                PAR -> Value.PAR
                PNK -> Value.PNK
                PRA -> Value.PRA
                RIS -> Value.RIS
                SAO -> Value.SAO
                SAU -> Value.SAU
                SES -> Value.SES
                SET -> Value.SET
                SGO -> Value.SGO
                SHH -> Value.SHH
                SHZ -> Value.SHZ
                SIX -> Value.SIX
                STO -> Value.STO
                STU -> Value.STU
                TAI -> Value.TAI
                TAL -> Value.TAL
                TLV -> Value.TLV
                TSX -> Value.TSX
                TSXV -> Value.TSXV
                TWO -> Value.TWO
                VIE -> Value.VIE
                WSE -> Value.WSE
                XETRA -> Value.XETRA
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
                AMEX -> Known.AMEX
                AMS -> Known.AMS
                AQS -> Known.AQS
                ASX -> Known.ASX
                ATH -> Known.ATH
                BER -> Known.BER
                BME -> Known.BME
                BRU -> Known.BRU
                BSE -> Known.BSE
                BUD -> Known.BUD
                BUE -> Known.BUE
                BVC -> Known.BVC
                CBOE -> Known.CBOE
                CNQ -> Known.CNQ
                CPH -> Known.CPH
                DFM -> Known.DFM
                DOH -> Known.DOH
                DUB -> Known.DUB
                DUS -> Known.DUS
                DXE -> Known.DXE
                EGX -> Known.EGX
                FSX -> Known.FSX
                HAM -> Known.HAM
                HEL -> Known.HEL
                HKSE -> Known.HKSE
                HOSE -> Known.HOSE
                ICE -> Known.ICE
                IOB -> Known.IOB
                IST -> Known.IST
                JKT -> Known.JKT
                JNB -> Known.JNB
                JPX -> Known.JPX
                KLS -> Known.KLS
                KOE -> Known.KOE
                KSC -> Known.KSC
                KUW -> Known.KUW
                LIS -> Known.LIS
                LSE -> Known.LSE
                MCX -> Known.MCX
                MEX -> Known.MEX
                MIL -> Known.MIL
                MUN -> Known.MUN
                NASDAQ -> Known.NASDAQ
                NEO -> Known.NEO
                NSE -> Known.NSE
                NYSE -> Known.NYSE
                NZE -> Known.NZE
                OSL -> Known.OSL
                OTC -> Known.OTC
                PAR -> Known.PAR
                PNK -> Known.PNK
                PRA -> Known.PRA
                RIS -> Known.RIS
                SAO -> Known.SAO
                SAU -> Known.SAU
                SES -> Known.SES
                SET -> Known.SET
                SGO -> Known.SGO
                SHH -> Known.SHH
                SHZ -> Known.SHZ
                SIX -> Known.SIX
                STO -> Known.STO
                STU -> Known.STU
                TAI -> Known.TAI
                TAL -> Known.TAL
                TLV -> Known.TLV
                TSX -> Known.TSX
                TSXV -> Known.TSXV
                TWO -> Known.TWO
                VIE -> Known.VIE
                WSE -> Known.WSE
                XETRA -> Known.XETRA
                else -> throw BrandDevInvalidDataException("Unknown TickerExchange: $value")
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

        fun validate(): TickerExchange = apply {
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

            return other is TickerExchange && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandRetrieveByTickerParams &&
            ticker == other.ticker &&
            forceLanguage == other.forceLanguage &&
            maxSpeed == other.maxSpeed &&
            tickerExchange == other.tickerExchange &&
            timeoutMs == other.timeoutMs &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            ticker,
            forceLanguage,
            maxSpeed,
            tickerExchange,
            timeoutMs,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BrandRetrieveByTickerParams{ticker=$ticker, forceLanguage=$forceLanguage, maxSpeed=$maxSpeed, tickerExchange=$tickerExchange, timeoutMs=$timeoutMs, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
