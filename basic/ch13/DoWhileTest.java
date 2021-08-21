package ch13;

import java.util.Scanner;

public class DoWhileTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;

        do { // 우선 실행 하고 false가 될 때까지 반복
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println(sum);
    }

}
