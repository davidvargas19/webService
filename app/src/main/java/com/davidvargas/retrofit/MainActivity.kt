package com.davidvargas.retrofit

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.davidvargas.retrofit.tiempo.TiempoActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityBtApiTiempo.setOnClickListener{
            val intent = Intent(this, TiempoActivity:: class.java)
            startActivity(intent)
        }

    }
}