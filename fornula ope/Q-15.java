import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();

    
        double surfaceArea = 2 * Math.PI * radius * (radius + height);

    
        double volume = Math.PI * radius * radius * height;

        System.out.println("Surface Area of Cylinder = " + surfaceArea);
        System.out.println("Volume of Cylinder = " + volume);
    }
}








