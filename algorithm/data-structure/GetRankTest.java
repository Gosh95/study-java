package structure;

import java.util.Scanner;

public class GetRankTest {
    public static void main(String[] args) {
        //A회사는 25개의 대리점을 가지고 있다. 이들 대리점의 전년도 매출액을 순서대로 읽어들여 매출액을 토대로 대리점의 석차를 구한 후 매출액과 석차를 함께 순서대로 출력하는 알고리즘을 제시하라.
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[25];
        int[] rank = new int[25];

        for(int i = 0; i < 25; i++) {
            num[i] = scanner.nextInt();
            rank[i] = 1;
        }

        //매출 큰 순서대로 내림차순 정렬
        for(int p = 0; p < 25; p++) {
            for(int j = p; j < 25; j++) {
                if(num[p] < num[j]) {
                    int temp = num[p];
                    num[p] = num[j];
                    num[j] = temp;
                }
            }
        }

        for(int i = 0; i < 25; i++) {
            for(int j = 0; j < 25; j++) {
                if(num[i] < num[j]) rank[i]++;
            }
        }

        for(int i = 0; i < 25; i++) {
            System.out.print(rank[i] + "등 매출 : " + num[i] + "만원 \n");
        }
        /*
        1등 매출 : 100만원
        1등 매출 : 100만원
        3등 매출 : 95만원
        4등 매출 : 90만원
        4등 매출 : 90만원
        6등 매출 : 85만원
        6등 매출 : 85만원
        8등 매출 : 80만원
        8등 매출 : 80만원
        10등 매출 : 75만원
        11등 매출 : 65만원
        12등 매출 : 60만원
        13등 매출 : 55만원
        14등 매출 : 50만원
        15등 매출 : 45만원
        16등 매출 : 40만원
        17등 매출 : 34만원
        18등 매출 : 30만원
        18등 매출 : 30만원
        20등 매출 : 25만원
        21등 매출 : 20만원
        21등 매출 : 20만원
        23등 매출 : 10만원
        23등 매출 : 10만원
        25등 매출 : 1만원
         */
    }
}
