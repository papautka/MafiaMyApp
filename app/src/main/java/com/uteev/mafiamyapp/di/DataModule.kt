package com.uteev.mafiamyapp.di

import com.uteev.mafiamyapp.data.datasource.RemoteDataSource
import com.uteev.mafiamyapp.data.datasource.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {
    @Binds
    fun bindRemoteDataSource(impl : RemoteDataSourceImpl) : RemoteDataSource
}