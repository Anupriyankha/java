import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the digit to count: ");
        int digit = scanner.nextInt();
        num = Math.abs(num); 
        int count = 0;

        while (num > 0) {
            int lastDigit = num % 10;

            if (lastDigit == digit) {
                count++;
            }

            num = num / 10;
        }

        System.out.println(count);
    }
}
