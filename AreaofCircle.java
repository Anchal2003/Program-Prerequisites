import java.util.*;
public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();
        double Area = 3.14*radius*radius;
        System.out.println("Area of Circle: "+ Area);
    }

}
