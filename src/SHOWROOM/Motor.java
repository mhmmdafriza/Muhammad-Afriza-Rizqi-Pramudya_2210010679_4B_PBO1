package SHOWROOM;

public class Motor extends Kendaraan {
    private boolean adaSidecar;

    public Motor(String merk, int kecepatan, boolean adaSidecar) {
        super(merk, kecepatan);
        this.adaSidecar = adaSidecar;
    }

    public boolean isAdaSidecar() {
        return adaSidecar;
    }

    public void setAdaSidecar(boolean adaSidecar) {
        this.adaSidecar = adaSidecar;
    }

    // Polimorfisme (override method)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ada Sidecar: " + (adaSidecar ? "Ya" : "Tidak"));
    }
}

    
    

