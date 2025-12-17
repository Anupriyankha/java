import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        num = Math.abs(num); 
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0) {
                reversed = reversed * 10 + digit;
            }
            num /= 10;
        }

        int result = 0;
        while (reversed > 0) {
            int digit = reversed % 10;
            result = result * 10 + digit;
            reversed /= 10;
        }

        System.out.println("Number after removing zeros: " + result);
    }
}
