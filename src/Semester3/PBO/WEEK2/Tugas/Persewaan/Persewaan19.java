package Semester3.PBO.WEEK2.Tugas.Persewaan;

public class Persewaan19 {
    String idSewa;
    String namaMember;
    String namaGame;
    int lamaSewa;
    int harga;
    int totalHarga;

    public int hitungTotalHarga(){
        totalHarga = harga * lamaSewa;
        return totalHarga;
    }
    
    public void tampilData(){
        System.out.println("ID Sewa: " + idSewa);
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Nama Game: " + namaGame);
        System.out.println("Harga Sewa: Rp " + harga);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("---------------------------------");
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}
