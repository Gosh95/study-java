public class DecimalTest {
    public static void main(String[] args) {
        //1 부터 100까지의 소수 중 가장 큰 소수를 출력
        int decimal = 2; //가장 큰 소수의 변수
        int number = 3; //자연수 3부터 소수 체크

        while (true) {
            double temp = Math.sqrt(number);
            int m = (int) temp;

            for (int i = 2; i <= m; i++) {
                int r = number % i;

                if (r == 0) break; //중간에 나눠지는 수가 있으므로 반복 탈출
                if (i == m) decimal = number; //끝까지 나눠지는 수가 없으므로 소수변수를 바꿔준다.
            }

            number++;

            if (number > 100) break;
        }
        System.out.println(decimal);
    }
}
