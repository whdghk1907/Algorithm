package Step5.Constant;

import java.util.Scanner;
public class Constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] results = flipAndConvertToArray(a);
        a = flipNumeric(results);

        int[] resultsForB = flipAndConvertToArray(b);
        b = flipNumeric(resultsForB);

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static int flipNumeric(int[] results) {
        int result = 0;

        for (int i = 0; i < results.length; i++) {
            int digits = 1;
            for (int j = i + 1; j < results.length; j++) {
                digits *= 10;
            }
            result += results[i] * digits;
        }
        return result;
    }

    public static int[] flipAndConvertToArray(int a) {
        int[] results = new int[3];
        int index = 0;

        while (a > 0) {
            results[index] = a % 10;
            a /= 10;
            index++;
        }
        return results;
    }
}
