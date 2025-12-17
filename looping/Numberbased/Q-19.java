import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int product= 1;
        int digit;
        while (n != 0) {
            digit = n % 10;   
            product = product* digit;     
            n = n / 10;    
        }
        System.out.println("product of digits = " + product);
    }
}




