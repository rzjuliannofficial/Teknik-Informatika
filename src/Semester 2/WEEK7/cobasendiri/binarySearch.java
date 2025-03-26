package WEEK7.cobasendiri;

    public class binarySearch {
    
        String binarySearch(int[] arr, int target) {
            int i = 0;
            int j = arr.length - 1;
    
            while (i <= j) {
                int mid = (i + j) / 2; // Elemen tengah
                if (arr[mid] == target) {
                    return "Elemen " + target + " ditemukan di indeks " + mid;
                } else if (arr[mid] < target) {
                    i = mid + 1; // Cari di separuh kanan
                } else {
                    j = mid - 1; // Cari di separuh kiri
                }
            }
            return "Elemen " + target + " tidak ditemukan";
        }
    
}
