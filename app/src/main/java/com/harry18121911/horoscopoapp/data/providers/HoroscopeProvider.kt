package com.harry18121911.horoscopoapp.data.providers

import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Aquarius
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.Aries
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
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes():List<HoroscopeInfo>{
        return listOf(
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
}