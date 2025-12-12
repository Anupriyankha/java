import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an ASCII value: ");
        int ascii = sc.nextInt();

        char ch = (char) ascii; // Convert integer ASCII to character

        System.out.println("Character for ASCII value " + ascii + " is: " + ch);
    }
}



