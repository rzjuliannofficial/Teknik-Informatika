package WEEK7.cobasendiri;

public class pecahString {
        public static void main(String[] args) {
            String nama = "Julian";
    
            // Menggunakan toCharArray
            char[] karakter = nama.toCharArray(); //ini akan mengubah string menjadi array karakter
            for (char c : karakter) {
                System.out.print(c + " ");
            }
    
            // Atau, menggunakan loop
            System.out.println(); // Baris baru
            for (int i = 0; i < nama.length(); i++) {
                System.out.print(nama.charAt(i) + " ");
            }
        
    }
}
