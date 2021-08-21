package ch16;

public class ThreadTest extends Thread {
    //thread method 1

    public void run() {
        for (int i = 1; i <= 200; i++) {
            System.out.print(i + "->");
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + "start");

        ThreadTest test1 = new ThreadTest();
        ThreadTest test2 = new ThreadTest();

        test1.start();
        test2.start();
        //두개의 스레드가 스위치를 하면서 수행

        System.out.println(Thread.currentThread() + "end");
    }

}
