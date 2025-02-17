package WEEK9;

public class perulangan2StudiK2_WHILE {
    public static void main(String[] args) {
        
    int i=1;    
        while (i<9) {
            
            int  j=1;
            while (j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
        i++;
        }
    }
}
