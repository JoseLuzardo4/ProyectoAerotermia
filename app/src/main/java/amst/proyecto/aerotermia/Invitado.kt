package amst.proyecto.aerotermia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
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
        var sensor1= findViewById<ImageButton>(R.id.sensor1)
        sensor1.setOnClickListener{
            val intent = Intent(this, Sensor1::class.java)
            startActivity(intent)
        }
        var sensor2= findViewById<ImageButton>(R.id.sensor2)
        sensor2.setOnClickListener{
            val intent = Intent(this, Sensor2::class.java)
            startActivity(intent)
        }
        var sensor3= findViewById<ImageButton>(R.id.sensor3)
        sensor3.setOnClickListener{
            val intent = Intent(this, Sensor3::class.java)
            startActivity(intent)
        }
    }
}