package ch07;

public class ConstantTest {

    public static void main(String[] args) {

        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 20;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

//		MIN_NUM = 300;
//		System.out.println(MIN_NUM);	상수는 변할 수 없기 때문에 한번 세팅하면 바꿀 수 없

    }

}
