package xyz.sangcomz.dagger2sample.di.multibindings

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import xyz.sangcomz.dagger2sample.di.multibindings.animal.Animal
import xyz.sangcomz.dagger2sample.di.multibindings.animal.Cat
import xyz.sangcomz.dagger2sample.di.multibindings.animal.Dog

@Module
abstract class AnimalBindingModule {

    @Binds
    @IntoMap
    @StringKey("Dog")
    abstract fun provideDog(dog: Dog): Animal


    @Binds
    @IntoMap
    @StringKey("Cat")
    abstract fun provideCat(cat: Cat): Animal
}