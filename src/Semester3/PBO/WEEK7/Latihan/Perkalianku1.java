package Semester3.PBO.WEEK7.Latihan;

public class Perkalianku1 {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
    
    void perkalian(int a, int b, int c){
        System.out.println(a * b * c);
    }
    
    public static void main(String args[]){
        Perkalianku1 objek = new Perkalianku1();
        objek.perkalian (25, 43);
        objek.perkalian (34, 23, 56);
    }
}
