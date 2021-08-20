public class FactorsAndPerfectNumberTest {
    public static void main(String[] args) {
        //4부터 500까지의 자연수 중에서 완전수를 찾아 출력하고 그 개수를 구하는 알고리즘을 제시하라.
        int count = 0;

        for(int i = 4; i <= 500; i++) {//4부터 500까지의 자연수
            int sum = 0;//인수의 합
            int temp = i / 2;

            for(int j = 1; j <= temp; j++) {//자연수의 반까지
                if(i % j == 0) sum += j;//인수가 나오면 sum에 더한다.
            }

            if(sum == i) {
                System.out.println("완전수 : " + i); // 6 , 28, 496
                count++;//개수 증가
            }
        }

        System.out.println(count); //3
    }
}
