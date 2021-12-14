package HashMap;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapColor {
    public static void main(String[] args) {

        String colors[] = {"red", "green", "blue", "red", "yellow", "red", "blue", "red", "green", "blue", "yellow", "red", "green", "grey"};

        Set<String> setColors = new HashSet<String>();
        for (String data : colors) {
            setColors.add(data);
        }
        System.out.println(setColors);
        int count=0;
        String  maximum ="",minimum="",same="";

for(String s:setColors){
    for(int i=0;i< colors.length;i++){
        if(s.equalsIgnoreCase(colors[i])){
            count++;
        }
    }
    System.out.println("The count for " + s + " is  " + count);
    if(count>3){
       maximum=s;
        System.out.println("The color which is having maximum occurrence of 3 is  : "+maximum);
    }
    if(count==3){
        same=s;
        System.out.println("The color which is having same occurrence of 3 is  : "+same);
    }
    if(count<3){
          minimum=s;
        System.out.println("The color which is having least occurrence is  : "+minimum);
    }
    count=0;
}

    }}