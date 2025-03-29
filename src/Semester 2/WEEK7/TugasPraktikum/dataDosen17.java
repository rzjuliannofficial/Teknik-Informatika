package WEEK7.TugasPraktikum;

public class dataDosen17 {
    int pria = 0, wanita = 0;
    int totalUsiaPria, rata2Pria;
    int totalUsiaWanita, rata2Wanita;
    
    //karena kita data nya diisi manual kita tidak perlu membutuhkan kontraktor default
    //Kontraktor untuk data dosen
    // public Datadosen17(){

    // }

    void dataSemuaDosen(dosen17[]arrDosen) { //memanggil array of object
        //TIDAK MENGGUNAKAN PUBLIC karena tidak diakses kelas lain
        for (int i = 0; i < arrDosen.length; i++) {
            arrDosen[i].tampilkanInfo();
        }
        System.out.println();
    }

    void jumlahDosenPerJenisKelamin(dosen17[]arrDosen) {
        for (int i = 0; i < arrDosen.length; i++) {
            if (arrDosen[i].jenisKelamin.equals(true)) {
                pria++;
            }else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Perjenis Kelamin");
        System.out.println("Pria: "+pria+" orang");
        System.out.println("Wanita: "+wanita+" orang");
        System.out.println("-------------------------------------");
    }

    void rerataUsiaDosenPerJenisKelamin(dosen17[]arrDosen){
        for (int i = 0; i < arrDosen.length; i++) {
            if (arrDosen[i].jenisKelamin.equals(true)) {
                totalUsiaPria+=arrDosen[i].usia;
            }else {
                totalUsiaWanita+=arrDosen[i].usia;
            }
        }

        //check jika pria atau wanita tidak ada
        if (pria == 0) {
            rata2Pria = 0;
            rata2Wanita = totalUsiaWanita / wanita;
            
        }else if (wanita == 0) {
            rata2Pria = totalUsiaPria / pria;
            rata2Wanita = 0;
        }else {
            rata2Pria = totalUsiaPria / pria;
            rata2Wanita = totalUsiaWanita / wanita;
        }
        
        System.out.println("Rata-rata Usia Dosen Per Jenis Kelamin");
        System.out.println("Pria: "+rata2Pria);
        System.out.println("Wanita: "+rata2Wanita);
        System.out.println("---------------------------------------");
    }

    void infoDosenPalingTua(dosen17[] arrDosen){
        int max=0;
        for (int i = 0; i < arrDosen.length; i++) {
            if (arrDosen[i].usia > arrDosen[max].usia ) {
                max = i;
            }
        }
        System.out.println("Info Dosen Paling Tua");
        arrDosen[max].tampilkanInfo();
    }

    void infoDosenPalingMuda(dosen17[] arrDosen){
        int min=0;
        for (int i = 0; i < arrDosen.length; i++) {
            if (arrDosen[i].usia < arrDosen[min].usia ) {
                min = i;
            }
        }
        System.out.println("Info Dosen Paling muda");
        arrDosen[min].tampilkanInfo();
        
    }
}