# Aplikasi Akademik Java Sederhana

Project ini merupakan aplikasi Java sederhana untuk mengelola data **Mahasiswa** dan **Dosen**.  
Aplikasi dibuat untuk memenuhi tugas kuliah Pemrograman Berorientasi Objek.

---

## Fitur Aplikasi
- Menyimpan data Mahasiswa
- Menyimpan data Dosen
- Menampilkan data Mahasiswa dan Dosen ke console
- Menggunakan konsep class dan package terpisah

---

## Struktur Project
```
com.kampus.akademik
├── model
│   ├── Mahasiswa.java
│   └── Dosen.java
├── service
│   └── AkademikService.java
└── main
    └── MainApp.java
```

---

## Penjelasan Package
- **model**  
  Berisi class yang merepresentasikan data Mahasiswa dan Dosen.

- **service**  
  Berisi class untuk memproses dan menampilkan data.

- **main**  
  Berisi class utama (`MainApp`) yang dijalankan pertama kali.

---

## Teknologi yang Digunakan
- Java JDK 17
- Command Prompt / Terminal
- IDE (opsional): IntelliJ IDEA, Eclipse, atau VS Code

---

## Cara Compile dan Run (Command Line)

Pastikan sudah berada di folder project yang terdapat folder `src`.

### Compile
```
javac -d bin src\com\kampus\akademik\model\*.java src\com\kampus\akademik\service\*.java src\com\kampus\akademik\main\*.java
```

### Run
```
java -cp bin com.kampus.akademik.main.MainApp
```

---

## Contoh Output
```
Data Mahasiswa
----------------
NIM : 210401010192
Nama : Ahmad Asy'ari
Jurusan : Informatika

Data Dosen
----------------
NIDN : D001
Nama Dosen : Alun Sujjada, S.Kom., M.T
Mata Kuliah : Pemrograman Berorientasi Objek
```

---

## Tujuan Pembelajaran
- Memahami konsep Class dan Object
- Menggunakan constructor
- Mengelola package pada Java
- Membuat struktur program yang lebih rapi

---

## Author
Nama : Ahmad Asy'ari  
Program Studi : Informatika  

---

## Catatan
Project ini dibuat untuk keperluan pembelajaran dan tugas kuliah.  
Masih menggunakan konsep dasar Java tanpa framework tambahan.
