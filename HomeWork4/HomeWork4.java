import javax.print.attribute.standard.Finishings;
import java.util.Random;
import java.util.Scanner;

/**
 * Java 1. Home Work #4
 *
 * @author Viktoriya Kalachinskaya
 * @version 23.02.2022
 */

class TicTacToe {
    Random random;
    Scanner scanner;
    char [][] table;
    int SIZE = 3;

    public static void main (String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[SIZE][SIZE];
    }
    void  game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (checkWin('x')) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();
            printTable();
            if (checkWin('o')) {
                System.out.println("AI WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER!");
        printTable();
    }
    void initTable() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                table[x][y] = '.';
            }
        }
    }
    void printTable() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1..3]:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = 'x';
    }
    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        table[x][y] = 'o';
    }
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == '.';
    }
    boolean checkWin(char ch) {
        //
        for (int i = 0; i < SIZE; i++) {
            if ((table[i][0] == ch && table[i][i] == ch && table[i][2] == ch) ||
                    (table[0][i] == ch && table[i][i] == ch && table[2][i] == ch))
                return true;
        }
        //
        if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) ||
                (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch)) {
                return true;
        }
        return false;
    }
    boolean isTableFull() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (table[x][y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}
