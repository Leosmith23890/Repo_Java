package date;

import java.util.Scanner;

public class Date2TimeLine {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of timeline you want to add to create this timeline");
        int time= scan.nextInt();

        Date2Example.generateTimeline(time);

    }}
