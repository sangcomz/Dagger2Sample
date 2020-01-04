package xyz.sangcomz.dagger2sample.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import xyz.sangcomz.dagger2sample.Dagger2SampleApp
import xyz.sangcomz.dagger2sample.R
import xyz.sangcomz.dagger2sample.di.bind.NeedBind
import xyz.sangcomz.dagger2sample.next.NextActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var needBind: NeedBind

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as Dagger2SampleApp).appComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.print()
        needBind.print()

        button.setOnClickListener {
            startActivity(Intent(this@MainActivity, NextActivity::class.java))
        }

    }

}
