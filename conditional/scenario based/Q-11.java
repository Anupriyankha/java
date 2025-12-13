import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the purchase amount: $");
        double amount = sc.nextDouble();
        double discount = 0;
        if (amount >= 5000) {
            discount = 20; 
        } else if (amount >= 2000) {
            discount = 10; 
        } else if (amount >= 1000) {
            discount = 5;  
        } else {
            discount = 0;  
        }

        double discountAmount = (amount * discount) / 100;
        double finalAmount = amount - discountAmount;

        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Discount amount: $" + discountAmount);
        System.out.println("Amount to pay after discount: $" + finalAmount);


    }
}

