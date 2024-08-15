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
        ui.cancel.setOnClickListener {
            finish()
        }
    }
}

//Prompt: I want to build a HIGH-END PC that is going to be mostly used for GAMING, give me the names of the pieces that I should get in the form of "Case, Motherboard, PSU, Storage, Cooling system, CPU, GPU, RAM" and tell me the total price... I want a list only so don't generate a multi-line response//