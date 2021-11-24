package test;

public class Employee {
    String empName;
    int empID;
 static String companyName="TGS";

 public static void display(String empName1, int empID1)
 {


     System.out.println(empName1);
     System.out.println(empID1);
     System.out.println(companyName);
     String companyName="POS";
     System.out.println(companyName);
 }
    public static void state(String stateName)
    {
        System.out.println(stateName);
        System.out.println(companyName);
    }

    public static void main(String[] args) {
        display("siva",802);
        state("tamil");

    }
}
