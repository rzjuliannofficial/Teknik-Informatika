import java.util.Scanner;
public class tokoBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diskon=0;
        String jenisBuku;
        int banyakBuku;

        System.out.println("Buku yang  tersedia: ");
        System.out.println("1. Kamus   ");
        System.out.println("2. Novel ");
        System.out.println("3. Biografi");
        System.out.println("4. Buku Pelajaran");
        System.out.print("Masukkan jenis buku: ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan banyak buku: ");
        banyakBuku= sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon=0.1;
            if (banyakBuku>2) {
                diskon=0.1 + 0.02;
            }
            else {
                diskon=0.1 + 0;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon=0.07;
            if (banyakBuku>3) {
                diskon=0.07+0.03;
            }
            else{
                diskon=0.07+0.01;
            }
        }
        else {
            if (banyakBuku>3) {
                diskon=0.05;
            }
            else{
                diskon=0;
            }
        }
        diskon=diskon*100;
        int diskontotal=(int)diskon;

        System.out.println("Jenis buku yang anda beli :"+jenisBuku);
        System.out.println("Jumlah buku yang anda beli : "+banyakBuku);
        System.out.println("Diskon yang anda dapatkan : "+diskontotal+"% ");
        sc.close();
    }
}
