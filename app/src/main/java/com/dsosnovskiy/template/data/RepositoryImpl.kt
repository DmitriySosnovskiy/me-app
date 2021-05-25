package com.dsosnovskiy.template.data

import com.dsosnovskiy.template.data.local.preferences.PrefManager
import com.dsosnovskiy.template.data.remote.ApiService
import javax.inject.Inject
import javax.inject.Singleton

class RepositoryImpl constructor(
    val api: ApiService,
    val prefs: PrefManager
) : IRepository {

}