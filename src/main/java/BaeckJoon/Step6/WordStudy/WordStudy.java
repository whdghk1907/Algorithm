package BaeckJoon.Step6.WordStudy;

import java.util.Scanner;

public class WordStudy {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        int[] alphabet = new int[26];
        int max = 0;
        int wordLength = input.length();
        String[] result = new String[wordLength];
        int maxAlphabet = 0;
        int maxIndex = 0;
        String maxAlphabetString = "";


        for (int i = 0; i < wordLength; i++) {

            int index = input.charAt(i) - 65;

            alphabet[index]++;
            if (max < alphabet[index]) {
                max = alphabet[index];
            }
        }

        for(int i = 0; i < alphabet.length; i++ ) {

            if(alphabet[i] == max) {
                maxAlphabet = i;
                maxIndex++;
                maxAlphabetString = String.valueOf((char)(maxAlphabet + 65));
            }
        }

        if (maxIndex > 1) {
            System.out.println("?");
            return;
        }else {
            System.out.println(maxAlphabetString);
            return;
        }



    }
}
