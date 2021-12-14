package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListOccur {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("happy");
        students.add("peace");
        students.add("joy");
        students.add("grow");
        students.add("joy");
        students.add("laugh");
        students.add("happy");
        students.add("laugh");
        students.add("joy");
        int length1 = students.size();
        Set<String> studentNew = new HashSet<>();
        System.out.println("The Arraylist values are : " + students);
        System.out.println("The ArrayList size is : " + length1);
        for(int i =0; i < students.size(); i++) {
            if(students.indexOf(students.get(i))!=(students.lastIndexOf(students.get(i)))){
                System.out.println("The duplicate Strings in the list are :"+ students.get(i));
                studentNew.add(students.get(i));
            }
        }
        System.out.println("\nThe duplicate string values are :" +studentNew);
    }}


