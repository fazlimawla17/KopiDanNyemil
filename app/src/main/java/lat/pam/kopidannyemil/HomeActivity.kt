package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val name = intent.getStringExtra("EXTRA_NAME") ?: "Pengguna"
        findViewById<TextView>(R.id.tvHaloNama).text = "Halo $name,"

        val openOrder = {
            val intentOrder = Intent(this, AlamatActivity::class.java)
            intentOrder.putExtra("EXTRA_NAME", name)
            startActivity(intentOrder)
        }

        findViewById<Button>(R.id.btnOrder1).setOnClickListener { openOrder() }
        findViewById<Button>(R.id.btnOrder2).setOnClickListener { openOrder() }
        findViewById<Button>(R.id.btnOrder3).setOnClickListener { openOrder() }
        findViewById<Button>(R.id.btnOrder4).setOnClickListener { openOrder() }
        findViewById<Button>(R.id.btnOrder5).setOnClickListener { openOrder() }

        findViewById<Button>(R.id.navProfile).setOnClickListener {
            val intentProfile = Intent(this, ProfileActivity::class.java)
            intentProfile.putExtra("EXTRA_NAME", name)
            startActivity(intentProfile)
        }
        findViewById<Button>(R.id.navOrder).setOnClickListener { openOrder() }
    }
}