package WEEK5;
import java.util.Scanner;

public class SistemParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jenis kendaraan
        System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
        String jenisKendaraan = scanner.nextLine().toLowerCase();  // Mengubah input ke huruf kecil agar tidak case-sensitive

        // Meminta input durasi parkir
        System.out.print("Masukkan durasi parkir dalam jam: ");
        int durasiParkir = scanner.nextInt();

        // Deklarasi variabel untuk menyimpan biaya parkir
        int biayaParkir = 0;

        // Logika if-else 
        if (jenisKendaraan.equals("mobil")) {
            biayaParkir = 5000 * durasiParkir;  // Biaya parkir mobil Rp5.000 per jam
            System.out.println("Anda memarkir mobil.");
        } else if (jenisKendaraan.equals("motor")) {
            biayaParkir = 3000 * durasiParkir;  // Biaya parkir motor Rp3.000 per jam
            System.out.println("Anda memarkir motor.");
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
        
        }

        // Menampilkan total biaya parkir
        System.out.println("Total biaya parkir: Rp" + biayaParkir);

        scanner.close();  // Menutup scanner
    }
}

