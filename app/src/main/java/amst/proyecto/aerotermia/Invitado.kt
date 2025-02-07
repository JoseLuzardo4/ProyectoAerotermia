package amst.proyecto.aerotermia

import android.content.Intent
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Invitado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_invitado)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val sensor1 = findViewById<MaterialButton>(R.id.sensor1)
        sensor1.setOnClickListener {
            val intent = Intent(this, Sensor1::class.java)
            startActivity(intent)
        }

        val sensor2 = findViewById<MaterialButton>(R.id.sensor2)
        sensor2.setOnClickListener {
            val intent = Intent(this, Sensor2::class.java)
            startActivity(intent)
        }

        val sensor3 = findViewById<MaterialButton>(R.id.sensor3)
        sensor3.setOnClickListener {
            val intent = Intent(this, Sensor3::class.java)
            startActivity(intent)
        }

        val sensor4 = findViewById<MaterialButton>(R.id.sensor4)
        sensor4.setOnClickListener {
            val intent = Intent(this, Sensor4::class.java)
            startActivity(intent)
        }

        val sensor5 = findViewById<MaterialButton>(R.id.sensor5)
        sensor5.setOnClickListener {
            val intent = Intent(this, Sensor5::class.java)
            startActivity(intent)
        }

        val sensor6 = findViewById<MaterialButton>(R.id.sensor6)
        sensor6.setOnClickListener {
            val intent = Intent(this, Sensor6::class.java)
            startActivity(intent)
        }

        val sensor7 = findViewById<MaterialButton>(R.id.sensor7)
        sensor7.setOnClickListener {
            val intent = Intent(this, Sensor7::class.java)
            startActivity(intent)
        }

        val sensor8 = findViewById<MaterialButton>(R.id.sensor8)
        sensor8.setOnClickListener {
            val intent = Intent(this, Sensor8::class.java)
            startActivity(intent)
        }

        val sensorFlujo = findViewById<MaterialButton>(R.id.sensorFlujo)
        sensorFlujo.setOnClickListener {
            val intent = Intent(this, SensorFlujo::class.java)
            startActivity(intent)
        }
    }
}