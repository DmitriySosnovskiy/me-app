package com.dsosnovskiy.template.di.component

import android.app.Application
import com.dsosnovskiy.template.di.module.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class])
interface AppComponent {

    @Component.Builder
    interface AppComponentBuilder {
        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application): AppComponentBuilder
    }
}