package Semester3.PBO.WEEK1;

import WEEK9.TUGAS.piramid17_int;

public class sepeda_Demo {
    public static void main(String[] args) {
        
        // buat dua buah objek sepeda
        sepeda spd1 = new sepeda();
        sepeda spd2 = new sepeda();

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
    }
}
