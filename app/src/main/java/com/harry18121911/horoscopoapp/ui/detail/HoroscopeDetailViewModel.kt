package com.harry18121911.horoscopoapp.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.harry18121911.horoscopoapp.domain.GetPrediction
import com.harry18121911.horoscopoapp.domain.model.PredictionModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HoroscopeDetailViewModel @Inject constructor(private val getPrediction: GetPrediction):ViewModel(){
    private var _state = MutableStateFlow<HoroscopeDetailState>(HoroscopeDetailState.Loading)
    val state:StateFlow<HoroscopeDetailState> = _state

    fun getHoroscope(sign:String){
        viewModelScope.launch {
            _state.value = HoroscopeDetailState.Loading
            val result : PredictionModel? = withContext(Dispatchers.IO){
                getPrediction(sign)
            }
            if(result != null){
                _state.value = HoroscopeDetailState.Success(result.horoscope, result.sign)
            }else{
                _state.value = HoroscopeDetailState.Error("Ha ocurrido un error, inténtelo más tarde.")
            }

        }
    }
}