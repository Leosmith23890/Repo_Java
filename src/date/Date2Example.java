package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2Example {
    public static void main(String[] args) {


    Date aug=new Date();
    SimpleDateFormat df=new SimpleDateFormat();
    String CurrentTime=df.format(aug);
        System.out.println("the Current time is "+CurrentTime);
    
}
