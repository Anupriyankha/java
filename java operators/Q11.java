import java.util.Scanner;
public  class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number :");
        int num=sc.nextInt();
        int absvalue=Math.abs(num);
        System.out.println("The absolute value of "+num+" "+"is"+" "+absvalue);
}
}






