import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side: ");
        double side3 = scanner.nextDouble();

        System.out.print("Enter the fourth side: ");
        double side4 = scanner.nextDouble();
        
            if (side1 == side2 && side2 == side3 && side3 == side4) {
                System.out.println("The sides form a Square.");
            } 
            else if (side1 == side3 && side2 == side4) {
                System.out.println("The sides form a Rectangle.");
            } else {
                System.out.println("The sides do NOT form a Square or Rectangle.");
            }
        }


    }









