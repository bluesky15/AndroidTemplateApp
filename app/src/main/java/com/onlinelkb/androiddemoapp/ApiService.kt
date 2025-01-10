package com.onlinelkb.androiddemoapp

import retrofit2.http.GET

interface ApiService {
    @GET("/user")
    suspend fun getData(): User
}