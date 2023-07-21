package BaeckJoon.Step19.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack {
    public static int[] stackArr;
    public static int index = 0;

    public Stack(int size) {
        stackArr = new int[size];
        index = 0;
    }

    public void push(int number) {
        stackArr[index] = number;
        index++;
    }

    public int pop() {
        if (index == 0) {
            return -1;
        }

        int arrTop = stackArr[index - 1];
        stackArr[index - 1] = 0;
        index--;

        return arrTop;
    }

    public int top() {
        if (index == 0) {
            return -1;
        }
        return stackArr[index];
    }


    public int size() {
        return index;
    }

    public int empty() {
        if (index == 0) {
            return -1;
        }
        return 0;
    }

    public int[] getIntArr() {
        return stackArr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int orderNumber = Integer.parseInt(bufferedReader.readLine());
        Stack stack = new Stack(orderNumber);

        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;

        while (orderNumber-- > 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            String commandWord = stringTokenizer.nextToken();

            if (commandWord.equals("push")) {
                int nextNumber = Integer.parseInt(stringTokenizer.nextToken());

                stack.push(nextNumber);
            }

            if (commandWord.equals("pop")) {
                stringBuilder.append(stack.pop()).append('\n');
            }

            if (commandWord.equals("size")) {
                stringBuilder.append(stack.size()).append('\n');
            }

            if (commandWord.equals("empty")) {
                stringBuilder.append(stack.empty()).append('\n');
            }

            if (commandWord.equals("top")) {
                stringBuilder.append(stack.top()).append('\n');
            }
        }

        System.out.println(stringBuilder);
    }
}

