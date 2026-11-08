package lat.pam.kafepastry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    private var currentName: String = "Pengguna"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val etProfileName = findViewById<EditText>(R.id.etProfileName)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val txtNavHome = findViewById<TextView>(R.id.txtNavHome)
        val txtNavOrder = findViewById<TextView>(R.id.txtNavOrder)

        // 1. Menerima data nama dari MainActivity saat halaman dibuka
        currentName = intent.getStringExtra("EXTRA_NAME") ?: "Pengguna"
        etProfileName.setText(currentName)

        // 2. Aksi Tombol Save
        btnSave.setOnClickListener {
            val newName = etProfileName.text.toString().trim()
            if (newName.isNotEmpty()) {
                currentName = newName // Perbarui variabel lokal
                Toast.makeText(this, "Profil berhasil disimpan!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Nama tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }

        // 3. Aksi Tombol Logout (Kembali ke Login & Bersihkan Stack)
        btnLogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

        // 4. Navigasi Bawah: Kembali ke Home (Membawa data nama terbaru)
        txtNavHome.setOnClickListener {
            val updatedName = etProfileName.text.toString().trim().ifEmpty { currentName }
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("EXTRA_NAME", updatedName)
            }
            startActivity(intent)
            finish()
        }

        // 5. Navigasi Bawah: Pindah ke Order
        txtNavOrder.setOnClickListener {
            val updatedName = etProfileName.text.toString().trim().ifEmpty { currentName }
            val intent = Intent(this, OrderActivity::class.java).apply {
                putExtra("EXTRA_NAME", updatedName)
            }
            startActivity(intent)
            finish()
        }
    }
}