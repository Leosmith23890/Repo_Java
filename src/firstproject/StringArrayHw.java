package firstproject;

import java.util.Arrays;

public class StringArrayHw {
    public static void main(String[] args) {
        String sentence = "Happy birthday to you";
        String[] afterSplitOfSentence = sentence.split(" ");
        System.out.println("The sentence is : "+sentence);
        System.out.println("The Sentence after split by space is : "+ (Arrays.toString(afterSplitOfSentence)));
        System.out.println("The sentence after reversal is:");
        for (int i=(afterSplitOfSentence.length-1);i>=0;i--)
        {
            System.out.print(afterSplitOfSentence[i]+ " ");

        }

        String sentence1 = "Learn More";
        String[] afterSplitOfSentence1 = sentence1.split(" ");
        System.out.println("\nThe sentence is : "+sentence1);
        System.out.println("The Sentence after split by space is : "+ (Arrays.toString(afterSplitOfSentence1)));
        System.out.println("The sentence after reversal is:");
        for (int i=(afterSplitOfSentence1.length-1);i>=0;i--)
        {
            System.out.print(afterSplitOfSentence1[i]+" ");



        }

        String word = "Learn";
        String[] afterSplitOfWord = word.split(" ");
        System.out.println("\nThe word is : " + word);
        for (int j = (afterSplitOfWord.length - 1); j >= 0; j--) {
            System.out.print("The word after reverse is : "+(afterSplitOfWord[j] + " "));


        }
}}
