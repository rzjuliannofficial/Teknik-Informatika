package WEEK11;

import java.util.Scanner;

public class latihanArr2Dimensi {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int array2D[][]= new int[1][6]; 
    double rata2NilaiR=0, rata2NilaiP=0;

    for (int i = 0; i < array2D.length; i++) {
        System.out.println("Responden ke-"+(i+1));
        //deklarasi hasilResponden
        double hasilRes = 0;
        for (int j = 0; j < array2D[i].length;) {
            System.out.println("Pertanyaan ke-"+(j+1));
            System.out.print("Berikan jawaban nilai 1-5: ");
            array2D[i][j] = sc.nextInt();
            // Memastikan jawaban dalam rentang 1-5
            if (array2D[i][j] < 1 || array2D[i][j] > 5) {
                System.out.print("Jawaban tidak valid! masukkan yang benar!");
                continue;
            }
            //karena terdapat pengondisian di for tersebut , j++ diberi di belakang agar saat pengondidsian salah tidak berganti index j
            //hasil penjumlahan nilai responden
            hasilRes +=array2D[i][j];
            j++; 
        } 
        //total rata2NilaiRespoden
        rata2NilaiR=hasilRes/array2D[i].length;
        System.out.println("Rata-rata nilai responden ke-"+(i+1)+" yaitu "+rata2NilaiR);
        System.out.println();
    }
    
    //mencari rata2 nilai responden dalam setiap pertanyaan
    //dibalik j dulu, mengapa?karena yang ditanya i jadi otomatis i yang ada didalam untuk memudahkan
    for (int j = 0; j < 6.; j++) {
        double totalNilaiP=0;
        for (int i = 0; i < array2D.length; i++) {
            totalNilaiP+=array2D[i][j];
        }
        rata2NilaiP=totalNilaiP/6;
        System.out.println("Rata-rata nilai pertanyaan ke-"+(j+1)+" adalah "+rata2NilaiP); 
    }
    
    double rata2Semua=0;
    double hasilRata2=0;
    for (int i = 0; i < array2D.length; i++) {
        rata2Semua+=rata2NilaiP;
        for (int j = 0; j < array2D[i].length; j++) {
            rata2Semua+=rata2NilaiR;
        }   
    }
    hasilRata2=rata2Semua/(6*10);
    System.out.println("========================");
    System.out.println("Rata-rata dari Semuanya adalah "+hasilRata2);
    System.out.println("==========================");
    sc.close();
    }
}
