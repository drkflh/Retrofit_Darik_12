package com.retrofit_darik_12.infocovid_19.file.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.retrofit_darik_12.R
import com.retrofit_darik_12.infocovid_19.file.adapter.provinceAdapter
import com.retrofit_darik_12.infocovid_19.file.api.RetrofitClient
import com.retrofit_darik_12.infocovid_19.file.model.provinceResponse
import javax.security.auth.callback.Callback
import kotlinx.android.synthetic.main.activity_province.*
import retrofit2.Call
import retrofit2.Response


class ProvinceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_province)
        showProvince()
    }
    private  fun showProvince(){
        rvProvince.setHasFixedSize(true)
        rvProvince.layoutManager = LinearLayoutManager(this)

        RetrofitClient.instance.getProvince().enqueue(object : retrofit2.Callback<ArrayList<provinceResponse>>{
            override fun onResponse(call: Call<ArrayList<provinceResponse>>, response: Response<ArrayList<provinceResponse>>) {
                val list = response.body()
                val adapter = list?.let { provinceAdapter(it) }
                rvProvince.adapter = adapter
            }

            override fun onFailure(call: Call<ArrayList<provinceResponse>>, t: Throwable) {
                Toast.makeText(this@ProvinceActivity, "${t.message}", Toast.LENGTH_SHORT).show()
            }

        })
    }
}