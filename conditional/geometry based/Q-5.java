import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        int a = sc.nextInt();

        System.out.print("Enter the second side of the triangle: ");
        int b = sc.nextInt();

        System.out.print("Enter the third side of the triangle: ");
        int c = sc.nextInt();
        

            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }

        
        
    }
}




