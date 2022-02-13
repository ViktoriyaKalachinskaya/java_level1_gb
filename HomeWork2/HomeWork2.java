/**
 * Java 1. Home Work #2
 *
 * @author Viktoriya Kalachinskaya
 * @version 14.02.2022 01:42
 */


public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(checkSumBetween (15,6, 10, 20 ) );
        System.out.println();
        isPositiveOrNegative(7);
        isPositiveOrNegative(0);
        isPositiveOrNegative(-2);
        System.out.println();
        System.out.println(isNegative(-2));
        System.out.println();
        printWordNTimes("hello", 4);

    }

    static boolean checkSumBetween(int a, int b, int min, int max) {
        int sum = a + b;
        return (sum >= min && sum <= max);
    }

    static void isPositiveOrNegative(int x) {
        System.out.println(x < 0 ? "negative" : "positive");
    }

    static boolean isNegative(int x) {
        return x < 0;
    }
    static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
