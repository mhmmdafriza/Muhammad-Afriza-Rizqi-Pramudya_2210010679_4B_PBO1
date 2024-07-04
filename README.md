# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data SHOWROOM menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa merk mobil, kecepatan mobil, jumlah pintu mobil, merk motor, kecepatan motor, dan Apakah ada Sidecar, dan memberikan output berupa informasi detail dari merk mobil, kecepatan mobil, jumlah pintu mobil, merk motor, kecepatan motor, dan Apakah ada Sidecar

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mobil`, `Motor`,`Kendaraan`, dan `Main` adalah contoh dari class.

```bash
public class Kendaraan {
    ...
}

public class Mobil extends Kendaraan {
    ...
}

public class Motor extends Kendaraan {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Mobil mobil = new Mobil(merkMobil, kecepatanMobil, jumlahPintu);
            garasi[0] = mobil;` adalah contoh pembuatan object.

```bash
Mobil mobil = new Mobil(merkMobil, kecepatanMobil, jumlahPintu);
 garasi[0] = mobil;

Motor motor = new Motor(merkMotor, kecepatanMotor, adaSidecar);
garasi[1] = motor;
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merk` dan `kecepatan` adalah contoh atribut.

```bash
String merk;
int kecepatan;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kendaraan`,`Mobil`dan `Motor`.

```bash
public Kendaraan(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
}

public Mobil(String merk, int kecepatan, int jumlahPintu) {
        super(merk, kecepatan);
        this.jumlahPintu = jumlahPintu;
}

public Motor(String merk, int kecepatan, boolean adaSidecar) {
        super(merk, kecepatan);
        this.adaSidecar = adaSidecar;
}

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `set` dan `setMerk` adalah contoh method mutator.

```bash
public void setMerk(String merk) {
    this.merk = merk;
}

public void setKecepatan(int kecepatan) {
    this.kecepatan = kecepatan;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`, `getKecepatan`, `getTahunMasuk`, adalah contoh method accessor.

```bash
public String getMerk() {
    return merk;
}

public int getKecepatan() {
    return kecepatan;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merk` dan `kecepatan` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merk;
private int kecepatan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Mobil` mewarisi `Kendaraan`dan`Motor` mewarisi `Kendaraan` dengan sintaks `extends`.

```bash
public class Mobil extends Kendaraan {
    ...
}
public class Motor extends Kendaraan {
```

9. **Polymorphism** adalah konsep di mana sebuah merk dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan merk yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Override. Pada kode ini, method `public void tampilkanInfo() {` merupakan override dari method `tampilkanInfo` di `Motor`,`Mobil`.

```bash
 @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);

 @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ada Sidecar: " + (adaSidecar ? "Ya" : "Tidak"));
    ...
}
```

10. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukkan merk mobil: ");
String merkMobil = scanner.nextLine();
System.out.print("Masukkan kecepatan mobil: ");
int kecepatanMobil = Integer.parseInt(scanner.nextLine());
System.out.print("Masukkan jumlah pintu mobil: ");
int jumlahPintu = Integer.parseInt(scanner.nextLine());

System.out.print("Masukkan merk motor: ");
String merkMotor = scanner.nextLine();
System.out.print("Masukkan kecepatan motor: ");
int kecepatanMotor = Integer.parseInt(scanner.nextLine());
System.out.print("Apakah ada sidecar (true/false): ");
boolean adaSidecar = Boolean.parseBoolean(scanner.nextLine());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Kendaraan[] garasi = new Kendaraan[2];` adalah contoh penggunaan array.

```bash
Kendaraan[] garasi = new Kendaraan[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
catch (NumberFormatException e) {
System.out.println("Input tidak valid. Harap masukkan angka yang sesuai.");
} finally {
scanner.close();
 }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Afriza Rizqi Pramudya
NPM: 2110010679
