package test;

import java.util.Arrays;

public class FourMain {
    public static String abbreviationMethod(String sentence){
    String sentence1=sentence;
    String sentenceLowerCase=sentence1.toLowerCase();
    String [] afterSplitSentenceLowerCase=sentenceLowerCase.split(" ");
        System.out.println("The given sentence is  :"+sentence1);
        System.out.println("The given sentence after split is   :"+Arrays.toString(afterSplitSentenceLowerCase));
        String letter="";
        for (int i=0;i<=afterSplitSentenceLowerCase.length-1;i++){
            letter+=afterSplitSentenceLowerCase[i].substring(0,1).toUpperCase();
        }
            return(letter);
        }
}
