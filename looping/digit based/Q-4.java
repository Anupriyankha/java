import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        num = Math.abs(num);  
        boolean ascending = true;
        int prevDigit = 10;    
        while (num > 0) {
            int currentDigit = num % 10;
            if (currentDigit > prevDigit) {
                ascending = false;
                break;
            }

            prevDigit = currentDigit;
            num = num / 10;
        }

        if (ascending) {
            System.out.println("Digits are in ascending order.");
        } else {
            System.out.println("Digits are NOT in ascending order.");
        }
    }
}
