package test;

import java.util.Arrays;

public class ReverseStringObj {
    public static void main(String[] args) {
    ReverseString reverseStringObj=new ReverseString();
        String name = "madam";
        System.out.println("the given string name  is :" + name);
        String[] afterSplit = name.split("");
        String afterSplitWord = Arrays.toString(afterSplit);
        String output = Arrays.toString((reverseStringObj.reverse(name)));
        System.out.println("The reverse of string is :" + output);
        boolean result = output.equalsIgnoreCase(afterSplitWord);
        if (result == true) {
            System.out.println("The given string is palindrome");
        } else
            System.out.println("The given string is not palindrome");
    }
}