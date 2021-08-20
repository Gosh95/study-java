import java.util.Scanner;

public class HexadecimalTest {
    public static void main(String[] args) {
        //10진수를 16진수로 변환.
        char[] hexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char[] convert = new char[20];
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 0;
        int M, N; //몫과 나머지 저장 변수

        do {
            M = input / 16; //몫
            N = input % 16; //나머지

            convert[i] = hexa[N];
            input = M;
            i++;
        } while(input >= 16);

        convert[i] = hexa[M];//마지막에 나누지 못한 값 저장
        int temp = i; //뒤집어야하기 때문에 위치 변수 저장

        do {
            System.out.print(convert[temp]); //10진수 = 1000 16진수 = 3E8
            temp--;
        } while(temp >= 0);
    }
}
