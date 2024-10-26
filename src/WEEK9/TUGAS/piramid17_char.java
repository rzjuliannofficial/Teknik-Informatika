package WEEK9.TUGAS;

public class piramid17_char{
    public static void main(String[] args) {
        char huruf = 'a'; 
        int n = 5;  
        
       
        for (int i = 1; i <= n; i++) {
            for (int spasi = n; spasi > i; spasi--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(huruf);
                
                if (huruf <= 'z') {
                    huruf++;  
                }
            }
            System.out.println(); 
        }
    }
}
