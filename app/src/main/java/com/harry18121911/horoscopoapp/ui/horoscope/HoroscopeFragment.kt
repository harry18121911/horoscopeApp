package com.harry18121911.horoscopoapp.ui.horoscope

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.harry18121911.horoscopoapp.databinding.FragmentHoroscopeBinding
import com.harry18121911.horoscopoapp.ui.horoscope.adapter.HoroscopeAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HoroscopeFragment : Fragment() {

    private val horoscopeViewModel by viewModels<HoroscopeViewModel>()

    private lateinit var  horoscopeAdapter: HoroscopeAdapter

    private var _binding: FragmentHoroscopeBinding? = null
    private val binding get() = _binding!!

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        initUi()
    }

    private fun initUi(){
        initList()
        initUIState()
    }

    private fun initList(){
        horoscopeAdapter = HoroscopeAdapter(onItemSelected = {Toast.makeText(context,getString(it.name),Toast.LENGTH_LONG).show()})
        binding.rvHoroscope.layoutManager = GridLayoutManager(context, 2)
        binding.rvHoroscope.adapter = horoscopeAdapter
    }

    private fun initUIState(){
       lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                horoscopeViewModel.horoscope.collect{
                    horoscopeAdapter.updateList(it)
                }
            }
       }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}