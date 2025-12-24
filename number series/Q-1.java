import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += (double) i / (i + 1);
        }

        System.out.println("Sum = " + sum);
    }
}
