package test;


import java.util.Arrays;

public class MainClass {


    public static String reverseString(String name) {

        String sentence1 = name;
        String[] afterSplitOfSentence1 = sentence1.split(" ");
        System.out.println("\nThe sentence is : " + sentence1);
        System.out.println("The Sentence after split by space is : " + (Arrays.toString(afterSplitOfSentence1)));
        System.out.println("The sentence after reversal is:");
        String result = "";
        for (int i = (afterSplitOfSentence1.length - 1); i >= 0; i--) {
            result += afterSplitOfSentence1[i] + " ";
        }
       return(result);

    }
    public static String reverseSentence(String name) {
        String word = name;
        String[] afterSplitOfWord = word.split(" ");
        System.out.println("\nThe word is : " + word);
        System.out.println("The word after split by space is : " + (Arrays.toString(afterSplitOfWord)));
        System.out.println("The word after reversal is:");
        String revString = "";
        for (int j = (afterSplitOfWord.length - 1); j >= 0; j--) {
            revString += (afterSplitOfWord[j]+" ");
        }
       return (revString);
}}


