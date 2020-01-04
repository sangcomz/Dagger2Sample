package xyz.sangcomz.dagger2sample.di

import dagger.Binds
import dagger.Module
import xyz.sangcomz.dagger2sample.di.bind.NeedBind
import xyz.sangcomz.dagger2sample.di.bind.NeedBindImpl

@Module
abstract class NeedBindModule {

    @Binds
    abstract fun provideNeedBind(needBindImpl: NeedBindImpl): NeedBind
}