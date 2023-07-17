package Step7.VerticalRead;

import java.util.Scanner;

public class VerticalRead {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int verticalLine = 5;
        String[][] matrix = new String[verticalLine][];
        String value = "";

        int horizontalLine = 0;
        for (int i = 0; i < verticalLine; i++) {
            String input = scanner.next();
            matrix[i] = new String[input.length()];
            for (int j = 0; j < input.length(); j++) {
                matrix[i][j] = String.valueOf(input.charAt(j));
            }
            if (input.length() > horizontalLine) {
                horizontalLine = input.length();
            }
        }

        for (int i = 0; i < horizontalLine; i++) {
            for (int j = 0; j < verticalLine; j++) {
                if (i < matrix[j].length) {
                    value += matrix[j][i];
                }
            }
        }

        System.out.println(value);
    }
}
