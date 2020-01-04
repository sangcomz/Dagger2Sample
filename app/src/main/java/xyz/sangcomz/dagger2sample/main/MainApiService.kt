package xyz.sangcomz.dagger2sample.main

import retrofit2.http.GET

interface MainApiService {

    @GET
    fun getSomething()
}