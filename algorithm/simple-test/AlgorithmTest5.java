package test;

import java.io.*;

public class AlgorithmTest5 {
    //어느 해의 1월 1일을 수요일이라고 가정할 때 같은 해의 날짜를 받아들여서 요일을 출력해 주는 요일 계산 알고리즘을 제시하라(단, 입력한 날짜의 일 값이 0이면 종료한다).

    public static void main(String[] args) throws IOException {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" "); //입력 예시 12월 1일  : 12 1
        int M = Integer.parseInt(str[0]); //달 입력
        int D = Integer.parseInt(str[1]); //일 입력
        int DAYS = 0; //입력 날짜와 차이 일수

        if(D == 0) {//0일이면 리턴
            return;
        } else if(M - 1 == 0 && D - 1 == 0) {//1월 1일은 수요일
            System.out.println("수요일 입니다.");
            return;
        }

        if(M < 0 || M > 12) return; //달이 0보다 작거나 12보다 크면 리턴

        if(M - 1 != 0) {
            int i = 0;
            do {
                DAYS += month[i];
                i++;
            } while(i <= (M - 1));
        }

        DAYS += D - 1;
        int V = DAYS % 7; //총 일수 7로 나눈 나머지
        int R = 2 + V; //수요일 부터라 2더함

        if(R >= 7) {
            R -= 7; //7보다 크면 일주일을 다 돌았기 때문에 -7 해줌
            System.out.println(M +"월 " + D + " 일은 " + day[R] + " 입니다.");
        } else {
            System.out.println(M +"월 " + D + " 일은 " + day[R] + " 입니다.");
        }
    }
}
