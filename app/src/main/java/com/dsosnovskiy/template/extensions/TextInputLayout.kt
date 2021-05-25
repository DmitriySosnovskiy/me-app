package com.dsosnovskiy.template.extensions

import androidx.core.view.isVisible
import com.google.android.material.textfield.TextInputLayout

fun TextInputLayout.disableError() {
    this.error = null
    this.isErrorEnabled = false
}

fun TextInputLayout.enableError(errorMsg: String? = null) {
    if (errorMsg == null) {
        this.error = " "
        this.getChildAt(1).isVisible = false
    } else {
        this.error = errorMsg
        this.getChildAt(1).isVisible = true
    }
}