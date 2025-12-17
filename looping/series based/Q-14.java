import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0, count = 0;
        while (count < n) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
