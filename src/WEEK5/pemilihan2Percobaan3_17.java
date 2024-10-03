import java.util.Scanner;

public class pemilihan2Percobaan3_17 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String kategori ;
    int penghasilan;
    double pajak=0, gajiBersih=0;

    System.out.print("Masukkan kategori (pekerja/pebisnis) anda : ");
    kategori = sc.nextLine();
    System.out.print("Masukkan penghasilan anda : ");
    penghasilan = sc.nextInt();

    //pengecualian
        if (penghasilan<=0) {
            System.out.println("Input penghasilan yang anda masukkan = 0/negatif");
        }

    //logika   
       if (kategori.equalsIgnoreCase("pekerja")) {
        
        if (penghasilan<=2000000) {
            pajak = 0.1;
        } else if (penghasilan<=3000000) {
            pajak=0.15;
        } else {
            pajak=0.2;
        }
        gajiBersih = penghasilan-(penghasilan*pajak);
       }

       
       else if (kategori.equalsIgnoreCase("pebisnis")) {
        if (penghasilan<=2500000) {
            pajak=0.15;
        }
        else if (penghasilan<=3500000) {
            pajak=0.2;
        } else {
            pajak=0.25;
        }
        gajiBersih = penghasilan-(penghasilan*pajak);
        
       }
       else {
        System.out.println("Kategori yang anda masukkan salah");
       }
       System.out.println("Gaji bersih anda = Rp. "+ gajiBersih);
       
        sc.close();
    }
}
