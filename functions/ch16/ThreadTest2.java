package ch16;

public class ThreadTest2 implements Runnable {
    //thread method 2

    @Override
    public void run() {
        for (int i = 1; i <= 200; i++) {
            System.out.print(i + "->");
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + "start");

        //여러 스레드에 장착해서 사용할 경우 유용
        ThreadTest2 runnable = new ThreadTest2();

        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);

        th1.start();
        th2.start();

        System.out.println(Thread.currentThread() + "end");

        //심플 스레드
        Runnable run = new Runnable() {

            @Override
            public void run() {
                System.out.println("run");
            }

        };

        run.run();
    }
}
