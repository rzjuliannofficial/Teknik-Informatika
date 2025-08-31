package Semester3.PBO.WEEK1;

public class sepeda_Demo {
    public static void main(String[] args) {
        
        // buat dua buah objek sepeda
        sepeda spd1 = new sepeda();
        sepeda spd2 = new sepeda();
        sepedaGunung spd3 = new sepedaGunung();

        // panggil method didalam objek sepeda
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        System.out.println();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
        System.out.println();
        
        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas suspension");
        spd3.cetakStatus();
    }
}


