package com.harry18121911.horoscopoapp.data.network.response

import com.harry18121911.horoscopoapp.domain.model.PredictionModel
import com.harry18121911.horoscopoapp.motherobject.HoroscopeMotherObject.anyResponse
import io.kotlintest.shouldBe
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class PredictionResponseTest{

    @Test
    fun toDomainShouldReturnCorrectPredictionModel(){

        //Given
        val horoscopeResponse : PredictionResponse = anyResponse.copy(sign ="libra")

        //When
        val predictionModel : PredictionModel = horoscopeResponse.toDomain()

        //Then
        predictionModel.sign shouldBe  horoscopeResponse.sign
        predictionModel.horoscope shouldBe  horoscopeResponse.horoscope
    }
}