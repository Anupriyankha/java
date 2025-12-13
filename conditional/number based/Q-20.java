import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int product = num1 * num2;

        if (product > 0) {
            System.out.println("The product (" + product + ") is Positive.");
        } else if (product < 0) {
            System.out.println("The product (" + product + ") is Negative.");
        } else {
            System.out.println("The product is Zero.");
        }
    }
}













