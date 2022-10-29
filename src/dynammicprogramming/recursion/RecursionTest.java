package dynammicprogramming.recursion;

public class RecursionTest {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        System.out.println(fibonacci(35)); //0.030631 sec

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    private static int fibonacci(int n) {
        if(n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
