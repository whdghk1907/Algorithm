package Programmers.Level2.RepresentingNumbers;

public class RepresentingNumbers {

    public int representingNumbers(int givenNumber) {
        int count = 0;
        int temp = 0;

        for(int i = 1; i <= givenNumber; i++) {
            temp = 0;

            for(int j = i; j <= givenNumber; j++) {
                temp += j;

                if (temp == givenNumber) {
                    count ++;
                    break;
                }

                else if (temp > givenNumber) {
                    break;
                }
            }
        }

        return count;
    }
}
