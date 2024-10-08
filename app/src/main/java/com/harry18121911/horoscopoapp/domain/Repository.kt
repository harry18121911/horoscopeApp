package com.harry18121911.horoscopoapp.domain

import com.harry18121911.horoscopoapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String):PredictionModel?
}