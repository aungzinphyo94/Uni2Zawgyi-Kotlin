package com.azp.zawgyi2uni

import android.app.Application
import com.azp.zawgyi2uni.utils.TypefaceManager
import me.myatminsoe.mdetect.MDetect

public class MainApplication: Application() {
    companion object {
        lateinit var typefaceManager: TypefaceManager
    }

    override fun onCreate() {
        super.onCreate()
        MDetect.init(this)
        typefaceManager = TypefaceManager(assets, applicationContext)
    }
}