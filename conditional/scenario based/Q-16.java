import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine().trim();
        if (mobileNumber.length() == 10 && mobileNumber.matches("\\d+")) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
