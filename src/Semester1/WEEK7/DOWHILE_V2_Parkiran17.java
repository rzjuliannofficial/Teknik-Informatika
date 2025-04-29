package WEEK7;
import java.util.Scanner;
public class DOWHILE_V2_Parkiran17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int jenis, durasi, total=0, totalAkhir=0;
        System.out.println("PARKIRAN");

        //versi untuk pemilik parkiran //untuk menghitung keuntungan
        do {
        System.out.println("Jenis kendaraan: ");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("0. Keluar");
        System.out.print("Masukkan jenis kendaraan: ");
        jenis =sc.nextInt();
        sc.nextLine();
        
            if (jenis==1 || jenis==2) {
                System.out.print("Masukkan durasi: ");
                durasi = sc.nextInt();

                total = 0;  // Reset total untuk setiap kendaraan, jika ini tidak ada total akan selalu bertambah, cocok untuk menhitung hasil kentungan
                
                if (durasi>5) {
                    total = 12500; // Biaya flat jika durasi lebih dari 5 jam
                    //mengapa tidak memakai += ? karena anda sudah memakai total=0 jadi +=menjadi tidak berguna
                    //dan jika anda memakai += dan total=0 dinonaktifkan total dari input 1-2 dan seterunya akan selalu ditambah, sedankan anda sudah membuat totalAkhir, jadinya rusak nilainya nanti
                }else{
                    if (jenis==1) {
                        total += durasi *3000;
                    }else {
                        total += durasi *2000;
                    }
                } 
                System.out.println("Harga yang dibayarkan: "+total);
                totalAkhir += total;
            }  
            
            
        
        } while (jenis !=0);
        System.out.println("Total biaya pendapatan parkiran: "+totalAkhir);
        System.out.println("==============================");
        
        sc.close();
    }
}

