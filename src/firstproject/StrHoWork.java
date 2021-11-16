package firstproject;
import java.util.Arrays;


public class StrHoWork {
    public static void main(String[] args) {


        String sentence = "goOD MorNInG AmERiCa";
        String sentence2 = sentence.toLowerCase();
        String sentence1 = sentence.toUpperCase();
        System.out.println("The sentence is : " + sentence);
        String title = sentence1.charAt(0) + sentence2.substring(1);
        System.out.println(title);


        String sentence11 = "We wISh YOU A mERRY cHrIStMAS";
        String sentence12 = sentence11.toLowerCase();
        String sentence13 = sentence11.toUpperCase();
        System.out.println("The sentence is : " + sentence11);
        String title2 = sentence13.charAt(0) + sentence12.substring(1);
        System.out.println(title2);


    }
}



