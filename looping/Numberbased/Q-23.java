import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int lcm;
        int max;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                lcm = max;
                break;
            }
            max++;
        }
        System.out.println("LCM  is: " + lcm);
    }
}

