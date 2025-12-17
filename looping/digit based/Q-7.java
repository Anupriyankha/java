import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = scanner.next();
        for (char digit = '0'; digit <= '9'; digit++) {
            int count = 0;
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == digit) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println("Digit " + digit + " occurs " + count + " time(s).");
            }
        }

    }
}
