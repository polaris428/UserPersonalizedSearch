package com.example.userpersonalizedsearch.Retrofit


import com.example.userpersonalizedsearch.data.SearchDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RetrofitService {

    @GET("customsearch/v1")
     fun getPosts(@Query("key") key:String,@Query("cx") cx: String,@Query("q")q:String,@Query("num")num:String): Call<SearchDTO>
}