package com.dsosnovskiy.template.extensions

import com.google.android.material.textfield.TextInputEditText

fun TextInputEditText.getTrimmedText(): String {
    return this.text.toString().trim()
}