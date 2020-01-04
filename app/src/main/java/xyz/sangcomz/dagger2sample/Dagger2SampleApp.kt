package xyz.sangcomz.dagger2sample

import android.app.Application
import xyz.sangcomz.dagger2sample.di.DaggerAppComponent


class Dagger2SampleApp : Application() {

    val appComponent = DaggerAppComponent.create()


    override fun onCreate() {

        super.onCreate()

    }
}