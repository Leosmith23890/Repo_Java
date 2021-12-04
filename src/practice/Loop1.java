package practice;

public class Loop1 {
    public static void main(String[] args) {
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while ( num <= 5 );
        System.out.println(num);

        //for is like while loop.it can also have true or false condition but define within semicolon
        boolean x = true;
        for (; x = true; ) {
            System.out.println("All is true");
            break;
        }
// in for loop we can have 2 initialization and 2 increments and decrements.
        for (int i = 0, j = 0; i <= 3; i++, j++) {
            System.out.print(i);
            System.out.println(j);
        }


        for (int i = 0;x=true;i++) {
            System.out.print(i);
break;
        }
    }
}
