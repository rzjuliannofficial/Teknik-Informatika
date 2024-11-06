import java.util.Scanner;
public class modifikasiSearchNilai17 {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int key=0 , hasil = 0 ,bnykInput;

        System.out.print("Masukkan banyak nilai yang akan diinput: ");
        bnykInput = sc.nextInt();
        int arrayNilai[] = new int[bnykInput];

        
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrayNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();
        
        for (int i = 0; i < arrayNilai.length; i++) {
            if (key == arrayNilai[i]) {
                hasil = i+1;
                break;
            }
        }
        if (hasil!=0) {
            System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        
        System.out.println();
        sc.close();
    }
}


