package stack.Step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Stack {
    public static  int[] stack;
    public static int size = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();


        StringTokenizer stringTokenizer;
        int OrderNumber = Integer.parseInt(bufferedReader.readLine());
        stack = new int[OrderNumber];

        while (OrderNumber--> 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            switch (stringTokenizer.nextToken()) {
                case "push":
                    stack[size++] = Integer.parseInt(stringTokenizer.nextToken());
                    break;
                case "pop":
                    if(size == 0) {
                        stringBuilder.append("-1").append('\n');
                    } else {
                        stringBuilder.append(stack[size - 1]).append('\n');
                        size--;
                    }
                    break;
                case "size":
                    stringBuilder.append(size).append('\n');
                    break;
                case "empty":
                    if(size == 0) {
                        stringBuilder.append("1").append('\n');
                    } else {
                        stringBuilder.append("0").append('\n');
                    }
                    break;
                case "top":
                    if(size == 0) {
                        stringBuilder.append("-1").append('\n');
                    } else {
                        stringBuilder.append(stack[size - 1]).append('\n');
                    }
                    break;
            }
        }
        System.out.println(stringBuilder);
        }





    }

