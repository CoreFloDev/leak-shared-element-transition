package com.example.florent.animationtest

import android.app.Application
import com.squareup.leakcanary.LeakCanary

class DemoApplication: Application() {


    override fun onCreate() {
        super.onCreate()
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)
    }

}
