package com.ssafy.howdomodo.data.datasource.remote

import com.google.gson.JsonObject
import com.ssafy.howdomodo.data.datasource.model.LoginResponse
import com.ssafy.howdomodo.data.datasource.model.MovieApi
import com.ssafy.howdomodo.data.datasource.model.SignUpResponse
import com.ssafy.howdomodo.data.datasource.model.Users


interface RemoteDataSource {
    fun login(
        loginRequestBody: JsonObject,
        success: (LoginResponse) -> Unit,
        fail: (Throwable) -> Unit
    )

    fun signUp(
        signUpRequestBody: JsonObject,
        success: (SignUpResponse) -> Unit,
        fail: (Throwable) -> Unit
    )

    fun userInfo(
        userCode:String,
        success: (LoginResponse) -> Unit,
        fail: (Throwable) -> Unit
    )

}