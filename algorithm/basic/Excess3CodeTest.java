public class Excess3CodeTest {
    public static void main(String[] args) {
        int[] bcd = {0, 1, 0, 1};
        int[] excess = new int[4];
        int[] add = {0, 0, 1, 1}; //3초과를 만들기 위한 변수
        int carry = 0; //캐리

        for (int i = 3; i >= 0; i--) {
            int sum = bcd[i] + add[i] + carry;

            if (sum > 1) {
                excess[i] = sum % 2;
                carry = 1; //한 자릿수가 1을 초과하므로 캐리는 1
            } else {
                excess[i] = sum;
                carry = 0;
            }
        }

        for (int j = 0; j <= 3; j++) {
            System.out.print(excess[j]); //1000
        }
    }
}
