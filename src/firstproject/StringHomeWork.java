package firstproject;

public class StringHomeWork {
    public static void main(String[] args) {

        System.out.println("\n Title : Ternary First condition is true");
        String sentence1="Hello dear, how are you doing?";
        int result1=0;
        int sentence1Length=sentence1.length();
        System.out.printf(" Sentence1 string length is: " +sentence1Length );
        result1 = sentence1Length>=10 ?100:150;
        System.out.println("\n If the string length is greater than or equal to 10 then the result is : "+result1);

//***************************************************************************************
        System.out.println("\n Title : Ternary Second condition is true");

        String sentence2="Hi Dear";
        int result2=0;
        int sentence2Length=sentence2.length();
        System.out.printf(" Sentence2 string length is: " +sentence2Length );
        result2 = sentence2Length>=10 ?100:150;
        System.out.println("\n If the string length is less than 10 then the result is : "+result2);
//***************************************************************************************




    }
}
