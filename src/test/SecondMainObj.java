package test;

public class SecondMainObj {
    public static void main(String[] args) {

        int inputArray[] = {10, 20, 70, 40, 50};
        SecondMain secMainObj = new SecondMain();

       int  result = secMainObj.maxArrayMethod(inputArray);
        System.out.println("The max value in array is " +result);
    }
}