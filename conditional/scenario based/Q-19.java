import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data usage percentage: ");
        int usage = scanner.nextInt();
        if (usage >= 0 && usage < 50) {
            System.out.println("Low Data");
        } 
        else if (usage >= 50 && usage < 100) {
            System.out.println("Half Consumed");
        } 
        else if (usage >= 100) {
            System.out.println("Data Over");
        } 
        else {
            System.out.println("Invalid data ");
        }

    }
}


