package lat.pam.kafepastry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        val txtHaloNama = findViewById<TextView>(R.id.txtHaloNama)
        val btnOke = findViewById<Button>(R.id.btnOke)

        // Menerima data nama (opsional, jika dikirim dari aktivitas sebelumnya)
        val username = intent.getStringExtra("EXTRA_NAME") ?: "Pengguna"
        txtHaloNama.text = "Halo $username,"

        // Ketika tombol Oke dipencet, kembali mulus ke MainActivity (Home)
        btnOke.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // Membersihkan riwayat stack agar tidak bisa kembali ke halaman sukses dengan tombol back HP
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}