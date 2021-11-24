package test;

import com.sun.jdi.PathSearchingVirtualMachine;

public class AverageMainObj {
    public static void main(String[] args) {

        double[] input1 = {10, 20, 30, 50.1, 40, 60, 70, 80.1, 90};
        AverageMain averageMainObj=new AverageMain();
        double average = averageMainObj.averageOfArray(input1);
        System.out.println("The average of input array is :" +average);
    }
}