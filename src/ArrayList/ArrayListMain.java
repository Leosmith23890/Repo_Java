package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListMain {
    public boolean ArrayListCompare(List<String> inputArray) {
        List<String> myList1 = new ArrayList<>();
        myList1 = inputArray;
        int length = myList1.size();
        System.out.println("The Arraylist values are : " + myList1);
        System.out.println("The ArrayList size is : " + length);
        System.out.println("Converting Arraylist into Hashset");
        Set<String> mySetList = new HashSet<>(myList1);
        System.out.println("The HashSet values are : " + mySetList);
        int newLength = mySetList.size();
        System.out.println("The Hashset size is : " + newLength);
        if (length == newLength) {
            System.out.println("The ArrayList has no duplicate values");
            return true;
        } else {
            System.out.println("The ArrayList has duplicate values as the length of the  arrays are mismatched");
            return false;
        }
    }

    }

