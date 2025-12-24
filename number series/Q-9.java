public class Main {
    public static void main(String[] args) {
        int n = 10;
        int term = 1; 
        int diff = 1; 

        System.out.print(term + " ");

        for (int i = 1; i < n; i++) {
            term += diff;
            System.out.print(term + " ");
            diff++; 
        }
    }
}
