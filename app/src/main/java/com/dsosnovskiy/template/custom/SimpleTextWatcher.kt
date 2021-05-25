package com.dsosnovskiy.template.custom

import android.text.Editable
import android.text.TextWatcher

class SimpleTextWatcher(private val callback: () -> Unit) : TextWatcher {
    override fun afterTextChanged(s: Editable?) {
        callback.invoke()
    }

    override fun beforeTextChanged(s: CharSequence?, st: Int, count: Int, after: Int) {}
    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
}