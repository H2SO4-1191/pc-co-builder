package com.h2so4.matchmake
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.h2so4.matchmake.databinding.ActivityMainBinding

class Purpose: BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purpose)
        val next: Button = findViewById(R.id.next)
        next.setOnClickListener{
            val budgetIntent = Intent(this, BudgetActivity::class.java)
            startActivity(budgetIntent)
        }
    }
}