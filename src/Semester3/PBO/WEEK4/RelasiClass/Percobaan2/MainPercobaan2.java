package Semester3.PBO.WEEK4.RelasiClass.Percobaan2;

public class MainPercobaan2 {
    public static void main(String[] args) {
    Mobil19 m = new Mobil19();
    m.setMerk("Avanza");
    m.setBiaya(350000);
    Sopir19 s = new Sopir19();
    s.setNama("John Doe");
    s.setBiaya(200000);
    Pelanggan19 p = new Pelanggan19();
    p.setNama("Jane Doe");
    p.setMobil(m);
    p.setSopir(s);
    p.setHari(2);
    System.out.println("Biaya Total = " +
    p.hitungBiayaTotal());

 }   
}
