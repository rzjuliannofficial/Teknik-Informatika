package WEEK9.TUGAS;

public class tugas1 {
    public static void main(String[] args) {
        
    int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
                //untuk membuat kotak dengan bolong ditengah
                // if (i==1 || i==n || j==1 || j==n) {
                
                // if ( i==j || j==n-i+1 ) { //untuk membuat  garis diagonal(X)
                                            //untuk cara membaca // jika i==j maka print. jadi akan terbentuk garis diagonal dr kiri atas ke kanan bawah
                                            //untuk cara membaca // jika  j==n-i+1 maka print. jadi akan terbentuk garis diagonal dr kanan atas ke kiri bawah
                
                //jika digabungkan 
                if (i==1 || i==n || j==1 || j==n || i==j || j<=n-i +1 || j>i ) {
                    
                    System.out.print("5 ");
                }else {
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
}
