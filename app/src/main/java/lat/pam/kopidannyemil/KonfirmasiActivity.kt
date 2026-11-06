package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KonfirmasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi)

        val name = intent.getStringExtra("EXTRA_NAME") ?: "Pengguna"
        findViewById<TextView>(R.id.tvHaloNama).text = "Halo $name,"

        findViewById<Button>(R.id.btnOke).setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("EXTRA_NAME", name)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}