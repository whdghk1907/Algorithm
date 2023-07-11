package Step6.CroatianAlphabet;

import java.util.Scanner;

public class CroatianAlphabet {
    private static String input;
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        String[] CroatianAlphbet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};


        for (int i = 0; i < CroatianAlphbet.length; i++){

            if(input.contains(CroatianAlphbet[i])){
                input = input.replace(CroatianAlphbet[i], "!");
            }
        }

        System.out.println(input.length());



    }


}
