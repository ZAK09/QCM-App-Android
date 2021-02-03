package com.myrecipes.myqcm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Game : AppCompatActivity() {

    lateinit var firstCheck: CheckBox
    lateinit var secondCheck: CheckBox
    lateinit var thirdCheck: CheckBox
    lateinit var firstCheck2: CheckBox
    lateinit var secondCheck2: CheckBox
    lateinit var thirdCheck2: CheckBox
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        firstCheck = findViewById(R.id.firstTrue)
        secondCheck = findViewById(R.id.secondTrue)
        thirdCheck = findViewById(R.id.thirdTrue)

        firstCheck2 = findViewById(R.id.firstFalse)
        secondCheck2 = findViewById(R.id.secondFalse)
        thirdCheck2 = findViewById(R.id.thirdFalse)
        button = findViewById(R.id.validate)

        button.setOnClickListener {
            var totalScore = 0
            if (firstCheck.isChecked) {
                firstCheck2.isEnabled = false
                firstCheck2.isChecked = false
                ++totalScore
            }
            if (secondCheck.isChecked) {
                secondCheck2.isEnabled = false
                secondCheck2.isChecked = false
                ++totalScore
            }
            if (thirdCheck.isChecked) {
                thirdCheck2.isEnabled = false
                thirdCheck2.isChecked = false
                ++totalScore
            }
            Toast.makeText(applicationContext, "Votre score est de $totalScore / 3", Toast.LENGTH_LONG).show()
        }

    }
}
