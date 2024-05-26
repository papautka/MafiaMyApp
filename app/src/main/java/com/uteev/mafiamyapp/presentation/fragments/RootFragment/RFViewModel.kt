package com.uteev.mafiamyapp.presentation.fragments.RootFragment

import com.uteev.mafiamyapp.domain.ExampleUseCase
import javax.inject.Inject

class RFViewModel @Inject constructor(
    private val useCase : ExampleUseCase
) {
    fun method() {
        useCase()
    }
}