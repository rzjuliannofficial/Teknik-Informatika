package WEEK10;
import java.util.Scanner;

public class arrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMhs;
        int mhsLulus=0, mhsTdkLulus=0, nilaiMhsLulus=0, nilaiMhsTidakLulus=0;
        double total = 0, rata2, rata2lulus=0 , rata2TdkLulus=0;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs= sc.nextInt();
        int nilaiMhs[] = new int[jmlMhs];

        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                System.out.println("Lulus!");
                nilaiMhsLulus += nilaiMhs[i];
                mhsLulus++ ;

            }else {
                System.out.println("Tidak Lulus!");
                nilaiMhsTidakLulus += nilaiMhs[i];
                mhsTdkLulus++;
            }

        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total / nilaiMhs.length;
        rata2lulus = nilaiMhsLulus / mhsLulus;
        rata2TdkLulus = nilaiMhsTidakLulus / mhsTdkLulus;

        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Mahasiswa yang lulus : "+mhsLulus);
        System.out.println("Rata-rata nilai mahasiswa lulus : "+rata2lulus);
        System.out.println("Mahasiwa yang tidak lulus : "+mhsTdkLulus);
        System.out.println("Rata-rata nilai mahasiswa lulus : "+rata2TdkLulus);
        sc.close();
    }
}
