package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AlamatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alamat)

        findViewById<Button>(R.id.btnOrderKirim).setOnClickListener {
            startActivity(Intent(this, KonfirmasiActivity::class.java))
            finish()
        }
    }
}