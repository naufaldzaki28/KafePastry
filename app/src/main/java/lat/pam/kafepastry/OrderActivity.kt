package lat.pam.kafepastry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {
    private var username: String = "Pengguna"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val etAlamat = findViewById<EditText>(R.id.etAlamat)
        val etTelepon = findViewById<EditText>(R.id.etTelepon)
        val btnPesanSekarang = findViewById<Button>(R.id.btnPesanSekarang)
        val txtNavHome = findViewById<TextView>(R.id.txtNavHome)
        val txtNavProfile = findViewById<TextView>(R.id.txtNavProfile)

        // 1. Menerima data nama yang dikirim dari MainActivity
        username = intent.getStringExtra("EXTRA_NAME") ?: "Pengguna"

        // 2. Aksi Submit Pesanan -> Berpindah ke SuccessActivity
        btnPesanSekarang.setOnClickListener {
            val alamat = etAlamat.text.toString().trim()
            val telepon = etTelepon.text.toString().trim()

            if (alamat.isEmpty() || telepon.isEmpty()) {
                Toast.makeText(this, "Alamat dan nomor telepon wajib diisi!", Toast.LENGTH_SHORT).show()
            } else {
                // Pindah ke SuccessActivity serta membawa data username
                val intent = Intent(this, SuccessActivity::class.java).apply {
                    putExtra("EXTRA_NAME", username)
                }
                startActivity(intent)
                finish()
            }
        }

        // 3. Navigasi Bawah: Ke Home (Membawa data username)
        txtNavHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("EXTRA_NAME", username)
            }
            startActivity(intent)
            finish()
        }

        // 4. Navigasi Bawah: Ke Profile (Membawa data username)
        txtNavProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java).apply {
                putExtra("EXTRA_NAME", username)
            }
            startActivity(intent)
            finish()
        }
    }
}