package ch02;

class Outter {

    Runnable getRunnable(int i) {
        int num = 10;

        return new Runnable() {

            @Override
            public void run() {
                //Runnable 안의 변수는 final 처리가 되어있기 때문에 값을 바꿀 수 없다.
                //num = 100; error

                System.out.println(num);
                System.out.println(i);
            }

        };

    }

    Runnable runnable = new Runnable() {

        @Override
        public void run() {
            System.out.println("Anonymous Test");
        }

    }; //anonymous
}

public class AnonymousInnerTes {

    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.runnable.run(); //Anonymous Test

        outter.getRunnable(20).run(); // 10, 20
    }

}
