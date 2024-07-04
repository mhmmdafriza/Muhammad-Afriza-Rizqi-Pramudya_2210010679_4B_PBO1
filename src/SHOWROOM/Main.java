package SHOWROOM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array untuk menyimpan objek kendaraan
        Kendaraan[] garasi = new Kendaraan[2];

        // Seleksi dan Simple IO
        try {
            System.out.print("Masukkan merk mobil: ");
            String merkMobil = scanner.nextLine();
            System.out.print("Masukkan kecepatan mobil: ");
            int kecepatanMobil = Integer.parseInt(scanner.nextLine());
            System.out.print("Masukkan jumlah pintu mobil: ");
            int jumlahPintu = Integer.parseInt(scanner.nextLine());

            Mobil mobil = new Mobil(merkMobil, kecepatanMobil, jumlahPintu);
            garasi[0] = mobil;

            System.out.print("Masukkan merk motor: ");
            String merkMotor = scanner.nextLine();
            System.out.print("Masukkan kecepatan motor: ");
            int kecepatanMotor = Integer.parseInt(scanner.nextLine());
            System.out.print("Apakah ada sidecar (true/false): ");
            boolean adaSidecar = Boolean.parseBoolean(scanner.nextLine());

            Motor motor = new Motor(merkMotor, kecepatanMotor, adaSidecar);
            garasi[1] = motor;

            System.out.println("\nInformasi Kendaraan di Garasi:");
            for (Kendaraan k : garasi) {
                k.tampilkanInfo();
                System.out.println();
            }
            //Error Handling
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Harap masukkan angka yang sesuai.");
        } finally {
            scanner.close();
        }
    }
}
    

