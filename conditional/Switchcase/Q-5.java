import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 10000;   
        int choice;
        double amount;
            System.out.println("\n--- MINI ATM ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    amount = scanner.nextDouble();
                    if (amount > 0) {
                        balance =balance+ amount;
                        System.out.println("Deposit successful.");
                        System.out.println("Updated Balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    amount = scanner.nextDouble();
                    if (amount > 0 && amount <= balance) {
                        balance =balance- amount;
                        System.out.println("Please collect your cash.");
                        System.out.println("Remaining Balance: ₹" + balance);
                    } else {
                        System.out.println("Insufficient balance or invalid amount!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        
    }
}




















