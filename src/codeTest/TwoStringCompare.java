package codeTest;

import java.util.Arrays;

public class TwoStringCompare {
    public static void main(String[] args) {

        String[] a1 = {"alpha", "Beta", "Cathy", "David"};
        String[] a2 = {"Alpha", "beta", "Ice", "dove"};
        String a1S = Arrays.toString(a1);
        String a2S = Arrays.toString(a2);
        System.out.println(a1S);
        System.out.println(a2S);

       for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {// inner loop
                if (a1[i].equalsIgnoreCase(a2[j])) {
                    System.out.println(a1[i]);
                 
                }
            }
        }
    }
}


