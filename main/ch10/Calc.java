package ch10;

public interface Calc {
    public final double PI = 3.14;
    public final int ERROR_NUM = -999999;

    public int add(int a, int b);

    public int substract(int a, int b);

    public int divide(int a, int b);

    public int times(int a, int b);

    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod();
    }

    public static int total(int[] arr) {
        int total = 0;

        for (int num : arr) {
            total += num;
        }

        myStaticMethod();
        return total;
    }

    private void myMethod() {
        System.out.println("MyMethod");
    }

    private static void myStaticMethod() {
        System.out.println("MyStaticMethod");
    }
}
