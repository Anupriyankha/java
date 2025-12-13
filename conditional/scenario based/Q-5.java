import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your temperature : ");
        double temperature = sc.nextDouble();
        if (temperature > 100) {
            System.out.println("You have a fever.");
        } else {
            System.out.println("Your temperature is normal.");
        }

    }
}

