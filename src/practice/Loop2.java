package practice;

public class Loop2 {
    public static void main(String[] args) {
int x=1;
        for ( int i=1;i<=5;i++){
            System.out.print(i+ " ");


        }
        System.out.println();

        // nested for loop
        System.out.println("new loop");

        for ( int i=1;i<=5;i++){
            for ( int j=1;j<=5;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        //above program with while loop
        System.out.println("another with while loop");

   int count =1;
        while(count<=3){
            for ( int j=1;j<=5;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        count++;
        }

    }}


