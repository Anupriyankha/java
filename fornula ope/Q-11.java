import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference of Circle = " + circumference);
    }
}





