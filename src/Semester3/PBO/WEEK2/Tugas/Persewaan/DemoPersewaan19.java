package Semester3.PBO.WEEK2.Tugas.Persewaan;

public class DemoPersewaan19 {
    public static void main(String[] args) {
        Persewaan19 sewa1 = new Persewaan19();
        sewa1.idSewa = "SW1";
        sewa1.namaMember = "Budi";
        sewa1.namaGame = "Grand Theft Auto V";
        sewa1.harga = 5000;
        sewa1.lamaSewa = 3;

        sewa1.hitungTotalHarga();
        sewa1.tampilData();
    }   
}
