package WEEK5.Latihan;

public class daftarNilaiMhsMain {
    public static void main(String[] args) {
        daftarNilaiMhs nm = new daftarNilaiMhs();
        
        //DEVIDE AND CONQUER
        int nilaiTertinggiUts = nm.nilaiTertinggi(0, nm.nilaiUts.length - 1);
        System.out.println("Nilai Uts tertinggi: "+nilaiTertinggiUts);
        
        //DEVIDE AND CONQUER
        int nilaiTerendahUts = nm.nilaiTerendah(0, nm.nilaiUts.length-1);
        System.out.println("Nilai Uts terendah: "+nilaiTerendahUts);

        //BRUTEFORCE
        int rata2NilaiUas = nm.rata2Uas();
        System.out.println("Rata rata nilai Uas Mahasiswa: "+rata2NilaiUas);
    }
}
