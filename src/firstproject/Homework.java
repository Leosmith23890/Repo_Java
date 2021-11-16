package firstproject;



public class Homework {
    public static void main(String[] args) {
        int[] arrayName = {41, -5, 16, 97, 0, 91};
        int maximumValue = arrayName[0];
        for (int i = 1; i < arrayName.length; i++) {
            if (arrayName[i] > maximumValue) {
                maximumValue = arrayName[i];

            }

        }
        System.out.println("The maximum value is "+maximumValue);
    }}




