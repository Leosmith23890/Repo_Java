package date;

import java.text.SimpleDateFormat;

public class DateExample {

    public static void main(String[] args) {
        java.util.Date now=new java.util.Date();
        SimpleDateFormat df=new SimpleDateFormat("dd");
        String value=df.format(now);
        System.out.println("The date is :"+value);
        int dateInteger=Integer.valueOf(value);
        if(dateInteger<15){
            System.out.println("We are in the first half of the month");
        }
        else{
            System.out.println("We are in the second half of the month");
        }
    }


}



