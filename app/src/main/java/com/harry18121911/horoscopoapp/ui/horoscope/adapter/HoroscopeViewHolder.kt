package com.harry18121911.horoscopoapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.harry18121911.horoscopoapp.databinding.ItemHoroscopeBinding
import com.harry18121911.horoscopoapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder (view: View):RecyclerView.ViewHolder(view){

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected:(HoroscopeInfo)->Unit){
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = binding.tvTitle.context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener {
            startRotationAnimation(binding.ivHoroscope, newCallBack = {onItemSelected(horoscopeInfo)})
        }
    }

    private fun startRotationAnimation(view:View, newCallBack:()->Unit){
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction { newCallBack() }
            start()

        }
    }
}