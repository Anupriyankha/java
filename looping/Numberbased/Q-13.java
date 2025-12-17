import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 1) {
            System.out.println(num + " is not a power of 3.");
        } else {
            while (num % 3 == 0) {
                num /= 3;
            }
            if (num == 1) System.out.println("Yes, it is a power of 3.");
            else System.out.println("No, it is not a power of 3.");
        }
    }
}
