package HashSetExample;

import java.util.*;
import java.util.HashSet;

public class SetClass {
    public static void main(String[] args) {


        Set<String> newSet = new HashSet<>();
        {
            newSet.add("king");
            newSet.add("queen");
            newSet.add("king");
            newSet.add("minister");
            newSet.add("prince");
            newSet.add("princess");
            newSet.add("Prince");
            newSet.add("Soldier");

            //NO DUPLICATES are available
            System.out.println("The new set list is : " + newSet);
            System.out.println("_______________________________________________________________________");
            //size method
            System.out.println("The size of set is:"+newSet.size());
            System.out.println("_______________________________________________________________________");
            //contains method
            System.out.println(newSet.contains("Soldier")); //true
            boolean jj=newSet.remove("Soldier");
            System.out.println(jj);
            System.out.println("The size of set is:"+newSet.size());
            System.out.println("_______________________________________________________________________");
            //displaying set one by one like foreach loop. only forward not backward
            Iterator<String> value= newSet.iterator();
            while( value.hasNext() ){
                System.out.println("the values are :"+value.next());
            }
            System.out.println("_______________________________________________________________________");
//equals method

            System.out.println(newSet.equals("Queen"));
            System.out.println("_______________________________________________________________________");

            //addAll method to copy all data from one set to another
            Set<String> childSet = new HashSet<>();
            childSet.addAll(newSet);
            System.out.println("The childset list are :"+childSet);
            System.out.println("_______________________________________________________________________");

            //converting set to array
            String[] newArray= new String[childSet.size()];
            newArray=childSet.toArray(newArray);
            System.out.println("the arrays value are:" +Arrays.toString(newArray));
            System.out.println("_______________________________________________________________________");
            //converting Set to ArrayList
            List<String> newChildList=new ArrayList<String>(childSet);
            System.out.println("The new childlist values are :" +newChildList);
            System.out.println("_______________________________________________________________________");
            //converted ArrayList with duplicate values
            newChildList.add("hi");
            newChildList.add("king");
            System.out.println("The new childlist values with duplicates are :" +newChildList);
            System.out.println("_______________________________________________________________________");
//converting ArrayList into Set
            Set<String>  convertedChildSet = new HashSet<>(newChildList);

            System.out.println("After conversion of ChildList to Childset the values are : "+convertedChildSet);
            System.out.println("_______________________________________________________________________");

        }
    }
}

