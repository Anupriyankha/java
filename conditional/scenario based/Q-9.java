import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 10000.0;

        System.out.print("Enter the withdrawal amount: ");
        double amount = scanner.nextDouble();
        if (amount <= balance) {
            
            if (amount % 100 == 0) {
                balance -= amount;
                System.out.println("Withdrawal successful! Remaining balance: $" + balance);
            } else {
                System.out.println("Invalid amount");
            }
        } else {
            System.out.println("Insufficient balance");
        }

    
    }
}





