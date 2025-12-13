import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number : ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a Weekday.");
                break;

            case 6:
            case 7:
                System.out.println("It is a Weekend.");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}



















