import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int lastDigit = N % 10;

        System.out.println("Last digit of " + N + " is: " + lastDigit);
    }
}






