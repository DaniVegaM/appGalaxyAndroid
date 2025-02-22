package com.example.galaxy

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openPlanet(view: View) {
        val planetName = view.tag.toString()
        val intent = Intent(this, PlanetInfoActivity::class.java)
        intent.putExtra("planet_name", planetName)
        startActivity(intent)
    }
}