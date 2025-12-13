import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first year: ");
        int year1 = scanner.nextInt();

        System.out.print("Enter the second year: ");
        int year2 = scanner.nextInt();
        int lastDigit1 = year1 % 10;
        int lastDigit2 = year2 % 10;
        if (lastDigit1 == lastDigit2) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}













