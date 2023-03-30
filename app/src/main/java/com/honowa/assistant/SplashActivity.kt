package com.honowa.assistant

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        logo.alpha = 0.5f
        logo.animate().setDuration(1500).alpha(1f).withEndAction {
            // Start app & close splash screen with transition
            val mainActivityIntent = Intent(baseContext, MainActivity::class.java);
            startActivity(mainActivityIntent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}