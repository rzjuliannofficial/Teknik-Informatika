package WEEK13.Jobsheet10;

public class pengunjungCafe17 {
    //penggunaan String ... adalah untuk menandakan Array
    public static void daftarPengunjung(String ... namaPengunjung ) {
        System.out.println("Daftar Nama Pengunjung: ");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- "+namaPengunjung[i]);
        }

        //mode for-each loop
        System.out.println("Daftar Nama Pengunjung: ");
        for (String nama : namaPengunjung) {
            System.out.println("- "+nama);
        }
    }
    //main
    public static void main(String[] args) {
    daftarPengunjung("Ali", "Budi", "Citra");
    }
}

