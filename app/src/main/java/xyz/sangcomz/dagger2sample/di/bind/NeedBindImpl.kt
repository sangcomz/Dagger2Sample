package xyz.sangcomz.dagger2sample.di.bind

import javax.inject.Inject

class NeedBindImpl @Inject constructor() : NeedBind {
    override fun print() {
        println("Hello NeedBindImpl")
    }
}