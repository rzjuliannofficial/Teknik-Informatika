package Semester3.PBO.WEEK10.Percobaan4;

import Semester3.PBO.WEEK10.Percobaan1.*; //import semua file dari Percobaan1

public class Owner {
    public void pay (Payable p){
        System.out.println("Total payment = "+p.getPaymentAmount());
        
        // Baris 6: Operator instanceof
        if(p instanceof ElectricityBill){
            // Baris 7: Downcasting
            ElectricityBill eb = (ElectricityBill) p; 
            System.out.println(""+eb.getBillInfo());
        }else if(p instanceof PermanentEmployee) {
            PermanentEmployee pe = (PermanentEmployee) p;
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    
    public void showMyEmployee (Employee e) {
        System.out.println(""+e.getEmployeeInfo());
        
        if(e instanceof PermanentEmployee) // Baris 17: Operator instanceof
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
