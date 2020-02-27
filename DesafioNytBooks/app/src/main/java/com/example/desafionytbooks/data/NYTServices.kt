package com.example.desafionytbooks.data

import com.example.desafionytbooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {
    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "ABXK33ioAix96WdT2m32eOU1AhF9EiAN",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}