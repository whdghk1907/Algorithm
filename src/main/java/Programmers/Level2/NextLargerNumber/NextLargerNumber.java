package Programmers.Level2.NextLargerNumber;

public class NextLargerNumber {

    public int countNumber(char[] charArray) {
        int count = 0;

        for (char c : charArray) {
            if (c == '1') count ++;
        }

        return count;
    }

    public int nextLargerNumber(int givenNumber) {
        int result = 0;

        char[] givenArray = Integer.toBinaryString(givenNumber).toCharArray();
        int givenArrayNumberCount = countNumber(givenArray);

        for (int i = givenNumber + 1; i < Integer.MAX_VALUE; i++) {
            char[] nextNumber = Integer.toBinaryString(i).toCharArray();
            int nextNumberNumberCount = countNumber(nextNumber);

            if (nextNumberNumberCount == givenArrayNumberCount) {
                result = i;
                break;
            };

        }
        return result;
    }
}
