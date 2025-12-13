import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 60) {
            System.out.println("eligible");
        } else if (age >= 0) {
            System.out.println("not eligible");
        } else {
            System.out.println("Invalid");
        }
    }
}























