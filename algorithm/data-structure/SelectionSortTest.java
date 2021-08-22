package structure;

public class SelectionSortTest {
    public static void main(String[] args) {
        //학생 100명의 영어 성적을 오름차순으로 선택 정렬하는 알고리즘을 제시하라.
        int[] score = {95, 75, 85, 100, 50};
        int i = 0;
        int temp;

        do {
            int j = 1 + i;

            do {
                if(score[i] > score[j]) {
                    temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
                j++;
            } while(j < 5);

            i++;
        } while(i < 4);

        for(int p = 0; p < 5; p++) {
            System.out.print(score[p] + " ");
        }
        //50 75 85 95 100
    }

}
