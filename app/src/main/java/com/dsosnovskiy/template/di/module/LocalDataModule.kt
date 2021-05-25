package com.dsosnovskiy.template.di.module

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.dsosnovskiy.template.data.local.preferences.PrefManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object LocalDataModule {

    @Singleton
    @Provides
    @JvmStatic fun provideSharedPreferences(context: Context): SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(context)

    @Singleton
    @Provides
    @JvmStatic fun providePrefManager(sharedPreferences: SharedPreferences): PrefManager =
        PrefManager(sharedPreferences)
}