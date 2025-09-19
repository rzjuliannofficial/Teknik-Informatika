package Semester3.PBO.WEEK4.RelasiClass.Percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor19 proc = new Processor19("Intel i5", 3);
        Laptop19 laptop = new Laptop19("Asus", proc);

        laptop.info();
    }
}
