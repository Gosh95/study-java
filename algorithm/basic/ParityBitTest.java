public class ParityBitTest {
    public static void main(String[] args) {
        //맨 앞이 1이면 홀수 0이면 짝수 패리티이다.
        //나머지 8개는 데이터를 갖는 영역.
        int[] parity = {0, 1, 0, 0, 1, 0, 0, 0, 1};
        int count = 0;

        for (int i = 1; i < 9; i++) {
            if (parity[i] == 1) {
                count++;
            }
        }

        int check = count % 2; //0인지 1인지 검사 숫자변수

        if (check == parity[0]) {
            System.out.println("에러없음");
        } else {
            System.out.println("에러발견"); //에러발견
        }
    }
}
