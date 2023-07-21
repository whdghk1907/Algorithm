package BaeckJoon.Step7.MaxValue;

import java.util.Scanner;

public class MaxValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[9][9];

        int maxValue = 0;
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < 9; ++i) {
            for(int j = 0; j < 9; ++j) {
                if(matrix[i][j] >= maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i + 1;
                    maxColumn = j + 1;
                }
            }
        }

        System.out.println(maxValue);
        System.out.println(maxRow + " " + maxColumn);

    }
}
