# ☕ Kafe & Pastry Mobile App

Aplikasi Android "Kafe & Pastry" adalah aplikasi pemesanan makanan dan minuman berbasis *native* Android menggunakan Kotlin dengan skema warna kopi yang elegan (Coffee-themed Palette). Proyek ini dikembangkan untuk memenuhi tugas mata kuliah Pemrograman Aplikasi Mobile (PAM).

## 📸 Tampilan Aplikasi (Screenshots)
- **Splash Screen**
<img width="375" height="828" alt="Screenshot 2026-11-08 085306" src="https://github.com/user-attachments/assets/341270fb-431a-4bf5-85c1-0008ab736f0b" />
- **Sign Up**
<img width="372" height="831" alt="image" src="https://github.com/user-attachments/assets/57f41545-765f-440e-a3fa-2485fd7e084f" />
- **Register**
<img width="375" height="828" alt="image" src="https://github.com/user-attachments/assets/fbd2585e-9be7-4459-a410-7714e1da3732" />
- **Log in**
<img width="370" height="827" alt="image" src="https://github.com/user-attachments/assets/41f4acc4-5f48-4e78-9496-bce2f366e052" />
- **Home Menu Interaktif**
<img width="370" height="822" alt="image" src="https://github.com/user-attachments/assets/79b634d4-12e9-4df4-bdec-d492cc40faaa" />
- **Order & Checkout**
- <img width="373" height="841" alt="image" src="https://github.com/user-attachments/assets/a46d5183-0a5e-4e3b-a3ee-137c053bc81e" />
- **Success Confirmation**
<img width="372" height="832" alt="image" src="https://github.com/user-attachments/assets/ac714581-61c0-44b8-9733-daf758db50b4" />
- **Profile User**
<img width="375" height="835" alt="image" src="https://github.com/user-attachments/assets/2f995c72-f88f-4606-a68f-81e712166458" />

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
