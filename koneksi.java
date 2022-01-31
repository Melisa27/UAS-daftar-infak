package com.informatika19100082.melisa_19100082_daftarinfak.network;

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class koneksi {
    companion object{
        var retrofit = Retrofit.Builder()
                .baseUrl("http://192.168.43.196/daftarinfak/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        var service:ApiService = retrofit.create(ApiService:: class.java)
    }
}
