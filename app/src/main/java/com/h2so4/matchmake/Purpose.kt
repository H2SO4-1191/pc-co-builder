package com.h2so4.matchmake
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.h2so4.matchmake.databinding.ActivityPurposeBinding
class Purpose: BaseActivity() {
    private var purposeChoice = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = ActivityPurposeBinding.inflate(layoutInflater)
        setContentView(ui.root)
        ui.game.setOnClickListener{
            purposeChoice = ui.game.text.toString()
            ui.office.isChecked = false
            ui.design.isChecked = false
            ui.mix.isChecked = false
        }
        ui.office.setOnClickListener{
            purposeChoice = ui.office.text.toString()
            ui.game.isChecked = false
            ui.design.isChecked = false
            ui.mix.isChecked = false
        }
        ui.design.setOnClickListener{
            purposeChoice = ui.design.text.toString()
            ui.game.isChecked = false
            ui.office.isChecked = false
            ui.mix.isChecked = false
        }
        ui.mix.setOnClickListener{
            purposeChoice = ui.mix.text.toString()
            ui.game.isChecked = false
            ui.office.isChecked = false
            ui.design.isChecked = false
        }
        ui.next.setOnClickListener{
            if(!ui.game.isChecked && !ui.office.isChecked && !ui.design.isChecked && !ui.mix.isChecked) Toast.makeText(this, "Hint: Pick a purpose choice first.", Toast.LENGTH_SHORT).show()
            else{
                ui.next.animate().apply{
                    duration = 500
                    rotationYBy(360f)
                }.withEndAction{
                    val budgetIntent = Intent(this, BudgetActivity::class.java)
                    budgetIntent.putExtra("purposeChoice", purposeChoice)
                    startActivity(budgetIntent)
                }.start()
            }
        }
    }
}