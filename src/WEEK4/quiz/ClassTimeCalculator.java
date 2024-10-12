

        import java.util.Scanner;

public class ClassTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("PROGRAM MENGHITUNG JAM KULIAH");
        
        // Input current time
        System.out.print("masukkan jam saat ini: ");
        int currentHour = scanner.nextInt();
        System.out.print("masukkan menit saat ini: ");
        int currentMinute = scanner.nextInt();
        
        // Display current time
        System.out.println("jam saat ini :  " + currentHour+ ":" + currentMinute);
        
        // Input class start time
        System.out.print("masukkan jam masuk kuliah: ");
        int classHour = scanner.nextInt();
        System.out.print("masukkan menit masuk kuliah: ");
        int classMinute = scanner.nextInt();
        
        // Display class start time
        System.out.printf("jam kuliah anda dimulai : %02d:%02d\n", classHour, classMinute);
        
        // Calculate time difference
        int totalCurrentMinutes = currentHour * 60 + currentMinute;
        int totalClassMinutes = classHour * 60 + classMinute;
        
        int jam = totalClassMinutes-totalCurrentMinutes;
        int jamTotal = jam/60 ; 
        int menitTotal = jam %60;
        System.out.println("sisa waktumu : " +jamTotal +"jam"+menitTotal+"menit");
        
        
        
        scanner.close();
    }
}

