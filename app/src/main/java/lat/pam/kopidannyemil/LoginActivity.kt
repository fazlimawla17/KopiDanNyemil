package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val user = etUsername.text.toString()
            if(user.isNotEmpty()) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("EXTRA_NAME", user)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Masukkan username!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}