package WEEK6.jobseet.praktikum2;

public class mahasiswa17 {
    String nama, nim , kelas;
     public double ipk; //variabel ipk di set public agar bisa di akses dari luar class

    //konstruktor default
    mahasiswa17(){

    }
    
    //konstruktor menggunakan public agar bisa di akses beda folder/ package , karena aku ingin menggunakan pada file modifikasi
    //konstruktor berparameter
    public mahasiswa17(String nama, String nim, String kelas , double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi(){
        System.out.println("Nama: "+nama);
        System.out.println("Nim: "+nim);
        System.out.println("Kelas: "+kelas);
        System.out.println("Ipk: "+ipk);
    }
}
