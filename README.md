# ☕ Kafe & Pastry Mobile App

Aplikasi Android "Kafe & Pastry" adalah aplikasi pemesanan makanan dan minuman berbasis *native* Android menggunakan Kotlin dengan skema warna kopi yang elegan (Coffee-themed Palette). Proyek ini dikembangkan untuk memenuhi tugas mata kuliah Pemrograman Aplikasi Mobile (PAM).

## 📸 Tampilan Aplikasi (Screenshots)
<p align="center">
  <table>
    <tr>
      <td align="center"><b>Splash Screen</b></td>
      <td align="center"><b>Sign Up</b></td>
      <td align="center"><b>Register</b></td>
      <td align="center"><b>Login</b></td>
    </tr>
    <tr>
      <td><img width="375" height="828" alt="Screenshot 2026-11-08 085306" src="https://github.com/user-attachments/assets/edab503b-a4db-4d5b-828a-c47a966546ee" />
</td>
      <td><img width="372" height="831" alt="Screenshot 2026-11-08 085448" src="https://github.com/user-attachments/assets/e2952910-0239-4d1c-b4c6-b8aee15a6eb1" />
</td>
      <td><img width="375" height="828" alt="Screenshot 2026-11-08 085609" src="https://github.com/user-attachments/assets/fa0c0a15-e291-4cc0-8698-cd20430906c5" />
 </td>
      <td><img width="370" height="827" alt="Screenshot 2026-11-08 085711" src="https://github.com/user-attachments/assets/13624016-5625-4688-a800-45388c5b1c87" />
/></td>
    </tr>
    <tr>
      <td align="center"><b>Home Menu</b></td>
      <td align="center"><b>Order</b></td>
      <td align="center"><b>Success</b></td>
      <td align="center"><b>Profile</b></td>
    </tr>
    <tr>
      <td><img width="370" height="822" alt="Screenshot 2026-11-08 085746" src="https://github.com/user-attachments/assets/b7995f2f-ba04-46c7-85a9-bab3329fba54" />
</td>
      <td><img width="373" height="841" alt="Screenshot 2026-11-08 085818" src="https://github.com/user-attachments/assets/daebb5ac-a5c8-46b2-a048-8620290b2e7f" />
</td>
      <td><img width="372" height="832" alt="Screenshot 2026-11-08 085841" src="https://github.com/user-attachments/assets/e8b5a422-e370-4328-9af0-360e35e68e9a" />
</td>
      <td><img width="375" height="835" alt="Screenshot 2026-11-08 085929" src="https://github.com/user-attachments/assets/63162696-a91a-4c53-a5a9-1d5698db911e" />
</td>
    </tr>
  </table>
</p>

## ✨ Fitur Utama
1. **Splash Screen & Start Page**: Halaman pembuka dengan logo elegan dan animasi transisi.
2. **Autentikasi Pengguna**: Halaman masuk dan pendaftaran akun dengan validasi input.
3. **Home Menu Interaktif**: 
   - Menampilkan daftar produk Coffee & Pastry (Café Latte, Butter Croissant, Pain au Chocolat, dll.) lengkap dengan harga dan deskripsinya.
   - Tombol **"Pesan"** interaktif di setiap item yang berubah status menjadi "Dipilih ✓" dan terkunci setelah diklik.
   - Validasi navigasi: Tombol *Order* dikunci/diberikan peringatan jika pengguna belum memilih menu.
4. **Halaman Order & Pengiriman**: Form pengisian alamat dan nomor telepon yang terintegrasi dengan data pesanan.
5. **Konfirmasi Pesanan (Success Screen)**: Halaman sukses pemesanan dengan sapaan nama pengguna secara dinamis dan pembersihan *activity stack* agar tombol *back* tidak kembali ke halaman transaksi.
6. **Profil Pengguna**: Manajemen profil, sinkronisasi nama dinamis, dan tombol *Logout*.

## 🛠️ Teknologi & Stack
* **Bahasa Pemrograman**: Kotlin
* **UI Framework**: Android XML (ConstraintLayout, ScrollView, CardView)
* **Design System**: Glassmorphism Style & Material Components
* **Navigasi & State**: Intent Eksplisit, Data Passing (`EXTRA_NAME`), & Flag Management (`CLEAR_TOP`, `NEW_TASK`)
* **IDE**: Android Studio

## 🎨 Palet Warna (Color Palette)
| Warna | Hex Code | Penggunaan |
| :--- | :--- | :--- |
| **Dark Brown** | `#3E2723` | Header Card, Tombol Utama, Navigasi |
| **Warm Coffee** | `#4E342E` | Warna Tombol Pesan |
| **Off White** | `#CCFFFFFF` | Latar belakang Card (Glassmorphism) |
| **Pure White** | `#FFFFFF` | Warna Teks Judul & Sapaan |

## 🚀 Cara Menjalankan Aplikasi
1. Clone Repository Ini:
   ```bash
   git clone [https://github.com/naufaldzaki28/KafePastry.git](https://github.com/naufaldzaki28/KafePastry.git)
Buka folder proyek menggunakan Android Studio.

Sinkronkan Gradle (Sync Project with Gradle Files).

Jalankan emulator (disarankan menggunakan API level terbaru) atau sambungkan perangkat fisik Android.

🪜 Alur Penggunaan Aplikasi (User Flow)
Splash Screen: Muncul saat aplikasi dibuka, lalu otomatis mengarah ke halaman utama/login.

Autentikasi: Masuk menggunakan akun terdaftar atau buat akun baru via Register.

Eksplorasi Katalog (Home): Disambut dengan sapaan dinamis ("Halo, [Username]"). Pilih menu dengan menekan tombol Pesan pada item yang diinginkan.

Kelola Order: Klik tab Order di navigasi bawah. (Aplikasi akan memvalidasi: jika belum memilih menu, tombol akan memberikan peringatan).

Checkout: Masukkan alamat lengkap dan nomor telepon, lalu klik konfirmasi pesanan.

Resi / Bukti Transaksi (Success): Menampilkan konfirmasi sukses, lalu kembali mulus ke beranda saat tombol selesai ditekan.

Profil: Cek informasi akun atau lakukan Logout melalui menu profil.

Dikembangkan oleh Naufal Dzaki (Informatika - UIN Sunan Gunung Djati Bandung | NIM: 1247050082).


---

### Cara Memasukkannya ke GitHub:
1. Buka repository GitHub Anda (`KafePastry`)[cite: 5].
2. Jika file `README.md` belum ada, klik **Add a README**[cite: 5]. Jika sudah ada, klik ikon pensil (*Edit*).
3. Salin seluruh teks di atas, lalu tempel (*paste*) ke editor GitHub.
4. Gulir ke bawah, klik tombol hijau **Commit changes...**.

Dengan deskripsi yang selengkap dan serapi ini dijamin dokumen GitHub Anda akan terlihat sangat profesional dan poin dokumentasi (20 poin) bisa didapatkan dengan maksimal!
