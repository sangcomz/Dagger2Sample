package xyz.sangcomz.dagger2sample.main

import javax.inject.Inject

class MainRemoteDataSource @Inject constructor(private val mainApiService: MainApiService) {

    fun print() {
        println("Hello MainRemoteDataSource")
    }
}