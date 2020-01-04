package xyz.sangcomz.dagger2sample.main

import javax.inject.Inject

class MainViewModel @Inject constructor(private val mainRepository: MainRepository) {

    fun print() {
        println("Hello MainViewModel")
        mainRepository.print()
    }
}