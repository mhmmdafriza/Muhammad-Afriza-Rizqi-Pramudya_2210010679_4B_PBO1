package SHOWROOM;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int kecepatan, int jumlahPintu) {
        super(merk, kecepatan);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    // Polymorphism (override method)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

    

