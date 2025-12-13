import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        double bill = 0;
        if (units <= 100) {
            bill = 0;  
        } else if (units <= 300) {
            bill = (units - 100) * 5; 
        } else {
            bill = (200 * 5) + (units - 300) * 10; 
        }

        if (units > 500) {
            double surcharge = bill * 0.10; 
            bill += surcharge;
        }

        System.out.println("Total electricity bill: ₹" + bill);

        scanner.close();
    }
}



