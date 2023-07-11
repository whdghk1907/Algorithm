package Step6.GroupWordCheck;

import java.util.Scanner;

public class GroupWordCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < input; i++){
            String word = scanner.next();
            if(checkGroupWord(word)){
                count ++;
            }
        }
        System.out.println(count);
    }

    public static boolean checkGroupWord(String word) {
        int wordLength = word.length();
        for(int i = 0; i < wordLength; i++) {
            char alphabet = word.charAt(i);
               int index = word.indexOf(alphabet);
               int lastIndex = word.lastIndexOf(alphabet);
               if(index != lastIndex) {
                    for(int j = index; j < lastIndex; j++) {
                        if(word.charAt(j) != alphabet) {
                            return false;
                        }
                    }
               }
        }
        return true;
    }

}
