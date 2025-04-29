package WEEK2.classMataKuliah;

public class mataKuliah17 {

    //kontruktor tanpa parameter/default
    String kodeMK ;
    String namaMK ;
    int sks ;
    int jmlJam;

    public mataKuliah17() {
        kodeMK = "TIF123";
        namaMK = "Algoritma dan Struktur Data";
        sks = 3;
        jmlJam = 6;
    }

    //kontruktor dengan parameter
    public mataKuliah17(String kodeMK, String namaMK, int sks, int jmlJam) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.jmlJam = jmlJam;
    }

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + namaMK);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jmlJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        if (sks < 0 || sks > 3) {
            System.out.println("SKS tidak valid. Harus antara 0 - 3");
            return;
        }
    }

    void tambahJam(int jam) {
        jmlJam += jam;
        System.out.println(jam+" Jam berhasil ditambahkan");
    }
    
    void kurangiJam(int jam) {
        if (jam > jmlJam) {
            System.out.println("Jam tidak valid.");
            return;
        }
        jmlJam -= jam;
        System.out.println(jam+" Jam berhasil dikurangi");
    }

}
