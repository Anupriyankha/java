import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle speed in km/h: ");
        double speed = scanner.nextDouble();
        if (speed > 100) {
            System.out.println("Speed exceeds 100 km/h.");
        } else if (speed >= 0) {
            System.out.println("Speed is within limit.");
        } else {
            System.out.println("Invalid speed entered");
        }

    }
}
