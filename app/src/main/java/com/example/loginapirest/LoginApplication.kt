package com.example.loginapirest

import android.app.Application
import com.example.stores.common.database.ReqResApi


class LoginApplication: Application() {
    companion object{

        lateinit var storeAPI: ReqResApi
    }

    override fun onCreate() {
        super.onCreate()

        //Volley
        storeAPI = ReqResApi.getInstance(this)
    }
}