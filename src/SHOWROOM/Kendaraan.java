package SHOWROOM;

public class Kendaraan {
    // Atribut
    private String merk;
    private int kecepatan;

    // Konstruktor
    public Kendaraan(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    // Accessor (getter)
    public String getMerk() {
        return merk;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    // Mutator (setter)
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

    

