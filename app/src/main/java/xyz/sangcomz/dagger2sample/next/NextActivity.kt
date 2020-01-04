package xyz.sangcomz.dagger2sample.next

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import xyz.sangcomz.dagger2sample.Dagger2SampleApp
import xyz.sangcomz.dagger2sample.R
import xyz.sangcomz.dagger2sample.di.SubComponent
import javax.inject.Inject

class NextActivity : AppCompatActivity() {

    lateinit var subComponent: SubComponent

    @Inject
    lateinit var nextViewModel: NextViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        subComponent = (application as Dagger2SampleApp).appComponent.loginComponent().create()
        subComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        nextViewModel.print()
    }
}
