package WEEK3.ClassMahasiswa17;
import java.util.Scanner;

public class mahasiswaDemo17 {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    mahasiswa17[] arrayOfMahasiswa = new mahasiswa17[3]; //deklarasi array of object

    for (int i = 0; i < arrayOfMahasiswa.length; i++) {
      arrayOfMahasiswa[i] = new mahasiswa17(); //inisialisasi objek pertama

      System.out.println("Input Data Mahasiswa ke-"+(i+1)+" : ");
      System.out.print("NIM : ");
      arrayOfMahasiswa[i].nim = sc.nextLine();
      System.out.print("Nama : ");
      arrayOfMahasiswa[i].nama = sc.nextLine();
      System.out.print("Kelas : ");
      arrayOfMahasiswa[i].kelas = sc.nextLine();
      System.out.print("IPK : ");
      arrayOfMahasiswa[i].ipk = sc.nextFloat();
      sc.nextLine();
      System.out.println("------------------------------------");
    }
      
    for (int i = 0; i < arrayOfMahasiswa.length; i++) {
      System.out.println("Mahasiswa ke-"+(i+1));
      arrayOfMahasiswa[i].cetakInfo();
    }

    mahasiswa17[] myArrayOfMahasiswa = new mahasiswa17[3]; //deklarasi array of object
    myArrayOfMahasiswa[0].nim = "12345678"; // 
    myArrayOfMahasiswa[0].nama = "Budi";
    myArrayOfMahasiswa[0].kelas = "1F";
    myArrayOfMahasiswa[0].ipk = 3.5f;
    //akan eror karena objek yang bernama myArrayOfMahasiswa[0] belum diinisialisasi
    //sehingga tidak bisa diakses atributnya
    sc.close(); 
  }   
}
