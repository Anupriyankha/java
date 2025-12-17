import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sqrt = (int) Math.sqrt(num);
        if (sqrt * sqrt == num){
            System.out.println( "Perfect Square.");
        } else {
            System.out.println(" not Perfect Square.");
        }
    }
}
