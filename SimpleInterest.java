import java.util.*;
public class SimpleInterest {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int  Principle = sc.nextInt();
        System.out.print("Enter Rate: ");
        float Rate = sc.nextFloat();
        System.out.print("Enter Time: ");
        float Time = sc.nextInt();
        
        double SI = (Principle*Rate*Time)/100;

        System.out.println("Simple Interest is : "+ SI);

        }
}
