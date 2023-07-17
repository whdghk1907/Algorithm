package Step19.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Zero {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int orderNumber = Integer.parseInt(bufferedReader.readLine());

        int[] stack = new int[orderNumber];
        int sum = 0;

        /**/
        int index = 0;
        while (orderNumber-- > 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int number = Integer.parseInt(stringTokenizer.nextToken());

            if (number == 0) {
                stack[index - 1] = 0;
                index--;
            } else {
                stack[index] = number;
                index++;
            }

        }

        for (int i = 0; i < stack.length; i++) {
            sum += stack[i];
        }

        System.out.println(sum);
    }
}
