import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        num = Math.abs(num); 
        String numStr = Integer.toString(num);

        System.out.println("Digits in words:");
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);

            switch (ch) {
                case '0': System.out.println("Zero"); break;
                case '1': System.out.println("One"); break;
                case '2': System.out.println("Two"); break;
                case '3': System.out.println("Three"); break;
                case '4': System.out.println("Four"); break;
                case '5': System.out.println("Five"); break;
                case '6': System.out.println("Six"); break;
                case '7': System.out.println("Seven"); break;
                case '8': System.out.println("Eight"); break;
                case '9': System.out.println("Nine"); break;
            }
        }
    }
}
