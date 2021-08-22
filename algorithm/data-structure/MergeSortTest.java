package structure;

public class MergeSortTest {
    public static void main(String[] args) {
         //오름차 정렬이 되어있는 배열A 와 내림차 정렬이 되어있는 배열B 를 통합정렬 해라.
        int[] arrA = {2, 5, 10, 17, 20, 22, 25};
        int[] arrB = {15, 12, 11, 5, 1};
        final int m = 7; //배열 A의 갯수
        final int n = 5; //배열 B의 갯수
        final int end = 999999999;
        int[] arrR = new int[m + n];
        int a = 0; //배열 A의 시작 위치
        int b = n - 1; //배열 B의 시작 위치
        int r = 0; //배열 R의 시작 위치
        int done = 0; //배열 삽입 완료 여부

        for(;;) {
            if(arrA[a] < arrB[b]) {
                arrR[r] = arrA[a];
                r++;
                a++;

                if(a > m - 1) {
                    if(done == 0) {
                        arrA[m - 1] = end; //배열 A가 다 돌았는데 done 이 0 이면 마지막을 강제로 크게 해주어 배열 B를 다 들어오게 만들어 준다.
                        a = m - 1;
                        done = 1;
                    } else {
                        break;
                    }
                }
            } else {
                arrR[r] = arrB[b];
                b--;
                r++;

                if(b < 0) {
                    if(done == 0) {
                        arrB[b + 1] = end;
                        b = b + 1;
                        done = 1;
                    } else {
                        break;
                    }
                }
            }
        }

        for(int i = 0; i < m + n; i++) {
            System.out.print(arrR[i] + " "); // 1 2 5 5 10 11 12 15 17 20 22 25
        }
    }
}
