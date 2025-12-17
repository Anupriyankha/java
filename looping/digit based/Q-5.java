import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        num = Math.abs(num);  
        boolean decending = true;
        int prevDigit = -1;    
        while (num > 0) {
            int currentDigit = num % 10;
            if (currentDigit < prevDigit) {
                decending= false;
                break;
            }

            prevDigit = currentDigit;
            num = num / 10;
        }

        if (decending) {
            System.out.println("Digits are in decending order.");
        } else {
            System.out.println("Digits are NOT in decending order.");
        }
    }
}
