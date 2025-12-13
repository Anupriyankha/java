import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second side: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third side: ");
        double c = scanner.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do NOT form a valid triangle.");
        }
    }
}







