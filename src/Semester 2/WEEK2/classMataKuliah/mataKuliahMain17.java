package WEEK2.classMataKuliah;

public class mataKuliahMain17 {
    public static void main(String[] args) {
        
        System.out.println("Mata Kuliah 1");
        mataKuliah17 mk1 = new mataKuliah17(); //membuat objek mk1 dari class / file mataKuliah17
        mk1.tampilInformasi();//memanggil method tampilInformasi dari objek mk1 dari file mataKuliah17
        System.out.println();

        System.out.println("Update");
        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.tampilInformasi();
        System.out.println();
        
        System.out.println("Update v2");
        mk1.kurangiJam(5);
        mk1.tampilInformasi();
        System.out.println();

        System.out.println("Mata Kuliah 2");
        mataKuliah17 mk2 = new mataKuliah17("TIF124", "Pemrograman Dasar", 4, 8);
        mk2.tampilInformasi();
        System.out.println();

        System.out.println("Update");
        mk2.ubahSKS(5);
        mk2.tambahJam(3);
        mk2.tampilInformasi();
        System.out.println();

        System.out.println("Update v2");
        mk2.kurangiJam(5);
        mk2.tampilInformasi();
        System.out.println();

    }
}
