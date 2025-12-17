import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.next();
        if (num.length() == 1) {
            System.out.println("Swapped number: " + num); 
        } else {
            String swapped = num.charAt(num.length() - 1) 
                             + num.substring(1, num.length() - 1)
                             + num.charAt(0);
            System.out.println("Swapped number: " + swapped);
        }

    }
}
