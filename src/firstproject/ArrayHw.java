package firstproject;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayHw {
    public static void main(String[] args) {

        System.out.println("Homework Question1");
        String countryName = "France";
        String[] splitCountryName= countryName.split("");
        System.out.println("The country name is : " + countryName);
        System.out.println("The CountryName after split is  : " + (Arrays.toString(splitCountryName)));
        System.out.println("The CountryName length is  : " +splitCountryName.length);

        System.out.println("\nHomework Question2");
        String sentence = "Health was Earlier said to Be the ability of the body functioning WElL";
        String[] afterSplitOfSentence = sentence.split(" ");
        System.out.println("The sentence is : "+sentence);
        System.out.println("The Sentence after split by space is : "+ (Arrays.toString(afterSplitOfSentence)));
        System.out.println("The number of words in sentence is : " +afterSplitOfSentence.length);

        System.out.println("\nHomework Question3");
        String sentence1 = "Make America great again";
        System.out.println("The sentence is : "+sentence1);
        String sentence1ToUppercase =sentence1.toUpperCase();
        String[] afterSplitOfSentence1 = sentence1ToUppercase.split(" ");
        String Sentence1AfterSplit = (Arrays.toString(afterSplitOfSentence1));
        System.out.println("The Sentence after split by space is : "+ (Sentence1AfterSplit));
        for (int i=0;i< afterSplitOfSentence1.length;i++) {
            String abbre = afterSplitOfSentence1[i];
            System.out.print(abbre.charAt(0));
        }
            String sentence2 = "Outfit of the day";
            System.out.println("\nThe sentence is : "+sentence2);
            String sentence2ToUppercase =sentence2.toUpperCase();
            String[] afterSplitOfSentence2 = sentence2ToUppercase.split(" ");
            String Sentence2AfterSplit = (Arrays.toString(afterSplitOfSentence2));
            System.out.println("The Sentence after split by space is : "+ (Sentence2AfterSplit));
            for (int j=0;j< afterSplitOfSentence2.length;j++){
                String abbre1 ="";
                abbre1+=afterSplitOfSentence2[j].charAt(0);
                System.out.print(abbre1);

        }

        String sentence3 = "Happy birthday to you";
        System.out.println("\nThe sentence is : "+sentence3);
        String sentence3ToUppercase =sentence3.toUpperCase();
        String[] afterSplitOfSentence3 = sentence3ToUppercase.split(" ");
        String Sentence3AfterSplit = (Arrays.toString(afterSplitOfSentence3));
        System.out.println("The Sentence after split by space is : "+ (Sentence3AfterSplit));
        for (int j=0;j< afterSplitOfSentence3.length;j++){
           String abbre2 =afterSplitOfSentence3[j];
            System.out.print(abbre2.charAt(0));}


    }
}