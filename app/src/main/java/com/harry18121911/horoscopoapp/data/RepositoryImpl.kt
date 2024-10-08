package com.harry18121911.horoscopoapp.data

import android.util.Log
import com.harry18121911.horoscopoapp.data.network.HoroscopeApiService
import com.harry18121911.horoscopoapp.data.network.response.PredictionResponse
import com.harry18121911.horoscopoapp.domain.Repository
import com.harry18121911.horoscopoapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService):Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess {
                return it.toDomain()
            }
            .onFailure {
                Log.i("test","Ha ocurrido un error ${it.message}")
            }
        return null
    }
}