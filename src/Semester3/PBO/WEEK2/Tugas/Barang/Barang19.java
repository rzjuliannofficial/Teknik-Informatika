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
}
