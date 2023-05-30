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
        StringBuilder stringBuilder = new StringBuilder(); // 출력할 결과물 저장

        // BufferedReader  는 물자열 한줄로 읽으니까 공백을 기준으로 문자열을 분리해주기 위해 사용함.
        StringTokenizer stringTokenizer;
        // 명령의 수 체크하기
        int OrderNumber = Integer.parseInt(bufferedReader.readLine());

        stack = new int[OrderNumber];

    }
}
