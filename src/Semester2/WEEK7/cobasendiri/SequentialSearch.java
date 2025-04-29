package WEEK7.cobasendiri;

public class SequentialSearch {
    public static String sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return "Elemen " + target + " ditemukan di indeks " + i;
            }
        }
        return "Elemen " + target + " tidak ditemukan";
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sequentialSearch(data, 11));  // Output: Elemen 7 ditemukan di indeks 6
        
        //tidak masuk materi
        String nama = "Julian";
        String nim = "2341720255";
        System.out.println(nim.length()); // Output: 6
    }
}
