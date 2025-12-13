import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the sphere: ");
        double radius = sc.nextDouble();

        
        double surfaceArea = 4 * Math.PI * radius * radius;

        double volume = (4.0 / 3) * Math.PI * radius * radius * radius;

        System.out.println("Surface Area of Sphere = " + surfaceArea);
        System.out.println("Volume of Sphere = " + volume);
    }
}







