public class FibIteration {
    public static int fib(int n) {
        //* Put your code here.
        if (n <= 1){ return n; }

        int minus2 = 0;
        int minus1 = 1;
        int fib = 0;
        for(int i = 2; i <= n; i++){
            fib = minus2 + minus1; 
            minus2 = minus1;
            minus1 = fib;
        }

        return fib;
    }

    public static void main(String[] args) {
        int n = 10;
        int n_2 = 2000;

        for (int i = 0; i < n; i++) {
            System.out.println("Fibonacci number " + i + " is: " + fib(i));
        }

        // Instruction: After you have done with n=10; uncomment the following code to run.

        for (int i = 0; i < n_2; i++) {
            System.out.println("Fibonacci number " + i + " is: " + fib(i));
        }
        
    }
}
