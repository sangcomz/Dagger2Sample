package xyz.sangcomz.dagger2sample.di

import dagger.Subcomponent
import xyz.sangcomz.dagger2sample.di.scope.ActivityScope
import xyz.sangcomz.dagger2sample.next.NextActivity

@ActivityScope
@Subcomponent
interface SubComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): SubComponent
    }

    fun inject(nextActivity: NextActivity)
}