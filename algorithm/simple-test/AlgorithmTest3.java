package test;

public class AlgorithmTest3 {
//    다음은 회사 사원들에게 출장비를 지급할 때 각 화폐 단위별로 몇 매씩 지급해야 하는지를 계산하는 급여 계산 알고리즘이다.
//    - 화폐 단위는 10000원, 5000원, 1000원, 500원, 100원, 50원, 10원, 5원, 1원 의 9가지가 있다.
//    - 출장비로 지급하는 화폐는 고액권부터 순서대로 지급한다. 이름이 STOP 이면 입력이 끝난다.
    static StringBuffer sb = new StringBuffer();

    public static void showReport() {
        System.out.println(sb.toString());
    }

    public static void makeHeader() {
        sb.append("출장비 지급 알람표\n");
        sb.append("성명\t| 출장비\t| 만원 | 오천원 | 천원 | 오백원 | 백원 | 오십원 | 십원 | 오원 | 일원 \n");
        sb.append("=================================================================\n");
    }

    public static void calc(String name) {
        if(name == "STOP") return;
    }

    static int[] quantity = new int[9];
    public static void calc(String name, int money) {
        int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

        sb.append(name + " | " + money + " | ");

        for(int i = 0; i < 9; i++) {
            int m = money / coin[i];
            quantity[i] += m;
            money -= (m * coin[i]);
            sb.append(m + "  |  ");
        }

        sb.append("\n");
    }

    public static void makeFooter() {
        sb.append("=================================================================\n");
        sb.append("전체 화폐 매수  | ");
        for(int i = 0; i < 9; i++) {
            sb.append(" " + quantity[i]+ "  | ");
        }
    }

    public static void main(String[] args) {
        AlgorithmTest3.makeHeader();
        AlgorithmTest3.calc("홍길동", 532263);
        AlgorithmTest3.calc("김철수", 307349);
        AlgorithmTest3.calc("이순신", 152830);
        AlgorithmTest3.calc("STOP");
        AlgorithmTest3.makeFooter();
        AlgorithmTest3.showReport();
    }
}
