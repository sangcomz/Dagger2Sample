package xyz.sangcomz.dagger2sample.next

import xyz.sangcomz.dagger2sample.di.scope.ActivityScope
import javax.inject.Inject


@ActivityScope
class NextViewModel @Inject constructor() {

    fun print() {
        println("$this Hello NextViewModel")
    }
}