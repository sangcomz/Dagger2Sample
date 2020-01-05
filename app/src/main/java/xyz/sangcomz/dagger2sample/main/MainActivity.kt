package xyz.sangcomz.dagger2sample.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import xyz.sangcomz.dagger2sample.Dagger2SampleApp
import xyz.sangcomz.dagger2sample.R
import xyz.sangcomz.dagger2sample.di.bind.NeedBind
import xyz.sangcomz.dagger2sample.di.multibindings.animal.Animal
import xyz.sangcomz.dagger2sample.di.multibindings.car.Car
import xyz.sangcomz.dagger2sample.next.NextActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var needBind: NeedBind

    @Inject
    lateinit var carSet: Set<@JvmSuppressWildcards Car>

    @Inject
    lateinit var animalMap: Map<String, @JvmSuppressWildcards Animal>

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as Dagger2SampleApp).appComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.print()
        needBind.print()


        carSet.forEach {
            it.boooong()
        }

        animalMap.forEach {
            print("I am ${it.key} ")
            it.value.cry()
        }

        button.setOnClickListener {
            startActivity(Intent(this@MainActivity, NextActivity::class.java))
        }

    }

}
