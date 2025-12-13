import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temp = sc.nextDouble();
        if (temp < 10) {
            System.out.println("Cold");
        } else if (temp >= 10 && temp < 20) {
            System.out.println("Pleasant");
        } else if (temp >= 20 && temp < 35) {
            System.out.println("Hot");
        } else {
            System.out.println("Heatwave");
        }
    }
}


