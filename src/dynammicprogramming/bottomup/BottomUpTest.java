package dynammicprogramming.bottomup;

public class BottomUpTest {
    public static void main(String[] args) {
//        long startTime = System.nanoTime();
//
//        System.out.println(fibonacci(35)); //0.000264 sec
//
//        long endTime   = System.nanoTime();
//        long totalTime = endTime - startTime;
//        System.out.println(totalTime);

        long startTime = System.nanoTime();

        System.out.println(fibonacci(1000000)); //0.029891 sec

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

//        long startTime1 = System.nanoTime();
//
//        System.out.println(fibonacci(1000000)); //0.029891 sec
//
//        long endTime1   = System.nanoTime();
//        long totalTime1 = endTime1 - startTime1;
//        System.out.println(totalTime1);
    }

    private static int fibonacci(int n) {
        if(n == 1 || n == 2) return 1;
        int[] bottomUp = new int[n+1];
        bottomUp[1] = 1;
        bottomUp[2] = 1;

        for(int i = 3; i<=n; i++) {
            bottomUp[i] = bottomUp[i-2]+bottomUp[i-1];
        }
        return bottomUp[n];
    }
}
