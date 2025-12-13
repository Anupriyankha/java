import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius:");
        double radius=sc.nextDouble();
        double Area=Math.PI*radius*radius;
        System.out.print("The Area of Circle = "+" "+Area);
    
    }
}

