package com.uteev.mafiamyapp.domain

import javax.inject.Inject

class ExampleUseCase @Inject constructor(
    private val repository: Repository
) {
    operator fun invoke() {
        repository.requestWeatherData()
    }
}