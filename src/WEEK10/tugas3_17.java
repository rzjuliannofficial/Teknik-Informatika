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
        String key = sc.nextLine();

        String food="";
        // Mencari makanan menggunakan linear search
        //for-each loop
        for (String pilihan : menu) { //pilihan sbg var sementara untuk menampung setiap elemen dari array menu selama iterasi
          if (pilihan.equalsIgnoreCase(key)) {// Memeriksa kecocokan nama makanan tanpa memedulikan huruf kapital
            food=pilihan;
          break;
          }
        }
        if (!food.isEmpty()) {
            System.out.println("makanan "+food+" tersebut tersedia.");
        } else {
            System.out.println("makanan yang dicari tidak ada di menu.");
        }

       sc.close();
    }
}
