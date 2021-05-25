package com.dsosnovskiy.template.di.module

import com.dsosnovskiy.template.data.IRepository
import com.dsosnovskiy.template.data.RepositoryImpl
import com.dsosnovskiy.template.data.local.preferences.PrefManager
import com.dsosnovskiy.template.data.remote.ApiService
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [NetworkModule::class, LocalDataModule::class])
abstract class RepositoryModule {

    @Binds
    abstract fun bindRepository(repository: RepositoryImpl): IRepository

    @Module
    companion object {

        @Singleton
        @Provides
        @JvmStatic fun provideRepository(api: ApiService, prefs: PrefManager): RepositoryImpl {
            return RepositoryImpl(api, prefs)
        }
    }
}