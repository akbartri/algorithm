package basic.thread;

public class ThreadTest {
    public static void main(String[] args) {
//        ThreadExample threadExample = new ThreadExample();
//        ThreadExample threadExample1 = new ThreadExample();
//        threadExample.start();
//        threadExample1.start();

        AnotherThreadExample anotherThreadExample = new AnotherThreadExample();
        Thread thread = new Thread(anotherThreadExample);
        thread.start();

//        .isAlive()
//        .join()
    }
}
