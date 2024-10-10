import java.util.Scanner;
public class DOWHILE_V1_Parkiran17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int jenis, durasi, total=0;
        System.out.println("PARKIRAN");

        //versi untuk pengguna Parkir
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
                    total += 12500;
                }else{
                    if (jenis==1) {
                        total += durasi *3000;
                    }else {
                        total += durasi *2000;
                    }
                } 
            }  
        System.out.println("Total biaya yang harus anda bayarkan: "+total);
        System.out.println("==============================");
        sc.nextLine();
        } while (jenis !=0);
        
        sc.close();
    }
}
