package codeTest;

import test.AverageMain;

import java.util.Arrays;

public class ArraySortObj {
    public static void main(String[] args) {

        int[] input1 = {93,33,56,27,89};
        System.out.println("The given Array list is:"+Arrays.toString(input1));
        int[] Sort=ArraySort.arraySort(input1);
        String SortedArray= Arrays.toString(Sort);
        System.out.println("The Sorted Array is :" +SortedArray);
    }
}

