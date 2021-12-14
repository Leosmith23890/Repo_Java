package HashMap;
import java.util.*;

public class HashMapHomework {
    public static void main(String[] args) {
        Map<Integer, String> wordList = new HashMap<>();
        wordList.put(101, "happy".toLowerCase());
        wordList.put(102, "peace".toLowerCase());
        wordList.put(103, "Happy".toLowerCase());
        wordList.put(104, "learn".toLowerCase());
        wordList.put(105, "pEaCe".toLowerCase());
        wordList.put(106, "HAPPY".toLowerCase());
        System.out.println("The wordlist with keys and values are : " + wordList);
        System.out.println("The HashMap size is: " + wordList.size());

        Set<Integer> allIds = wordList.keySet();
        System.out.println("The keyset values are : " + allIds);

        Collection<String> wordListValues = wordList.values();
        Set<String> newValues = new HashSet<String>(wordListValues);
        System.out.println("The set of values are " + newValues);


        for(String s:newValues){
            for (int jj:allIds){ {
                if ((wordList.get(jj).equalsIgnoreCase(s)))
                    System.out.println("The value "+s+ " is in the key "+jj);
                }}


        }}}






