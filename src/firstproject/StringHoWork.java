package firstproject;

import java.util.Arrays;

public class StringHoWork {
    public static void main(String[] args) {


        String sentence = "Many more hAppy returns of the day";
        String sentence1=sentence.toUpperCase();
        String[] afterSplitOfSentence1 = sentence1.split(" ");
        System.out.println("The sentence is : " + sentence);
        System.out.println("The Sentence after split by space is : " + (Arrays.toString(afterSplitOfSentence1)));
        for (int i=0; i<=afterSplitOfSentence1.length-1;i++) {
            String abbreviation= "" ;
            abbreviation+=afterSplitOfSentence1[i].charAt(0);
        System.out.print(abbreviation);}


        String newSentence = "outfit of the day";
        String newSentence1=newSentence.toUpperCase();
        String[] afterSplitOfNewSentence1 = newSentence1.split(" ");
        System.out.println("\nThe sentence is : " + newSentence);
        System.out.println("The Sentence after split by space is : " + (Arrays.toString(afterSplitOfNewSentence1)));
        for (int i=0; i<=afterSplitOfNewSentence1.length-1;i++) {
            String abbreviation= "" ;
            abbreviation+=afterSplitOfNewSentence1[i].charAt(0);
            System.out.print(abbreviation);}

            String sentence2 = "haPPY New YeAr To yOU";
            String newSentence2=sentence2.toUpperCase();
            String[] afterSplitOfNewSentence2 = newSentence2.split(" ");
            System.out.println("\nThe sentence is : " + sentence2);
            System.out.println("The Sentence after split by space is : " + (Arrays.toString(afterSplitOfNewSentence2)));
            for (int j=0; j<=afterSplitOfNewSentence2.length-1;j++) {
                String abbreviation1= "" ;
                abbreviation1+=afterSplitOfNewSentence2[j].charAt(0);
                System.out.print(abbreviation1);}


}}