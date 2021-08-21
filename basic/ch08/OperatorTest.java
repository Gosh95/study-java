package ch08;

public class OperatorTest {

    public static void main(String[] args) {
        int gameScore1 = 150;
        int gameScore2 = 150;

        int resultScore1 = ++gameScore1; // 플러스 된 상태로 들어간다.
        int resultScore2 = gameScore2++; // 먼저 들어간 다음 플러스 시킨다.

        System.out.println(resultScore1); // 151
        System.out.println(resultScore2); // 150
    }

}
