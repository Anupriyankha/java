import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num=Math.abs(num);
        int firstDigit =num / 100;
        if (firstDigit % 2 == 0) {
            System.out.println("Even");
        } 
        else {
            System.out.println("Odd");
        }
    }
}






