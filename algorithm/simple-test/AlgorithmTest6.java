package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgorithmTest6 {
//    다음은 고객이 원금을 은행에 예치한 후 1년이 지날 때마다 받게 되는 원금과 이자의 합계를 알려 주는 원리 합계 계산 알고리즘이다.
//    - 고객으로부터 원금과 최대 예치기간(년단위)을 받는다.
//    - 1년부터 시작하여 최대 예치기간까지 매년 받게 되는 원리 합계를 출력.
//    - 이자에 대한 이자도 지급 이자율은 연 5.4%

    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(sb.readLine());
        int year = Integer.parseInt(sb.readLine());
        double rate = 0.054;
        int total = 0;

        if(money > 0 && year > 0) {
            for(int i = 0; i < year; i++) {
                money += (int)(money * rate);
                System.out.println((i + 1) + "년 후 => " + money + "원");
            }
        }


    }
}
