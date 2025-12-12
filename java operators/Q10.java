import java.util.Scanner;
public  class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number :");
        int a=sc.nextInt();
        int b=(a/10)%10;
        System.out.println("The middle  number  of " +" "+a+" is"+" "+b);
    }
}






