import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();


        String result = (marks >= 40) ? "PASS" : "FAIL";

        System.out.println("Result: " + result);
    }
}

