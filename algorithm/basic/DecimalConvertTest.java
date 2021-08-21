public class DecimalConvertTest {
    public static void main(String[] args) {
        //2진수를 10진수로 변환하는 알고리즘을 제시하라.
        //2진수의 맨 앞 이 1이면 양수 0이면 음수이다.
        int[] binary = {1, 1, 1, 1, 0, 1, 1, 0};
        int[] one = new int[8]; //임시 1의 보수 배열
        int decimal = 0; //10진수 값
        int sign = 1; //양수 음수 부호 결정

        if (binary[0] != 0) {//첫번째 값이 1이면 음수
            sign = -1;
            int burrow = 1;

            for (int i = 7; i >= 1; i--) {
                one[i] = binary[i] - burrow; //1의 보수 임시 저장

                if (binary[i] != 0 || burrow != 1) {
                    burrow = 0; //더이상 숫자를 빌리지 않아도 된다. burrow 초기화
                }

                one[i] = Math.abs(one[i]);
                binary[i] = 1 - one[i]; //1의 보수를 2진수로 변환
            }
        }

        for (int i = 1; i <= 7; i++) {
            int power = (int) Math.pow(2, (7 - i));
            if (binary[i] == 1) {
                decimal += power;
            }
        }

        decimal *= sign;
        System.out.println(decimal);//-10
    }
}
