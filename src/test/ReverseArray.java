package test;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] input1 = {4, 6, 7, 8, 9, 10};

        int[] reversedArray1=reverseArrayMethod(input1);;
        System.out.println((Arrays.toString(reverseArrayMethod(input1))));


    }
    public static int[] reverseArrayMethod(int[] inputArray) {
        int[] reverseArray= new int[inputArray.length];
        for (int i=0;i< inputArray.length-1;i++) {
            reverseArray[i] = inputArray[inputArray.length - 1 - i];
        }
        return reverseArray;

    }



    }


