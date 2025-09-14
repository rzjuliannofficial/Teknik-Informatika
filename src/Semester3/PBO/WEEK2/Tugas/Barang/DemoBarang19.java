package Semester3.PBO.WEEK2.Tugas.Barang;

public class DemoBarang19 {
    public static void main(String[] args) {
        Barang19 barang1 = new Barang19();
        barang1.kode = "A001";
        barang1.namaBarang = "Laptop Asus";
        barang1.hargaDasar = 10000000.0;
        barang1.diskon = 15.0f; // Diskon 15%

        barang1.tampilData();
    }
}
