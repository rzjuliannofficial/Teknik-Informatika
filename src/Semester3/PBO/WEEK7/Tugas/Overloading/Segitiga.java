package Semester3.PBO.WEEK7.Tugas.Overloading;

import java.lang.Math;

public class Segitiga {
    private int sudut; // Atribut -sudut:int

    // Method Overloading 1: totalSudut(sudutA:int)
    // Menghitung total sudut sisa (180 - sudutA)
    public int totalSudut(int sudutA) {
        // rumus: sudut = 180 - sudutA
        return 180 - sudutA;
    }

    // Method Overloading 2: totalSudut(sudutA:int, sudutB:int)
    // Menghitung total sudut sisa (180 - (sudutA + sudutB))
    public int totalSudut(int sudutA, int sudutB) {
        // rumus: sudut = 180 - (sudutA + sudutB)
        return 180 - (sudutA + sudutB);
    }

    // Method Overloading 3: keliling(sisiA:int, sisiB:int, sisiC:int)
    // Menghitung keliling segitiga sembarang (sisiA + sisiB + sisiC)
    public int keliling(int sisiA, int sisiB, int sisiC) {
        // rumus: keliling = sisiA + sisiB + sisiC
        return sisiA + sisiB + sisiC;
    }

    // Method Overloading 4: keliling(sisiA:int, sisiB:int)
    // Menghitung keliling segitiga siku-siku (asumsi sisiA dan sisiB adalah sisi tegak)
    // Mencari sisi miring (c = sqrt(a^2 + b^2))
    public double keliling(int sisiA, int sisiB) {
        // rumus: c = sqrt(a^2 + b^2)
        double sisiC = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        // Keliling adalah sisiA + sisiB + sisiC
        return sisiA + sisiB + sisiC;
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        // Testing totalSudut Overloading
        System.out.println("--- totalSudut Overloading ---");
        System.out.println("Total Sudut (1 sudut diketahui): " + s.totalSudut(60));
        System.out.println("Total Sudut (2 sudut diketahui): " + s.totalSudut(30, 90));

        // Testing keliling Overloading
        System.out.println("\n--- keliling Overloading ---");
        System.out.println("Keliling (3 sisi diketahui - int): " + s.keliling(10, 15, 20));
        System.out.printf("Keliling (2 sisi siku-siku - double): %.2f\n", s.keliling(3, 4));
    }
}