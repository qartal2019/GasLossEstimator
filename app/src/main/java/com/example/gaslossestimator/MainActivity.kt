package com.example.gaslossestimator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNew = findViewById<Button>(R.id.btnNew)
        val btnEquip = findViewById<Button>(R.id.btnEquipment)
        val btnSign = findViewById<Button>(R.id.btnSignature)
        val btnAdmin = findViewById<Button>(R.id.btnAdmin)
        val btnLanguage = findViewById<Button>(R.id.btnLanguage)
        val txtSlogan = findViewById<TextView>(R.id.txtSlogan)
        val imgLogo = findViewById<ImageView>(R.id.imgLogoMain)

        txtSlogan.text = "در مصرف گاز صرفه‌جویی کنید"

        btnNew.setOnClickListener { /* open new scenario */ }
        btnEquip.setOnClickListener { /* manage equipment */ }
        btnSign.setOnClickListener { /* signature */ }
        btnAdmin.setOnClickListener { /* admin panel */ }
        btnLanguage.setOnClickListener { /* language selector */ }
    }
}
