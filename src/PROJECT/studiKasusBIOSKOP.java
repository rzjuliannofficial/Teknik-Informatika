import java.util.Scanner;

public class studiKasusBIOSKOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi array username dan password
        String username[] = new String[100];
        String password[] = new String[100];
        int kursi[][] = new int[5][10];
        String newUsername ;
        String newPassword ;
        int account = 0;
        int totPembayaran=0;
        boolean verifikasi = false;
        String namaFilm="";
        int pesan=0;

        while (true) {
            System.out.println("================================");
            System.out.println("Selamat Datang di Bioskop Julian");
            System.out.println("================================");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
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
                if (account==0) {
                    System.out.println("Username atau password salah!");
                }
                for (int i = 0; i < account; i++) {
                    if (newUsername.equals(username[i]) && newPassword.equals(password[i])) {
                        verifikasi = true; 
                    }else {
                        System.out.println("Username atau password salah!");
                        break;
                    } 
                }
                if (verifikasi) {
                    System.out.println("Login berhasil");
                    System.out.println();
                    while (true) {
                        System.out.println("============================");
                        System.out.println("1. Pilih Film");
                        System.out.println("2. Kembali ke login");
                        System.out.println("3. Cetak Pembayaran");
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
                            if (pilihFilm>3 || pilihFilm<0) {
                                System.out.println("input an salah. Coba lagi!");
                                continue;
                            }
                            if (pilihFilm==1) {
                                namaFilm = "Ayam Ranger";
                            }else if (pilihFilm==2) {
                                namaFilm = "Buaya Betutu";
                            }else {
                                namaFilm = "Kuda Bajak Laut";
                            }
                            System.out.println("Anda memilih film "+namaFilm);
                            System.out.println();
                            System.out.print("Jumlah kursi yang ingin dipesan: ");
                            pesan = sc.nextInt();
                            if (pesan>=(kursi.length*kursi[0].length) || pesan <=0) {
                                System.out.println("Kursi yang anda pesan melebihi batas atau kurang dari 1");
                                continue;
                            }
                            
                            System.out.println("Kursi yang tersedia ");
                            for (int h = 0; h < pesan;h++) {
                                System.out.println("Bioskop");
                                for (int i = 0; i < kursi.length;i++) {
                                    for (int j = 0; j < kursi[i].length; j++) {
                                        if (kursi[i][j]==0) {
                                            System.out.print(" O ");
                                        }else {
                                            System.out.print(" X ");
                                        }
                                    }
                                    System.out.println();
                                }
                                System.out.print("pilih baris: ");
                                int pilihBaris = sc.nextInt() - 1;
                                System.out.print("pilih kolom: ");
                                int pilihKolom = sc.nextInt() - 1;
                                
                                if (pilihBaris < 0 || pilihBaris >= kursi.length || pilihKolom > kursi[1].length || pilihKolom<0) {
                                    System.out.println("Maaf inputan anda invalid! Coba lagi");
                                }else {
                                    //agar kursi yang dipilih valid
                                    if (kursi[pilihBaris][pilihKolom]==0) {
                                        kursi[pilihBaris][pilihKolom]=1;
                                        System.out.println("Kursi berhasil dipesan");
                                    }else {
                                        System.out.println("Maaf kursi sudah terisi");
                                        continue;
                                    }
                                  System.out.println();
                                }
                                System.out.println();
                            }
                            System.out.println("Anda memesan tiket untuk film : "+namaFilm);
                            System.out.println("Kursi yang telah dipesan :"+pesan);
                            System.out.println("Harga tiket : Rp. 30.000");
                            totPembayaran = pesan * 30000;
                            System.out.println("Total harga tiket : Rp. "+totPembayaran);
                        }else if (pilihan == 2) {
                            break;
                        } else {
                            System.out.println("========== Cetak Pembayaran =========");
                            System.out.println("Judul film: "+namaFilm);
                            System.out.println("Kursi dipesan: "+pesan);
                            System.out.println("Harga tiket: Rp. 30.000");
                            System.out.println("Total pembayaran: Rp. "+totPembayaran);
                            System.out.println("======================================");
                            break;
                        }
                    }
                }
            }else {
                break;
            }
        }sc.close();
    }
}
