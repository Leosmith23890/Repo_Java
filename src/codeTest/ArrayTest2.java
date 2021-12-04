package codeTest;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {

        int[] input1 = {6, 7, 8, 9, 11};
        String newArr1 = Arrays.toString(input1);
        System.out.println("arraylist is "+newArr1);

        int index = 8;
        for (int i = 0; i <= input1.length-1; i++) {
            if (input1[i] == index) {
                System.out.println("The index to be removed:" + i);
            }


        }}}










