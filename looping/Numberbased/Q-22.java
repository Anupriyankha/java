import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        int digit;
        while (number != 0) {
            digit = number % 10;         
            sum = sum + (digit * digit * digit);
            number = number / 10;        
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " Armstrong number.");
        } else {
            System.out.println(originalNumber + "  not an Armstrong number.");
        }
    }
}
