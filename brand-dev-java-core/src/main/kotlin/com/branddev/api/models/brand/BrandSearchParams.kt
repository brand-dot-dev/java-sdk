// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.Params
import com.branddev.api.core.checkRequired
import com.branddev.api.core.http.Headers
import com.branddev.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Search brands by query */
class BrandSearchParams
private constructor(
    private val query: String,
    private val timeoutMs: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Query string to search brands */
    fun query(): String = query

    /**
     * Optional timeout in milliseconds for the request. If the request takes longer than this
     * value, it will be aborted with a 408 status code. Maximum allowed value is 300000ms (5
     * minutes).
     */
    fun timeoutMs(): Optional<Long> = Optional.ofNullable(timeoutMs)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrandSearchParams].
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandSearchParams]. */
    class Builder internal constructor() {

        private var query: String? = null
        private var timeoutMs: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandSearchParams: BrandSearchParams) = apply {
            query = brandSearchParams.query
            timeoutMs = brandSearchParams.timeoutMs
            additionalHeaders = brandSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandSearchParams.additionalQueryParams.toBuilder()
        }

        /** Query string to search brands */
        fun query(query: String) = apply { this.query = query }

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
         * Returns an immutable instance of [BrandSearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandSearchParams =
            BrandSearchParams(
                checkRequired("query", query),
                timeoutMs,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("query", query)
                timeoutMs?.let { put("timeoutMS", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BrandSearchParams && query == other.query && timeoutMs == other.timeoutMs && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(query, timeoutMs, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BrandSearchParams{query=$query, timeoutMs=$timeoutMs, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
