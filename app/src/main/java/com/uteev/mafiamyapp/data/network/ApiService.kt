package com.uteev.mafiamyapp.data.network

import android.app.Application
import android.content.Context
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import javax.inject.Inject

class ApiService @Inject constructor(
    private val context: Context
) {
    fun requestWeatherData() {
        val API_KEY = "90003910355246fcbb182615241905"
        val url = "https://api.weatherapi.com/v1/forecast.json?key=$API_KEY&q=Moscow&days=10&aqi=no&alerts=no"
        val queue = Volley.newRequestQueue(context)
        val stringRequest = StringRequest(
            Request.Method.GET,
            url,
            { resultJson ->
//                parseWeatherData(resultJson)
            },
            { error ->
//                liveDataCurrent.postValue(null) // Or handle error more gracefully
            }
        )
        queue.add(stringRequest)
    }

}