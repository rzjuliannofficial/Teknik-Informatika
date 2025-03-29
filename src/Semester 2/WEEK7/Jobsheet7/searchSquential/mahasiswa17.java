package WEEK7.Jobsheet7.searchSquential;
public class mahasiswa17 {
    public String nim;
    public String nama;
    public String kelas;
    public double ipk;  //variabel ipk di set public agar bisa di akses dari luar class

    public mahasiswa17(){ //constructor default

    }

    public mahasiswa17(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi(){
        System.out.println("Nama: "+nama);
        System.out.println("Nim: "+nim);
        System.out.println("Kelas: "+kelas);
        System.out.println("Ipk: "+ipk);
    }
}
