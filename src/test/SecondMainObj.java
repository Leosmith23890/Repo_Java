package test;

import java.util.Arrays;

public class SecondMainObj {
    public static void main(String[] args) {

        int inputArray[] = {10, 20, 70, 40, 50};
        System.out.println("The input Array is : "+Arrays.toString(inputArray));
        SecondMain secMainObj = new SecondMain();

       int  result = secMainObj.maxArrayMethod(inputArray);
        System.out.println("The max value in array is " +result);
    }
}