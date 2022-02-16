package com.retrofit_darik_12.infocovid_19.file.api

import com.retrofit_darik_12.infocovid_19.file.model.indonesiaResponse
import com.retrofit_darik_12.infocovid_19.file.model.provinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET ("https://learn-retrofit-data.netlify.app/casenumber.json")
    fun getIndonesia(): Call<ArrayList<indonesiaResponse>>

    @GET ("https://learn-retrofit-data.netlify.app/casenumberprovince.json")
    fun getProvince(): Call<ArrayList<provinceResponse>>

}