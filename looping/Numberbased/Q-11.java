import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int square = num * num;
        if (String.valueOf(square).endsWith(String.valueOf(num))) 
            System.out.println(num + " is an Automorphic Number.");
        else 
            System.out.println(num + " is not an Automorphic Number.");
    }
}
