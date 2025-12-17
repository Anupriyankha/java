import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        String bin = sc.next();
        int zeros = 0, ones = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '0') zeros++;
            else if (bin.charAt(i) == '1') ones++;
        }
        System.out.println("0s = " + zeros);
        System.out.println("1s = " + ones);
    }
}
