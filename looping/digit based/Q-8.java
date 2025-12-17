import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        num = Math.abs(num); 

        int largest = 0;

        while (num > 0) {
            int digit = num % 10; 

            if (digit > largest) {
                largest = digit; 
            }

            num = num / 10; 
        }

        System.out.println("Largest digit is: " + largest);

    }
}
