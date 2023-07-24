package Programmers.Level2.JadenCase;

import java.util.StringTokenizer;

public class JadenCase {
    public String JadenCase(String givenWord) {
        StringTokenizer stringTokenizer = new StringTokenizer(givenWord, " ");
        StringBuilder stringBuilder = new StringBuilder();

        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();

            stringBuilder.append(toJadenSingle(token));
            stringBuilder.append(" ");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }

    public String toJadenSingle(String givenWord) {
        char[] chars = givenWord.toCharArray();

        if(!Character.isLetter(chars[0]))
            return givenWord;

        StringBuilder stringBuilder = new StringBuilder().append(Character.toUpperCase(chars[0]));

        for(int i = 1; i < chars.length; i++)
            stringBuilder.append(Character.toLowerCase(chars[i]));

        return stringBuilder.toString();
    }

}
