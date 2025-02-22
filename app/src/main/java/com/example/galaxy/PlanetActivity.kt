package com.example.galaxy

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PlanetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet)

        val planetName = intent.getStringExtra("PLANET_NAME") ?: "default"

        val imageView: ImageView = findViewById(R.id.planetImage)
        val textView: TextView = findViewById(R.id.planetInfo)

        val imageResId = resources.getIdentifier(planetName.lowercase(), "drawable", packageName)
        val infoResId = resources.getIdentifier("${planetName.lowercase()}_info", "string", packageName)

        if (imageResId != 0) {
            imageView.setImageResource(imageResId)
        }

        if (infoResId != 0) {
            textView.text = getString(infoResId)
        } else {
            textView.text = "Información no disponible."
        }
    }
}