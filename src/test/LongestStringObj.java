package test;

public class LongestStringObj{
    public static void main(String[] args) {
        String[] input1 = {"Marry Mathew", "Williams", "Abraham Downey", "Jennifer kingsley", "wilson"};
        LongestStringMain LongestStringObj=new LongestStringMain();
        int output= LongestStringObj.longestStringOfArray(input1);
        System.out.println("\nThe Length of Longest String is : " + output);
        for (int j = 0; j <= input1.length-1; j++) {
            if((input1[j].length())==output) {
                System.out.println("The Longest String Name is : " + ((input1[j])));
            }}}
}

