package Step6.CroatianAlphabet;

import java.util.Scanner;

public class CroatianAlphabet {
    private static String input;
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        //크로아티아 알파벳의 종류 배열로 담음
        String[] CroatianAlphbet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};


        for (int i = 0; i < CroatianAlphbet.length; i++){
            // 크로아티아 알파벳이 input에 포함되어 있으면 !로 바꿈
            if(input.contains(CroatianAlphbet[i])){
                input = input.replace(CroatianAlphbet[i], "!");
            }
        }

        System.out.println(input.length());



    }


}
