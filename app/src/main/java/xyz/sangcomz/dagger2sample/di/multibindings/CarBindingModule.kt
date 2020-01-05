package xyz.sangcomz.dagger2sample.di.multibindings

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet
import xyz.sangcomz.dagger2sample.di.multibindings.car.Car
import xyz.sangcomz.dagger2sample.di.multibindings.car.MiniCar
import xyz.sangcomz.dagger2sample.di.multibindings.car.SuperCar

@Module
abstract class CarBindingModule {

    @Binds
    @IntoSet
    abstract fun provideSuperCar(car: SuperCar): Car


    @Binds
    @IntoSet
    abstract fun provideMiniCar(car: MiniCar): Car
}