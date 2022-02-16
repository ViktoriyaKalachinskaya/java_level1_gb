import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Java 1. Home Work #3
 *
 * @author Viktoriya Kalachinskaya
 * @version 16.02.2022 02:00
 */


public class HomeWork3 {

    public static void main(String[] args) {
        // Задание 1
        int[] arr = { 1, 0, 0, 1, 1, 0, 0, 1 };
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        invertArray(arr);
        System.out.println("Модифицированный массив: " + Arrays.toString(arr));
        System.out.println();
        // Задание 2
        int[] arr2 = new int[100];
        fillArray(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println();
        // Задание 3
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Исходный массив: " + Arrays.toString(arr3));
        multiplyArraysElements(arr3);
        System.out.println("Модифицированный массив: " + Arrays.toString(arr3));
        System.out.println();
        // Задание 4
        int[][] arr4 = new int[3][3];
        fillDiagonal(arr4);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Задание 5
        System.out.println(Arrays.toString(createArray(5, 7)));
    }

    static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case (0) -> arr[i] = 1;
                case (1) -> arr[i] = 0;
            }
        }

    }

    static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    static void multiplyArraysElements (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    static void fillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
    }

    static int[] createArray(int len, int initialValue) {
        int[] result = new int[len];
        Arrays.fill(result, initialValue);
        return result;
    }
}