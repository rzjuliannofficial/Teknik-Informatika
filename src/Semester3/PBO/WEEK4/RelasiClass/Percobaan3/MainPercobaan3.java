package Semester3.PBO.WEEK4.RelasiClass.Percobaan3;


public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai19 masinis = new Pegawai19("1234", "Spongebob Squarepants");
        Pegawai19 asisten = new Pegawai19("4567", "Patrick Star");

        KeretaApi19 keretaApi = new KeretaApi19("Gaya Baru", "Bisnis", masinis, asisten);

        System.out.println(keretaApi.info());
    }
}

