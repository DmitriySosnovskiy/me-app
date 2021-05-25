package com.dsosnovskiy.template.extensions

fun String.isValidEmail(): Boolean {
    val pattern = "^.+@.+\\.\\w+\$"
    return Regex(pattern).matches(this)
}
