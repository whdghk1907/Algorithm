package Programmers.Level2.FibonacciSequences;

public class FibonacciSequences {
    public int fibonacciSequences(int given) {
        int[] result = new int[given + 1];
        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i <= given; i++) {
            result[i] = (result[i - 1] + result[i - 2]) % 1234567;
        }

        return result[given];
    }
}
