package com.rcosteira.template.di.modules

import com.rcosteira.core.di.modules.DataModule
import com.rcosteira.core.di.scopes.ActivityScope
import com.rcosteira.recyclerviewexample.di.RecyclerViewExampleModule
import com.rcosteira.rxjavatocoroutines.di.RxJavaToCoroutinesModule
import com.rcosteira.template.presentation.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeModule {

    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            DataModule::class,
            RecyclerViewExampleModule::class,
            RxJavaToCoroutinesModule::class
        ]
    )
    abstract fun provideHomeActivity(): HomeActivity
}