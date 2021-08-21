package ch17;

import java.io.IOException;

class ThreadTest extends Thread {
    private boolean flag = false;
    int time = 0;

    public void run() {
        System.out.println("1 + 1 = ?? \t A : 2  B : 0");

        while (!flag) {

            System.out.print(time + "\t");

            try {

                sleep(1000);

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            time += 1;

            if (this.time == 10) {
                System.out.println("Time Out");
                this.setFlag(true);
                break;
            }
        }

    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

public class SimpleProblemTest extends Thread {

    public static void main(String[] args) throws IOException {
        ThreadTest tt = new ThreadTest();

        tt.start();

        int i;
        while (true) {
            i = System.in.read();

            if (i == 'A') {
                tt.setFlag(true);
                System.out.println("True");
                break;
            } else if (i == 'B') {
                tt.setFlag(true);
                System.out.println("False True is A");
                break;
            }
        }
    }
}

