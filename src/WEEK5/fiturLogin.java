import java.util.Scanner;

public class fiturLogin {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String username1, password1, username2, password2 ;
    //create akun
    System.out.println("PEMBUATAN AKUN LOGIN");
    System.out.print("Masukkan Username: ");
    username1 = sc.nextLine();
    System.out.print("Masukkan Password: ");
    password1 = sc.nextLine();
    System.out.println("PEMBUATAN AKUN BERHASIL");
    System.out.println("===================");

    //login
    System.out.println("LANDING PAGE LOGIN");
    System.out.print("Masukkan Username: ");
    username2 = sc.nextLine();
    System.out.print("Masukkan Password: ");
    password2 = sc.nextLine();

    if (username1.equals(username2) && password1.equals(password2)) {
        System.out.println("Anda berhasil login");
    } else {
        System.out.println("Input username atau password anda salah");
        
    }


    sc.close();

    }
}
