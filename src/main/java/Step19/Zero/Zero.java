package Step19.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Zero {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int OrderNumber = Integer.parseInt(bufferedReader.readLine());

        int[] stack = new int[OrderNumber];
        int allSum = 0;
        while (OrderNumber--> 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int number = Integer.parseInt(stringTokenizer.nextToken());
            if(number == 0) {
                //stack[--OrderNumber] = 0;
                stack[OrderNumber - 1] = 0;
            } else {
                stack[OrderNumber] = number;

            }
            System.out.println(stack[OrderNumber]);
        }
        for(int i = 0; i < stack.length; i++) {
            allSum += stack[i];
        }

        System.out.println("정답은 : "+allSum);






    }
}
