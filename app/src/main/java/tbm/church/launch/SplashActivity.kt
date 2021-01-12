package tbm.church.launch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import tbm.church.AppConstants.Companion.SPLASH_TIME_OUT
import tbm.church.base.BaseActivity
import tbm.church.home.HomeActivity
import tbm.church.homeactivity.R

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)

        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))

            finish()
        }, SPLASH_TIME_OUT)
    }

    override fun initializeDi() {
    }

    override fun setUpLayout() {
    }

    override fun setUpViews() {
    }
}