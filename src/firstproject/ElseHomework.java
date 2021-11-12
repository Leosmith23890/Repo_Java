package firstproject;

public class ElseHomework {
    public static void main(String[] args) {

            int value = 45;
            if  (value % 5 == 0 &&  value % 3 == 0) {
                System.out.println(" The entered number " + value + " is divisible by 5");
                System.out.println(" The entered number " + value +" is divisible by 3");
                System.out.println(" The entered number " + value +" is divisible by 5 and 3 ");
                ;
            }else if (value % 5 == 0){
                System.out.println(" The entered number " + value +" is divisible by 5");}
            else if(value % 3 == 0){
                System.out.println(" The entered number " + value +" is divisible by 3");}
            else {
                System.out.println(" The entered number is " + value);
                System.out.println(" The entered number " + value + " is not divisible by 5 or 3 or 15");}
            }}

