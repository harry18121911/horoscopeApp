package com.harry18121911.horoscopoapp.data.core.interceptors

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(private val tokenManager: TokenManager) : Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val request :Request= chain.request().newBuilder().header("Authorization", tokenManager.getToken()).build()
        return chain.proceed(request)
    }
}

class TokenManager @Inject constructor(){
    fun getToken() :String = "TestToken"
}

