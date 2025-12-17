import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int bin = sc.nextInt();
        int decimal = 0, power = 0;
        while (bin > 0) {
            int digit = bin % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            bin /= 10;
        }
        System.out.println("Decimal = " + decimal);
    }
}
