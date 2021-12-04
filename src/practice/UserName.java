package practice;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
    String userName;
    String passWord;
    Scanner scan=new Scanner(System.in);

for(int i=1;i<=5;i++)
{
    System.out.println("Enter the username");
    userName = scan.nextLine();
    System.out.println("Enter the password");
     passWord= scan.nextLine();
      if (userName.equalsIgnoreCase("Siva")&& (passWord.equals("pass1234"))) {
          System.out.println("Welcome to the homepage");
          break;
      }
      else
    {
        System.out.println("Your username and password are incorrect.try again");
        System.out.println("you have "+ (5-i) +" attempts left");
    }
if(i==5){
    System.out.println("your are locked out for 10 minutes");
}
    }
    }
}
