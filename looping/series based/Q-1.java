import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = scanner.nextInt();

        System.out.println("First " + n + " natural numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

    }
}
