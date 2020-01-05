package xyz.sangcomz.dagger2sample.di.multibindings.car

import javax.inject.Inject

class MiniCar @Inject constructor() : Car {
    override fun boooong() {
        println("miniCar!!")
    }

}