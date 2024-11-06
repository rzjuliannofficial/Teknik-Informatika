public class ArrayTerbalik { 
    public static void main(String[] args) {
        // Membuat array dengan 10 elemen
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Isi array secara terbalik:");

        // Menampilkan isi array secara terbalik
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
