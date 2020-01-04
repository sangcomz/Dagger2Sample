package xyz.sangcomz.dagger2sample.main

import javax.inject.Inject

class MainRepository @Inject constructor(private val mainDataSource: MainDataSource) {

    fun print() {
        println("Hello MainRepository")
        mainDataSource.print()
    }
}