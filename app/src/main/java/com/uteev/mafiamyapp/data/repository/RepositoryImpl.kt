package com.uteev.mafiamyapp.data.repository

import com.uteev.mafiamyapp.data.datasource.RemoteDataSource
import com.uteev.mafiamyapp.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : Repository {
    override fun requestWeatherData() {
        remoteDataSource.requestWeatherData()
    }
}