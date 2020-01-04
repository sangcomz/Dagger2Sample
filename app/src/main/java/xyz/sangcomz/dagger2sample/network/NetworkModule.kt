package xyz.sangcomz.dagger2sample.network

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import xyz.sangcomz.dagger2sample.main.MainApiService

@Module
class NetworkModule {

    // @Provides tell Dagger how to create instances of the type that this function
    // returns (i.e. LoginRetrofitService).
    // Function parameters are the dependencies of this type.
    @Provides
    fun provideMainApiService(): MainApiService {
        // Whenever Dagger needs to provide an instance of type LoginRetrofitService,
        // this code (the one inside the @Provides method) is run.
        return Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(MainApiService::class.java)
    }
}