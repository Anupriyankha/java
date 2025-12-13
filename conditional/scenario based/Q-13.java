import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the battery percentage :");
        int battery = sc.nextInt();
        if (battery >= 80 && battery <= 100) {
            System.out.println(" Full");
        } else if (battery >= 30 && battery < 80) {
            System.out.println(" Moderate");
        } else if (battery >= 0 && battery < 30) {
            System.out.println(" Low");
        } else {
            System.out.println("Invalid battery");
        }
    }
}



