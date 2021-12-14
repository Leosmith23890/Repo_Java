package ArrayList;

import java.util.ArrayList;
import java.util.List;
//ArrayList removal practice example
public class ArrayList1 {
        public static void main(String[] args) {


                List<String> grade = new ArrayList<>();
                grade.add("Tanya");
                grade.add("Daniel");
                grade.add("Grace");
                grade.add("Grow");
                grade.add("Julie");
                grade.add("Mady");
                grade.add("Nathan");
                grade.add("John");
                grade.add("Peter");
                grade.add("Mike");
                grade.add("Kevin");
                grade.add("Thane");
                grade.add("Watson");
                grade.add("Merry");
                grade.add("Duke");
                grade.add("Rose");
                grade.add("Benny");
                grade.add("Henry");
                grade.add("Abey");
                grade.add("Sony");
                grade.add("Lucy");
                grade.add("John");
int length=grade.size();
                System.out.println("The array list is : " +grade);
                System.out.println("The array list length  is : " +length);
                String removedValue ="";
for (int i=0;i<=grade.size()-1;i++){
        if(grade.get(i).equalsIgnoreCase("grow"))
        {
             removedValue=grade.remove(i);
                System.out.println("The removed value is : " +removedValue);
                System.out.println("The array list length after removal");
                System.out.println("The array list is : " +grade);
                System.out.println("The array list length  is : " +grade.size());
        }

}
            System.out.println("last");

            for (int i=grade.size()-1;i>=0;i--){
                if(grade.get(i).equalsIgnoreCase("john"))
                {
                    int value=grade.indexOf(i);
                    System.out.println("the value is"+value);
                }

            }
        }
}