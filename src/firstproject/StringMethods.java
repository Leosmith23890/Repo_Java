package firstproject;

public class StringMethods {
    public static void main(String[] args) {


        System.out.println("\nTitle : Replace all a/A with Z");

        String sentence1 = "Health was Earlier said to Be the ability of the body functioning WElL";
        String replaceThis = "a" ,replaceWith= "Z";
String sentence1lowercase=sentence1.toLowerCase();
String sentence1Replace1=sentence1lowercase.replace(replaceThis,replaceWith);
        System.out.println("Sentence Before replace : "+sentence1);
        System.out.println("Sentence After replace  : "+sentence1Replace1);

//***************************************************************************************

        System.out.println("\nTitle : Replace all e/E with Z");

        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL";
        String replaceThis2 = "E" ,replaceWith2= "Z";
        String sentence2uppercase=sentence2.toUpperCase();
        String sentence2Replace2=sentence2uppercase.replace(replaceThis2,replaceWith2);
        System.out.println("Sentence Before replace : "+sentence2);
        System.out.println("Sentence After replace  : "+sentence2Replace2);

//***************************************************************************************

        System.out.println("\nTitle : Finding the length of string");

        String sentence3 = "Health was Earlier said to Be the ability of the body functioning WElL";
        int sentence3Length=sentence3.length();
        System.out.println("The length of sentence3 is : " +sentence3Length);

//***************************************************************************************

        System.out.println("\nTitle : Check if the sentence4 starts with health");

        String sentence4 = "Health was Earlier said to Be the ability of the body functioning WElL";
        String sentence4Lowercase=sentence4.toLowerCase();
        System.out.println("The sentence is  : " +sentence4Lowercase);
        boolean result4 = sentence4Lowercase.startsWith("health");
        System.out.println("Check if the sentence4 starts with 'health' then the  result is : " +result4);

//***************************************************************************************
        System.out.println("\nTitle : Check if the sentence5 contains the word 'Body'");

        String sentence5 = "Health was Earlier said to Be the ability of the body functioning WElL";
        String sentence5Lowercase=sentence5.toLowerCase();
        System.out.println("The lower case sentence is  : " +sentence5Lowercase);
        boolean result5 = sentence5Lowercase.contains("body");
        System.out.println("if the sentence5 contains the word 'body' then  the result is : " +result5);
        boolean result6 = sentence5Lowercase.contains("bdy");
        System.out.println("if the sentence5 does not contains the word 'bdy' then the result is : " +result6);

//***************************************************************************************

        System.out.println("\nTitle : Check the index of 'Body' in sentence6");

        String sentence6 = "Health was Earlier said to Be the ability of the body functioning WElL";
        int result7=sentence6.indexOf("body");
        System.out.println("The index of word body is : " +result7);
//***************************************************************************************
    }



}
