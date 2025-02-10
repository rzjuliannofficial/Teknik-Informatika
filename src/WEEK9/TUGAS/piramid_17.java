package WEEK9.TUGAS;


public class piramid_17 {
    public static void main(String[] args) {
     
        int n = 6;  
        
       
        for (int i = 1; i <= n; i++) {
            for (int spasi = n; spasi > i; spasi--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1 ); j++) {
                System.out.print("*");
                
            
            }
            System.out.println(); 
        }
    }
}
    
