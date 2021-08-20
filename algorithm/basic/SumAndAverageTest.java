import org.w3c.dom.ls.LSOutput;

public class SumAndAverageTest {
    public static void main(String[] args) {
        //다음과 같은 조건에서 휴대폰 고객 1명이 한 달 동안 사용하는 총 통화시간을 토대로 일일 평균 통화시간(초)을 구하는 알고리즘을 제시하라.
        double[] time = {184, 240, 9, 245, 333, 295, 20, 38, 329, 34, 350, 59, 313, 24, 187,
                327, 234, 59, 324, 47, 145, 99, 282, 481, 213, 182, 283, 228, 157, 217};
        int count = 0;
        int sum = 0;
        double average = 0;

        while(true) {
            sum += time[count];
            count++;

            if(count >= time.length) break;
        }
        average = sum / count;
        System.out.println(average);//약 197.0초
    }
}
