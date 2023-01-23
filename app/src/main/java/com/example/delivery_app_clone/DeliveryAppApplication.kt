package com.example.delivery_app_clone

import android.app.Application
import android.content.Context
import com.example.delivery_app_clone.di.appModule
import org.koin.core.context.startKoin
import org.koin.dsl.module

class DeliveryAppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        appContext = this

        startKoin{
            modules(appModule)
        }
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