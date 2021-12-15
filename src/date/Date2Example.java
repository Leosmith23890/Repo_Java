package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date2Example {
    public static void generateTimeline(int number) {
        Date nov = new Date();
        System.out.println("The Current Date is " +nov);
        SimpleDateFormat df = new SimpleDateFormat("h a");
       String CurrentTime = df.format(nov);
       System.out.println("the Current time is " + CurrentTime);
   Calendar myCalender= Calendar.getInstance();
        myCalender.setTime(nov);

        for(int i=1;i<=number;i++) {
            if(i<=number){
            {
            myCalender.add(Calendar.HOUR,2);
            Date fromCalender = myCalender.getTime();
            String timeLine = df.format(fromCalender);
            System.out.println("The generated timelines are  :" + timeLine);

        }

    }
}}}