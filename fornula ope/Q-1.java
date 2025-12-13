import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length :");
        int length=sc.nextInt();
    
        System.out.print("Enter the breadth :");
        int breadth=sc.nextInt();
        int Area=length*breadth;
         System.out.print("The Area of Rectangle = "+" "+Area);
    
    }
}

