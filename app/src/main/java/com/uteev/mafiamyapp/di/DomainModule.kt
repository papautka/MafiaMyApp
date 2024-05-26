package com.uteev.mafiamyapp.di

import com.uteev.mafiamyapp.data.repository.RepositoryImpl
import com.uteev.mafiamyapp.domain.Repository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl : RepositoryImpl) : Repository
}