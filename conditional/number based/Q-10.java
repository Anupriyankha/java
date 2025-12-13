import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int lastDigit = Math.abs(num % 10); 

        if (lastDigit % 3 == 0) {
            System.out.println("The last digit (" + lastDigit + ") is divisible by 3.");
        } else {
            System.out.println("The last digit (" + lastDigit + ") is not divisible by 3.");
        }
    }
}




