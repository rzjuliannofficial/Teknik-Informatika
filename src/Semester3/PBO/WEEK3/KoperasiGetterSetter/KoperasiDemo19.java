package Semester3.PBO.WEEK3.KoperasiGetterSetter;

public class KoperasiDemo19 {

    public static void main(String[] args) {
        Anggota19 anggota1 = new Anggota19("Iwan", "Jalan Mawar");
        System.out.println("Simpanan "+anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " +anggota1.getNama()+" : Rp "+ anggota1.getSimpanan());

        anggota1.ambil(5000);
        System.out.println("Simpanan " +anggota1.getNama()+" : Rp "+ anggota1.getSimpanan());    
    }
}
