package org.fs.xirangreader

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.ViewCompat
import androidx.activity.viewModels;
import coil.load

class SplashActivity : AppCompatActivity() {


//    private val viewmodel by viewModels<>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        findViewById<Button>(R.id.btnFullscreen).setOnClickListener {
            this.setStatusBar(true)
        }

        findViewById<ImageView>(R.id.imageView).load("https://www.baidu.com/img/flexible/logo/pc/result.png")

    }


    private fun setStatusBar(hideStatusBarBackground: Boolean) {
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

        if (hideStatusBarBackground) {
            window.clearFlags((WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS));
            window.statusBarColor = Color.TRANSPARENT
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE and View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
    }
}