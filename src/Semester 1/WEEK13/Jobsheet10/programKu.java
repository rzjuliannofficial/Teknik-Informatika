package WEEK13.Jobsheet10;

public class programKu {
    public static void tampilHinggaKei(int i) {
        for (int j = 1; j < i; j++) {
            System.out.println(j);
        }
    }

    public static int jumlah (int bil1, int bil2) {
        return bil1 + bil2;
    }
    
    public static void TampilJumlah (int bil1, int bil2) {
        tampilHinggaKei(jumlah(bil1, bil2));
    }
    
    public static void main(String[] args) {
        int temp = jumlah(1, 1);
        TampilJumlah(temp, 5);
    }

    
}
