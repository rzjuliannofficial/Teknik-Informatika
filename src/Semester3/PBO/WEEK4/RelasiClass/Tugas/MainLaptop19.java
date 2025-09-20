package Semester3.PBO.WEEK4.RelasiClass.Tugas;

public class MainLaptop19 {
    public static void main(String[] args) {
        Processor19 proc1 = new Processor19("AMD RYZEN 7", 8);
        Layar19 layar1 = new Layar19("Acer", "2K");
        Battery19 battery1 = new Battery19("Li-Ion", 65);
        Laptop19 laptop1 = new Laptop19("Acer Nitro 5", proc1, layar1, battery1);

        System.out.println(laptop1.info());
    }
}
