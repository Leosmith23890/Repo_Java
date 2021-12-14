package test;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int arr[] = {14, 54, 24, 34, 64};
        String j1=Arrays.toString(arr);

        int max=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if ((arr[i]>arr[j])){
                    max=arr[i];
                    arr[i]=arr[j];
                    arr[j]=max;

                }

            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
