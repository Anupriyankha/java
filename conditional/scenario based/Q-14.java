import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter passenger age: ");
        int age = scanner.nextInt();
        double price;
        if (age >= 0 && age <= 12) {
            price = 5.0;
            System.out.println(" Child");
        } else if (age >= 13 && age <= 59) {
            price = 10.0; 
            System.out.println(" Adult");
        } else if (age >= 60) {
            price = 7.0; 
            System.out.println(" Senior");
        } else {
            System.out.println("Invalid ");
            scanner.close();
            return;
        }

        System.out.println("Ticket price: $" + price);
        scanner.close();
    }
}
 





