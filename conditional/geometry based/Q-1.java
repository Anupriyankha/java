 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        int a = sc.nextInt();

        System.out.print("Enter the second side of the triangle: ");
        int b = sc.nextInt();

        System.out.print("Enter the third side of the triangle: ");
        int c = sc.nextInt();
        
            if (a * a + b * b == c * c ||
                a * a + c * c == b * b ||
                b * b + c * c == a * a) {
                System.out.println("The triangle is Right-Angled.");
            } else {
                System.out.println("The triangle is not Right-Angled.");
            }
    }
}





