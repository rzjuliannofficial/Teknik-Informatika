package WEEK9.TUGAS;

public class piramid17_int {
    
    public static void main(String[] args) {
        
        int n = 5;
        
        //jika menggunakan ascii,  maka tidak perlu menggunakan for loop, jadi h=angka huruf
        int h = 97;
        char c = (char)h; // casting untuk mengubah integer menjadi char
 
            for (int i = 1; i <= n ; i++) {
                
                for (int space = n; space > i; space--) {
                System.out.print(" ");
                }

                for (int j = 1; j <= (i * 2 - 1) ; j++) {
                    System.out.print(c);
                    
                    //menggunakan kondisi agar terus  berubah huruf
                    if (c <= 122) {
                        c++;
                    }
                }
                System.out.println();
            }
        }
       
 }


