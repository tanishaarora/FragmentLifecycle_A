package com.example.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.fragment, FirstFragment()).commit()
        Log.e("Main Activity","onCreate")
        /*findViewById<Button>(R.id.btn1).setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.fragment, FirstFragment()).commit()
        }
        findViewById<Button>(R.id.btn2).setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.fragment, SecondFragment()).commit()
        }*/

    }

    override fun onStart() {
        super.onStart()
        Log.e("Main Activity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Main Activity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Main Activity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Main Activity","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Main Activity","onDestroy")
    }

   /* fun  onClickFirst(view: View){
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.btn1, FirstFragment())
        fragmentTransaction.commit()
    }
    fun  onClickSecond(view: View){
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.btn2, SecondFragment())
        fragmentTransaction.commit()
    }*/
}