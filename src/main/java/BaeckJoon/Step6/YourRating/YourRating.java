package BaeckJoon.Step6.YourRating;

import java.util.Scanner;

public class YourRating {

    static double creditsNum = 0;
    static double ratingNum = 0;
    static double creditsAverage = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 19 ; i++) {
            String line = scanner.nextLine();
            lineRating(line);
        }
        double average = creditsAverage / creditsNum;
        System.out.printf("%.6f\n", average);



    }
    public static void lineRating(String line){
        String[] lineArray = line.split(" ");
        String credits = lineArray[1] ;
        String rating = lineArray[2];
        double thisRatingNum = 0;

        if(rating != "P"){

            switch (rating){
                case "A+" :
                    thisRatingNum = 4.5;
                    break;
                case "A0" :
                    thisRatingNum = 4.0;
                    break;
                case "B+" :
                    thisRatingNum = 3.5;
                    break;
                case "B0" :
                    thisRatingNum = 3.0;
                    break;
                case "C+" :
                    thisRatingNum = 2.5;
                    break;
                case "C0" :
                    thisRatingNum = 2.0;
                    break;
                case "D+" :
                    thisRatingNum = 1.5;
                    break;
                case "D0" :
                    thisRatingNum = 1.0;
                    break;
                case "F" :
                    thisRatingNum = 0.0;
                    break;
            }
            creditsNum = creditsNum + Double.parseDouble(credits);
            creditsAverage = creditsAverage + (Double.parseDouble(credits) * thisRatingNum);
        }
    }
}
