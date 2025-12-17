import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int count = 0, num = 1;
        while (count < n) {
            System.out.print(num + " ");
            num += 2;
            count++;
        }
    }
}
