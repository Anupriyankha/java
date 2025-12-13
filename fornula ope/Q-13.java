import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of cuboid: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of cuboid: ");
        double breadth = sc.nextDouble();

        System.out.print("Enter height of cuboid: ");
        double height = sc.nextDouble();

    
        double surfaceArea = 2 * (length * breadth + breadth * height + length * height);

        
        double volume = length * breadth * height;

        System.out.println("Surface Area of Cuboid = " + surfaceArea);
        System.out.println("Volume of Cuboid = " + volume);
    }
}






