package com.harry18121911.horoscopoapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.harry18121911.horoscopoapp.R
import com.harry18121911.horoscopoapp.data.providers.HoroscopeProvider
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(private val horoscopeProvider: HoroscopeProvider):ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope:StateFlow<List<HoroscopeInfo>> =  _horoscope

    init {
        horoscopeProvider.getHoroscopes()
        _horoscope.value = horoscopeProvider.getHoroscopes()
    }

}

