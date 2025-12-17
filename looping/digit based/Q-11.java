import java.util.Scanner;
public class  Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        num=Math.abs(num);
        boolean alleven=true;
        boolean allodd=false;
        while(num>0){
            int digit=num%10;
            if(digit%2==0){
                allodd=false;
            }
            else{
                alleven=false;
            }
            num=num/10;
        }
    if(alleven){
        System.out.println("even");
    }
    else if(allodd){
        System.out.println("odd");
    }
    else{
        System.out.println("mixed");
    }
    }
}