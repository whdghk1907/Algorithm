package Step19.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack {
    public static  int[] intArr;
    public static int index = 0;

    public Stack(int size) {
        intArr = new int[size];
    }

    public void push(int number) {
        intArr[index++] = number;
    }
    public int pop() {
        if(index != 0) {
            int arrTop = intArr[0];


            index--;
            return arrTop;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int orderNumber = Integer.parseInt(bufferedReader.readLine());
        Stack stack = new Stack(orderNumber);

        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;


        // 이거 설마 복붙이나 ChatGPT 아니죠?
        while(orderNumber --> 0) {

            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            String commandWord = stringTokenizer.nextToken();
            int nextNumber = Integer.parseInt(stringTokenizer.nextToken());

            if(commandWord.equals("push")) {
                stack.push(nextNumber);
            }

            // switch 문 사용하는거 아님미다...
            switch (stringTokenizer.nextToken()) {
                case "push":
                    intArr[index++] = nextNumber;
                    break;
                case "pop":
                    if(index == 0) {
                        stringBuilder.append("-1").append('\n');
                    } else {
                        stringBuilder.append(intArr[index - 1]).append('\n');
                        index--;
                    }
                    break;
                case "size":
                    stringBuilder.append(index).append('\n');
                    break;
                case "empty":
                    if(index == 0) {
                        stringBuilder.append("1").append('\n');
                    } else {
                        stringBuilder.append("0").append('\n');
                    }
                    break;
                case "top":
                    if(index == 0) {
                        stringBuilder.append("-1").append('\n');
                    } else {
                        stringBuilder.append(intArr[index - 1]).append('\n');
                    }
                    break;
            }
        }

        }

}

