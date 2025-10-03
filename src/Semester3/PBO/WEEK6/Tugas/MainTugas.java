package Semester3.PBO.WEEK6.Tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("D001", "Budi Santoso", "Jl. Mawar No. 10");
        dosen1.setJumlahSKS(12); // Dosen mengajar 12 SKS

        Dosen dosen2 = new Dosen("D002", "Ani Wijaya", "Jl. Melati No. 5");
        dosen2.setJumlahSKS(10); // Dosen mengajar 10 SKS

        // Membuat objek DaftarGaji
        DaftarGaji daftar = new DaftarGaji(5); // Kapasitas 5 pegawai

        // Menambahkan pegawai (dosen) ke daftar gaji
        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);

        // Menampilkan semua gaji pegawai
        daftar.printSemuaGaji();
    }

}
