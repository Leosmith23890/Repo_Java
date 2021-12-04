package practice;

public class LoopRow {
    public static void main(String[] args) {

//make i as rows and j as columns...i has println to move it to next line that means next row

        for (int rows = 5; rows >0; rows--) {
            for (int column = 1; column <= 5; column++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }

        System.out.println("Another example-1");
        int x=1;
        for (int rows = 1; rows<=5; rows++) {
            for (int column = 1; column <= 5; column++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        System.out.println("Another example-2");

        for(int rows = 1; rows<=5; rows++) {
            for (int column = 1; column <= 5; column++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }

        System.out.println("Another example-3");

        for(int rows = 1; rows<=5; rows+=2) {
            for (int column = 1; column <= 6; column++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
            System.out.println("Another example-4");

            for(int rows = 1; rows<=3; rows++) {
                if (rows == 1) {
                    for (int column = 1; column <= 3; column++) {
                        System.out.print(column + " ");
                    }
                    System.out.println();
                }
                if (rows == 2) {
                    for (int column = 4; column <= 6; column++) {
                        System.out.print(column + " ");
                    }
                    System.out.println();
                }
                if (rows == 3) {
                    for (int column = 7; column <= 9; column++) {
                        System.out.print(column + " ");
                    }
                    System.out.println();
                }
            }
                System.out.println("Another example-5");
                    for (int column = 1; column <=9; column++) {
                        System.out.print(column + " ");
                        if (column % 3 == 0) {
                            System.out.println();
                        }
                    }
                        System.out.println("Another example-6");
                    int val=1;
        for (int k = 1; k <=3; k++){
    for (int columns = 1; columns <=3; columns++) {
        System.out.print(val + " ");
    val++;}
            System.out.println();}


    }
                    }








