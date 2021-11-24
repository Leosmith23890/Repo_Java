package test;

import java.util.Arrays;

public class ReverseString {

    public static String[]  reverse(String name) {
        String givenString = name;
        String[] afterSplit = givenString.split("");
        System.out.println("The given String after split is : "+Arrays.toString(afterSplit));
        String [] afterSplitReverse= new String[afterSplit.length];
       for (int i = 0; i<= afterSplit.length - 1; i++) {
           afterSplitReverse[i] = afterSplit[afterSplit.length - 1 - i];

       }
return(afterSplitReverse);

    }

}
