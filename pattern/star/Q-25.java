import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print("  "); 
            }
            for (int j = i; j >= 0; j--) {
                System.out.print((char)('A' + j) + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j) + " ");
            }

            System.out.println();
        }
    }
}
