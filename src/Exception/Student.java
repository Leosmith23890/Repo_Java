package Exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {

    // Properties
    private String name;
    private int age;
    private String state;
    private String courseName;
    private int yourStudentId;
    private static int studentId = 0;
    private String[] courseNames = {"QA", "PM", "BA", "Developer"};
    private Scanner input = new Scanner(System.in);
    String inputStr = "";
    String defaultState = "__";
    int value;
    /*
        method to enroll

        1. what is the purpose of method - to enroll a student
        2. make user of scanner class to make student interactive enrollment flow interactive
            Mandatory fields (name, age, courseName)
            Optional fields (state) ; default state value: "--"
        3. should I return any value in the end of method? - void

        Requirement:
            no student below 16 should be able to enroll
            no student should be able to enroll if courseName is other than "QA, PM, BA, Developer"

        Note: Handle relevant exceptions

    */
    public void enroll() {
try{
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age in years:");
        int sAge = input.nextInt();
        if (sAge < 16) {
            System.out.println("Sorry, you are under age.");
        } else {
            boolean isCourseValid = false;
            System.out.println("Please enter the course in which you want to enroll:");
            String sCourseName = input.next();
            for (String cName : courseNames) {
                if (cName.equalsIgnoreCase(sCourseName)) {
                    isCourseValid = true;
                    System.out.println("Please enter your name:");
                    name = input.next();
                    age = sAge;
                    System.out.println("Do you want to enter your state:if yes, then enter 1 or default state will be chosen");
                    value = input.nextInt();
                    if (value==1) {
                        System.out.println("Enter the State  value: ");
                        state = input.next();
                           if(state.length()>2){
                               System.out.println("Incorrect state value please enter valid state again");
                               state = input.next();
                        }
                    }

                    else {
                        System.out.println("The default state value is :" + defaultState);}
                        courseName = sCourseName;
                        yourStudentId = ++studentId;
                        break;
                    }

                if (isCourseValid) {
                    System.out.println("\n\nHey, thank you " + name + " for the enrollment\nYour student-id: " + yourStudentId);
                 }
                 else {
                    System.out.println("\n\nIncorrect course name provided.\nProvided course name: " + sCourseName + "\nValid course names: " + Arrays.toString(courseNames));
                }
                    }}}
    catch (InputMismatchException e){
        System.out.println("Enter the input value in integers and don't enter alphabetical letters");
        e.printStackTrace();
        }
    }

    public void changeState() {
try {
    String firstState;
    firstState = state;
    System.out.println("Procedure to change state");
    System.out.println("Enter your Student id");
    Scanner input = new Scanner(System.in);
    int id = input.nextInt();
    if (id == yourStudentId) {
        System.out.println("This is the existing state value " + state);
        System.out.println("Please Enter the new State  value: ");
        state = input.next();
        if (state.equalsIgnoreCase(firstState)) {
            System.out.println("The new state id already exist. Please try again ");

        } else {
            System.out.println("State changed successfully and the new state value is  " + state);
        }

    }
    else if (id<=0)
    {
            throw new NumberFormatException("The id " + id + " is a negative number!");
        }
    else {
        System.out.println("you have entered incorrect student id");
    }

}
catch (NumberFormatException e){
    System.out.println("id  entered is equal or less than 0");
    e.printStackTrace();
}

catch (InputMismatchException e){
    System.out.println("Enter the student id value in integer and don't enter alphabetical letters");
    e.printStackTrace();
}

    }


    public void changeName() {
        try {

            String firstName;
            firstName = name;

            Scanner input = new Scanner(System.in);
            System.out.println("Procedure to change name");
            System.out.println("Enter your Student id");
            int id = input.nextInt();
            if (id <= 0) {
                throw new NumberFormatException    ("The id " + id + " is a negative number!");  }
            if (id == yourStudentId) {
                System.out.println("This is your existing name " + name);
                System.out.println("Hi " + name + " do you want to change your name?");
                inputStr = input.next();
                if (inputStr.equalsIgnoreCase("yes")) {
                    System.out.println("Enter the new name");
                    name = input.next();
                    if (name.equalsIgnoreCase(firstName)) {
                        System.out.println("This name already exists.Please try later");

                    } else {
                        System.out.println("Name changed successfully and the new name is :" + name);
                    }
                }
            }
        }
        catch (NumberFormatException e){
            System.out.println("id  entered is equal or less than 0");
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            System.out.println("Enter the student id value in integer and don't enter alphabetical letters");
            e.printStackTrace();
        }
    }


    public void showDetailSummary() {
try {

    System.out.println("\nDisplay of student details");
    System.out.println("\nTo see detail summary, please enter the id: ");
    System.out.println("Enter your Student id");
    Scanner input = new Scanner(System.in);
    int id = input.nextInt();
    if (id == yourStudentId) {
        System.out.println("\n**** Detail Student summary: ***\nName : " + name +
                "\nStudent id : " + yourStudentId +
                "\nAge : " + age +
                "\nState : " + state +
                "\nCourse name : " + courseName);
    }  else if (id<=0)
    {
        throw new NumberFormatException("The id " + id + " is a negative number!");
    }
    else {
        System.out.println("you have entered incorrect student id");
    }

}
catch (NumberFormatException e){
    System.out.println("id  entered is equal or less than 0");
    e.printStackTrace();
}

catch (InputMismatchException e){
    System.out.println("Enter the student id value in integer and don't enter alphabetical letters");
    e.printStackTrace();
}

    }
    }
         /*
        changeState
        make user of scanner class to make change state flow interactive
        return type - No

        Requirement:
            New state name should NOT be same as already in the system.
            If student enters new state same as the already registered one, show relevant error msg

        Note: Handle relevant exceptions*/
    /*
        changeName
        make user of scanner class to make change name flow
        return type - No

        Requirement:
            New name should NOT be same as already in the system.
            If student enters newName same as the already registered one, show relevant error msg

        Note: Handle relevant exceptions
     */


    /*
    showDetailSummary
    make user of scanner class to make show student details flow interactive
    return type - No

    show should be able to see details if correct id provided

    Note: Handle relevant exceptions*/






