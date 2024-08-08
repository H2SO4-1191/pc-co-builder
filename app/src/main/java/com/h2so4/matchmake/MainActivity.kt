package com.h2so4.matchmake
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.h2so4.matchmake.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)
        ui.build.setOnClickListener{
            val purposeIntent = Intent(this, Purpose::class.java)
            startActivity(purposeIntent)
        }
    }
}