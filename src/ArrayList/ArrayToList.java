package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {


        String words[]= {"Siva","Wilma","Lucy","Jenny","Duke"};
        List<String>wordsList=new ArrayList<String>();
        for(String data: words){
            wordsList.add(data);
        }
        System.out.println("The ArrayList values are : "+wordsList);
     //Converting ArrayList back to normal Array
        String[] fish=wordsList.toArray(new String[0]);
        System.out.println("After converting list back array :" + (Arrays.toString(fish)));

    }
}
