import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first alphabet: ");
        char start = sc.next().charAt(0);

        System.out.print("Enter second alphabet: ");
        char end = sc.next().charAt(0);

        for (char ch = start; ch <= end; ch++) {
            System.out.print(ch + " ");
        }
    }
}

