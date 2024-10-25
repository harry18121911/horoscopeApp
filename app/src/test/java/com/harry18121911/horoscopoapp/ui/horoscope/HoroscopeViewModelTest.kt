package com.harry18121911.horoscopoapp.ui.horoscope

import com.harry18121911.horoscopoapp.data.providers.HoroscopeProvider
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo
import com.harry18121911.horoscopoapp.motherobject.HoroscopeMotherObject.horoscopeInfoList
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest{

    @MockK
    lateinit var  horoscopeProvider: HoroscopeProvider

    private lateinit var  viewModel: HoroscopeViewModel

    @Before
    fun setUp(){
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun whenViewModelIsCreatedThenHoroscopesAreLoaded(){
        every { horoscopeProvider.getHoroscopes() } returns  horoscopeInfoList
        viewModel = HoroscopeViewModel(horoscopeProvider)

        val horoscopes : List<HoroscopeInfo> = viewModel.horoscope.value

        assertTrue(horoscopes.isNotEmpty())
    }
}