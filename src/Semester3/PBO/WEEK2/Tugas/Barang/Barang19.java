package Semester3.PBO.WEEK2.Tugas.Barang;

public class Barang19 {
    public String kode;
    public String namaBarang;
    public double hargaDasar;
    public float diskon; // Diskon dalam persen

    public double hitungHargaJual() {
        double diskonAmount = hargaDasar * (diskon / 100);
        return hargaDasar - diskonAmount;
    }  

    public void tampilData() {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: Rp " + hargaDasar);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("---------------------------------");
        System.out.println("Harga Jual: Rp " + hitungHargaJual());
    }
}
