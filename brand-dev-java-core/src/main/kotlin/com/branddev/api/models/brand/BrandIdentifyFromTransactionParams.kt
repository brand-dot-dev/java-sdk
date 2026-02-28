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
 * Endpoint specially designed for platforms that want to identify transaction data by the
 * transaction title.
 */
class BrandIdentifyFromTransactionParams
private constructor(
    private val transactionInfo: String,
    private val city: String?,
    private val countryGl: CountryGl?,
    private val forceLanguage: ForceLanguage?,
    private val highConfidenceOnly: Boolean?,
    private val maxSpeed: Boolean?,
    private val mcc: String?,
    private val phone: Double?,
    private val timeoutMs: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Transaction information to identify the brand */
    fun transactionInfo(): String = transactionInfo

    /** Optional city name to prioritize when searching for the brand. */
    fun city(): Optional<String> = Optional.ofNullable(city)

    /**
     * Optional country code (GL parameter) to specify the country. This affects the geographic
     * location used for search queries.
     */
    fun countryGl(): Optional<CountryGl> = Optional.ofNullable(countryGl)

    /** Optional parameter to force the language of the retrieved brand data. */
    fun forceLanguage(): Optional<ForceLanguage> = Optional.ofNullable(forceLanguage)

    /**
     * When set to true, the API will perform an additional verification steps to ensure the
     * identified brand matches the transaction with high confidence. Defaults to false.
     */
    fun highConfidenceOnly(): Optional<Boolean> = Optional.ofNullable(highConfidenceOnly)

    /**
     * Optional parameter to optimize the API call for maximum speed. When set to true, the API will
     * skip time-consuming operations for faster response at the cost of less comprehensive data.
     */
    fun maxSpeed(): Optional<Boolean> = Optional.ofNullable(maxSpeed)

    /** Optional Merchant Category Code (MCC) to help identify the business category/industry. */
    fun mcc(): Optional<String> = Optional.ofNullable(mcc)

    /** Optional phone number from the transaction to help verify brand match. */
    fun phone(): Optional<Double> = Optional.ofNullable(phone)

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
         * Returns a mutable builder for constructing an instance of
         * [BrandIdentifyFromTransactionParams].
         *
         * The following fields are required:
         * ```java
         * .transactionInfo()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandIdentifyFromTransactionParams]. */
    class Builder internal constructor() {

        private var transactionInfo: String? = null
        private var city: String? = null
        private var countryGl: CountryGl? = null
        private var forceLanguage: ForceLanguage? = null
        private var highConfidenceOnly: Boolean? = null
        private var maxSpeed: Boolean? = null
        private var mcc: String? = null
        private var phone: Double? = null
        private var timeoutMs: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandIdentifyFromTransactionParams: BrandIdentifyFromTransactionParams) =
            apply {
                transactionInfo = brandIdentifyFromTransactionParams.transactionInfo
                city = brandIdentifyFromTransactionParams.city
                countryGl = brandIdentifyFromTransactionParams.countryGl
                forceLanguage = brandIdentifyFromTransactionParams.forceLanguage
                highConfidenceOnly = brandIdentifyFromTransactionParams.highConfidenceOnly
                maxSpeed = brandIdentifyFromTransactionParams.maxSpeed
                mcc = brandIdentifyFromTransactionParams.mcc
                phone = brandIdentifyFromTransactionParams.phone
                timeoutMs = brandIdentifyFromTransactionParams.timeoutMs
                additionalHeaders = brandIdentifyFromTransactionParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    brandIdentifyFromTransactionParams.additionalQueryParams.toBuilder()
            }

        /** Transaction information to identify the brand */
        fun transactionInfo(transactionInfo: String) = apply {
            this.transactionInfo = transactionInfo
        }

        /** Optional city name to prioritize when searching for the brand. */
        fun city(city: String?) = apply { this.city = city }

        /** Alias for calling [Builder.city] with `city.orElse(null)`. */
        fun city(city: Optional<String>) = city(city.getOrNull())

        /**
         * Optional country code (GL parameter) to specify the country. This affects the geographic
         * location used for search queries.
         */
        fun countryGl(countryGl: CountryGl?) = apply { this.countryGl = countryGl }

        /** Alias for calling [Builder.countryGl] with `countryGl.orElse(null)`. */
        fun countryGl(countryGl: Optional<CountryGl>) = countryGl(countryGl.getOrNull())

        /** Optional parameter to force the language of the retrieved brand data. */
        fun forceLanguage(forceLanguage: ForceLanguage?) = apply {
            this.forceLanguage = forceLanguage
        }

        /** Alias for calling [Builder.forceLanguage] with `forceLanguage.orElse(null)`. */
        fun forceLanguage(forceLanguage: Optional<ForceLanguage>) =
            forceLanguage(forceLanguage.getOrNull())

        /**
         * When set to true, the API will perform an additional verification steps to ensure the
         * identified brand matches the transaction with high confidence. Defaults to false.
         */
        fun highConfidenceOnly(highConfidenceOnly: Boolean?) = apply {
            this.highConfidenceOnly = highConfidenceOnly
        }

        /**
         * Alias for [Builder.highConfidenceOnly].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun highConfidenceOnly(highConfidenceOnly: Boolean) =
            highConfidenceOnly(highConfidenceOnly as Boolean?)

        /**
         * Alias for calling [Builder.highConfidenceOnly] with `highConfidenceOnly.orElse(null)`.
         */
        fun highConfidenceOnly(highConfidenceOnly: Optional<Boolean>) =
            highConfidenceOnly(highConfidenceOnly.getOrNull())

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
         * Optional Merchant Category Code (MCC) to help identify the business category/industry.
         */
        fun mcc(mcc: String?) = apply { this.mcc = mcc }

        /** Alias for calling [Builder.mcc] with `mcc.orElse(null)`. */
        fun mcc(mcc: Optional<String>) = mcc(mcc.getOrNull())

        /** Optional phone number from the transaction to help verify brand match. */
        fun phone(phone: Double?) = apply { this.phone = phone }

        /**
         * Alias for [Builder.phone].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun phone(phone: Double) = phone(phone as Double?)

        /** Alias for calling [Builder.phone] with `phone.orElse(null)`. */
        fun phone(phone: Optional<Double>) = phone(phone.getOrNull())

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
         * Returns an immutable instance of [BrandIdentifyFromTransactionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .transactionInfo()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandIdentifyFromTransactionParams =
            BrandIdentifyFromTransactionParams(
                checkRequired("transactionInfo", transactionInfo),
                city,
                countryGl,
                forceLanguage,
                highConfidenceOnly,
                maxSpeed,
                mcc,
                phone,
                timeoutMs,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("transaction_info", transactionInfo)
                city?.let { put("city", it) }
                countryGl?.let { put("country_gl", it.toString()) }
                forceLanguage?.let { put("force_language", it.toString()) }
                highConfidenceOnly?.let { put("high_confidence_only", it.toString()) }
                maxSpeed?.let { put("maxSpeed", it.toString()) }
                mcc?.let { put("mcc", it) }
                phone?.let { put("phone", it.toString()) }
                timeoutMs?.let { put("timeoutMS", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Optional country code (GL parameter) to specify the country. This affects the geographic
     * location used for search queries.
     */
    class CountryGl @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AD = of("ad")

            @JvmField val AE = of("ae")

            @JvmField val AF = of("af")

            @JvmField val AG = of("ag")

            @JvmField val AI = of("ai")

            @JvmField val AL = of("al")

            @JvmField val AM = of("am")

            @JvmField val AN = of("an")

            @JvmField val AO = of("ao")

            @JvmField val AQ = of("aq")

            @JvmField val AR = of("ar")

            @JvmField val AS = of("as")

            @JvmField val AT = of("at")

            @JvmField val AU = of("au")

            @JvmField val AW = of("aw")

            @JvmField val AZ = of("az")

            @JvmField val BA = of("ba")

            @JvmField val BB = of("bb")

            @JvmField val BD = of("bd")

            @JvmField val BE = of("be")

            @JvmField val BF = of("bf")

            @JvmField val BG = of("bg")

            @JvmField val BH = of("bh")

            @JvmField val BI = of("bi")

            @JvmField val BJ = of("bj")

            @JvmField val BM = of("bm")

            @JvmField val BN = of("bn")

            @JvmField val BO = of("bo")

            @JvmField val BR = of("br")

            @JvmField val BS = of("bs")

            @JvmField val BT = of("bt")

            @JvmField val BV = of("bv")

            @JvmField val BW = of("bw")

            @JvmField val BY = of("by")

            @JvmField val BZ = of("bz")

            @JvmField val CA = of("ca")

            @JvmField val CC = of("cc")

            @JvmField val CD = of("cd")

            @JvmField val CF = of("cf")

            @JvmField val CG = of("cg")

            @JvmField val CH = of("ch")

            @JvmField val CI = of("ci")

            @JvmField val CK = of("ck")

            @JvmField val CL = of("cl")

            @JvmField val CM = of("cm")

            @JvmField val CN = of("cn")

            @JvmField val CO = of("co")

            @JvmField val CR = of("cr")

            @JvmField val CU = of("cu")

            @JvmField val CV = of("cv")

            @JvmField val CX = of("cx")

            @JvmField val CY = of("cy")

            @JvmField val CZ = of("cz")

            @JvmField val DE = of("de")

            @JvmField val DJ = of("dj")

            @JvmField val DK = of("dk")

            @JvmField val DM = of("dm")

            @JvmField val DO = of("do")

            @JvmField val DZ = of("dz")

            @JvmField val EC = of("ec")

            @JvmField val EE = of("ee")

            @JvmField val EG = of("eg")

            @JvmField val EH = of("eh")

            @JvmField val ER = of("er")

            @JvmField val ES = of("es")

            @JvmField val ET = of("et")

            @JvmField val FI = of("fi")

            @JvmField val FJ = of("fj")

            @JvmField val FK = of("fk")

            @JvmField val FM = of("fm")

            @JvmField val FO = of("fo")

            @JvmField val FR = of("fr")

            @JvmField val GA = of("ga")

            @JvmField val GB = of("gb")

            @JvmField val GD = of("gd")

            @JvmField val GE = of("ge")

            @JvmField val GF = of("gf")

            @JvmField val GH = of("gh")

            @JvmField val GI = of("gi")

            @JvmField val GL = of("gl")

            @JvmField val GM = of("gm")

            @JvmField val GN = of("gn")

            @JvmField val GP = of("gp")

            @JvmField val GQ = of("gq")

            @JvmField val GR = of("gr")

            @JvmField val GS = of("gs")

            @JvmField val GT = of("gt")

            @JvmField val GU = of("gu")

            @JvmField val GW = of("gw")

            @JvmField val GY = of("gy")

            @JvmField val HK = of("hk")

            @JvmField val HM = of("hm")

            @JvmField val HN = of("hn")

            @JvmField val HR = of("hr")

            @JvmField val HT = of("ht")

            @JvmField val HU = of("hu")

            @JvmField val ID = of("id")

            @JvmField val IE = of("ie")

            @JvmField val IL = of("il")

            @JvmField val IN = of("in")

            @JvmField val IO = of("io")

            @JvmField val IQ = of("iq")

            @JvmField val IR = of("ir")

            @JvmField val IS = of("is")

            @JvmField val IT = of("it")

            @JvmField val JM = of("jm")

            @JvmField val JO = of("jo")

            @JvmField val JP = of("jp")

            @JvmField val KE = of("ke")

            @JvmField val KG = of("kg")

            @JvmField val KH = of("kh")

            @JvmField val KI = of("ki")

            @JvmField val KM = of("km")

            @JvmField val KN = of("kn")

            @JvmField val KP = of("kp")

            @JvmField val KR = of("kr")

            @JvmField val KW = of("kw")

            @JvmField val KY = of("ky")

            @JvmField val KZ = of("kz")

            @JvmField val LA = of("la")

            @JvmField val LB = of("lb")

            @JvmField val LC = of("lc")

            @JvmField val LI = of("li")

            @JvmField val LK = of("lk")

            @JvmField val LR = of("lr")

            @JvmField val LS = of("ls")

            @JvmField val LT = of("lt")

            @JvmField val LU = of("lu")

            @JvmField val LV = of("lv")

            @JvmField val LY = of("ly")

            @JvmField val MA = of("ma")

            @JvmField val MC = of("mc")

            @JvmField val MD = of("md")

            @JvmField val MG = of("mg")

            @JvmField val MH = of("mh")

            @JvmField val MK = of("mk")

            @JvmField val ML = of("ml")

            @JvmField val MM = of("mm")

            @JvmField val MN = of("mn")

            @JvmField val MO = of("mo")

            @JvmField val MP = of("mp")

            @JvmField val MQ = of("mq")

            @JvmField val MR = of("mr")

            @JvmField val MS = of("ms")

            @JvmField val MT = of("mt")

            @JvmField val MU = of("mu")

            @JvmField val MV = of("mv")

            @JvmField val MW = of("mw")

            @JvmField val MX = of("mx")

            @JvmField val MY = of("my")

            @JvmField val MZ = of("mz")

            @JvmField val NA = of("na")

            @JvmField val NC = of("nc")

            @JvmField val NE = of("ne")

            @JvmField val NF = of("nf")

            @JvmField val NG = of("ng")

            @JvmField val NI = of("ni")

            @JvmField val NL = of("nl")

            @JvmField val NO = of("no")

            @JvmField val NP = of("np")

            @JvmField val NR = of("nr")

            @JvmField val NU = of("nu")

            @JvmField val NZ = of("nz")

            @JvmField val OM = of("om")

            @JvmField val PA = of("pa")

            @JvmField val PE = of("pe")

            @JvmField val PF = of("pf")

            @JvmField val PG = of("pg")

            @JvmField val PH = of("ph")

            @JvmField val PK = of("pk")

            @JvmField val PL = of("pl")

            @JvmField val PM = of("pm")

            @JvmField val PN = of("pn")

            @JvmField val PR = of("pr")

            @JvmField val PS = of("ps")

            @JvmField val PT = of("pt")

            @JvmField val PW = of("pw")

            @JvmField val PY = of("py")

            @JvmField val QA = of("qa")

            @JvmField val RE = of("re")

            @JvmField val RO = of("ro")

            @JvmField val RS = of("rs")

            @JvmField val RU = of("ru")

            @JvmField val RW = of("rw")

            @JvmField val SA = of("sa")

            @JvmField val SB = of("sb")

            @JvmField val SC = of("sc")

            @JvmField val SD = of("sd")

            @JvmField val SE = of("se")

            @JvmField val SG = of("sg")

            @JvmField val SH = of("sh")

            @JvmField val SI = of("si")

            @JvmField val SJ = of("sj")

            @JvmField val SK = of("sk")

            @JvmField val SL = of("sl")

            @JvmField val SM = of("sm")

            @JvmField val SN = of("sn")

            @JvmField val SO = of("so")

            @JvmField val SR = of("sr")

            @JvmField val ST = of("st")

            @JvmField val SV = of("sv")

            @JvmField val SY = of("sy")

            @JvmField val SZ = of("sz")

            @JvmField val TC = of("tc")

            @JvmField val TD = of("td")

            @JvmField val TF = of("tf")

            @JvmField val TG = of("tg")

            @JvmField val TH = of("th")

            @JvmField val TJ = of("tj")

            @JvmField val TK = of("tk")

            @JvmField val TL = of("tl")

            @JvmField val TM = of("tm")

            @JvmField val TN = of("tn")

            @JvmField val TO = of("to")

            @JvmField val TR = of("tr")

            @JvmField val TT = of("tt")

            @JvmField val TV = of("tv")

            @JvmField val TW = of("tw")

            @JvmField val TZ = of("tz")

            @JvmField val UA = of("ua")

            @JvmField val UG = of("ug")

            @JvmField val UM = of("um")

            @JvmField val US = of("us")

            @JvmField val UY = of("uy")

            @JvmField val UZ = of("uz")

            @JvmField val VA = of("va")

            @JvmField val VC = of("vc")

            @JvmField val VE = of("ve")

            @JvmField val VG = of("vg")

            @JvmField val VI = of("vi")

            @JvmField val VN = of("vn")

            @JvmField val VU = of("vu")

            @JvmField val WF = of("wf")

            @JvmField val WS = of("ws")

            @JvmField val YE = of("ye")

            @JvmField val YT = of("yt")

            @JvmField val ZA = of("za")

            @JvmField val ZM = of("zm")

            @JvmField val ZW = of("zw")

            @JvmStatic fun of(value: String) = CountryGl(JsonField.of(value))
        }

        /** An enum containing [CountryGl]'s known values. */
        enum class Known {
            AD,
            AE,
            AF,
            AG,
            AI,
            AL,
            AM,
            AN,
            AO,
            AQ,
            AR,
            AS,
            AT,
            AU,
            AW,
            AZ,
            BA,
            BB,
            BD,
            BE,
            BF,
            BG,
            BH,
            BI,
            BJ,
            BM,
            BN,
            BO,
            BR,
            BS,
            BT,
            BV,
            BW,
            BY,
            BZ,
            CA,
            CC,
            CD,
            CF,
            CG,
            CH,
            CI,
            CK,
            CL,
            CM,
            CN,
            CO,
            CR,
            CU,
            CV,
            CX,
            CY,
            CZ,
            DE,
            DJ,
            DK,
            DM,
            DO,
            DZ,
            EC,
            EE,
            EG,
            EH,
            ER,
            ES,
            ET,
            FI,
            FJ,
            FK,
            FM,
            FO,
            FR,
            GA,
            GB,
            GD,
            GE,
            GF,
            GH,
            GI,
            GL,
            GM,
            GN,
            GP,
            GQ,
            GR,
            GS,
            GT,
            GU,
            GW,
            GY,
            HK,
            HM,
            HN,
            HR,
            HT,
            HU,
            ID,
            IE,
            IL,
            IN,
            IO,
            IQ,
            IR,
            IS,
            IT,
            JM,
            JO,
            JP,
            KE,
            KG,
            KH,
            KI,
            KM,
            KN,
            KP,
            KR,
            KW,
            KY,
            KZ,
            LA,
            LB,
            LC,
            LI,
            LK,
            LR,
            LS,
            LT,
            LU,
            LV,
            LY,
            MA,
            MC,
            MD,
            MG,
            MH,
            MK,
            ML,
            MM,
            MN,
            MO,
            MP,
            MQ,
            MR,
            MS,
            MT,
            MU,
            MV,
            MW,
            MX,
            MY,
            MZ,
            NA,
            NC,
            NE,
            NF,
            NG,
            NI,
            NL,
            NO,
            NP,
            NR,
            NU,
            NZ,
            OM,
            PA,
            PE,
            PF,
            PG,
            PH,
            PK,
            PL,
            PM,
            PN,
            PR,
            PS,
            PT,
            PW,
            PY,
            QA,
            RE,
            RO,
            RS,
            RU,
            RW,
            SA,
            SB,
            SC,
            SD,
            SE,
            SG,
            SH,
            SI,
            SJ,
            SK,
            SL,
            SM,
            SN,
            SO,
            SR,
            ST,
            SV,
            SY,
            SZ,
            TC,
            TD,
            TF,
            TG,
            TH,
            TJ,
            TK,
            TL,
            TM,
            TN,
            TO,
            TR,
            TT,
            TV,
            TW,
            TZ,
            UA,
            UG,
            UM,
            US,
            UY,
            UZ,
            VA,
            VC,
            VE,
            VG,
            VI,
            VN,
            VU,
            WF,
            WS,
            YE,
            YT,
            ZA,
            ZM,
            ZW,
        }

        /**
         * An enum containing [CountryGl]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CountryGl] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AD,
            AE,
            AF,
            AG,
            AI,
            AL,
            AM,
            AN,
            AO,
            AQ,
            AR,
            AS,
            AT,
            AU,
            AW,
            AZ,
            BA,
            BB,
            BD,
            BE,
            BF,
            BG,
            BH,
            BI,
            BJ,
            BM,
            BN,
            BO,
            BR,
            BS,
            BT,
            BV,
            BW,
            BY,
            BZ,
            CA,
            CC,
            CD,
            CF,
            CG,
            CH,
            CI,
            CK,
            CL,
            CM,
            CN,
            CO,
            CR,
            CU,
            CV,
            CX,
            CY,
            CZ,
            DE,
            DJ,
            DK,
            DM,
            DO,
            DZ,
            EC,
            EE,
            EG,
            EH,
            ER,
            ES,
            ET,
            FI,
            FJ,
            FK,
            FM,
            FO,
            FR,
            GA,
            GB,
            GD,
            GE,
            GF,
            GH,
            GI,
            GL,
            GM,
            GN,
            GP,
            GQ,
            GR,
            GS,
            GT,
            GU,
            GW,
            GY,
            HK,
            HM,
            HN,
            HR,
            HT,
            HU,
            ID,
            IE,
            IL,
            IN,
            IO,
            IQ,
            IR,
            IS,
            IT,
            JM,
            JO,
            JP,
            KE,
            KG,
            KH,
            KI,
            KM,
            KN,
            KP,
            KR,
            KW,
            KY,
            KZ,
            LA,
            LB,
            LC,
            LI,
            LK,
            LR,
            LS,
            LT,
            LU,
            LV,
            LY,
            MA,
            MC,
            MD,
            MG,
            MH,
            MK,
            ML,
            MM,
            MN,
            MO,
            MP,
            MQ,
            MR,
            MS,
            MT,
            MU,
            MV,
            MW,
            MX,
            MY,
            MZ,
            NA,
            NC,
            NE,
            NF,
            NG,
            NI,
            NL,
            NO,
            NP,
            NR,
            NU,
            NZ,
            OM,
            PA,
            PE,
            PF,
            PG,
            PH,
            PK,
            PL,
            PM,
            PN,
            PR,
            PS,
            PT,
            PW,
            PY,
            QA,
            RE,
            RO,
            RS,
            RU,
            RW,
            SA,
            SB,
            SC,
            SD,
            SE,
            SG,
            SH,
            SI,
            SJ,
            SK,
            SL,
            SM,
            SN,
            SO,
            SR,
            ST,
            SV,
            SY,
            SZ,
            TC,
            TD,
            TF,
            TG,
            TH,
            TJ,
            TK,
            TL,
            TM,
            TN,
            TO,
            TR,
            TT,
            TV,
            TW,
            TZ,
            UA,
            UG,
            UM,
            US,
            UY,
            UZ,
            VA,
            VC,
            VE,
            VG,
            VI,
            VN,
            VU,
            WF,
            WS,
            YE,
            YT,
            ZA,
            ZM,
            ZW,
            /**
             * An enum member indicating that [CountryGl] was instantiated with an unknown value.
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
                AD -> Value.AD
                AE -> Value.AE
                AF -> Value.AF
                AG -> Value.AG
                AI -> Value.AI
                AL -> Value.AL
                AM -> Value.AM
                AN -> Value.AN
                AO -> Value.AO
                AQ -> Value.AQ
                AR -> Value.AR
                AS -> Value.AS
                AT -> Value.AT
                AU -> Value.AU
                AW -> Value.AW
                AZ -> Value.AZ
                BA -> Value.BA
                BB -> Value.BB
                BD -> Value.BD
                BE -> Value.BE
                BF -> Value.BF
                BG -> Value.BG
                BH -> Value.BH
                BI -> Value.BI
                BJ -> Value.BJ
                BM -> Value.BM
                BN -> Value.BN
                BO -> Value.BO
                BR -> Value.BR
                BS -> Value.BS
                BT -> Value.BT
                BV -> Value.BV
                BW -> Value.BW
                BY -> Value.BY
                BZ -> Value.BZ
                CA -> Value.CA
                CC -> Value.CC
                CD -> Value.CD
                CF -> Value.CF
                CG -> Value.CG
                CH -> Value.CH
                CI -> Value.CI
                CK -> Value.CK
                CL -> Value.CL
                CM -> Value.CM
                CN -> Value.CN
                CO -> Value.CO
                CR -> Value.CR
                CU -> Value.CU
                CV -> Value.CV
                CX -> Value.CX
                CY -> Value.CY
                CZ -> Value.CZ
                DE -> Value.DE
                DJ -> Value.DJ
                DK -> Value.DK
                DM -> Value.DM
                DO -> Value.DO
                DZ -> Value.DZ
                EC -> Value.EC
                EE -> Value.EE
                EG -> Value.EG
                EH -> Value.EH
                ER -> Value.ER
                ES -> Value.ES
                ET -> Value.ET
                FI -> Value.FI
                FJ -> Value.FJ
                FK -> Value.FK
                FM -> Value.FM
                FO -> Value.FO
                FR -> Value.FR
                GA -> Value.GA
                GB -> Value.GB
                GD -> Value.GD
                GE -> Value.GE
                GF -> Value.GF
                GH -> Value.GH
                GI -> Value.GI
                GL -> Value.GL
                GM -> Value.GM
                GN -> Value.GN
                GP -> Value.GP
                GQ -> Value.GQ
                GR -> Value.GR
                GS -> Value.GS
                GT -> Value.GT
                GU -> Value.GU
                GW -> Value.GW
                GY -> Value.GY
                HK -> Value.HK
                HM -> Value.HM
                HN -> Value.HN
                HR -> Value.HR
                HT -> Value.HT
                HU -> Value.HU
                ID -> Value.ID
                IE -> Value.IE
                IL -> Value.IL
                IN -> Value.IN
                IO -> Value.IO
                IQ -> Value.IQ
                IR -> Value.IR
                IS -> Value.IS
                IT -> Value.IT
                JM -> Value.JM
                JO -> Value.JO
                JP -> Value.JP
                KE -> Value.KE
                KG -> Value.KG
                KH -> Value.KH
                KI -> Value.KI
                KM -> Value.KM
                KN -> Value.KN
                KP -> Value.KP
                KR -> Value.KR
                KW -> Value.KW
                KY -> Value.KY
                KZ -> Value.KZ
                LA -> Value.LA
                LB -> Value.LB
                LC -> Value.LC
                LI -> Value.LI
                LK -> Value.LK
                LR -> Value.LR
                LS -> Value.LS
                LT -> Value.LT
                LU -> Value.LU
                LV -> Value.LV
                LY -> Value.LY
                MA -> Value.MA
                MC -> Value.MC
                MD -> Value.MD
                MG -> Value.MG
                MH -> Value.MH
                MK -> Value.MK
                ML -> Value.ML
                MM -> Value.MM
                MN -> Value.MN
                MO -> Value.MO
                MP -> Value.MP
                MQ -> Value.MQ
                MR -> Value.MR
                MS -> Value.MS
                MT -> Value.MT
                MU -> Value.MU
                MV -> Value.MV
                MW -> Value.MW
                MX -> Value.MX
                MY -> Value.MY
                MZ -> Value.MZ
                NA -> Value.NA
                NC -> Value.NC
                NE -> Value.NE
                NF -> Value.NF
                NG -> Value.NG
                NI -> Value.NI
                NL -> Value.NL
                NO -> Value.NO
                NP -> Value.NP
                NR -> Value.NR
                NU -> Value.NU
                NZ -> Value.NZ
                OM -> Value.OM
                PA -> Value.PA
                PE -> Value.PE
                PF -> Value.PF
                PG -> Value.PG
                PH -> Value.PH
                PK -> Value.PK
                PL -> Value.PL
                PM -> Value.PM
                PN -> Value.PN
                PR -> Value.PR
                PS -> Value.PS
                PT -> Value.PT
                PW -> Value.PW
                PY -> Value.PY
                QA -> Value.QA
                RE -> Value.RE
                RO -> Value.RO
                RS -> Value.RS
                RU -> Value.RU
                RW -> Value.RW
                SA -> Value.SA
                SB -> Value.SB
                SC -> Value.SC
                SD -> Value.SD
                SE -> Value.SE
                SG -> Value.SG
                SH -> Value.SH
                SI -> Value.SI
                SJ -> Value.SJ
                SK -> Value.SK
                SL -> Value.SL
                SM -> Value.SM
                SN -> Value.SN
                SO -> Value.SO
                SR -> Value.SR
                ST -> Value.ST
                SV -> Value.SV
                SY -> Value.SY
                SZ -> Value.SZ
                TC -> Value.TC
                TD -> Value.TD
                TF -> Value.TF
                TG -> Value.TG
                TH -> Value.TH
                TJ -> Value.TJ
                TK -> Value.TK
                TL -> Value.TL
                TM -> Value.TM
                TN -> Value.TN
                TO -> Value.TO
                TR -> Value.TR
                TT -> Value.TT
                TV -> Value.TV
                TW -> Value.TW
                TZ -> Value.TZ
                UA -> Value.UA
                UG -> Value.UG
                UM -> Value.UM
                US -> Value.US
                UY -> Value.UY
                UZ -> Value.UZ
                VA -> Value.VA
                VC -> Value.VC
                VE -> Value.VE
                VG -> Value.VG
                VI -> Value.VI
                VN -> Value.VN
                VU -> Value.VU
                WF -> Value.WF
                WS -> Value.WS
                YE -> Value.YE
                YT -> Value.YT
                ZA -> Value.ZA
                ZM -> Value.ZM
                ZW -> Value.ZW
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
                AD -> Known.AD
                AE -> Known.AE
                AF -> Known.AF
                AG -> Known.AG
                AI -> Known.AI
                AL -> Known.AL
                AM -> Known.AM
                AN -> Known.AN
                AO -> Known.AO
                AQ -> Known.AQ
                AR -> Known.AR
                AS -> Known.AS
                AT -> Known.AT
                AU -> Known.AU
                AW -> Known.AW
                AZ -> Known.AZ
                BA -> Known.BA
                BB -> Known.BB
                BD -> Known.BD
                BE -> Known.BE
                BF -> Known.BF
                BG -> Known.BG
                BH -> Known.BH
                BI -> Known.BI
                BJ -> Known.BJ
                BM -> Known.BM
                BN -> Known.BN
                BO -> Known.BO
                BR -> Known.BR
                BS -> Known.BS
                BT -> Known.BT
                BV -> Known.BV
                BW -> Known.BW
                BY -> Known.BY
                BZ -> Known.BZ
                CA -> Known.CA
                CC -> Known.CC
                CD -> Known.CD
                CF -> Known.CF
                CG -> Known.CG
                CH -> Known.CH
                CI -> Known.CI
                CK -> Known.CK
                CL -> Known.CL
                CM -> Known.CM
                CN -> Known.CN
                CO -> Known.CO
                CR -> Known.CR
                CU -> Known.CU
                CV -> Known.CV
                CX -> Known.CX
                CY -> Known.CY
                CZ -> Known.CZ
                DE -> Known.DE
                DJ -> Known.DJ
                DK -> Known.DK
                DM -> Known.DM
                DO -> Known.DO
                DZ -> Known.DZ
                EC -> Known.EC
                EE -> Known.EE
                EG -> Known.EG
                EH -> Known.EH
                ER -> Known.ER
                ES -> Known.ES
                ET -> Known.ET
                FI -> Known.FI
                FJ -> Known.FJ
                FK -> Known.FK
                FM -> Known.FM
                FO -> Known.FO
                FR -> Known.FR
                GA -> Known.GA
                GB -> Known.GB
                GD -> Known.GD
                GE -> Known.GE
                GF -> Known.GF
                GH -> Known.GH
                GI -> Known.GI
                GL -> Known.GL
                GM -> Known.GM
                GN -> Known.GN
                GP -> Known.GP
                GQ -> Known.GQ
                GR -> Known.GR
                GS -> Known.GS
                GT -> Known.GT
                GU -> Known.GU
                GW -> Known.GW
                GY -> Known.GY
                HK -> Known.HK
                HM -> Known.HM
                HN -> Known.HN
                HR -> Known.HR
                HT -> Known.HT
                HU -> Known.HU
                ID -> Known.ID
                IE -> Known.IE
                IL -> Known.IL
                IN -> Known.IN
                IO -> Known.IO
                IQ -> Known.IQ
                IR -> Known.IR
                IS -> Known.IS
                IT -> Known.IT
                JM -> Known.JM
                JO -> Known.JO
                JP -> Known.JP
                KE -> Known.KE
                KG -> Known.KG
                KH -> Known.KH
                KI -> Known.KI
                KM -> Known.KM
                KN -> Known.KN
                KP -> Known.KP
                KR -> Known.KR
                KW -> Known.KW
                KY -> Known.KY
                KZ -> Known.KZ
                LA -> Known.LA
                LB -> Known.LB
                LC -> Known.LC
                LI -> Known.LI
                LK -> Known.LK
                LR -> Known.LR
                LS -> Known.LS
                LT -> Known.LT
                LU -> Known.LU
                LV -> Known.LV
                LY -> Known.LY
                MA -> Known.MA
                MC -> Known.MC
                MD -> Known.MD
                MG -> Known.MG
                MH -> Known.MH
                MK -> Known.MK
                ML -> Known.ML
                MM -> Known.MM
                MN -> Known.MN
                MO -> Known.MO
                MP -> Known.MP
                MQ -> Known.MQ
                MR -> Known.MR
                MS -> Known.MS
                MT -> Known.MT
                MU -> Known.MU
                MV -> Known.MV
                MW -> Known.MW
                MX -> Known.MX
                MY -> Known.MY
                MZ -> Known.MZ
                NA -> Known.NA
                NC -> Known.NC
                NE -> Known.NE
                NF -> Known.NF
                NG -> Known.NG
                NI -> Known.NI
                NL -> Known.NL
                NO -> Known.NO
                NP -> Known.NP
                NR -> Known.NR
                NU -> Known.NU
                NZ -> Known.NZ
                OM -> Known.OM
                PA -> Known.PA
                PE -> Known.PE
                PF -> Known.PF
                PG -> Known.PG
                PH -> Known.PH
                PK -> Known.PK
                PL -> Known.PL
                PM -> Known.PM
                PN -> Known.PN
                PR -> Known.PR
                PS -> Known.PS
                PT -> Known.PT
                PW -> Known.PW
                PY -> Known.PY
                QA -> Known.QA
                RE -> Known.RE
                RO -> Known.RO
                RS -> Known.RS
                RU -> Known.RU
                RW -> Known.RW
                SA -> Known.SA
                SB -> Known.SB
                SC -> Known.SC
                SD -> Known.SD
                SE -> Known.SE
                SG -> Known.SG
                SH -> Known.SH
                SI -> Known.SI
                SJ -> Known.SJ
                SK -> Known.SK
                SL -> Known.SL
                SM -> Known.SM
                SN -> Known.SN
                SO -> Known.SO
                SR -> Known.SR
                ST -> Known.ST
                SV -> Known.SV
                SY -> Known.SY
                SZ -> Known.SZ
                TC -> Known.TC
                TD -> Known.TD
                TF -> Known.TF
                TG -> Known.TG
                TH -> Known.TH
                TJ -> Known.TJ
                TK -> Known.TK
                TL -> Known.TL
                TM -> Known.TM
                TN -> Known.TN
                TO -> Known.TO
                TR -> Known.TR
                TT -> Known.TT
                TV -> Known.TV
                TW -> Known.TW
                TZ -> Known.TZ
                UA -> Known.UA
                UG -> Known.UG
                UM -> Known.UM
                US -> Known.US
                UY -> Known.UY
                UZ -> Known.UZ
                VA -> Known.VA
                VC -> Known.VC
                VE -> Known.VE
                VG -> Known.VG
                VI -> Known.VI
                VN -> Known.VN
                VU -> Known.VU
                WF -> Known.WF
                WS -> Known.WS
                YE -> Known.YE
                YT -> Known.YT
                ZA -> Known.ZA
                ZM -> Known.ZM
                ZW -> Known.ZW
                else -> throw BrandDevInvalidDataException("Unknown CountryGl: $value")
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

        fun validate(): CountryGl = apply {
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

            return other is CountryGl && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandIdentifyFromTransactionParams &&
            transactionInfo == other.transactionInfo &&
            city == other.city &&
            countryGl == other.countryGl &&
            forceLanguage == other.forceLanguage &&
            highConfidenceOnly == other.highConfidenceOnly &&
            maxSpeed == other.maxSpeed &&
            mcc == other.mcc &&
            phone == other.phone &&
            timeoutMs == other.timeoutMs &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            transactionInfo,
            city,
            countryGl,
            forceLanguage,
            highConfidenceOnly,
            maxSpeed,
            mcc,
            phone,
            timeoutMs,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BrandIdentifyFromTransactionParams{transactionInfo=$transactionInfo, city=$city, countryGl=$countryGl, forceLanguage=$forceLanguage, highConfidenceOnly=$highConfidenceOnly, maxSpeed=$maxSpeed, mcc=$mcc, phone=$phone, timeoutMs=$timeoutMs, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
