package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etNama = findViewById<EditText>(R.id.etNamaLengkap)

        findViewById<Button>(R.id.btnRegister).setOnClickListener {
            val nama = etNama.text.toString()
            if(nama.isNotEmpty()) {
                Toast.makeText(this, "Registrasi Sukses!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("EXTRA_NAME", nama)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Lengkapi data registrasi!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}