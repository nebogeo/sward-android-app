package am.fo.swardapp

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : SwardActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setSupportActionBar(toolbar)
    }

}
