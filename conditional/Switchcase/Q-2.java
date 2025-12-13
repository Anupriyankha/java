import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!");
        } else {
            switch (marks / 10) {
                case 10:
                case 9:
                case 8:
                    System.out.println("Grade: A");
                    break;

                case 7:
                case 6:
                    System.out.println("Grade: B");
                    break;

                case 5:
                case 4:
                    System.out.println("Grade: C");
                    break;

                default:
                    System.out.println("Grade: Fail");
            }
        }

    }
}


















