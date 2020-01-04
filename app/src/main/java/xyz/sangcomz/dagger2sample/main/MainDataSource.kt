package xyz.sangcomz.dagger2sample.main

import javax.inject.Inject

class MainDataSource @Inject constructor(
    private val mainLocalDataSource: MainLocalDataSource,
    private val mainRemoteDataSource: MainRemoteDataSource
) {
    fun print() {
        println("Hello MainDataSource")
        mainLocalDataSource.print()
        mainRemoteDataSource.print()
    }
}

