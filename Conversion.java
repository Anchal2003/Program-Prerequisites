import java.util.*;
public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius: ");
        float Celsius = sc.nextInt();
        float Fahrenheit = (Celsius *9/5) +32;
        System.out.println("Temperature in Fahrenheit is: "+ Fahrenheit);
    }

}
