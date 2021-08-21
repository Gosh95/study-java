package ch17;

public class JoinTest extends Thread {
    int start;
    int end;
    int total;

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            this.total += i;
        }
    }

    public static void main(String[] args) {
        JoinTest jt1 = new JoinTest(1, 100);
        JoinTest jt2 = new JoinTest(101, 200);

        jt1.start();
        jt2.start();

        try {
            jt1.join();
            jt2.join();
            //join을 걸면 메인 스레드는 작업이 끝날 때까지 기다린다.
            //join을 쓸 때는 반드시 interruptException을 처리해 줘야됨
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
//			Thread가 join(), sleep(), wait() 함수에의해 not-runnable 상태일 때 
//			interrupt() 메서드를 호출하면 다시 runnable 상태가 될 수 있음
        }


        int result = jt1.total + jt2.total;

        System.out.println(jt1.total);
        System.out.println(jt2.total);
        System.out.println(result);

    }

}
