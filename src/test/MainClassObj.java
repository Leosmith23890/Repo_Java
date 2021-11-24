package test;

public class MainClassObj {
    public static void main(String[] args) {
        MainClass revStr = new MainClass();
        String result = revStr.reverseString("May God bless you all");

        System.out.println(result);

        String result1= revStr.reverseSentence("Never regret anything that made you smile");
        System.out.println(result1);
    }
}
