package WEEK6;
import java.util.Scanner;

public class latihanPemilaianKelayakanKreditBank {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int pendapatanPerBulan=0;
    double presentaseCicilanLain, cicilanLain;
    String riwayatKredit, jenisPekerjaan;

    System.out.println("Jenis pekerjaan: ");
    System.out.println("1. Freelance ");
    System.out.println("2. FullTime");
    System.out.println("3. Contract");
    System.out.print("Masukkan jenis pekerjaan anda: ");
    jenisPekerjaan = sc.nextLine();
    System.out.print("Riwayat kredit (baik/buruk)=>(y/n): ");
    riwayatKredit=sc.nextLine();
    System.out.print("Pendapatan Perbulan:Rp. "); 
    pendapatanPerBulan=sc.nextInt();
    System.out.println("=========================");

    if (pendapatanPerBulan>500000) {
        System.out.println("Anda memenuhi syarat awal pengajuan kredit");
    }else {
        System.out.println("Maaf anda tidak memenuhi syarat awal pengajuan kredit");
        sc.close();
        return;
    }
    
    if (riwayatKredit.equalsIgnoreCase("y")) {
        System.out.println("Riwayat kredit anda baik. Proses akan terus berlanjut");
    }else if(riwayatKredit.equalsIgnoreCase("n")) {
        System.out.println("Maaf riwayat kredit anda buruk. Pengajuan kredit ditolak");
    }else{
        System.out.println("Input riwayat yang anda masukkan invalid");
    sc.close();
    return;
    }

    if (jenisPekerjaan.equalsIgnoreCase("freelance")) {
        System.out.println("==============================");
        System.out.print("Masukkan jumlah cicilan lain: ");
        cicilanLain=sc.nextInt();
        presentaseCicilanLain=cicilanLain/pendapatanPerBulan;
        presentaseCicilanLain=presentaseCicilanLain*100;
        System.out.println("Presentase cicilan anda : "+presentaseCicilanLain+" %");
        if (presentaseCicilanLain<=30) {
            System.out.println("Selamat! Pengajuan kredit telah berhasil. ");
        }else {
            System.out.println("Maaf pengajuan kredit anda ditolak");
        }
    }else{
        if (jenisPekerjaan.equalsIgnoreCase("fulltime")) {
            System.out.println("Selamat! Pengajuan kredit telah berhasil.");
        }else if (jenisPekerjaan.equalsIgnoreCase("contract")) {
            System.out.println("Selamat! Pengajuan kredit telah berhasil.");
        }else {
            System.out.println("Maaf input pekerjaan anda invalid");
        }
    }
    System.out.println("=====================================");

    





    sc.close();
    }
}
