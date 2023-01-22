package com.example.delivery_app_clone

import android.app.Application
import android.content.Context

class DeliveryAppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }

    override fun onTerminate() {
        super.onTerminate()
        appContext = null
    }

    companion object{
        var appContext : Context? = null
            private set
    }
}