import java.util.Scanner;

public class studiKasusBIOSKOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi array username dan password
        String username[] = new String[100];
        String password[] = new String[100];
        String newUsername ;
        String newPassword ;
        int account = 0;
        boolean verifikasi = true;

        while (true) {
            System.out.println("================================");
            System.out.println("Selamat Datang di Bioskop Julian");
            System.out.println("================================");
            System.out.println("1. Register");
            System.out.println("1. Login");
            System.out.println("1. Exit");
            System.out.println("================================");
            System.out.print("Pilih Menu: ");
            int pilih = sc.nextInt();
            sc.nextLine();
            
            if (pilih > 3 || pilih < 0) {
                System.out.println("Masukkan inputan yang benar!");
                continue;
            }
            if (pilih==1) {
                //jika account kurang dari sama dengan username.lengt maka masih bisa diinput/ register
                if (account < username.length) {//0-99
                    System.out.println("Anda masuk menu 1");
                    System.out.print("Masukkan username: ");
                    newUsername = sc.nextLine();
                    System.out.print("Masukkan password: ");
                    newPassword = sc.nextLine();
                    //menyimpan data ke array username dan password
                    username[account] = newUsername; 
                    password[account] = newPassword;
                    account++;
                }
                else {
                    System.out.println("Maaf database akun telah penuh!");
                    break;
                }
            }
            else if (pilih == 2 ) {
                System.out.print("Masukkan username: ");
                newUsername = sc.nextLine();
                System.out.print("Masukkan password: ");
                newPassword = sc.nextLine();
                
                for (int i = 0; i < account; i++) {
                    if (newUsername.equals(username[i] ) && newPassword.equals(password[i])) {
                        verifikasi = true; 
                        break;
                    }
                }
                if (verifikasi) {
                    System.out.println("Login berhasil");
                    System.out.println();
                    while (true) {
                        System.out.println("============================");
                        System.out.println("1. Pilih Film");
                        System.out.println("2. Pilih Kursi");
                        System.out.println("3. Pembayaran");
                        System.out.println("4. Kembali ke login");
                        System.out.println("5. Cetak Pembayaran");
                        System.out.println("============================");
                        System.out.print("Pilihan Anda: ");
                        int pilihan = sc.nextInt();
                        sc.nextLine();

                        if (pilihan < 0 || pilihan > 5) {
                            System.out.println("Masukkan inputan yang benar!");
                            continue;
                        }
                        if (pilihan == 1) {
                            System.out.println("Film yang tersedia");
                            System.out.println("1. Ayam Ranger");
                            System.out.println("2. Buaya Betutu");
                            System.out.println("3. Kuda Bajak Laut ");
                            System.out.print("Pilih film: ");
                            int pilihFilm = sc.nextInt();

                        }else if (pilihan == 2) {
                            
                        }else if (pilihan == 3 ) {
                            
                        }else if (pilihan == 4 ) {
                            
                        }else {
                            
                        }
                    }
                }


            }
        }
    }
}
