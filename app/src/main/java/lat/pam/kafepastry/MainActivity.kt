package lat.pam.kafepastry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var username: String = "Pengguna"
    private var selectedMenu: String = "" // Menyimpan menu yang dipilih

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtHalo = findViewById<TextView>(R.id.txtHalo)

        // 1. Menerima data nama yang dikirim dari Login/Register/Profile
        username = intent.getStringExtra("EXTRA_NAME") ?: "Pengguna"
        txtHalo.text = "Halo $username,"

        // Inisialisasi Tombol Pesan per Menu
        val btnPesanLatte = findViewById<Button>(R.id.btnPesanLatte)
        val btnPesanCroissant = findViewById<Button>(R.id.btnPesanCroissant)
        val btnPesanPain = findViewById<Button>(R.id.btnPesanPain)
        val btnPesanMacchiato = findViewById<Button>(R.id.btnPesanMacchiato)
        val btnPesanDanish = findViewById<Button>(R.id.btnPesanDanish)

        // 2. Logika Interaktif Tombol Pesan
        btnPesanLatte.setOnClickListener {
            selectedMenu = "Café Latte"
            ubahStatusTombol(btnPesanLatte, "Dipilih ✓")
            Toast.makeText(this, "Berhasil memilih Café Latte!", Toast.LENGTH_SHORT).show()
        }

        btnPesanCroissant.setOnClickListener {
            selectedMenu = "Butter Croissant"
            ubahStatusTombol(btnPesanCroissant, "Dipilih ✓")
            Toast.makeText(this, "Berhasil memilih Butter Croissant!", Toast.LENGTH_SHORT).show()
        }

        btnPesanPain.setOnClickListener {
            selectedMenu = "Pain au Chocolat"
            ubahStatusTombol(btnPesanPain, "Dipilih ✓")
            Toast.makeText(this, "Berhasil memilih Pain au Chocolat!", Toast.LENGTH_SHORT).show()
        }

        btnPesanMacchiato.setOnClickListener {
            selectedMenu = "Caramel Macchiato"
            ubahStatusTombol(btnPesanMacchiato, "Dipilih ✓")
            Toast.makeText(this, "Berhasil memilih Caramel Macchiato!", Toast.LENGTH_SHORT).show()
        }

        btnPesanDanish.setOnClickListener {
            selectedMenu = "Almond Danish"
            ubahStatusTombol(btnPesanDanish, "Dipilih ✓")
            Toast.makeText(this, "Berhasil memilih Almond Danish!", Toast.LENGTH_SHORT).show()
        }

        // 3. Navigasi Bawah: Pindah ke ProfileActivity
        val txtNavProfile = findViewById<TextView>(R.id.txtNavProfile)
        txtNavProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java).apply {
                putExtra("EXTRA_NAME", username)
            }
            startActivity(intent)
            finish()
        }

        // 4. Navigasi Bawah: Pindah ke OrderActivity (Divalidasi: Harus pilih menu dulu!)
        val txtNavOrder = findViewById<TextView>(R.id.txtNavOrder)
        txtNavOrder.setOnClickListener {
            if (selectedMenu.isEmpty()) {
                // Jika belum memilih menu sama sekali, munculkan pesan dan cegah berpindah halaman
                Toast.makeText(this, "Pilih menu terlebih dahulu sebelum melakukan order!", Toast.LENGTH_LONG).show()
            } else {
                // Jika sudah memilih, izinkan lanjut ke halaman Order sambil membawa data menu dan nama
                val intent = Intent(this, OrderActivity::class.java).apply {
                    putExtra("EXTRA_NAME", username)
                    putExtra("EXTRA_MENU", selectedMenu)
                }
                startActivity(intent)
                finish()
            }
        }
    }

    // Fungsi helper untuk mengubah tombol menjadi terkunci dan teks berubah
    private fun ubahStatusTombol(button: Button, textBaru: String) {
        button.text = textBaru
        button.isEnabled = false // Tombol dikunci agar tidak bisa diklik berulang kali
    }
}