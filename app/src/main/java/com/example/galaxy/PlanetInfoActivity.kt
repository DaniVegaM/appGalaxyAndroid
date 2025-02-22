package com.example.galaxy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PlanetInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_info)

        val planetName = intent.getStringExtra("planet_name")
        val infoTextView = findViewById<TextView>(R.id.infoTextView)
        val imageView = findViewById<ImageView>(R.id.planetBackground)
        val factsButton = findViewById<Button>(R.id.factsButton)

        infoTextView.text = getPlanetInfo(planetName)
        imageView.setImageResource(getPlanetImage(planetName))

        // Al pulsar el botón se lanza PlanetFactsActivity
        factsButton.setOnClickListener {
            val intent = Intent(this, PlanetFactsActivity::class.java)
            intent.putExtra("planet_name", planetName)
            startActivity(intent)
        }
    }

    private fun getPlanetInfo(planetName: String?): String {
        return when (planetName) {
            "mercury" -> "Mercurio\nDiámetro: 4,880 km\nDistancia del Sol: 57.91 millones de km\nPeríodo orbital: 88 días\nGravedad: 3.7 m/s²\nTemperatura media: 167°C"
            "venus" -> "Venus\nDiámetro: 12,104 km\nDistancia del Sol: 108.2 millones de km\nPeríodo orbital: 225 días\nGravedad: 8.87 m/s²\nTemperatura media: 464°C"
            "earth" -> "Tierra\nDiámetro: 12,742 km\nDistancia del Sol: 149.6 millones de km\nPeríodo orbital: 365.25 días\nGravedad: 9.81 m/s²\nTemperatura media: 15°C"
            "mars" -> "Marte\nDiámetro: 6,779 km\nDistancia del Sol: 227.9 millones de km\nPeríodo orbital: 687 días\nGravedad: 3.71 m/s²\nTemperatura media: -63°C"
            "jupiter" -> "Júpiter\nDiámetro: 139,820 km\nDistancia del Sol: 778.5 millones de km\nPeríodo orbital: 11.86 años\nGravedad: 24.79 m/s²\nTemperatura media: -108°C"
            "saturn" -> "Saturno\nDiámetro: 116,460 km\nDistancia del Sol: 1,429 millones de km\nPeríodo orbital: 29.5 años\nGravedad: 10.44 m/s²\nTemperatura media: -139°C"
            "uranus" -> "Urano\nDiámetro: 50,724 km\nDistancia del Sol: 2,871 millones de km\nPeríodo orbital: 84 años\nGravedad: 8.69 m/s²\nTemperatura media: -197°C"
            "neptune" -> "Neptuno\nDiámetro: 49,244 km\nDistancia del Sol: 4,495 millones de km\nPeríodo orbital: 165 años\nGravedad: 11.15 m/s²\nTemperatura media: -201°C"
            else -> "Información no disponible."
        }
    }

    private fun getPlanetImage(planetName: String?): Int {
        return when (planetName) {
            "mercury" -> R.drawable.mercury
            "venus" -> R.drawable.venus
            "earth" -> R.drawable.earth
            "mars" -> R.drawable.mars
            "jupiter" -> R.drawable.jupiter
            "saturn" -> R.drawable.saturn
            "uranus" -> R.drawable.uranus
            "neptune" -> R.drawable.neptune
            else -> R.drawable.default_image
        }
    }
}
