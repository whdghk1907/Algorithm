package BaeckJoon.Step5.Dials;

import java.util.Scanner;

public class Dials {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int scLength = a.length();
        int result = 0;

        for(int i = 0; i < scLength; i++) {
            char ch = a.charAt(i);
            if(ch >= 'A' && ch <= 'C') {
                result += 3;
            } else if(ch >= 'D' && ch <= 'F') {
                result += 4;
            } else if(ch >= 'G' && ch <= 'I') {
                result += 5;
            } else if(ch >= 'J' && ch <= 'L') {
                result += 6;
            } else if(ch >= 'M' && ch <= 'O') {
                result += 7;
            } else if(ch >= 'P' && ch <= 'S') {
                result += 8;
            } else if(ch >= 'T' && ch <= 'V') {
                result += 9;
            } else if(ch >= 'W' && ch <= 'Z') {
                result += 10;
            }
        }

        System.out.println(result);




    }
}
