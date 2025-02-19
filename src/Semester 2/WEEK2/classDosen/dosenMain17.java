package WEEK2.classDosen;

public class dosenMain17 {
    public static void main(String[] args) {
        dosen17 dosen_1 = new dosen17();
        dosen_1.tampilInformasi();
        System.out.println();

        System.out.println("Update");
        dosen_1.ubahKeahlian("Matematika");
        dosen_1.tampilInformasi();
        
        System.out.println("Masa Kerja Dosen "+dosen_1.hitungMasaKerja(2025)+" Tahun");
        System.out.println();
        dosen17 dosen_2 = new dosen17("D002", "Sutam", false, 2015, "Pemrograman Dasar");
        dosen_2.tampilInformasi();
        System.out.println();

        System.out.println("Update");
        dosen_2.setStatusAktif(true);
        dosen_2.tampilInformasi();
        System.out.println("Masa Kerja Dosen "+dosen_2.hitungMasaKerja(2022)+" Tahun");
        System.out.println();

    }
}
