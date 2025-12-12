import java.util.Scanner;

public class PrintBloodGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your blood group: ");
        String bloodGroup = sc.nextLine();

        System.out.println("Blood Group: " + bloodGroup);
    }
}
