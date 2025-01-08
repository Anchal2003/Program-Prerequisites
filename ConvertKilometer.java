import java.util.*;
public class ConvertKilometer {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Kilometers: ");
            int Km = sc.nextInt();
            double miles = Km *0.621371;
            System.out.println("MIles :"+ miles);
           
        }
}
