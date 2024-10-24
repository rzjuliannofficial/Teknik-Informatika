package WEEK9;

public class tugas1 {
    public static void main(String[] args) {
        
    int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // if (i == 1 || i == n || j == 1 || j == n || i == n/2+1 || j == n/2+1  ) { //jka dibaca = jika baris pertama atau baris terakhir , atau kolom pertama  atau kolom
                if (i==1 ||j==1 ||j<=n-1 ) {
                    System.out.print("5 ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
