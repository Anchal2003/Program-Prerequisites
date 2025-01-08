import java.util.*;
public class PerimeterOfRectangle {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = sc .nextInt();
        System.out.print("Enter Width: ");
        int Width = sc .nextInt();
        
        int perimeter = 2*(length+Width);
        System.out.println("Perimeter of Rectangle is: "+perimeter);
        }
}
