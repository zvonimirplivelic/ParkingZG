package com.zvonimirplivelic.parkingzg

import android.app.Application
import androidx.core.os.BuildCompat
import timber.log.Timber

class ParkingZGApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}