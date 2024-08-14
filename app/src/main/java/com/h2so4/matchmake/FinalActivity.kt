package com.h2so4.matchmake
import android.os.Bundle
import android.widget.Toast
import com.h2so4.matchmake.databinding.ActivityFinalBinding
class FinalActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(ui.root)
        ui.purposeSpec.text = intent.getStringExtra("purposeChoice")
        ui.budgetSpec.text = intent.getStringExtra("budgetChoice")
        ui.cancel.setOnClickListener{
            finish()
        }
    }
}