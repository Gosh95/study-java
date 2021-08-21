public class MaximumAndMinimumTest {
    public static void main(String[] args) {
        //영어 만점자 중에서 가장 높은 수학점수
        int[] english = {90, 100, 70, 85, 65, 75, 95, 100, 60};
        int[] math = {70, 80, 80, 90, 45, 100, 95, 55, 60};
        int position = 0;
        int min = 0;

        while (true) {
            if (english[position] == 100) {//영어가 100점인 학생
                if (math[position] > min) {//수학점수가 큰 학생
                    min = math[position];//수학점수
                }
            }
            position++;
            if (position >= english.length) break;//배열 다 돌면 종료
        }

        System.out.println(min);//80
    }
}
