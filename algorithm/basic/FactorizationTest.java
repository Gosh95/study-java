import java.util.Scanner;

public class FactorizationTest {
    public static void main(String[] args) {
        //자연수 N을 입력받아 소인수 분해하여 그 결과를 출력하는 과정을 반복하는 알고리즘을 제시하라.
        //입력받은 수가 소수이면 소수라고 출력하고 2보다 작으면 알고리즘 종료.
        int[] num = new int[20]; //소인수 배열
        Scanner scanner  = new Scanner(System.in);
        int N = scanner.nextInt(); //입력받은 숫자
        int position = 0;

        do {
            if(N >= 2) {
                int i  = 2;
                for(; i <= N; i++) {
                    if(N % i == 0) break;
                }

                num[position] = i; //소인수 배열에 입력.
                N /= i; //소인수 만큼 입력받은 수를 나눈다.
                position++;
            } else {
                return;
            }
        } while(N != 1);

        if(position == 1) {//나눠지는 수가 하나
            System.out.println("소수 입니다.");
        } else {
            for(int j = 0; j < position - 1; j++) {
                System.out.print(num[j] + "*");
            }
            System.out.println(num[position - 1]);
        } //if N == 30 print 2*3*5
    }
}
