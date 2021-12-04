package practice;

public class NestedLoop {
    public static void main(String[] args) {

        for (int j = 1; j <= 4; j++) {
            if (j == 2 || j == 3) {
                System.out.print("#" + "     " + "#");
            } else {
                for (int i = 1; i <= 4; i++) {
                    System.out.print("#" + " ");
                }
            }

            System.out.println();
        }}}

