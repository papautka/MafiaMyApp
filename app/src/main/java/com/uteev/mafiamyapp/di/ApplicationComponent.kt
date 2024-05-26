package com.uteev.mafiamyapp.di

import com.uteev.mafiamyapp.presentation.MainActivity
import dagger.Component

@Component(modules = [ContextModule::class, DataModule::class, DomainModule::class])
interface ApplicationComponent {
    fun inject(activity : MainActivity)
}