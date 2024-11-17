import java.util.Scanner;

public class tiktaktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiktak[][]= new int[3][3];
        char player ;
        int baris, kolom;
        boolean winner = false;

        System.out.println("===============================");
        System.out.println("Selamat datang di Game TikTakto");
        System.out.println("===============================");
        for (int h = 0; h < 9; ) {
            for (int i = 0; i < tiktak.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < tiktak[i].length; j++) {
                    if (tiktak[i][j]==0) {
                        System.out.print(" _ ");
                    }else if (tiktak[i][j]==1) {
                        System.out.print(" O ");
                    }else {
                        System.out.print(" X ");
                    }
                    System.out.print(" | ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Pilih O atau X");
            System.out.print("Pilihan anda: ");
            player = sc.nextLine().charAt(0);
            if (player == 'O') {
                System.out.println("pilih baris: ");
                baris = sc.nextInt();
                System.out.println("Pilih kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();
                if (baris < 1 || baris > 3 || kolom < 1 || kolom > 3) {
                    System.out.println("Inputan anda salah.Ulangi!");
                    continue;
                }
                if (tiktak[baris-1][kolom-1] == 0) {
                    tiktak[baris-1][kolom-1] = 1;
                } else {
                    System.out.println("Maaf bagian ini sudah terisi");
                    continue;
                }
                System.out.println();

            }else if (player == 'X'){
                System.out.println("pilih baris: ");
                baris = sc.nextInt();
                System.out.println("Pilih kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();
                if (baris < 1 || baris > 3 || kolom < 1 || kolom > 3) {
                    System.out.println("Inputan anda salah.Ulangi!");
                    continue;
                }
                if (tiktak[baris-1][kolom-1] == 0) {
                    tiktak[baris-1][kolom-1] = 2;
                } else {
                    System.out.println("Maaf bagian ini sudah terisi");
                    continue;
                    
                }
                System.out.println();
            }else {
                System.out.println("Maaf inputan anda salah");
                continue;
            }

            //check kemenangan
            // baris
            for (int i = 0; i < tiktak.length; i++) {
                if (tiktak[i][0] != 0 && tiktak[i][0] == tiktak[i][1] && tiktak[i][1]== tiktak[i][2]) {
                    winner = true;
                    break;
                }
            } 
            //kolom
            for (int i = 0; i < tiktak.length; i++) {
                if (tiktak[0][i] != 0 && tiktak[0][i] == tiktak[1][i] && tiktak[1][i]== tiktak[2][i]) {
                    winner = true;
                    break;
                }
            }
            //diagonal kiri atas --> kanan bawah 
            if (tiktak[0][0] != 0 && tiktak[0][0] == tiktak[1][1] && tiktak[1][1]== tiktak[2][2]) {
                winner = true;
                break;
            }
            //diagonal kanan atas --> kiri bawah
            if (tiktak[0][2] != 0 && tiktak[0][2] == tiktak[1][1] && tiktak[1][1]== tiktak[2][0]) {
                winner = true;
                break;
            }
            if (winner) {
                System.out.println("Pemain " + player + " menang!");
                break;
            }
            h++;
            //jika tidak ada kemenangan maka bermain lagi
        }
        if (!winner) {
            System.out.println("SERI");
        }
    }
}
