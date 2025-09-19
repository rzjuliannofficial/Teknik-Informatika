package Semester3.PBO.WEEK4.RelasiClass.Percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor19 proc = new Processor19("Intel i5", 3);
        Laptop19 laptop = new Laptop19("Asus", proc);

        laptop.info();
        System.out.println();
        
        //--
        Processor19 proc1 = new Processor19();
        proc1.setMerk("Intel i5");
        proc1.setCache(4);

        Laptop19 laptop1 = new Laptop19();
        laptop1.setMerk("Thinkpad");
        laptop1.setProc(proc1);
        laptop1.info();

    }
}
