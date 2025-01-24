package amst.proyecto.aerotermia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowInsetsCompat
import com.github.anastr.speedviewlib.SpeedView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class SensorFlujo : AppCompatActivity() {

    private lateinit var databaseRef: DatabaseReference
    private lateinit var speedometer: SpeedView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flujo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize the speedometer
        speedometer = findViewById(R.id.termoparFlujo)

        // Initialize Firebase Database reference
        databaseRef = FirebaseDatabase.getInstance().getReference("/flujo")

        // Set up a listener for Firebase data changes
        databaseRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                // Get the temperature value from the snapshot
                val flujo = snapshot.getValue(Float::class.java)

                // Update the Gauge Chart (SpeedView) with the temperature value
                if (flujo != null) {
                    speedometer.speedTo(flujo)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle any errors
                println("Error al leer los datos: ${error.message}")
            }
        })
    }
}