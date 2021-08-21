package ch17;

public class PriorityTest extends Thread {


    @Override
    public void run() {
        int total = 0;

        Thread t = Thread.currentThread();
        System.out.println(t + "start");

        for (int i = 0; i < 100000; i++) {
            total += i;
        }

        System.out.println(t.getPriority() + " end");
    }

    public static void main(String[] args) {
        //for(int i = Thread.MIN_PRIORITY; i < Thread.MAX_PRIORITY; i++) {
        PriorityTest pt1 = new PriorityTest();
        PriorityTest pt2 = new PriorityTest();
        PriorityTest pt3 = new PriorityTest();

        pt1.setPriority(Thread.MIN_PRIORITY);
        pt2.setPriority(Thread.MAX_PRIORITY);
        pt3.setPriority(Thread.NORM_PRIORITY);

        pt1.start();
        pt2.start();
        pt3.start();
        //스레드에 우선순위를 정할 수 있다.
        //보통 높은 우선순위의 스레드가 먼저 작업을 끝내지만 반드시 그런 것은 아니다.

    }

}
