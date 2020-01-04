package xyz.sangcomz.dagger2sample.di

import dagger.Component
import xyz.sangcomz.dagger2sample.main.MainActivity
import xyz.sangcomz.dagger2sample.network.NetworkModule
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)

    fun loginComponent(): SubComponent.Factory
}