public class Fibonacci2 {
    public static void main(String[] args) {
        int limit = 20; 

        long[] fibonacciSequence = new long[limit];
        fibonacciSequence[0] = 0;

        if (limit > 1) {
            fibonacciSequence[1] = 1;
            for (int i = 2; i < limit; i++) {
                fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
            }
        }

        System.out.print("Fibonacci sequence up to  " + limit + ": ");
        for (int i = 0; i < limit; i++) {
            System.out.print(fibonacciSequence[i] + " ");
        }
    }
}
