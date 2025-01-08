import java.util.*;
public class VolumeofCyclinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();
        double Volume = 3.14* radius* radius*height;
        System.out.println("Volume of Cyclinder: "+ Volume);
    }

}
