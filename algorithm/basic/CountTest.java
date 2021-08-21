public class CountTest {
    public static void main(String[] args) {
        //점수가 80점 이상인 학생의 수
        int[] score = {70, 60, 55, 90, 85, 75, 80, 100, 95, 45};
        int count = 0;
        int position = 0;
        while (true) {
            if (score[position] >= 80) {//80점 이상 카운트 1씩 추가
                count++;
            }
            position++;

            if (position >= score.length) {//배열 다 체크하면 반복 종료
                break;
            }
        }
        System.out.println(count);//5
    }

}
