package firstproject;

import java.util.Arrays;

public class StringPbm {
    public static void main(String[] args) {

        String sentence1 = "We wISH YoU A mERRY cHRiStMaS";
        System.out.println("\nThe sentence is : " + sentence1);
        String sentence1ToUppercase = sentence1.toUpperCase();
        String sentence2ToLowerCase = sentence1.toLowerCase();
        String[] afterSplitOfSentence111 = sentence1ToUppercase.split(" ");
        String[] afterSplitOfSentence222 = sentence2ToLowerCase.split(" ");
        String Sentence1AfterSplit = (Arrays.toString(afterSplitOfSentence111));
        System.out.println("The Sentence after split by space is : " + (Sentence1AfterSplit));
        for (int i = 0; i <= afterSplitOfSentence111.length - 1; i++) {
            String xyz = "";
            xyz += afterSplitOfSentence111[i].charAt(0);
            String abc = xyz + afterSplitOfSentence222[i].substring(1) + " ";
            System.out.print(abc);
        }

            String sentence32 = "HaPPy NeW yEAr To YoU";
            System.out.println("\nThe sentence is : " + sentence32);
            String sentence32ToUppercase = sentence32.toUpperCase();
            String sentence32ToLowerCase = sentence32.toLowerCase();
            String[] afterSplitOfSentence32 = sentence32ToUppercase.split(" ");
            String[] afterSplitOfSentence33 = sentence32ToLowerCase.split(" ");
            String Sentence32AfterSplit = (Arrays.toString(afterSplitOfSentence32));
            System.out.println("The Sentence after split by space is : " + (Sentence32AfterSplit));
            for (int j = 0; j <= afterSplitOfSentence32.length - 1; j++) {
                String print = "";
                print += afterSplitOfSentence32[j].charAt(0);
                String printValue = print + afterSplitOfSentence33[j].substring(1) + " ";
                System.out.print(printValue);

            }
        String sentence71 = "your numbER IS BusY";
        System.out.println("\nThe sentence is : " + sentence71);
        String sentence7ToLowerCase = sentence71.toLowerCase();
        String[] afterSplitOfSentence777 = sentence7ToLowerCase.split(" ");
        String Sentence71AfterSplit = (Arrays.toString(afterSplitOfSentence777));
        System.out.println("The Sentence after split by space is : " + (Sentence71AfterSplit));

        for (int i = 0; i <= afterSplitOfSentence777.length - 1; i++) {
            String xyz = "";
            xyz += afterSplitOfSentence777[i].substring(0,1).toUpperCase()+afterSplitOfSentence777[i].substring(1) + " ";
            System.out.print(xyz);
        }
        }
    }

