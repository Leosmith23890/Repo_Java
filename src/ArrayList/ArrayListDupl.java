package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDupl {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("One");
        myList.add("five");
        myList.add("six");
        myList.add("one");
        myList.add("seven");
        myList.add("one");
        myList.add("eight");
        ArrayListMain newList=new ArrayListMain();
        newList.ArrayListCompare(myList);
    }
}