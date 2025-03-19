package WEEK6.jobseet.praktikum1;

public class sortingMain17 {
    public static void main(String[] args) {
        int a[] = {20, 10 , 2 , 7 , 12};
        int b[] = {30, 20 , 2 , 8 , 14};
        int c[] = {40, 10 , 4 , 9 , 3};
        int d[] = {10, 30, 20 , 50, 40};

        sorting17 dataUrut1 = new sorting17(a, a.length); //objek untuk memanggil file sorting17
        sorting17 dataUrut2 = new sorting17(b, b.length);
        sorting17 dataUrut3 = new sorting17(c, c.length);
        sorting17 dataUrut4 = new sorting17(d, d.length);

        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan Bubble Sort (ASC)");
        dataUrut1.tampil();
        System.out.println();

        System.out.println("Data awal 2");
        dataUrut2.tampil();
        dataUrut2.selectionSort();
        System.out.println( "Data sudah diurutkan dengan Selection Sort (ASC)");
        dataUrut2.tampil();
        System.out.println();
        
        System.out.println("Data awal 3");
        dataUrut3.tampil();
        dataUrut3.insertionSort();
        System.out.println( "Data sudah diurutkan dengan Insertion Sort (ASC)");
        dataUrut3.tampil();
        System.out.println();
        
        System.out.println("Data awal 4");
        dataUrut4.tampil();
        dataUrut4.insertionSortDESC();
        System.out.println( "Data sudah diurutkan dengan Insertion Sort (DESC)");
        dataUrut4.tampil();
        System.out.println();
        
        
    }
    
}
