package Semester3.PBO.WEEK2.Percobaan3;

public class TestBarang19 {
    public static void main(String[] args) {
        Barang19 brg1 = new Barang19();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        //menampilkan dan mengisi argumen untuk menambahkan stock barang
        System.out.println("Stok Baru adalah "+ brg1.tambahStok(20));
    }    
}
