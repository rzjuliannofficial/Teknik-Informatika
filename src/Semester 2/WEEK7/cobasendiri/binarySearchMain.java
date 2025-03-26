package WEEK7.cobasendiri;
import WEEK7.cobasendiri.binarySearch; // Import kelas binarySearch
public class binarySearchMain {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 8; // Elemen yang dicari

        // Membuat objek dari kelas binarySearch
        binarySearch bs = new binarySearch();
        System.out.println(bs.binarySearch(arr, target));


    }
}