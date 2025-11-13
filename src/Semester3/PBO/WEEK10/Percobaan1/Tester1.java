package Semester3.PBO.WEEK10.Percobaan1;

public class Tester1 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee ("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee ("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        
        Employee e;
        Payable p;
        
        // Baris 10:
        e = pEmp; 
        // Baris 11:
        e = iEmp;
        // Baris 12:
        p = pEmp;
        // Baris 13:
        p = eBill;
    }
}
