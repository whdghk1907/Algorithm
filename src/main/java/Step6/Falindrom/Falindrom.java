package Step6.Falindrom;

import java.util.Scanner;

public class Falindrom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isFalindrom(input)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static boolean isFalindrom(String input) {
        int length = input.length();
        int halfLength = length / 2;

        for (int i = 0; i < halfLength; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
