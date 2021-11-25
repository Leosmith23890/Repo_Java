package codeTest;

import java.util.Arrays;

public class ArrayTest {


    public static void main(String[] args) {

        int[] input1 = {6, 7, 8, 9, 11};
        String newArr1 = Arrays.toString(input1);
        System.out.println("arraylist is "+newArr1);


        int index = 8;
        for (int i = 0; i <= input1.length-1; i++) {
            if (input1[i]==index) {
                System.out.println("The index to be removed:" +i);
            }
        }
        int[] input2 = new int[input1.length-1];
        input2[0] = input1[0];
        input2[1] = input1[1];
        input2[2] = input1[3];
        input2[3] = input1[4];

        String newArr = Arrays.toString(input2);
        System.out.println("The new array after removal is " +newArr);

    }

}

