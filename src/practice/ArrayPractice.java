package practice;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] input1 = {6, 7, 8, 9, 11};
        String newArr1 = Arrays.toString(input1);
        System.out.println("input 1 arraylist is " + newArr1);

        int lastIndex = 8;
        int[] input2 = new int[(input1.length) + 1];
        for (int i = 0; i <= input1.length - 1; i++) {
            {
                input2[i] = input1[i];
            }
            input2[input2.length - 1] = 90;
        }
        String newArr2 = Arrays.toString(input2);
        System.out.println("input 2 arraylist is " + newArr2);


    }
}