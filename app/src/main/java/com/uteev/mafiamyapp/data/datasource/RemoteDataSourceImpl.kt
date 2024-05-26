package com.uteev.mafiamyapp.data.datasource

import com.uteev.mafiamyapp.data.network.ApiService
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : RemoteDataSource{
    override fun requestWeatherData() {
        apiService.requestWeatherData()
    }
}