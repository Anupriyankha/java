import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. x^1 - x^2 + x^3 - x^4 + ... - x^20 (x=2)");
        System.out.println("2. 1, 11, 111, 1111, ... up to n terms");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int x = 2;
                long sum = 0;
                for (int i = 1; i <= 20; i++) {
                    long term = (long) Math.pow(x, i);
                    if (i % 2 == 0) {
                        term = -term;
                    }
                    sum += term;
                }
                System.out.println("Sum of series = " + sum);
                break;

            case 2:
                System.out.print("Enter number of terms: ");
                int n = sc.nextInt();
                long num = 0;
                System.out.println("Series:");
                for (int i = 1; i <= n; i++) {
                    num = num * 10 + 1;
                    System.out.print(num + " ");
                }
                System.out.println();
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
