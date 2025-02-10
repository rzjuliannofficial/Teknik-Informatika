
package WEEK6;
import java.util.Scanner;
public class latihan_levelUpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int exp=0, healtPotion, manaPotion;
        

        System.out.print("Masukkan experience point anda : ");
        exp = sc.nextInt();
        System.out.print("Masukkan jumlah Healt Potion anda saat ini : ");
        healtPotion = sc.nextInt();
        System.out.print("Masukkan jumlah Mana Potion anda saat ini : ");
        manaPotion= sc.nextInt();

        if (exp<0) {
            System.out.println("Maaf exp yang anda masukkan invalid");
            sc.close();
            return;
        }
        if (exp>1000) {
            System.out.println("Selamat anda telah  Level Up!");
            System.out.println("Level 1 telah dicapai");
        }else if (exp>3000 && healtPotion>0) {
            System.out.println("Selamat anda telah  Level Up!");
            System.out.println("Level 2 telah dicapai");
        }else if (exp>5000 && healtPotion>0 &&manaPotion>0) {
            System.out.println("Selamat anda telah  Level Up!");
            System.out.println("Level 3 telah dicapai");
        }else {
            System.out.println("Tidak bisa naik level");
        }
        
        
        sc.close();
    }
}
