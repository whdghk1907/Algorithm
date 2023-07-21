package BaeckJoon.Step1.Multiplication;

import java.util.Scanner;
public class Multiplication {
    private static final int digits = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int toMultiple = sc.nextInt();
        int byMultiple = sc.nextInt();

        System.out.println(multiply(toMultiple, byMultiple));
    }

    public static int multiply(int toMultiple, int byMultiple) {
        int result = 0;

        int[] byMultipleArray = integerToArray(byMultiple);

        for (int i = digits - 1; i >= 0; i--){
            int multiple = byMultipleArray[i] * toMultiple;

            System.out.println(multiple);

            int digit = 1;
            for (int j = i; j < digits - 1; j++) {
                digit *= 10;
            }
            result += multiple * digit;
        }
        return result;
    }

    public static int[] integerToArray(int integer) {
        int[] byMultipleArray = new int[digits];
        int i = digits;

        while (integer >= 1){
            i --;
            byMultipleArray[i] = integer % 10;
            integer /= 10;
        }
        return byMultipleArray;
    }


}
