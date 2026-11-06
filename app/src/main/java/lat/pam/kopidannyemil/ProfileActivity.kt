package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val name = intent.getStringExtra("EXTRA_NAME") ?: "Pengguna"
        findViewById<TextView>(R.id.tvProfileTitle).text = "Halo $name,"
        findViewById<EditText>(R.id.etProfileName).setText(name)

        findViewById<Button>(R.id.btnSave).setOnClickListener {
            Toast.makeText(this, "Profil disimpan", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.navHome).setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("EXTRA_NAME", name)
            startActivity(intent)
        }
        findViewById<Button>(R.id.navOrder).setOnClickListener {
            startActivity(Intent(this, AlamatActivity::class.java))
        }
    }
}