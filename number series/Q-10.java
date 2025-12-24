public class Main {
    public static void main(String[] args) {
        int n = 10;
        int term = 24; 
        int diff = 75; 
        int increment = 50; 

        System.out.print(term + " ");

        for (int i = 1; i < n; i++) {
            term += diff;
            System.out.print(term + " ");
            diff += increment; 
        }
    }
}
