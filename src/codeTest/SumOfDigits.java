package codeTest;

import java.util.Arrays;

public class SumOfDigits {
    public int sumOfDigits(int number) {
        int input1 = number;
        int max = 0;
        while ( input1 > 0 ) {
            max = max + input1 % 10;
            input1 = input1 / 10;
        }
        return max;
    }


}
