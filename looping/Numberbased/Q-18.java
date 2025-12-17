import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int c=0;
        if(n==0){
            System.out.println("1");
            return;
        }
        while(n!=0){
            c++;
            n/=10;
        }
        System.out.println(c);
    }
}



