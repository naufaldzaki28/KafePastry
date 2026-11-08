package lat.pam.kafepastry

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

        val etUsername = findViewById<EditText>(R.id.etUsernameLogin)
        val etPassword = findViewById<EditText>(R.id.etPasswordLogin)
        val btnLoginSubmit = findViewById<Button>(R.id.btnLoginSubmit)

        btnLoginSubmit.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Username dan password harus diisi!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show()

                // Berpindah ke Halaman Home (MainActivity) serta membawa data username
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("EXTRA_NAME", username)
                }
                startActivity(intent)
                finish()
            }
        }
    }
}