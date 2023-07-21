package BaeckJoon.Step4.Average;

import java.io.IOException;

public class Average {
    public static void main(String[] args) throws Exception {

    }

    public static double getMaxPoint(String[] points) {
        double[] arrayInt = new double[points.length];
        double maxPoint = 0;

        for(int i = 0; i < arrayInt.length; i++){
            arrayInt[i] = Integer.parseInt(points[i]);

            if(arrayInt[i]> maxPoint) {
                maxPoint = arrayInt[i];
            }
        }
        return maxPoint;
    }

    public static double getSumPoint(String[] points) throws IOException {

        int numberCount = points.length;

        double max = getMaxPoint(points);
        double[] arrayInt = new double[numberCount];
        double sum = 0;

        for(int i = 0; i < numberCount; i++){
            arrayInt[i] = Integer.parseInt(points[i]);
            sum += arrayInt[i] / max * 100;
        }
        System.out.println(sum / numberCount);
        return sum;
    }
}

