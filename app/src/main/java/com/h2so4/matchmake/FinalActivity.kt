package com.h2so4.matchmake
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.core.view.isVisible
import com.google.ai.client.generativeai.GenerativeModel
import com.h2so4.matchmake.databinding.ActivityFinalBinding
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class FinalActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ai = GenerativeModel("gemini-pro", "AIzaSyDGXcrHbLcJFrxOdIZzvNp-tU2cgy4b7V0")
        val ui = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(ui.root)
        ui.purposeSpec.text = "*${intent.getStringExtra("purposeChoice")}*"
        ui.budgetSpec.text = "*${intent.getStringExtra("budgetChoice")}*"
        MainScope().launch{
            try {
                val test = ai.generateContent("I want to build a ${ui.budgetSpec.text} PC that is going to be mostly used for ${ui.purposeSpec.text}, give me the names of the pieces that I should get in the form of \"Case, Motherboard, PSU, Storage, Cooling system, CPU, GPU, RAM\" and mention the price for each piece and tell me the total price at the end... I want a list only so don't generate a multi-line response")
                ui.response.text = test.text ?: "-Error occurred, Check your Internet connection-"
            } catch(e: Exception) {
                ui.response.text = "-Error occurred, Check your Internet connection-"
                ui.response.textSize = 50F
            }
        }
        ui.home.setOnClickListener{
            val homeIntent = Intent(this, MainActivity::class.java)
            startActivity(homeIntent)
            finish()
        }
    }
}