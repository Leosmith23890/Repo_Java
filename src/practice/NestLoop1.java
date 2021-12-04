package practice;

public class NestLoop1 {
    public static void main(String[] args) {

    for(int j = 1; j <= 4; j++) {
        if (j==1 || j==4) {
            for (int i = 1; i <= 4; i++) {
                System.out.print(i + " ");
            }
        }
        else if (j==2){
            System.out.print("1" + "     " + "4");
        }

        else{
            System.out.print("1" + "     " + "4");
        }
        System.out.println();
    }}}

