package UTS_CM;
import java.util.Scanner;

public class MainSiakad7 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);   // Untuk Input Karakter
        Scanner sci7 = new Scanner(System.in);  // Untuk Input Angka

        Mahasiswa7[] arrMhs7 = new Mahasiswa7[3]; //inisialisasi array objek arrMhs7
        arrMhs7[0] = new Mahasiswa7("Ali Rahman", "22001", "Informatika");
        arrMhs7[1] = new Mahasiswa7("Budi Santoso", "22002", "Informatika");
        arrMhs7[2] = new Mahasiswa7("Citra Dewi", "22003", "Sistem Informasi Bisnis");

        MataKuliah7[] matkulList7 = new MataKuliah7[3];
        matkulList7[0] = new MataKuliah7("MK001", "Struktur Data", 3);
        matkulList7[1] = new MataKuliah7("MK002", "Basis Data", 3);
        matkulList7[2] = new MataKuliah7("MK003", "Desain Web", 3);
        DataMataKuliah7 dataMatkul7 = new DataMataKuliah7(); //inisialisasi objek dataMatkul7

        DataMahasiswa7 dataMhs7 = new DataMahasiswa7(); //inisialisasi objek dataMhs7
        
        Penilaian7[] arrPen = {
            new Penilaian7(arrMhs7[0], matkulList7[0], 80, 85, 90), // Ali - Struktur Data
            new Penilaian7(arrMhs7[0], matkulList7[1], 60, 75, 70), // Ali - Basis Data
            new Penilaian7(arrMhs7[1], matkulList7[0], 75, 70, 80), // Budi - Struktur Data
            new Penilaian7(arrMhs7[2], matkulList7[1], 85, 90, 95), // Citra - Basis Data
            new Penilaian7(arrMhs7[2], matkulList7[2], 80, 90, 65)  // Citra - Desain Web
        };

        DataPenilaian7 dataPen7 = new DataPenilaian7(arrPen.length); // inisialisasi objek dataPen7
        
        // Menambahkan data penilaian ke dalam objek dataPen7
        for (Penilaian7 pen : arrPen) {
            dataPen7.tambahData(pen);
        }
        do{        
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.printf("1. Tampilkan Daftar Mahasiswa%n2. Tampilkan Daftar Mata Kuliah%n3. Tampilkan Data Penilaian%n4. Urutkan Mahasiswa Berdasarkan Nilai AKhir%n5. Cari Mahasiswa Berdasarkan NIM%n0. Keluar%n");
            System.out.print("Pilihan Menu: ");
            int choice = sci7.nextInt();
            switch (choice) {
                case 1:
                    dataMhs7.tampilkanMahasiswa(arrMhs7);
                    break;
                case 2:     
                    dataMatkul7.tampilDaftarMataKuliah(matkulList7);         
                    break;
                case 3:  
                    dataPen7.tampilPenilaian();    
                    break;
                case 4:
                    dataPen7.tampilSortNilaiAkhir();
                    break;
                case 5:    
                    System.out.println("=========================================");
                    System.out.println("Pencarian Data Mahasiswa");
                    System.out.println("Masukkan NIM yang dicari: ");
                    String nim = sc7.nextLine();
                    dataMhs7.cariMahasiswa(arrMhs7,nim);
                    System.out.println("=========================================");
                    break;
                case 0: 
                    System.out.println("Byee!!"); 
                    sc7.close();
                    sci7.close();  
                    return;
                default:
                    System.out.println("Masukkan Menu yang benar!!!");
            } 
        }while(true);
     
    }
}
