package Semester3.PBO.WEEK2.Tugas.Lingkaran;

public class DemoLingkaran19 {
    public static void main(String[] args) {
        Lingkaran19 lngkrn1 = new Lingkaran19();
        lngkrn1.r = 10.0;

        double luas = lngkrn1.hitungLuas();
        double keliling = lngkrn1.hitungKeliling();

        System.out.println("Luas lingkaran dengan jari-jari " + lngkrn1.r + " adalah: " + luas);
        System.out.println("Keliling lingkaran dengan jari-jari " + lngkrn1.r + " adalah: " + keliling);
    }
}
