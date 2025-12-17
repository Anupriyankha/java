import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= num2; i++) {
            result = result + num1;
        }

        System.out.println("Multiplication result = " + result);
        }
}
