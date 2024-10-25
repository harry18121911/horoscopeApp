package com.harry18121911.horoscopoapp.motherobject

import com.harry18121911.horoscopoapp.data.network.response.PredictionResponse
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Aquarius
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Cancer
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Capricorn
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Gemini
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Leo
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Libra
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Pisces
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Sagittarius
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Scorpio
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Taurus
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Virgo
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Aries

object HoroscopeMotherObject {
    val anyResponse = PredictionResponse("date", "prediction","leo" )

    val horoscopeInfoList =  listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}