package WEEK1;
import java.util.Scanner;
public class reviewDaspro {
    
    static Scanner sc = new Scanner(System.in);
    static double[] rata2 = new double[3];
    static String mhs[]= new String[3];
    static int[][] nilai = new int[mhs.length][4];
    public static void main(String[] args){
    
        nilaiMhs();
        kelulusan();
        System.out.println();

    }
    
    
    public static void nilaiMhs() {
        String kelas;
        double nilaiMhs=0;
        for (int i = 0; i < nilai.length;i++) {
            System.out.print("Masukkan nama mhs ke-"+(i+1)+":");
            mhs[i] = sc.nextLine();
            System.out.print("Masukkan kelas mhs: ");
            kelas = sc.nextLine();
            for (int j = 0; j < nilai[i].length;) {
                System.out.print("Masukkan nilai ke-"+(j+1)+": ");
                nilai[i][j] = sc.nextInt();
                if (nilai[i][j]>100 || nilai[i][j]<0) {
                    System.out.println("input invalid.");
                    continue;
                }
                sc.nextLine();
                nilaiMhs += nilai[i][j];
                j++;
            }
            System.out.println("nilai total mahasiswa: "+nilaiMhs);
            rata2[i] = nilaiMhs / nilai[i].length;
            System.out.println("rata rata nilai mahasiswa: "+rata2[i]);
            System.out.println();
            
        }
        
    }

    public static void kelulusan (){
        for (int i = 0; i < rata2.length; i++) {
            System.out.println("Mahasiswa dengan nama: "+mhs[i]);
                if (rata2[i] >= 75 ) {
                    System.out.println("Siswa dinyatakan Lulus");
                } else {
                    System.out.println("Siswa dinyatakan Gagal");
                }
              System.out.println();  
        }
    }
}
