import java.util.Scanner;
public class  Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        num=Math.abs(num);
    int sumeven=0;
    int  sumodd=0;
        while(num>0){
            int digit=num%10;
            if(digit%2==0){
                sumeven+=digit;
            }
            else{
                sumodd+=digit;
            }
            num=num/10;
        }
        int diff=sumeven-sumodd;
   System.out.println("even "+sumeven);
   System.out.println("odd "+sumodd);
   System.out.println("diifernce "+diff);
    }
}