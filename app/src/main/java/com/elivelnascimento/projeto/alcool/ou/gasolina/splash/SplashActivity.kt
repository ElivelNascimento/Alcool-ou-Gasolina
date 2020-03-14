package com.elivelnascimento.projeto.alcool.ou.gasolina.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import com.elivelnascimento.projeto.alcool.ou.gasolina.ui.MainActivity
import com.elivelnascimento.projeto.alcool.ou.gasolina.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //getSupportActionBar().hide();

        //getSupportActionBar().hide();
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        Handler().postDelayed({
            startActivity(Intent(baseContext, MainActivity::class.java))
            finish()
        }, 5000)
    }
}
