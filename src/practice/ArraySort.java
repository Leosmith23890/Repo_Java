package practice;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int max;
        String numbersString;
        int[] numbers = {4, 11, 13, 12, 17, 35, 15, 7, 19, 3, 45};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[i] < numbers[j + 1]) {
                    max = numbers[j + 1];
                    numbers[j + 1] = numbers[i];
                    numbers[i] = max;
                }
            }
        }

        numbersString = Arrays.toString(numbers);

        System.out.println(numbersString);
    }
}