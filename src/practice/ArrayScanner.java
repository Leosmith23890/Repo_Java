package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        int[] array1=new int[10];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the input");
        for (int i=0;i<10;i++) {
            int x = input.nextInt();
            array1[i] = x;

        }
        System.out.println("The new arraylist is " +(Arrays.toString(array1)));
        }
    }

