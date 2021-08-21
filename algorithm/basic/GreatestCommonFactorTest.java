import java.util.Scanner;

public class GreatestCommonFactorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        if (X < Y) {//X가 Y보다 크면 계산하기 편하게 스왑해준다.
            int temp = X;
            X = Y;
            Y = temp;
        }

        for (; ; ) {//무한반복
            int R = X % Y;

            if (R == 0) break; //X와 Y의 최대 공약수는 Y가 된다.

            X = Y;
            Y = R;
        }
        //X - 100 Y - 80
        System.out.println(Y); //20
    }
}
