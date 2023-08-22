package Programmers.Level2.JadenCase;

public class JadenCase {
    public String toJaden(String givenWord) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean isCapitalized = true;

        for (char given : givenWord.toCharArray()) {
            if (Character.isWhitespace(given)) {
                stringBuilder.append(given);
                isCapitalized = true;
            } else {
                if (isCapitalized) {
                    stringBuilder.append(Character.toUpperCase(given));
                    isCapitalized = false;
                } else {
                    stringBuilder.append(Character.toLowerCase(given));
                }
            }
        }
        return stringBuilder.toString();
    }
}
