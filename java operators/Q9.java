import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int result = N / 10;

        System.out.println("All digit except the Last digit  " + N +" "+ "is"+" "+result);
    }
}






