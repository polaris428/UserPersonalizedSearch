package com.example.userpersonalizedsearch

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import retrofit2.Callback
import com.example.userpersonalizedsearch.Retrofit.RetrofitInstance
import com.example.userpersonalizedsearch.data.SearchDTO
import retrofit2.Call
import retrofit2.Response


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            test()
        }
    }

    fun test(){
        var apiService= RetrofitInstance.retrofitService
        apiService.getPosts(key = "AIzaSyAwC2qPh7vYP9O25R4g7CF1vmvL80hDOqU", cx = "276d9fae23a014ed6", q = "pm", num = "2").enqueue(object :Callback<SearchDTO>{
            override fun onResponse(call: Call<SearchDTO>, response: Response<SearchDTO>) {
                Log.e("희망이 보용ㅅ",response.body().toString())
            }

            override fun onFailure(call: Call<SearchDTO>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })

    }
}

