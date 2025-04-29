package WEEK2.classMahasiswa;

//ini merupakan Class
public class mahasiswa17 {

    //ini merupakan Atribut
    String nama; 
    String nim;
    String kelas;
    double ipk;

    
    public mahasiswa17() {
        //ini merupakan Constructor tanpa parameter, karena sudah diambil dari atribut/default
    }

    public mahasiswa17(String nm, String nim, String kls, double ipk) {
        //ini merupakan Constructor dengan parameter, kaerna ada parameter yang diambil dari luar
        nama = nm;
        this.nim = nim; //this.nim = nim; kegunaaan this adalah untuk membedakan antara atribut dengan parameter. 
                        //maksudnya adalah this.nim adalah atribut nim yang ada di class mahasiswa17 sedangkan nim adalah parameter yang ada di constructor
        this.ipk = 3.5;
        kelas = kls;
    }
    //jadi kesimpulannya jika tidak ada this maka nim yang diambil adalah nim yang ada di parameter bukan nim yang ada di atribut
    //jika ada this maka nim yang diambil adalah nim yang ada di atribut


    //ini merupakan Method
    void tampilInformasi() {
        // System.out.printf("Nama: %s%nNIM: %s%nkelas: %s%nIPK: %.2f%n", nama, nim, kelas, ipk);
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIPK(double ipkBaru) {
        ipk = ipkBaru;
        if (ipkBaru > 4.0 || ipkBaru < 0) {
            System.out.println("IPK tidak valid. Harus antara 0.0 - 4.0");
            return;
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.5) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
}
