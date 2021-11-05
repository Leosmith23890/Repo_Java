package firstproject;

public class CelciusToFahren {
    public static void main(String[] args) {



        System.out.println("\nConverting Celsius to Fahrenheit");
        double tempCelsius1 = 100;
        double tempFah1= (tempCelsius1)*9/5+32;
        System.out.println("100° Celsius is equivalent to :" +tempFah1+"°F");

        System.out.println("\nConverting  Celsius to Kelvin");
        double tempCelsius2 = 99;
        double tempKelvin= (tempCelsius2)+273.15;
        System.out.println("99° Celsius is equivalent to :" +tempKelvin +"K");


        System.out.println("\nConverting Fahrenheit to Celsius");
        double tempFah2 = 210;
        double tempCelsius3= (tempFah2-32)*5/9;
        System.out.println(" 210° Fahrenheit is equivalent to :" +tempCelsius3 +"°C");

        System.out.println("\nConverting Fahrenheit to Kelvin");
        double tempFah3 = 365;
        double tempKelvin1= (tempFah3-32)*5/9+273.15;
        System.out.println("365° Fahrenheit is equivalent to :" +tempKelvin1+"K");

        System.out.println("\nConverting Kelvin to Celsius");
        double tempKelvin2 = 525;
        double tempCelsius4= (tempKelvin2-273.15);
        System.out.println("525 Kelvin is equivalent to :" +tempCelsius4 +"°C");

        System.out.println("\nConverting Kelvin to Fahrenheit");
        double tempKelvin3 = 452;
        double tempFah4= (tempKelvin3-273.15)*9/5+32;
        System.out.println("452 Kelvin is equivalent to :" +tempFah4 +"°F");
    }}
