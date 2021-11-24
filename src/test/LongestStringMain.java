package test;

import java.util.Arrays;
import java.util.Locale;

public class LongestStringMain {
    public static void main(String[] args) {
        String[] input1 = {"Marry Mathew", "Williams", "Abraham Downey", "Jennifer kingsley", "wilson"};
        int output = (longestStringOfArray(input1));
        System.out.println("\nThe Length of Longest String is : " + output);
        for (int j = 0; j <= input1.length-1; j++) {
if((input1[j].length())==output){
    System.out.println("The Longest String Name is : " + ((input1[j])));
        }
    }
    }
    public static int longestStringOfArray(String[] list) {
        int index = 0;
        int max = 0;
        int arrLen = 0;
        for (String x : list) {
            arrLen = x.length();


            if (arrLen > max) {
                max = arrLen;

            }
            index++;
            System.out.println("String " +index +" in the list is : " +x);
            System.out.println("String " +index +" length is : " +arrLen);
        }
            return (max);

        }}





