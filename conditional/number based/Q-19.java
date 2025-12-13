import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int absNum = Math.abs(num); 

        if (absNum >= 0 && absNum <= 9) {
            System.out.println(num + " is a single-digit number.");
        } else if (absNum >= 10 && absNum <= 99) {
            System.out.println(num + " is a two-digit number.");
        } else if (absNum >= 100 && absNum <= 999) {
            System.out.println(num + " is a three-digit number.");
        } else {
            System.out.println(num + " has more than three digits");
        }
    }
}












