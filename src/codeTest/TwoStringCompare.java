package codeTest;

import java.util.Arrays;

public class TwoStringCompare {
    public static void main(String[] args) {

        String[] a1 = {"alpha", "Beta", "Cathy", "David"};
        String[] a2 = {"Alpha", "beta", "Ice", "david"};
        String a1S = Arrays.toString(a1);
        String a2S = Arrays.toString(a2);
        System.out.println(a1S);
        System.out.println(a2S);
      String convert1 = a1S.toLowerCase();
        String convert2 = a2S.toLowerCase();
        System.out.println("after conversion" + convert1);
        System.out.println("after conversion" + convert2);
        String[] spl1 = convert1.split(",");
        String AfterSplit1 = Arrays.toString(spl1);
        String[] spl2 = convert2.split(", ");
        String AfterSplit2 = Arrays.toString(spl2);

        for (int i = 0; i < spl1.length-1; i++){
            for (int j = 0; j < spl2.length-1; j++){
              if(spl1[i].contains(spl2[j])) {
                    System.out.println(spl1[i]);

                  for (int k = 0; k < a1.length; i++) {
                      for (int l = 0; l < a2.length; l++) {
                          if (a1[k].equalsIgnoreCase(a2[j])) {
                              System.out.println(a1[i]);

                          }

                      }}}}

        }
    }
}
