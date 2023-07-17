package Step7.MatrixAdd;

import java.util.Scanner;
public class MatrixAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        StringBuilder matrixValue = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixValue.append(matrix1[i][j] + matrix2[i][j]).append(" ");
            }
            matrixValue.append("\n");
        }

        System.out.println(matrixValue.toString());
    }
}
