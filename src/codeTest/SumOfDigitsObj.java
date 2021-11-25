package codeTest;

public class SumOfDigitsObj {
    public static void main(String[] args) {
        SumOfDigits sumOfDigitsObj=new SumOfDigits();
        int input1=345567;
        System.out.println("The given number is :"+input1);
        int sumResult=sumOfDigitsObj.sumOfDigits(input1);
        System.out.println("The Sum of digits of number " +input1 +" is : " +sumResult);

    }
}
