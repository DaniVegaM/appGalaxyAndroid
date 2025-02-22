package com.example.galaxy

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PlanetFactsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_facts)

        val planetName = intent.getStringExtra("planet_name")
        val factsTextView = findViewById<TextView>(R.id.factsTextView)
        factsTextView.text = getPlanetInterestingFacts(planetName)
    }

    private fun getPlanetInterestingFacts(planetName: String?): String {
        return when (planetName) {
            "mercury" -> """
                1. Es el planeta más cercano al Sol.
                2. Tiene temperaturas extremas entre día y noche.
                3. Su superficie está llena de cráteres.
                4. Posee un campo magnético débil.
                5. No tiene atmósfera significativa.
            """.trimIndent()
            "venus" -> """
                1. Tiene una densa atmósfera de dióxido de carbono.
                2. Su efecto invernadero es extremo.
                3. Gira en sentido contrario a la mayoría.
                4. Es el planeta más brillante visto desde la Tierra.
                5. Su superficie está oculta por nubes espesas.
            """.trimIndent()
            "earth" -> """
                1. Es el único planeta conocido con vida.
                2. Posee una atmósfera rica en oxígeno.
                3. Tiene abundante agua en estado líquido.
                4. Su clima varía ampliamente.
                5. Presenta una diversidad biológica única.
            """.trimIndent()
            "mars" -> """
                1. Es conocido como el planeta rojo.
                2. Tiene la montaña más alta del sistema solar, Olympus Mons.
                3. Existen evidencias de agua en el pasado.
                4. Tiene estaciones similares a las de la Tierra.
                5. Es un candidato para futuras colonizaciones.
            """.trimIndent()
            "jupiter" -> """
                1. Es el planeta más grande del sistema solar.
                2. Tiene una gran mancha roja, una tormenta gigante.
                3. Posee numerosos satélites, entre ellos Ganímedes.
                4. Su fuerte campo magnético genera intensas radiaciones.
                5. Es un gigante gaseoso sin superficie sólida.
            """.trimIndent()
            "saturn" -> """
                1. Es famoso por sus impresionantes anillos.
                2. Es un gigante gaseoso con baja densidad.
                3. Tiene más de 80 lunas confirmadas.
                4. Sus anillos están compuestos de hielo y roca.
                5. Su atmósfera presenta patrones de nubes cambiantes.
            """.trimIndent()
            "uranus" -> """
                1. Gira de lado, con un eje casi horizontal.
                2. Es un gigante helado con metano en la atmósfera.
                3. Tiene un color azul verdoso distintivo.
                4. Posee un sistema de anillos tenues.
                5. Sus temperaturas son extremadamente bajas.
            """.trimIndent()
            "neptune" -> """
                1. Es conocido por sus intensos vientos y tormentas.
                2. Tiene un color azul vibrante debido al metano.
                3. Es el planeta más lejano del sistema solar.
                4. Posee una luna notable, Tritón.
                5. Se cree que alberga un núcleo rocoso.
            """.trimIndent()
            else -> "Datos interesantes no disponibles."
        }
    }
}
