import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();
        if (battery >= 0 && battery <= 20) {
            System.out.println("Low Battery");
        } else if (battery >= 21 && battery <= 80) {
            System.out.println("50% Consumed");
        } else if (battery >= 81 && battery <= 100) {
            System.out.println("Battery Full");
        } else {
            System.out.println("Invalid");
        }
    }
}
























