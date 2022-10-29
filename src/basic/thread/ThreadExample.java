package basic.thread;

public class ThreadExample extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        System.out.println(i);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}
