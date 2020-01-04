package xyz.sangcomz.dagger2sample.main

import javax.inject.Inject


class MainLocalDataSource @Inject constructor() {
    fun print() {
        println("Hello MainLocalDataSource")
    }
}


