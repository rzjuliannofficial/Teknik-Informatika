package WEEK13.Jobsheet10;

import java.util.Scanner;
public class kubus17 {
    //fungsi untuk menghitung volume kubus
    public static int volumeKubus (int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    //fungsi untuk menghitung luas permukaan kubus
    public static int luasPermukaanKubus (int sisi) {
        int luas = 6 * (sisi * sisi);
        return luas;
    }
    //fungsi Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sisi, volume , luarPermukaanKubus;
        System.out.print("Masukkan sisi kubus : ");
        sisi = sc.nextInt();

        volume = volumeKubus(sisi);
        System.out.println("Volume kubus: " + volume);
        luarPermukaanKubus = 6 * (sisi * sisi);
        System.out.println("Luas permukaan kubus : "+luarPermukaanKubus);

        sc.close();
    }
}
