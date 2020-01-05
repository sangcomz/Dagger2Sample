package xyz.sangcomz.dagger2sample.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import xyz.sangcomz.dagger2sample.di.multibindings.AnimalBindingModule
import xyz.sangcomz.dagger2sample.di.multibindings.CarBindingModule
import xyz.sangcomz.dagger2sample.main.MainActivity
import xyz.sangcomz.dagger2sample.network.NetworkModule
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class, NeedBindModule::class, CarBindingModule::class, AnimalBindingModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
    @Component.Factory
    interface Factory {
        // With @BindsInstance, Context를 의존성 그래프에서 사용할 수 있게 됩니다.
        // 이미 instance가 외부에서 생성된 것중에 의존성 그래프에서 필요할 때 사용합니다.
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun loginComponent(): SubComponent.Factory
}