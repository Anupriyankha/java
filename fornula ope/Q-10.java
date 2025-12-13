import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1 of the triangle : ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2 of the triangle : ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3 of the triangle : ");
        double side3= sc.nextDouble();
        double perimeter =side1+side2+side3;

        System.out.println("Perimeter of triangle = " + perimeter);
    }
}




