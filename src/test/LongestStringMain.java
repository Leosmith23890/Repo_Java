package test;

import java.util.Arrays;
import java.util.Locale;

public class LongestStringMain {

    public int longestStringOfArray(String[] list) {
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





