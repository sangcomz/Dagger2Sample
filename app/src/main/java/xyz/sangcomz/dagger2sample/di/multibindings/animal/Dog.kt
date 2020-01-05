package xyz.sangcomz.dagger2sample.di.multibindings.animal

import javax.inject.Inject

class Dog @Inject constructor() : Animal {
    override fun cry() {
        println("Bowwow")
    }
}