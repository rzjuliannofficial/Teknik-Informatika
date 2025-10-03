package Semester3.PBO.WEEK6.Tugas;

public class DaftarGaji {
    Pegawai[] listPegawai;
    int people;

    public DaftarGaji(int kapasitas){
        listPegawai = new Pegawai[kapasitas];
        people = 0;
    }

    public void addPegawai(Pegawai pegawai){
        if (people < listPegawai.length) {
            listPegawai[people] = pegawai;
            people++;
        }else{
            System.out.println("Daftar gaji penuh!");
        }
    }

    public void printSemuaGaji() {
        System.out.println("Daftar Gaji Pegawai:");
        for (int i = 0; i < people; i++) {
            System.out.println("Nama: " + listPegawai[i].getNama() + ", Gaji: " + listPegawai[i].getGaji());
        }
    }
}
