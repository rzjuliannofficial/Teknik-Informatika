package WEEK9.TUGAS;

import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaAtlet, namaAtletTot="",cabor="", institusi, hasilAkhir="";

        do{
        System.out.print("Masukkan Nama Institusi: ");
        institusi = sc.nextLine();
        System.out.println("Cabang Olahraga: ");
        System.out.println("1. Badminton");
        System.out.println("2. Tenis Meja");
        System.out.println("3. Basket");
        System.out.println("4. Bola Volly");
        System.out.println("0. Keluar");
        System.out.print("Masukkan cabor yang anda pilih(1-4): ");
        int pilihan = sc.nextInt();
        sc.nextLine();

            
            if (pilihan==1) {
                cabor="Badminton";
            }else if (pilihan==2) {
                cabor="Tenis Meja";
            }else if (pilihan==3) {
                cabor="Basket";
            }else if (pilihan==4) {
                cabor="Bola Volly";
            }else if (pilihan==0) {
                System.out.println("Terima Kasih. Anda telah keluar.");
                break;
            }else {
                System.out.println("Pilihan tidak ada. Masukkan input yang benar!");
                continue;
            }
            System.out.println();
            System.out.println("Anda masuk dalam cabor "+cabor);
            System.out.println("Masukkan nama 5 atlet yang dikirim ");
            
            for (int j = 1; j <= 5 ; j++) {
                System.out.print("Nama atlet ke-"+j+": ");
                namaAtlet = sc.nextLine();
                namaAtletTot +=  namaAtlet + "\n";
            }
            hasilAkhir += "Institusi: " + institusi + "\nCabang Olahraga: " + cabor + "\nDaftar Atlet:\n" + namaAtletTot;
            System.out.println(hasilAkhir);
            System.out.println("Institusi "+institusi+" telah terdaftar dalam cabor "+cabor);
            System.out.println("====================================================");
        }while (true);

        sc.close();
    }
}
