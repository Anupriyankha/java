import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check using bitwise AND operator
        boolean isPowerOfTwo = (num > 0) && ((num & (num - 1)) == 0);

        System.out.println(num + " is power of 2? " + isPowerOfTwo);
    }
}
