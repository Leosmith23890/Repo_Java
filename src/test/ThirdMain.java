package test;

import java.util.Arrays;

public class ThirdMain {

    public static String titleCaseMethod(String Sentence) {
        String givenString = Sentence;
        String givenStringLowerCase = givenString.toLowerCase();
        String[] afterSplitOfGivenString = givenStringLowerCase.split(" ");
        System.out.println("The String before Split is : " + givenString);
        System.out.println("The String after Split is : " + Arrays.toString(afterSplitOfGivenString));
        String title = "";
        for (int i = 0; i <= afterSplitOfGivenString.length-1; i++) {

            title += afterSplitOfGivenString[i].substring(0, 1).toUpperCase() + afterSplitOfGivenString[i].substring(1) + " ";
        }
        return (title);

    }
}