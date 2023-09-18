package Programmers.Level3.IntegerTriangle;

public class IntegerTriangle {

    /**
     *  이동 가능한 Index = 현재 인덱스, 현재 인덱스 + 1
     */
    public int integerTriangle(int[][] triangle) {
        int result = 0;

        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    triangle[i][j] += triangle[i - 1][j];
                }
                else if (j == i) {
                    triangle[i][j] += triangle[i - 1][j - 1];
                }
                else {
                    triangle[i][j] += Math.max(triangle[i-1][j-1],triangle[i-1][j]);
                }
            }
        }

        for (int i = 0; i < triangle.length; i++) {
            result = Math.max(result, triangle[triangle.length - 1][i]);
        }

        return result;
    }
}
