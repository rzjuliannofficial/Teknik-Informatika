package Semester3.PBO.WEEK7.Latihan;

class Ikan{
    public void swim() {
        System.out.println("Ikan bisa berenang");
    }
}

class Piranha extends Ikan{
    @Override // Tambahkan @Override untuk kejelasan
    public void swim(){
        System.out.println("Piranha bisa makan daging");
    }
}

public class Fish {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new Piranha(); // Polimorfisme (Dynamic Method Dispatch)
        a.swim(); // Memanggil Ikan.swim()
        b.swim(); // Memanggil Piranha.swim() karena overriding
    }
}
