package WEEK10;

import java.util.Scanner;

public class tugas3_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu[] = {"Nasi Goreng", "Mie Goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("Menu yang tersedia :");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
        
        System.out.println();
        System.out.print("Masukkan menu yang akan dipesan: ");
        String key =   sc.nextLine();

        boolean found = false;
        for (String pilihan : menu) {
          if (pilihan.equalsIgnoreCase(key)) {
            found = true;
          break;
          }
        }
        if (found) {
            System.out.println("makanan tersebut tersedia.");
        } else {
            System.out.println("makanan yang dicari tidak ada di menu.");
        }

       sc.close();
    }
}
