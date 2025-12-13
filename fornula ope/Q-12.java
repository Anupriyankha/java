import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of the cube: ");
        double side = sc.nextDouble();
        double surfaceArea = 6 * side * side;
        double volume = side * side * side;
        double perimeter = 12 * side;

        System.out.println("Surface Area of Cube = " + surfaceArea);
        System.out.println("Volume of Cube = " + volume);
        System.out.println("Perimeter (Sum of edges) of Cube = " + perimeter);
    }
}





