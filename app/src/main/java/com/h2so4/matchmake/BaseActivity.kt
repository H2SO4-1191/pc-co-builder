package com.h2so4.matchmake
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
open class BaseActivity: AppCompatActivity() {
    val tag = "LifeCycle"
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        Log.d(tag, "${javaClass.simpleName} onCreate")
    }
    override fun onStart(){
        super.onStart()
        Log.d(tag, "${javaClass.simpleName} onStart")
    }
    override fun onResume(){
        super.onResume()
        Log.d(tag, "${javaClass.simpleName} onResume")
    }
    override fun onRestart(){
        super.onRestart()
        Log.d(tag, "${javaClass.simpleName} onRestart")
    }
    override fun onPause(){
        super.onPause()
        Log.d(tag, "${javaClass.simpleName} onPause")
    }
    override fun onStop(){
        super.onStop()
        Log.d(tag, "${javaClass.simpleName} onStop")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d(tag, "${javaClass.simpleName} onDestroy")
    }
}