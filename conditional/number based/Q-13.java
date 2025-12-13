import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num=Math.abs(num);
        int lastnum =num % 10;
        if (lastnum % 2 == 0) {
            System.out.println("Even");
        } 
        else {
            System.out.println("Odd");
        }
    }
}






