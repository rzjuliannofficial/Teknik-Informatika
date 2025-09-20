package Semester3.PBO.WEEK4.RelasiClass.Percobaan3;

public class MainPertanyaan {

    public static void main(String[] args) {
        
        Pegawai19 masinis = new Pegawai19("1234", "Spongebob Squarepants");
        KeretaApi19 keretaApi = new KeretaApi19("Gaya Baru", "Bisnis", masinis);
        System.out.println(keretaApi.info());
    }
}