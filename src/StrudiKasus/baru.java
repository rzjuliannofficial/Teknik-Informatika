package StrudiKasus;

import java.util.Arrays;

public class baru {
    public static void main(String[] args) {
        // int element = 10;
        // int[] array;

        // array = new int[element]; //int
        // int [] array2 = new int[element]; //deklarasi dan instansiasi

        // System.out.println(array2[10]);

        int[][] numbers = {{1, 2}, {3, 4, 5}, {6, 7}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(Arrays.toString(numbers[i]));
            }
            System.out.println();
        }
    }   
}
