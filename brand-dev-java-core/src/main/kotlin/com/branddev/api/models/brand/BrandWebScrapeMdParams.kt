// File generated from our OpenAPI spec by Stainless.

package com.branddev.api.models.brand

import com.branddev.api.core.Params
import com.branddev.api.core.checkRequired
import com.branddev.api.core.http.Headers
import com.branddev.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Scrapes the given URL, converts the HTML content to GitHub Flavored Markdown (GFM), and returns
 * the result. Uses automatic proxy escalation to handle blocked sites.
 */
class BrandWebScrapeMdParams
private constructor(
    private val url: String,
    private val includeImages: Boolean?,
    private val includeLinks: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Full URL to scrape and convert to markdown (must include http:// or https:// protocol) */
    fun url(): String = url

    /** Include image references in Markdown output */
    fun includeImages(): Optional<Boolean> = Optional.ofNullable(includeImages)

    /** Preserve hyperlinks in Markdown output */
    fun includeLinks(): Optional<Boolean> = Optional.ofNullable(includeLinks)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrandWebScrapeMdParams].
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandWebScrapeMdParams]. */
    class Builder internal constructor() {

        private var url: String? = null
        private var includeImages: Boolean? = null
        private var includeLinks: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandWebScrapeMdParams: BrandWebScrapeMdParams) = apply {
            url = brandWebScrapeMdParams.url
            includeImages = brandWebScrapeMdParams.includeImages
            includeLinks = brandWebScrapeMdParams.includeLinks
            additionalHeaders = brandWebScrapeMdParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandWebScrapeMdParams.additionalQueryParams.toBuilder()
        }

        /**
         * Full URL to scrape and convert to markdown (must include http:// or https:// protocol)
         */
        fun url(url: String) = apply { this.url = url }

        /** Include image references in Markdown output */
        fun includeImages(includeImages: Boolean?) = apply { this.includeImages = includeImages }

        /**
         * Alias for [Builder.includeImages].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeImages(includeImages: Boolean) = includeImages(includeImages as Boolean?)

        /** Alias for calling [Builder.includeImages] with `includeImages.orElse(null)`. */
        fun includeImages(includeImages: Optional<Boolean>) =
            includeImages(includeImages.getOrNull())

        /** Preserve hyperlinks in Markdown output */
        fun includeLinks(includeLinks: Boolean?) = apply { this.includeLinks = includeLinks }

        /**
         * Alias for [Builder.includeLinks].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeLinks(includeLinks: Boolean) = includeLinks(includeLinks as Boolean?)

        /** Alias for calling [Builder.includeLinks] with `includeLinks.orElse(null)`. */
        fun includeLinks(includeLinks: Optional<Boolean>) = includeLinks(includeLinks.getOrNull())

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
         * Returns an immutable instance of [BrandWebScrapeMdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandWebScrapeMdParams =
            BrandWebScrapeMdParams(
                checkRequired("url", url),
                includeImages,
                includeLinks,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("url", url)
                includeImages?.let { put("includeImages", it.toString()) }
                includeLinks?.let { put("includeLinks", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandWebScrapeMdParams &&
            url == other.url &&
            includeImages == other.includeImages &&
            includeLinks == other.includeLinks &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(url, includeImages, includeLinks, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BrandWebScrapeMdParams{url=$url, includeImages=$includeImages, includeLinks=$includeLinks, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
