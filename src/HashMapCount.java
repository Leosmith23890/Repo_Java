package HashMap;

import java.util.*;

public class HashMapCount {
    public static void main(String[] args) {
        Map<Integer, String> wordList = new HashMap<>();
        wordList.put(101, "happy".toLowerCase());
        wordList.put(102, "peace".toLowerCase());
        wordList.put(103, "Happy".toLowerCase());
        wordList.put(104, "learn".toLowerCase());
        wordList.put(105, "pEaCe".toLowerCase());
        wordList.put(106, "HAPPY".toLowerCase());
        wordList.put(107, "joy".toLowerCase());
        wordList.put(108, "Joy".toLowerCase());
        wordList.put(109, "Learn".toLowerCase());
        wordList.put(110, "Lucy".toLowerCase());
        System.out.println("The wordlist with keys and values are : " + wordList);
        System.out.println("The HashMap size is: " + wordList.size());
        Set<Integer> allIds = wordList.keySet();
        System.out.println("The keyset values are : " + allIds);
        Collection<String> wordListValues = wordList.values();

        Set<String> newValues = new HashSet<String>(wordListValues);
        System.out.println("The set" + newValues);

        String[] newArray = new String[wordListValues.size()];
        newArray = wordListValues.toArray(newArray);
        System.out.println("The Array value are" + (Arrays.toString(newArray)));


        int count = 0;
        for(String s:newValues){
        for (int i = 0; i < newArray.length; i++) {
            if (s.equals(newArray[i])) {
                count++;
            }}
            System.out.println("The count for " + s + " is  " + count);
        count=0;
        }}}












