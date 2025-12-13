import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bill Amount: ");
        double billAmount = scanner.nextDouble();

        double discount = 0;
        if (billAmount >= 5000) {
            discount = billAmount * 0.20;
        } else if (billAmount >= 3000) {
            discount = billAmount * 0.15;
        } else if (billAmount >= 1000) {
            discount = billAmount * 0.10;
        } else {
            discount = 0;
        }
        double finalAmount = billAmount - discount;
        System.out.println("Bill Amount   : ₹" + billAmount);
        System.out.println("Discount      : ₹" + discount);
        System.out.println("Payable Amount: ₹" + finalAmount);

    }
}





















