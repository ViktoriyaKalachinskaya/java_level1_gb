public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        System.out.println();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();
    };
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 10;
        int b = 5;
        int c = a + b;
        if (c >= 0) {
            System.out.println("The amount is positive");
        } else {
            System.out.println("The sum is negative");
        }
    }
    private static void printColor() {
        int value = 130;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }
    private static void compareNumbers() {
        int a = 142, b = -15;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println(a < b);
    }
}
