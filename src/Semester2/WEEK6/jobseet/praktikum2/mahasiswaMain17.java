package WEEK6.jobseet.praktikum2;

public class mahasiswaMain17 {
    public static void main(String[] args) {
        mahasiswaBerprestasi17 list = new mahasiswaBerprestasi17();
        mahasiswa17 m1 = new mahasiswa17("123", "Zidan", "2A", 2);
        mahasiswa17 m2 = new mahasiswa17("124", "Ayu", "2A", 1);
        mahasiswa17 m3 = new mahasiswa17("125", "Sinta", "2A", 3.6);
        mahasiswa17 m4 = new mahasiswa17("126", "Julian", "2A", 3.9);
        mahasiswa17 m5 = new mahasiswa17("127", "Meyi", "2A", 3.8);
    
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
        System.out.println();
        
        System.out.println("Data Mahasiswa setelah sorting menggunakan selection sort IPK (ASC) : ");
        list.selectionSort();
        list.tampil();
        System.out.println();

        System.out.println("Data Mahasiswa setelah sorting menggunakan insertion sort IPK (ASC) : ");
        list.insertionSort();
        list.tampil();

    }
}
