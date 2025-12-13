import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
            int firstTwoDigits = year / 100;  
            int lastTwoDigits = year % 100;  
            if (firstTwoDigits == lastTwoDigits) {
                System.out.println("equal.");
            } else {
                System.out.println("not equal.");
            }
        
    }
}












