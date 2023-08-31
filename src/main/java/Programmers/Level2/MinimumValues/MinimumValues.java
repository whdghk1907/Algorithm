package Programmers.Level2.MinimumValues;

import java.util.Arrays;

public class MinimumValues {

    public int minimun(int []A, int []B) {
        int result = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            result += (A[i] * B[A.length - (i + 1)]);
        }

        return result;
    }
}
