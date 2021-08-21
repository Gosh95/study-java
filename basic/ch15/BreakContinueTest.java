package ch15;

public class BreakContinueTest {

    public static void main(String[] args) {
        int num;
        int total = 0;

        for (num = 0; ; num++) {
            total += num;

            if (total == 50) break; // 50 되면 반복 중
        }

        System.out.println(total);

        for (int i = 0; i <= 50; i++) {
            if (i % 5 == 0) { // 5의 배수만 출력
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}
