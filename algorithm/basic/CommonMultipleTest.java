public class CommonMultipleTest {
    public static void main(String[] args) {
        //3의 배수이면서 4의 배수인 숫자의 개수를 구하라.
        int[] arr = {21, 17, 4, 51, 24, 75, 40, 27, 48, 72};
        int count = 0;
        int position = 0;

        do {
            int three = arr[position] % 3;//3으로 나눈 나머지
            int four = arr[position] % 4;//4로 나눈 나머지

            if (three + four == 0) {//나머지가 0이다 == 3의배수 이면서 4의 배수이다.
                count++; //카운트 증가
            }

            position++;

        } while (position < arr.length);

        System.out.println(count); //3
    }
}
