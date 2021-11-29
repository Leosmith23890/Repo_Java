package practice;

import java.util.Arrays;

public class ArrayMethods
{
    public static void main(String[] args) {

        String[] name=new String[5];
        Arrays.fill(name,"valli");
        System.out.println(Arrays.toString(name));
        String[] name1={"raj","dev","mai","lee","leo"};
        String[] name2={"raj","dev","mai","lee","leo"};

        //Sorting the array for simple arrays

        String[] name11={"raj","dev","mai","lee","leo"};
        Arrays.parallelSort(name11);
        System.out.println(Arrays.toString(name11));

        //Sorting the array for complex arrays
        String[] name3={"raj","dev","mai","lee","leo","pop","lom","tom","love","king","mow","wow","boo","hen","joe"};
        Arrays.parallelSort(name3);
        System.out.println(Arrays.toString(name3));

        // 1.negative scenario of comparison
        if (name1==name2){
            System.out.println("they are equal");}
            else
            {
                System.out.println("Not equal");
            }
        // 2. negative scenario of comparison
        if (name1.equals(name2))
        {
            System.out.println("they are equals");}
        else
        {
            System.out.println("Not equals");
        }

        // 3. negative scenario of comparison

      if(Arrays.equals(name1,name2))
        {
            System.out.println("they are equals finally");}
        else
        {
            System.out.println("Not equals finally");
        }


        }
    }


