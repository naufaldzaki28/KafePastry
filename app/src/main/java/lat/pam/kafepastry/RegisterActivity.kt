package lat.pam.kafepastry

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

        val etNama = findViewById<EditText>(R.id.etNama)
        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnRegisterSubmit = findViewById<Button>(R.id.btnRegisterSubmit)

        btnRegisterSubmit.setOnClickListener {
            val nama = etNama.text.toString().trim()
            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (nama.isEmpty() || username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Semua kolom harus diisi!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Registrasi Berhasil!", Toast.LENGTH_SHORT).show()

                // Berpindah ke Halaman Home (MainActivity) serta membawa data nama
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("EXTRA_NAME", nama)
                }
                startActivity(intent)
                finish()
            }
        }
    }
}