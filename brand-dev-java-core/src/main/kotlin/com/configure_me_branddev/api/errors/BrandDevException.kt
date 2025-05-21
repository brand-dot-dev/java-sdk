package com.configure_me_branddev.api.errors

open class BrandDevException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
