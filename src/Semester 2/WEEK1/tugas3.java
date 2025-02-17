package WEEK1;

import java.util.Scanner;

public class tugas3 {

        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            
            System.out.print("Masukkan jumlah mata kuliah: ");
            int n = sc.nextInt();
            sc.nextLine(); 
            
            String[] namaMataKuliah = new String[n];
            int[] sks = new int[n];
            int[] semester = new int[n];
            String[] hariKuliah = new String[n];
            
            // Input data mata kuliah
            for (int i = 0; i < n; i++) {
                System.out.println("Masukkan data untuk mata kuliah ke-" + (i + 1));
                System.out.print("Nama Mata Kuliah: ");
                namaMataKuliah[i] = sc.nextLine();
                System.out.print("Jumlah SKS: ");
                sks[i] = sc.nextInt();
                System.out.print("Semester: ");
                semester[i] = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Hari Kuliah: ");
                hariKuliah[i] = sc.nextLine();
            }
            
            int pilihan;
            while (true) {
                
            
                System.out.println("\nMenu:");
                System.out.println("1. Tampilkan seluruh jadwal kuliah");
                System.out.println("2. Tampilkan jadwal berdasarkan hari");
                System.out.println("3. Tampilkan jadwal berdasarkan semester");
                System.out.println("4. Cari mata kuliah berdasarkan nama mata kuliah");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = sc.nextInt();
                sc.nextLine(); 
    
                switch (pilihan) {
                    case 1:
                        tampilkanJadwal(namaMataKuliah, sks, semester, hariKuliah, "");
                        break;
                    case 2:
                        System.out.print("Masukkan hari: ");
                        String hari = sc.nextLine();
                        tampilkanJadwal(namaMataKuliah, sks, semester, hariKuliah, hari);
                        break;
                    case 3:
                        tampilkanJadwalSemester(namaMataKuliah, sks, semester, hariKuliah);
                        break;
                    case 4:
                        cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah);
                        break;
                    case 5:
                        System.out.println("Program selesai.");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        }
        
        static void tampilkanJadwal(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, String hari) {
            System.out.println("\nJadwal Kuliah:");
            boolean ada = false;
            for (int i = 0; i < namaMataKuliah.length; i++) {
                if (hari.isEmpty() || hariKuliah[i].equalsIgnoreCase(hari)) { // isEmpty() == null
                    //jadi code ini hari.isempety digunakan untuk pilihan 1
                    //equals untuk cek pilihan 2 karena memasukkan nama hari

                    System.out.println("Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                    ada = true;
                }
            }
            if (!ada) {
                System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
            }
        }
        
        static void tampilkanJadwalSemester(String[] namaMatakuliah, int[] sks, int[] semester, String[] hariKuliah) {
            System.out.print("Masukkan semester: ");
            int sem = sc.nextInt();
            System.out.println("\nJadwal Kuliah Semester " + sem + ":");
            boolean ada = false;
            for (int i = 0; i < namaMatakuliah.length; i++) {
                if (semester[i] == sem) {
                    System.out.println("Mata Kuliah: " + namaMatakuliah[i] + ", SKS: " + sks[i] + ", Hari: " + hariKuliah[i]);
                    ada = true;
                }
            }
            if (!ada) {
                System.out.println("Tidak ada jadwal kuliah untuk semester " + sem);
            }
        }
        
        static void cariMataKuliah(String[] namaMatakuliah, int[] sks, int[] semester, String[] hariKuliah) {
            boolean ada = false;
            System.out.print("Masukkan nama mata kuliah: ");
            String nama = sc.nextLine();
            for (int i = 0; i < namaMatakuliah.length; i++) {
                if (namaMatakuliah[i].equalsIgnoreCase(nama)) {
                    System.out.println("\nDetail Mata Kuliah:");
                    System.out.println("Nama Mata Kuliah: " + namaMatakuliah[i]);
                    System.out.println("SKS: " + sks[i]);
                    System.out.println("Semester: " + semester[i]);
                    System.out.println("Hari Kuliah: " + hariKuliah[i]);
                    ada = true;
                    break;
                }
            }
            if (!ada) {
                System.out.println("Mata kuliah tidak ditemukan.");
            }
        }
    }
    