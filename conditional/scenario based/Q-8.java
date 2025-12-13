import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storedPin = 1234;
        int enteredPin;
        double balance = 5000.0; 
        System.out.print("Enter your ATM PIN: ");
        enteredPin = sc.nextInt();
        if (enteredPin == storedPin) {
            System.out.println("verified");
            System.out.print("Enter the amount to withdraw: ");
            double amount = sc.nextDouble();
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: $" + balance);
            } else if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                System.out.println("Invalid amount");
            }
        } else {
            System.out.println("Incorrect PIN");
    }
}




