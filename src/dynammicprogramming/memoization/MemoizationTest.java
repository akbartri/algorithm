package dynammicprogramming.memoization;

public class MemoizationTest {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int n = 35;
        Integer[] memo = new Integer[n+1];
        System.out.println(fibonacci(n,memo)); //0.030138 sec
        long endTime  = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);


//        long startTime = System.nanoTime();
//        System.out.println(fibonacci(n,memo));
//
//        long endTime   = System.nanoTime();
//        long totalTime = endTime - startTime;
//        System.out.println(totalTime);
    }

    private static int fibonacci(int n,Integer[] memo) {
        if(memo[n] != null)return memo[n];
        int result = 0;
        if(n == 1 || n == 2) result = 1;
        else result = fibonacci(n-1) + fibonacci(n-2);

        memo[n] = result;
        return result;
    }

    static int fibonacci(int n) {
        if(n == 1 || n == 2) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}
