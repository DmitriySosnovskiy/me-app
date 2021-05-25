package com.dsosnovskiy.template.di.module

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
object DispatcherModule {

    @Singleton
    @Provides
    @JvmStatic fun provideDefaultDispatcher() = Dispatchers.Default

    @Singleton
    @Provides
    @JvmStatic fun provideIODispatcher() = Dispatchers.IO

    @Singleton
    @Provides
    @JvmStatic fun provideUnconfinedDispatcher() = Dispatchers.Unconfined

    @Singleton
    @Provides
    @JvmStatic fun provideMainDispatcher() = Dispatchers.Main
}