package Semester3.PBO.WEEK10.Percobaan4;
import Semester3.PBO.WEEK10.Percobaan1.*; //import semua file dari Percobaan1

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill); // Baris 7: pay untuk eBill
        System.out.println("----------");
        
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp); // Baris 11: pay untuk pEmp
        System.out.println("\n");
        
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp); // Baris 15: show pEmp info
        System.out.println("\n");
        
        ow.showMyEmployee(iEmp); // Baris 17: show iEmp info
    }
}
