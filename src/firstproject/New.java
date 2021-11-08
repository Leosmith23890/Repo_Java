package firstproject;

public class New {
    public static void main(String[] args) {

     int a=5, b=4, c=6,d=7;
     boolean result = (a>b)|| (b>c) && (a>c)||(a>d);
                    //5>4 ||4>6 && 5>6 || 5>7 true || false && false || false
                    //                          true && false ----> false
                                //              true || false || false ---> true
        System.out.println(result);


    }
}
