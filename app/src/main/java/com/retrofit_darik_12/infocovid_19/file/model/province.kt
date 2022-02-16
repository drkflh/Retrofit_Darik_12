package com.retrofit_darik_12.infocovid_19.file.model

import com.google.gson.annotations.SerializedName

data class province (
    @SerializedName("FID")
    val fid: Int,
    @SerializedName("Kode_provi")
    val code: Int,
    @SerializedName("Provinsi")
    val province: String,
    @SerializedName("Kasus_Posi")
    val positive: Int,
    @SerializedName("Kasus_Semb")
    val recover: Int,
    @SerializedName("Kasus_Meni")
    val death: Int,
)