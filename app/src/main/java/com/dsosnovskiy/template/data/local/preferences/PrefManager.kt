package com.dsosnovskiy.template.data.local.preferences

import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

class PrefManager constructor(
    internal val preferences: SharedPreferences
) {

}