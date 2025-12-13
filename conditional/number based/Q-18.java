import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
       System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int lastDigit1 = Math.abs(num1 % 10);
        int lastDigit2 = Math.abs(num2 % 10);
        if (lastDigit1 == lastDigit2) {
            System.out.println("Both numbers have the same last digit: " + lastDigit1);
        } else {
            System.out.println("The numbers have different last digits.");
        }
    }
}











