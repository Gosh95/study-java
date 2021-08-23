package test;

public class AlgorithmTest4 {
//    다음은 회사 사원들에게 출장비를 지급할 때 각 화폐 단위별로 몇 매씩 지급해야 하는지를 계산하는 급여 계산 알고리즘이다.
//    - 화폐 단위는 10000원, 5000원, 1000원, 500원, 100원, 50원, 10원, 5원, 1원 의 9가지가 있다.
//    - 출장비로 지급하는 화폐는 고액권부터 순서대로 지급한다. 이름이 STOP 이면 입력이 끝난다.
    int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
    int[] count = new int[9];

    void calc(String name) {
        if(name == "STOP") return;
    }
    void calc(String name, int money) {
        System.out.print(name + " | " + money + " | ");
        for(int i = 0; i < 9; i++) {
            int m = (int) (money / coin[i]);
            money -= (m * coin[i]);
            count[i] += m;
            System.out.print(m + "  |  ");
        }
        System.out.println();
    }

    void total() {
        for(int i = 0; i < 9; i++) {
            System.out.print(count[i] + "  |  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AlgorithmTest4 test = new AlgorithmTest4();

        System.out.println("출장비 지급 알람표");
        System.out.println("성명\t| 출장비\t| 만원 | 오천원 | 천원 | 오백원 | 백원 | 오십원 | 십원 | 오원 | 일원 ");
        System.out.println("=================================================================");
        test.calc("홍길동", 532263);
        test.calc("김기덕", 896123);
        test.calc("하수구", 541123);
        System.out.println("=================================================================");
        System.out.print("전체 화폐 매수  | ");
        test.total();
    }

}
