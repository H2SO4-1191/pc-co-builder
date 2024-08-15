package com.h2so4.matchmake
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.h2so4.matchmake.databinding.ActivityBudgetBinding
class BudgetActivity: BaseActivity() {
    private var purposeChoice = ""
    private var budgetChoice = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = ActivityBudgetBinding.inflate(layoutInflater)
        setContentView(ui.root)
        purposeChoice = intent.getStringExtra("purposeChoice")!!
        ui.low.setOnClickListener{
            budgetChoice = ui.low.text.toString()
            ui.mid.isChecked = false
            ui.high.isChecked = false
        }
        ui.mid.setOnClickListener{
            budgetChoice = ui.mid.text.toString()
            ui.low.isChecked = false
            ui.high.isChecked = false
        }
        ui.high.setOnClickListener{
            budgetChoice = ui.high.text.toString()
            ui.low.isChecked = false
            ui.mid.isChecked = false
        }
        ui.finish.setOnClickListener{
            if(!ui.low.isChecked && !ui.mid.isChecked && !ui.high.isChecked) Toast.makeText(this, "Hint: Pick a budget choice first.", Toast.LENGTH_SHORT).show()
            else{
                ui.finish.animate().apply{
                    duration = 500
                    rotationBy(360f)
                }.withEndAction{
                    val finalIntent = Intent(this, FinalActivity::class.java)
                    finalIntent.putExtra("purposeChoice", purposeChoice)
                    finalIntent.putExtra("budgetChoice", budgetChoice)
                    startActivity(finalIntent)
                }.start()
            }
        }
    }
}