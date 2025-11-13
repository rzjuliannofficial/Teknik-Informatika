package Semester3.PBO.WEEK10.Percobaan3;
import Semester3.PBO.WEEK10.Percobaan1.*;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee ("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        
        // Baris 8:
        Employee e[] = {pEmp, iEmp};
        // Baris 9:
        Payable p[] = {pEmp, eBill};
        // Baris 10 (Error):
        // Employee e2[] = {pEmp, iEmp, eBill}; 
    }
}
