package StrudiKasus;
import java.util.Scanner;

public class kelompok10 {
  static  Scanner input10 = new Scanner(System.in);
  //intansisai array global
  static String[][] Data = new String[100][100];
  static String[] namaMahasiswa = new String[100]; // membatasi 100 mahasiswa
  static String[] nim = new String[100]; // membatasi 100 nim
  static String[][] namaMk = new String[100][100]; // membatasi 100
  static String[][] kodeMk = new String[100][100]; // membatasi 26 kodematkul
  static byte [][] sks = new byte[100][100]; 
  static int i = 0 ;
  static int[] totalSks = new int[100];
  static int jumlahMahasiswa; 

  public static void main(String[] args) {
    Menu();
  }

  // fungsi menu
  public static void Menu() {
    int pilihan;
    while (true) {
      // menampilkan daftar menu
      System.out.println("\n=== Sistem Pemantauan KRS Mahasiswa ===");
      System.out.println("1. Tambah Data KRS");
      System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
      System.out.println("3. Analisis Data KRS");
      System.out.println("4. Keluar");
      System.out.print("Pilih menu: ");
      pilihan = input10.nextInt();
      input10.nextLine();
      switch (pilihan) {
        case 1:
          // fungsi tambah
          menu1();
          break;
        case 2: 
          // fungsi tampil
          menu2();
          break;
        case 3:
          menu3();
          break;
        case 4: 
          System.out.println("Terima Kasih!");
          return;
        default:
          System.out.println("input tidak valid, masukin yg bener");
      }
    }
  }

  //fungsi tambah data
  public static void menu1() {
    //deklarasi nilai i
    System.out.println("i: "+i);
    System.out.println("--- Tambah Data KRS ---");
    System.out.print("Nama: ");
    namaMahasiswa[i] = input10.nextLine();
    System.out.print("NIM: ");
    nim[i] = input10.nextLine();
    int j =0;
    String jawaban;

    while (true) {
      System.out.println("j: "+j);
      System.out.print("Kode Mata Kuliah: ");
      kodeMk[i][j] = input10.nextLine();
      System.out.print("Nama Mata Kuliah: ");
      namaMk[i][j] = input10.nextLine();
      System.out.print("Jumlah SKS (1-3): ");
      sks[i][j] = input10.nextByte();
      input10.nextLine();
        if (totalSks[i] <= 24) {
          if (sks[i][j] > 3 || sks[i][j] < 1) { 
              System.out.println("Mohon isi yang benar");
              continue; // Kembali ke awal loop
          } else {
              totalSks[i] += sks[i][j];
              System.out.println("Data Mata Kuliah Berhasil Ditambahkan");
              System.out.print("Tambah mata kuliah lagi? (y/n): ");
              jawaban = input10.nextLine();
              
              if (jawaban.equalsIgnoreCase("n")) {
                  break; // Keluar dari loop
              }
              j++; 
          }
        } else {
          j--; //untuk mengurangi j yang telah ditambah
          System.out.println("SKS telah lebih dari 24");
          totalSks[i] -= sks[i][j]; //untuk mengurangi sks yang telah ditambah
          break; // Keluar dari loop
      } 
    }
    System.out.println("Total SKS: "+totalSks[i]);
    i++;
  }

  //fungsi tampilin
  public static void menu2() {
    System.out.println("--- Tampilin Daftar KRS Mahasiswa ---");
    System.out.print("Masukkan Nim mahasiswa: ");
    String NIM = input10.nextLine();
    System.out.println("Daftar KRS");
    for (int i = 0; i < Data.length; i++) {
      if (NIM.equals(nim[i])) {
        System.out.println("Nim ||\t\t|| Nama ||\t|| Kode MK ||\t|| Nama Mata Kuliah ||\t|| SKS");
        for (int j = 0; j < Data.length; j++) {
          if (kodeMk[i][j] == null) {
            break;
          }
          System.out.print("\n"+nim[i]+"||\t||"+namaMahasiswa[i]+"||\t||"+kodeMk[i][j]+"||\t\t||"+namaMk[i][j]+"||\t||"+sks[i][j]);
        }
        System.out.println();   
        System.out.println("Total SKS: "+totalSks[i]);
        System.out.println();
      }
    }
  }
      
    
  

  public static void menu3() {
  for (int i = 0; i < Data.length; i++) {
    if (totalSks[i]<20) {
      jumlahMahasiswa++;
      break;
    }
  }
  System.out.println("Jumlah mahasiswa yang mengambil SKS kurang dari 20: "+jumlahMahasiswa);
  }
}
