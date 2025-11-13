package Semester3.PBO.WEEK10.Percobaan2;

import Semester3.PBO.WEEK10.Percobaan1.*; //import semua file dari Percobaan1

public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee ("Dedik", 500);
        Employee e;
        
        System.out.println(""+pEmp.getEmployeeInfo()); // Baris 7
        
        e = pEmp; // Baris 8
        System.out.println(""+e.getEmployeeInfo()); // Baris 10
    }
}