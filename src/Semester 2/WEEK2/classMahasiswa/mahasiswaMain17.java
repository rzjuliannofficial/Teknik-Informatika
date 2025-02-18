package WEEK2.classMahasiswa;

public class mahasiswaMain17 {
    public static void main(String[] args) {
        
        mahasiswa17 mhs1 = new mahasiswa17(); //membuat objek mhs1 dari class mahasiswa17
    
        mhs1.nama = "SUTAM"; //mengisi nilai atribut nama
        mhs1.nim = "2341720255"; //mengisi nilai atribut nim
        mhs1.kelas = "TI 1F"; //mengisi nilai atribut kelas
        mhs1.ipk = 3.5 ; //mengisi nilai atribut ipk
        
        mhs1.tampilInformasi(); //memanggil method tampilInformasi
        System.out.println(mhs1.nilaiKinerja());
        mhs1.ubahKelas("TI 1E"); //memanggil method ubahKelas
        System.out.println();
        System.out.println("Update");
        //update
        mhs1.updateIPK(5); //memanggil method updateIPK
        mhs1.tampilInformasi();
        System.out.println();
        
        //constructor dengan parameter
        mahasiswa17 mhs2 = new mahasiswa17("YULI", "2341720255", "TI 1F", 3.5);
        mhs2.updateIPK(3.34);
        mhs2.tampilInformasi();
        
        
        
        System.out.println();
        mahasiswa17 mhsNabhanRizqiJulianSaputro = new mahasiswa17("Nabhan Rizqi Julian Saputro", "2341720255", "TI 1F", 3.5);
        mhsNabhanRizqiJulianSaputro.updateIPK(3.95);
        mhsNabhanRizqiJulianSaputro.tampilInformasi();
        

    }

    
}
