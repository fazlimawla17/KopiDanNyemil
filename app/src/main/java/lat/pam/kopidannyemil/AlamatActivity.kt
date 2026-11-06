package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AlamatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alamat)

        val name = intent.getStringExtra("EXTRA_NAME") ?: "Pengguna"

        findViewById<Button>(R.id.btnOrderKirim).setOnClickListener {
            val intent = Intent(this, KonfirmasiActivity::class.java)
            intent.putExtra("EXTRA_NAME", name)
            startActivity(intent)
            finish()
        }
    }
}