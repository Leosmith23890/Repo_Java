package test;

public class SecondMain {


    public static int maxArrayMethod(int[] inputArray) {

        int[] arrayName = inputArray;
        int maximumValue = arrayName[0];
        for (int i = 1; i < arrayName.length; i++) {
            if (arrayName[i] > maximumValue) {
                maximumValue = arrayName[i];

            }

        }
        return(maximumValue);
    }
}
