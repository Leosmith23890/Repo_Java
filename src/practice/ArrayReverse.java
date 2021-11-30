package practice;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        Integer[] intArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        //print array starting from first element
        System.out.println("Original Array:");
        for (int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i] + "  ");

        System.out.println();
int counter =0;
        Integer[] intArray1 = new Integer[intArray.length];
        for (int j = intArray.length - 1; j >= 0; j--) {
                intArray1[counter] = intArray[j];
                System.out.print(intArray1[counter] + "  ");
                counter++;
            }

        }


    }
