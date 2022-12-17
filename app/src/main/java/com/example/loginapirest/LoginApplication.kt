package com.example.loginapirest

import android.app.Application


class LoginApplication: Application() {
    companion object{

        lateinit var reqResAPI: ReqResApi
    }

    override fun onCreate() {
        super.onCreate()

        //Volley
        reqResAPI = ReqResApi.getInstance(this)
    }
}