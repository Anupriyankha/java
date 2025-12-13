import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine().trim().toLowerCase();
        double price;
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                price = 10.0; 
                System.out.println("It's a weekday.");
                break;
            case "saturday":
            case "sunday":
                price = 15.0; 
                System.out.println("It's a weekend.");
                break;
            default:
                System.out.println("Invalid day entered!");
                scanner.close();
                return;
        }

        System.out.println("Ticket price: $" + price);
    }
}

