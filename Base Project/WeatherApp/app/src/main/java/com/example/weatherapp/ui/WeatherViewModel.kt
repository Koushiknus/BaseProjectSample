package com.example.weatherapp.ui

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.base.BaseViewModel
import com.example.weatherapp.model.SearchResponse
import com.example.weatherapp.network.ApiMethods
import kotlinx.coroutines.launch
import javax.inject.Inject

class WeatherViewModel : BaseViewModel() {
    @set: Inject
    var apiMethods: ApiMethods? = null

    @set:Inject
    var mWeatherRepository: WeatherRepository? = null

    fun testSearchResults(){
        viewModelScope.launch {
           val result = mWeatherRepository?.testCouRoutine() as SearchResponse
           Log.v("ResultReceived",result.toString())
        }

    }

}