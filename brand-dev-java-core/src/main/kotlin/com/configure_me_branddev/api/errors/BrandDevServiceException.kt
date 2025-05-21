// File generated from our OpenAPI spec by Stainless.

package com.configure_me_branddev.api.errors

import com.configure_me_branddev.api.core.JsonValue
import com.configure_me_branddev.api.core.http.Headers

abstract class BrandDevServiceException
protected constructor(message: String, cause: Throwable? = null) :
    BrandDevException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
