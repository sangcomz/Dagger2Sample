package xyz.sangcomz.dagger2sample.network

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import xyz.sangcomz.dagger2sample.main.MainApiService

@Module
class NetworkModule {

    @Provides
    fun provideMainApiService(): MainApiService {
        return Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(MainApiService::class.java)
    }
}