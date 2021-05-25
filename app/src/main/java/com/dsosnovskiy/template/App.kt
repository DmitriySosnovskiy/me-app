package com.dsosnovskiy.template

import android.app.Application
import android.content.Context
import com.dsosnovskiy.template.di.component.AppComponent
import com.dsosnovskiy.template.di.component.DaggerAppComponent

class App: Application() {

    val daggerAppComponent: AppComponent by lazy {
        DaggerAppComponent.create()
    }

    override fun onCreate() {
        super.onCreate()
    }
}