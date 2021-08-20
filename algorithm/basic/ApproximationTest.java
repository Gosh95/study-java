import java.util.Scanner;

public class ApproximationTest {
    public static void main(String[] args) {
        //입력받은 값에 가장 가까운 근사값을 찾아 첨자를 출력하는 알고리즘을 제시하라.
        int[] arr = {131, 450, -100, 150, 50, -10, 0, 40, 32, 1}; //절대값이 500이하
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int maxCha = input - (-500); //가장 큰 차
        int position = 0;
        int temp = position;
        int minCha = 0;

        do {
            if(arr[position] >= input) {
                minCha = arr[position] - input;
            } else {
                minCha = input - arr[position];
            }

            if(maxCha > minCha) {
                maxCha = minCha;
                temp = position;
            }

            position++;
        } while(position < arr.length);

        System.out.println("근사값 : " + arr[temp] + ", " + (temp + 1) + "번째");
        //140
        //근사값 : 131, 1번째
    }
}
