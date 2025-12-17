import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.print("Enter a digit to search: ");
        int digit = scanner.nextInt();

        num = Math.abs(num); 
        boolean found = false;

        while (num > 0) {
            int lastDigit = num % 10;

            if (lastDigit == digit) {
                found = true;
                break;
            }

            num = num / 10;
        }

        if (found) {
            System.out.println(" present .");
        } else {
            System.out.println(" not present");
        }

    }
}
