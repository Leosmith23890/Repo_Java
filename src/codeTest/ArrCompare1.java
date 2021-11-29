package codeTest;

public class ArrCompare1 {

        public static void main(String[] args) {
            String [] sArray1 = {"lap","Sad","mop","dog"};
            String [] sArray2 = {"lap","Sad","Mop","CAT"};
            // Outer loop
            for(int i = 0; i < sArray1.length; i++){
                for(int j = 0; j < sArray2.length; j++){// inner loop
                    if(sArray1[i].equalsIgnoreCase(sArray2[j])){
                        System.out.println(sArray1[i]);

                    }
                }
            }
        }
    }

