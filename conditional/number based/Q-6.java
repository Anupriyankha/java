import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if number is 3-digit
        if (num >= 100 && num <= 999) {
            System.out.println(num + " is a 3-digit number.");
        } else if (num <= -100 && num >= -999) {
            System.out.println(num + " is a 3-digit number.");
        } else {
            System.out.println(num + " is not a 3-digit number.");
        }
    }
}


