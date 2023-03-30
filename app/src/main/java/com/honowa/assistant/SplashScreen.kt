package com.honowa.assistant

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val mainActivityIntent = Intent(baseContext, MainActivity::class.java);
        startActivityForResult(mainActivityIntent, 0)
       // finish();

        /*logo.alpha = 0.5f
        // Wait 1500 ms
        logo.animate().setDuration(1500).alpha(1f).withEndAction {
            // Start app & close splash screen with transition
            val mainActivityIntent = Intent(baseContext, MainActivity::class.java);
            startActivity(mainActivityIntent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }*/
    }
}