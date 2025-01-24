package amst.proyecto.aerotermia

import android.content.Intent
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Usuario : AppCompatActivity() {
    private lateinit var databaseRef: DatabaseReference
    private lateinit var switchFlujoAlto: Switch
    private lateinit var switchFlujoBajo: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_usuario)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize Firebase Database reference
        databaseRef = FirebaseDatabase.getInstance().getReference("")

        val sensor1 = findViewById<MaterialButton>(R.id.sensor1_usuario)
        sensor1.setOnClickListener {
            val intent = Intent(this, Sensor1::class.java)
            startActivity(intent)
        }

        val sensor2 = findViewById<MaterialButton>(R.id.sensor2_usuario)
        sensor2.setOnClickListener {
            val intent = Intent(this, Sensor2::class.java)
            startActivity(intent)
        }

        val sensor3 = findViewById<MaterialButton>(R.id.sensor3_usuario)
        sensor3.setOnClickListener {
            val intent = Intent(this, Sensor3::class.java)
            startActivity(intent)
        }

        val sensor4 = findViewById<MaterialButton>(R.id.sensor4_usuario)
        sensor4.setOnClickListener {
            val intent = Intent(this, Sensor4::class.java)
            startActivity(intent)
        }

        val sensor5 = findViewById<MaterialButton>(R.id.sensor5_usuario)
        sensor5.setOnClickListener {
            val intent = Intent(this, Sensor5::class.java)
            startActivity(intent)
        }

        val sensor6 = findViewById<MaterialButton>(R.id.sensor6_usuario)
        sensor6.setOnClickListener {
            val intent = Intent(this, Sensor6::class.java)
            startActivity(intent)
        }

        val sensor7 = findViewById<MaterialButton>(R.id.sensor7_usuario)
        sensor7.setOnClickListener {
            val intent = Intent(this, Sensor7::class.java)
            startActivity(intent)
        }

        val sensor8 = findViewById<MaterialButton>(R.id.sensor8_usuario)
        sensor8.setOnClickListener {
            val intent = Intent(this, Sensor8::class.java)
            startActivity(intent)
        }

        val sensorFlujo = findViewById<MaterialButton>(R.id.sensorFlujo_usuario)
        sensorFlujo.setOnClickListener {
            val intent = Intent(this, SensorFlujo::class.java)
            startActivity(intent)
        }

        switchFlujoAlto = findViewById(R.id.switch_FlujoAlto)
        switchFlujoBajo = findViewById(R.id.switch_FlujoBajo)

        switchFlujoAlto.setOnCheckedChangeListener { _, isChecked ->
            databaseRef.child("flujoAlto").setValue(isChecked)
        }

        switchFlujoBajo.setOnCheckedChangeListener { _, isChecked ->
            databaseRef.child("flujoBajo").setValue(isChecked)
        }
    }
}