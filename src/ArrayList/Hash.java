package ArrayList;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        Map<Integer,String>studentMap=new HashMap<>();
        studentMap.put(1,"Deepak");
        studentMap.put(2,"Siva");
        studentMap.put(3,"Ram");
        studentMap.put(4,"Rani");
        studentMap.put(5,"John");
        studentMap.put(6,"Divya");
        System.out.println();
        System.out.print("The list is :" +studentMap);
        System.out.println();
        System.out.println(studentMap.size());
        Set<Integer> allTds=studentMap.keySet();
for (Integer id:allTds) {
    {
        System.out.println("ID=" + id + ",Name= " + studentMap.get(id));

    }

    System.out.println("next exercise");
    for (Integer id1 : allTds) {
        if (id1%2 == 0 && studentMap.get(id).length()>4) {
            System.out.println("ID=" + id1 + ",Name= " + studentMap.get(id1));
        }

    }

}}}



