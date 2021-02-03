package com.myrecipes.myqcm

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startGame(view: View) {
        val editText = findViewById<EditText>(R.id.editName)
        val text = editText.text
        val toast = Toast.makeText(applicationContext, "Veuillez entrer un nom", Toast.LENGTH_SHORT)

        if (text.isEmpty()) {
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, -750)
            toast.show()
        }
        else {
            toast.cancel()
            val intent = Intent(this, Game::class.java)
            startActivity(intent)
        }
    }

}

