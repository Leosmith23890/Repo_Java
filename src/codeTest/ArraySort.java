package codeTest;

import java.util.Arrays;

public class ArraySort {


    public static int[] arraySort(int[] input1) {

        int[] arrayInput = input1;
        for (int i = 0; i < arrayInput.length; i++) {
            for (int j = i + 1; j < arrayInput.length; j++) {
                int max = 0;
                if (arrayInput[i] > arrayInput[j]) {
                    max = arrayInput[i];
                    arrayInput[i] = arrayInput[j];
                    arrayInput[j] = max;
                }
            }

        }
        return arrayInput;
    }
}







