package test;

import java.util.Arrays;

public class AverageMain {

    public static double averageOfArray(double[] inputArray) {

        double[] averageInputArray = inputArray;
        System.out.println("The input array is :"+ Arrays.toString(averageInputArray));
        int length= averageInputArray.length;
        System.out.println("The length of input array is :"+length);
        double max = 0;
        double sum=0;
        for (double x : averageInputArray) {

            sum = x + max;
            max = sum;
        }
        System.out.println("The Sum of input array is :" +sum);
        return (sum/length);
    }}

