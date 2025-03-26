package WEEK6.jobseet.latihanPraktikum;

public class dataDosen17 {
    int pria = 0, wanita = 0;
    int totalUsiaPria, rata2Pria;
    int totalUsiaWanita, rata2Wanita;
    
    //karena kita data nya diisi manual kita tidak perlu membutuhkan kontraktor default
    //Kontraktor untuk data dosen
    // public Datadosen17(){

    // }

    void dataSemuaDosen(dosen17[]arrDosen) { //memanggil array of object
        //TIDAK MENGGUNAKAN PUBLIC karena 
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
        
        rata2Pria = totalUsiaPria / pria ;
        rata2Wanita = totalUsiaWanita / wanita;
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