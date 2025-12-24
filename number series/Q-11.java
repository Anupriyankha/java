public class Main {
    public static void main(String[] args) {
        int n = 10; 
        int term = 2;
        int diff = 3; 

        System.out.print(term + " ");

        for (int i = 1; i < n; i++) {
            term += diff;
            System.out.print(term + " ");
            diff += 2; 
        }
    }
}
